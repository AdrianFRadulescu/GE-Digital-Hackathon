This is a directory for supporting python files for the application

The files are as follows:

- api_download_support.py                       -> contains two functions which are used in all the other donwloading scripts
- api_download_date_and_id.py                   -> queries data.police.uk/api/ with the date and id of the street parameters
                                                    in order to get the crimes that are registered for the corresponding month and zone 
- api_download_date_latitude_and_longitude.py   -> queries data.police.uk/api/ with the date latitude and longitude parameters
                                                    in order to get the crimes that are registered for the corresponding date and location
- api_download_triangular_area_and_date.py      -> queries data.police.uk/api/ with 3 pairs of latitude and longitude parameters and a date parameter
                                                    in order to get the crimes from a triangular region
All of those cripts write their results in the  temporaries/single_query_response files, each json being written on a separate row
               
- google_geocoding_key.txt                      -> contains the key neccessary to use the google geocoding api
