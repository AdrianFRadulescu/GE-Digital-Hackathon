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