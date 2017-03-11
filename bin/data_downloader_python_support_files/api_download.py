import sys, http.client, urllib.request, urllib.parse, urllib.error, json
import ssl

from pprint import pprint


def concat(args, con=""):
    rez = args[0]
    for a in args[1:]:
        rez += con + a
    return rez


def get_url(domain, url):
    # Headers are used if you need authentication
    headers = {}

    # If you know something might fail - ALWAYS place it in a try ... except
    try:
        conn = http.client.HTTPSConnection(domain, context=ssl.create_default_context(ssl.Purpose.CLIENT_AUTH))
        conn.request("GET", url, "", headers)
        response = conn.getresponse()
        data = response.read()
        conn.close()
        return data
    except Exception as e:
        # These are standard elements in every error.
        print("[Errno {0}] {1}".format(e.errno, e.strerror))

    # Failed to get data!
    return None

query1 = "2012-02"
query2 = '884227'
# This makes sure that any funny characters (including spaces) in the query are
# modified to a format that url's accept.
query = urllib.parse.quote_plus(query1)

# Call our function.
url_data = get_url('data.police.uk', '/api/crimes-at-location?date=' + query1 + '&location_id=' + query2)


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

url_data = str(url_data)


file = open("temporaries/single_query_response", "w")

#file.write(url_data)

pprint(url_data, file)
