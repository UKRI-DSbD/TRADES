# Download MITRE ATT&CK web pages for different techniques and save them locally
import urllib.request
import requests

urlPrefix = 'https://attack.mitre.org/mitigations/M'

#Run over all optional site
for attNum in range(800, 999): #Range for Mitigations #1000-1100 for Enterprise, 800-999 for ICS

    #Create the url of current index
    currUrl = urlPrefix + str(attNum).zfill(4)
    print(currUrl)

    request = requests.get(currUrl)
    if request.status_code == 200:
        fileName = 'C:\\temp\\Mitre\\M0' + str(attNum).zfill(4) + '.attck' #M for Enterprise, M0 for ICS
        urllib.request.urlretrieve(currUrl, fileName)
        #print(fileName)
        print('Web site saved')
    else:
        print('Web site for ATT&CK technique ' + str(attNum) + ' does not exist')
