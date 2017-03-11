import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

/**
 * Created by adrian_radulescu1997 on 11/03/2017.
 * A class responsible for linking the different parts of the system
 */

public class CommandLinker {

    public static ArrayList<Crime> getCrimesForGivenParameters(String date, String latitude, String longitude){

        //execute python3 command for downloading data


        return null;
    }


    public static void runGoecodingCommand(String _adress){

        String s = null;
        String output = "";

        try {
            String cmd = "curl https://maps.googleapis.com/maps/api/geocode/json?address="+ URLEncoder.encode(_adress,"UTF-8") + "&key=AIzaSyDxufSCnpNxSGW0bPxvVx3KsgouFC-R4o4";

            Process p = Runtime.getRuntime().exec(cmd);

            BufferedReader stdInput = new BufferedReader(new
                    InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(p.getErrorStream()));

            // read the output from the command



            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
                output = output + s;
            }

            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }


        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }   catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }

        JSONObject obj = new JSONObject(output);

        Double lat = ((JSONObject)((JSONObject)obj.getJSONArray("results").get(0)).get("geometry")).getJSONObject("location").getDouble("lat");
        Double lng = ((JSONObject)((JSONObject)obj.getJSONArray("results").get(0)).get("geometry")).getJSONObject("location").getDouble("lng");

    }

    public static ArrayList<Crime> runAPIDownloadPythonCommand(Double _lat, Double _lng, String _date, String _scriptName){

        String cmd = "python3 " + System.getProperty("user.dir") +"/"+ "data_downloader_python_support_files/"+ _scriptName + " "+ _date + " "+ _lat + " "+ _lng+"\n";

        String s = null;
        String output = "";

        ArrayList<Crime> crimes = new ArrayList<>();

        try{

            Process p = Runtime.getRuntime().exec(cmd);

            BufferedReader stdInput = new BufferedReader(new
                    InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(p.getErrorStream()));

            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
                crimes.add(CrimeURLDataParsing.parseCrime(s));
            }

            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        return crimes;
    }

    public static ArrayList<Crime> runAPIDownloadPythonCommand(String _date, Integer _id, String _scriptName){

        String cmd = "python3 " + System.getProperty("user.dir") +"/"+ "data_downloader_python_support_files/"+ _scriptName + " "+ _date + " "+ _id+"\n";

        String s = null;
        ArrayList<Crime> crimes = new ArrayList<>();

        try{

            Process p = Runtime.getRuntime().exec(cmd);

            BufferedReader stdInput = new BufferedReader(new
                    InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(p.getErrorStream()));

            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
                crimes.add(CrimeURLDataParsing.parseCrime(s));
            }

            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        return crimes;
    }

    public static ArrayList<Crime> runAPIDownloadPythonCommand(String _date, Double _lat0, Double _lng0, Double _lat1, Double _lng1, Double _lat2, Double _lng2, String _scriptName){

        String cmd = "python3 " + System.getProperty("user.dir") +"/"+ "data_downloader_python_support_files/"+ _scriptName  +" " + _lat0 + " "+ _lng0 + " " + _lat1 + " "+ _lng1 + " " + _lat2 + " " + _lng2 + " "+ _date;

        String s = null;
        ArrayList<Crime> crimes = new ArrayList<>();

        try{

            Process p = Runtime.getRuntime().exec(cmd);

            BufferedReader stdInput = new BufferedReader(new
                    InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(p.getErrorStream()));

            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println("s=+" + s);
                crimes.add(CrimeURLDataParsing.parseCrime(s));
            }

            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        return crimes;
    }


    public static void main(String[] args){

       // runGoecodingCommand("28 North Road, Selly Oak");
        //runAPIDownloadPythonCommand(52.643950,-1.143042,"2012-02","../data_downloader_python_support_files/api_download_date_latitude_and_longitude.py");
       //runAPIDownloadPythonCommand("2012-02",884227,"api_download_date_and_id.py");
        runAPIDownloadPythonCommand("2013-01",52.268,0.543,52.794,0.238,52.130,0.478,"api_download_triangular_area_and_date.py");
    }

}
