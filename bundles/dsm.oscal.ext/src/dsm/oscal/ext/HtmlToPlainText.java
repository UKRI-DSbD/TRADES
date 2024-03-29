/**
* The MIT License
* 
* Copyright (c) 2009-2021 Jonathan Hedley <https://jsoup.org/>
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
 * 
 */

package dsm.oscal.ext;

import org.jsoup.Jsoup;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

/**
 * HTML to plain-text. This example program demonstrates the use of jsoup to
 * convert HTML input to lightly-formatted plain-text. That is divergent from
 * the general goal of jsoup's .text() methods, which is to get clean data from
 * a scrape.
 * <p>
 * Note that this is a fairly simplistic formatter -- for real world use you'll
 * want to embrace and extend.
 * </p>
 * <p>
 * To invoke from the command line, assuming you've downloaded the jsoup jar to
 * your current directory:
 * </p>
 * <p>
 * <code>java -cp jsoup.jar org.jsoup.examples.HtmlToPlainText url [selector]</code>
 * </p>
 * where <i>url</i> is the URL to fetch, and <i>selector</i> is an optional CSS
 * selector.
 * 
 * @author Jonathan Hedley, jonathan@hedley.net
 */
//Source https://github.com/jhy/jsoup/blob/master/src/main/java/org/jsoup/examples/HtmlToPlainText.java
public class HtmlToPlainText {

	/**
	 * Format an Element to plain-text
	 * 
	 * @param element the root element to format
	 * @return formatted text
	 */
	public String getPlainText(String html) {

		FormattingVisitor formatter = new FormattingVisitor();
		NodeTraversor.traverse(formatter, Jsoup.parse(html)); // walk the DOM, and call .head() and .tail() for each
																// node

		return formatter.toString();
	}

	// the formatting rules, implemented in a breadth-first DOM traverse
	private static class FormattingVisitor implements NodeVisitor {
		private static final int maxWidth = 80;
		private int width = 0;
		private StringBuilder accum = new StringBuilder(); // holds the accumulated text

		// hit when the node is first seen
		public void head(Node node, int depth) {
			String name = node.nodeName();
			if (node instanceof TextNode)
				append(((TextNode) node).text()); // TextNodes carry all user-readable text in the DOM.
			else if (name.equals("li"))
				append("\n * ");
			else if (name.equals("dt"))
				append("  ");
			else if (StringUtil.in(name, "p", "h1", "h2", "h3", "h4", "h5", "tr"))
				append("\n");
		}

		// hit when all of the node's children (if any) have been visited
		public void tail(Node node, int depth) {
			String name = node.nodeName();
			if (StringUtil.in(name, "br", "dd", "dt", "p", "h1", "h2", "h3", "h4", "h5"))
				append("\n");
			else if (name.equals("a"))
				append(String.format(" <%s>", node.absUrl("href")));
		}

		// appends text to the string builder with a simple word wrap method
		private void append(String text) {
			if (text.startsWith("\n"))
				width = 0; // reset counter if starts with a newline. only from formats above, not in
							// natural text
			if (text.equals(" ")
					&& (accum.length() == 0 || StringUtil.in(accum.substring(accum.length() - 1), " ", "\n")))
				return; // don't accumulate long runs of empty spaces

			if (text.length() + width > maxWidth) { // won't fit, needs to wrap
				String[] words = text.split("\\s+");
				for (int i = 0; i < words.length; i++) {
					String word = words[i];
					boolean last = i == words.length - 1;
					if (!last) // insert a space if not the last word
						word = word + " ";
					if (word.length() + width > maxWidth) { // wrap and reset counter
						accum.append("\n").append(word);
						width = word.length();
					} else {
						accum.append(word);
						width += word.length();
					}
				}
			} else { // fits as is, without need to wrap text
				accum.append(text);
				width += text.length();
			}
		}

		@Override
		public String toString() {
			return accum.toString();
		}
	}
}