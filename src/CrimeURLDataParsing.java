import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by adrian_radulescu1997 on 10/03/2017.
 */

//import org.json.*;

public class CrimeURLDataParsing {

    private static String[] fCrimeParameters    = {"category", "persistent_id", "context", "location_type", "location", "context", "outcome_status","month"};
    private static String[] fLocationParameters = {"street", "longitude", "latitude"};
    private static String[] fStreetParameters   = {"id", "name"};
    private static String[] fOutcomeResult      = {"category", "date"};
    private static ArrayList<String> arrayList = new ArrayList<String>();


	/**
	 * Uses the org.json parser in order to transform a given string into a json object
	 * and the convert it to a crime object
	 * @param _args
	 * @return
	 */

	public static Crime parseCrime(String _args){

        JSONObject obj = new JSONObject(_args);

        //Location
		System.out.println(obj.getJSONObject("location").getJSONObject("street").get("id"));
		Street str = new Street(
				obj.getJSONObject("location").getJSONObject("street").getInt("id"),
				obj.getJSONObject("location").getJSONObject("street").getString("name")
		);
		Location loc = new Location(
				str,
				obj.getJSONObject("location").getString("latitude"),
				obj.getJSONObject("location").getString("longitude"));
		OutcomeStatus outcomeStatus = null;

		if(obj.isNull("outcome_status")) {

			outcomeStatus = new OutcomeStatus(
					obj.getJSONObject("outcome_status").getString("category"),
					obj.getJSONObject("outcome_status").getString("date")
			);
		}

		System.out.println(obj.getJSONObject("location").getString("longitude"));
		System.out.println(obj.getJSONObject("location").getString("latitude"));

		return new Crime(
				loc,
				outcomeStatus,
				obj.getString("category"),
				obj.getString("persistent_id"),
				obj.getInt("id"),
				obj.getString("location_subtype"),
				obj.getString("month")
		);
		
		
    }

    /**
     * Reads file and returns a list of the lines
     * @param _pathToFile = the path to the file to be read
     * @return
     */

    public static ArrayList<String> readFile(String _pathToFile){
    	try {
		  	int i = 0 ;
			File file = new File(System.getProperty("user.dir") +"/"+ "data_downloader_python_support_files/temporaries/"+ _pathToFile);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while (( line = bufferedReader.readLine()) != null) {
				arrayList.add(line);				
				//i++;
			}
			fileReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return arrayList;
    }

	/**
	 * Extracts crime objects form a file
	 * @param _pathToFile
	 * @return
	 */

	public static ArrayList<Crime> extractCrimeDataFromFile(String _pathToFile){

    	ArrayList<Crime> result = new ArrayList<>();

    	for (String crimeString: readFile(_pathToFile)){
    		result.add(parseCrime(crimeString));
		}

    	return result;
	}


}