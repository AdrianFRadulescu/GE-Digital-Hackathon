import sys, http.client, urllib.request, urllib.parse, urllib.error, json
import ssl

from pprint import pprint

from api_donwload_support_functions import concat,get_url

for i in list(sys.argv):
    print(i)

for i in list(sys.argv):
    print(i)

lat0    = urllib.parse.quote_plus(list(sys.argv)[1])
lng0    = urllib.parse.quote_plus(list(sys.argv)[2])
lat1    = urllib.parse.quote_plus(list(sys.argv)[3])
lng1    = urllib.parse.quote_plus(list(sys.argv)[4])
lat2    = urllib.parse.quote_plus(list(sys.argv)[5])
lng2    = urllib.parse.quote_plus(list(sys.argv)[6])
date    = urllib.parse.quote_plus(list(sys.argv)[7])


# Call our function.
url_data = get_url('data.police.uk', '/api/crimes-street/all-crime?poly=' + lat0 + '%2C'+lng0 + '%3A' + lat1 + '%2C'+ lng1 +'%3A'+ lat2 +'%2C'+ lng2 +'&date='+ date)


# We know how our function fails - graceful exit if we have failed.
if url_data is None:
    print("Failed to get data ... Can not proceed.")
    # Graceful exit.
    sys.exit()

# http.client socket returns bytes - we convert this to utf-8
url_data = url_data.decode("utf-8")

# Convert the structured json string into a python variable
url_data = json.loads(url_data)

# Pretty print
pprint(url_data)


file = open("temporaries/single_query_response", "w")

for data in url_data:
    file.write(str(data))
    file.write('\n')


