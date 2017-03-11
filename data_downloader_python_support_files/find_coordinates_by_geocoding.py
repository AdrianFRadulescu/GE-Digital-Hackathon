import sys, http.client, urllib.request, urllib.parse, urllib.error, json
import ssl

from pprint import pprint

from api_donwload_support_functions import concat,get_url


# Call our function.
url_data = get_url("maps.googleapis.com/","maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&key=AIzaSyDxufSCnpNxSGW0bPxvVx3KsgouFC-R4o4")

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
