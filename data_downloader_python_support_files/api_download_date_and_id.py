import sys, http.client, urllib.request, urllib.parse, urllib.error, json
import ssl

from pprint import pprint

from api_donwload_support_functions import concat,get_url


for i in list(sys.argv):
    print(i)

query = ["", "",""]

query[0] = str(list(sys.argv)[1])
query[1] = str(list(sys.argv)[2])


# This makes sure that any funny characters (including spaces) in the query are
# modified to a format that url's accept.

for q in query:
    q = urllib.parse.quote_plus(q)

# Call our function.
url_data = get_url('data.police.uk', '/api/crimes-at-location?date=' + query[0] + '&location_id=' + query[1])


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

