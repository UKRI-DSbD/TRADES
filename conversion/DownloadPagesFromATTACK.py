# Download MITRE ATT&CK web pages for different techniques and save them locally
import urllib.request
import requests

urlPrefix = 'https://attack.mitre.org/techniques/T'

#Run over all optional site
for attNum in range(800, 900): #Range for Techniques #For Enterprise+Mobile use 1000-1700, For ICS 0800-0900

    #Create the url of current index
    currUrl = urlPrefix + str(attNum).zfill(4)
    print(currUrl)

    request = requests.get(currUrl)
    if request.status_code == 200:
        fileName = 'C:\\temp\\Mitre\\T0' + str(attNum).zfill(4) + '.attck' #replace 'T' with 'T0' for ICS
        urllib.request.urlretrieve(currUrl, fileName)

        #print(fileName)
        print('Web site saved')
    else:
        print('Web site for ATT&CK technique ' + str(attNum) + ' does not exist')
