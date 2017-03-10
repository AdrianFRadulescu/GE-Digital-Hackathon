/**
 * Created by adrian_radulescu1997 on 10/03/2017.
 */
public class CrimeURLDataParsing {

    private static String[] fCrimeParameters    = {"category", "persistent_id", "context", "location_type", "location", "context", "outcome_status","month"};
    private static String[] fLocationParameters = {"street", "longitude", "latitude"};
    private static String[] fStreetParameters   = {"id", "name"};
    private static String[] fOutcomeResult      = {"category", "date"};

    /**
     * Parses a given string into a Crime object
     * @param _args = the given string
     * @return  a new Crime object
     */

    public static Crime praseCrime(String _args){


        return null /*new Crime()*/;
    }

    /**
     * Parses a given string into a Location object
     * @param _args = the given string
     * @return a new Location object
     */

    public static Location parseLocation(String _args){



        return null /*new Location()*/;
    }


    public static Street parseStreet(String _args){

        System.out.println(_args.lastIndexOf(fStreetParameters[0]));

        System.out.println(_args.charAt(_args.lastIndexOf(fStreetParameters[0])));


        return null;
    }

}
