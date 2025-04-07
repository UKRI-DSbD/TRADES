package dsm.cve.design.wizards;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.ProgressBar;

/**
 * Wraps a SWT ProgressBar object to allow for doubles to be sent as progress measures
 * and for updates to be handled on the UI thread without reading to explicitly code that.
 */
class ProgressBarWrapper {
    private ProgressBar progressBar;
    private double max;
    private double value;
    private int displayMax = 100; //The granularity of the display
    public ProgressBarWrapper(ProgressBar control) {
        progressBar = control;
        progressBar.setState(SWT.NORMAL);
        progressBar.setMinimum(0);
        progressBar.setMaximum(displayMax);
        progressBar.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    }
    
    public void setMaximum(double maximum) {
        max = maximum;
    }
    
    public void setValue(double currentValue) {
        value = currentValue;
        progressBar.getDisplay().syncExec(new Runnable() {
            @Override
            public void run() {
                if(!progressBar.isDisposed())
                    progressBar.setSelection((int)Math.floor(value*displayMax/max));
                }
            });
    }
}