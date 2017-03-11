import org.json.JSONObject;

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



    public static void parse(String _args){

        JSONObject obj = new JSONObject(_args);
        System.out.println(obj.getJSONObject("location").getString("latitude"));

    }

    /**
     * Reads file and returns a list of the lines
     * @param _pathToFile = the path to the file to be read
     * @return
     */

    public static ArrayList<String> readFile(String _pathToFile){

    }

}
