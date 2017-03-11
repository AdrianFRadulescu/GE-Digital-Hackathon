import java.util.ArrayList;

public class Test {


    public static void main(String[] _args){

        
        CrimeURLDataParsing.parseCrime("{'persistent_id': '38c1343f22ae8b609702e61c019c437f85e960b6ddce191690342ea98cca3092', 'id': 10468694, 'category': 'other-theft', 'location_type': 'Force', 'outcome_status': {'date': '2012-02', 'category': 'Crime reported'}, 'month': '2012-02', 'context': '', 'location_subtype': '', 'location': {'latitude': '52.643950', 'street': {'name': 'On or near Abbey Gate', 'id': 884227}, 'longitude': '-1.143042'}}");
        ArrayList<String> arrayList = CrimeURLDataParsing.readFile("single_query_response");

        String x = "{'month': '2013-01', 'location_type': 'Force', 'location_subtype': '', 'outcome_status': None, 'context': '', 'id': 19876502, 'category': 'anti-social-behaviour', 'persistent_id': '', 'location': {'longitude': '0.484861', 'street': {'name': 'On or near The Green', 'id': 561972}, 'latitude': '52.225827'}}";

        Crime y = CrimeURLDataParsing.parseCrime(x);

        System.out.println(y.getCategory());

    }
}