
public class Test {


    public static void main(String[] _args){

        CrimeURLDataParsing.parseLocation("'location': {'latitude': '52.643950', 'street': {'name': 'On or near Abbey Gate', 'id': 884227}, 'longitude': '-1.143042'}");
        Street str = CrimeURLDataParsing.parseStreet("{'name': 'On or near Abbey Gate', 'id': 884227}");

        CrimeURLDataParsing.getStringCorrespondingToCrimeParameter("outcome_status","[{'persistent_id': '38c1343f22ae8b609702e61c019c437f85e960b6ddce191690342ea98cca3092', 'id': 10468694, 'category': 'other-theft', 'location_type': 'Force', 'outcome_status': {'date': '2012-02', 'category': 'Crime reported'}, 'month': '2012-02', 'context': '', 'location_subtype': '', 'location': {'latitude': '52.643950', 'street': {'name': 'On or near Abbey Gate', 'id': 884227}, 'longitude': '-1.143042'}}]");

        CrimeURLDataParsing.getStringUntilGivenCharOccurs('}', "sdasdsadadsadasdasf dsdasds}");

        CrimeURLDataParsing.parse("{'persistent_id': '38c1343f22ae8b609702e61c019c437f85e960b6ddce191690342ea98cca3092', 'id': 10468694, 'category': 'other-theft', 'location_type': 'Force', 'outcome_status': {'date': '2012-02', 'category': 'Crime reported'}, 'month': '2012-02', 'context': '', 'location_subtype': '', 'location': {'latitude': '52.643950', 'street': {'name': 'On or near Abbey Gate', 'id': 884227}, 'longitude': '-1.143042'}}");

    }

}
