import org.json.JSONObject;

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
     * Parses a given string into a Crime object
     * @param _args = the given string
     * @return  a new Crime object
     */

    public static Crime praseCrime(String _args){




        System.gc();

        return null /*new Crime()*/;
    }

    /**
     * Parses a given string into a Location object
     * @param _args = the given string
     * @return a new Location object
     */

    public static Location parseLocation(String _args){


        // parse the street part
        String auxStreet = _args.substring(_args.indexOf(fLocationParameters[0]));
        auxStreet = auxStreet.substring(auxStreet.indexOf('{')-1);
        System.out.println(auxStreet);
        Street streetParam = parseStreet(auxStreet);

        String auxLatitude = _args.substring(_args.indexOf(fLocationParameters[2]));
        System.out.println(auxLatitude);

        return null/*new Location()*/;
    }


    public static Street parseStreet(String _args){

        String auxId = "";
        for (int i = _args.indexOf(fStreetParameters[0]) + fStreetParameters[0].length() + 3; _args.charAt(i) != '}' && _args.charAt(i) != '"'; i ++){
            auxId = auxId + _args.charAt(i);
        }

        String auxName = "";
        for (int i = _args.indexOf(fStreetParameters[1]) + fStreetParameters[1].length() + 4; _args.charAt(i) != '\'' && _args.charAt(i) != '"'; i ++){
            auxName = auxName + _args.charAt(i);
        }

        return new Street(auxId,auxName);
    }

    /**
     * Takes the information for a given parameter from the string
     * @param _crimeParameter
     * @param _args
     * @return
     */

    public static String getStringCorrespondingToCrimeParameter(String _crimeParameter, String _args){

        int increment = (_crimeParameter.equals("outcome_status")?5:4);

        String aux = _args.substring(_args.indexOf(_crimeParameter) + _crimeParameter.length() + increment);
        String auxRezult = "";
        for (int i = 0; aux.charAt(i) != '\'' && aux.charAt(i) != '"';i ++){
            auxRezult = auxRezult + aux.charAt(i);
        }
        System.out.println(auxRezult);

        return auxRezult;
    }

    /**
     * Returns a substring of a given string until the given character occurs
     * @param _ch
     * @param _args
     * @return
     */

    public static String getStringUntilGivenCharOccurs(char _ch, String _args){

        String result = "";
        for (int i = 0; _args.charAt(i) != _ch; i ++){
            result += _args.charAt(i);
        }

        result += _ch;
        System.out.println(result);
        return result;
    }

}
