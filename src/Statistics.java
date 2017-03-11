import java.lang.reflect.Array;
import java.util.ArrayList;

public class Statistics {

	//private Crime
	private ArrayList<Crime> arrayListCrime;
	private Location locationName;
	private Triangle Triangle;
	
	public Statistics(String pathToFile) {
		// TODO Auto-generated constructor stub
		
		
		arrayListCrime = CrimeURLDataParsing.extractCrimeDataFromFile("single_query_response");
		
		int[] arrayThing = MostCommonBy();
		
		Printing(arrayThing);
	}

	public int[] MostCommonBy(){
		int[] arrayThing = new int[9]; 
		
		
		for(int i=0; i<arrayListCrime.size(); i++){
			switch (arrayListCrime.get(i).getCategory())
	        {
	            case ("anti-social-behaviour"):
	            	arrayThing[0]++;
	            case ("burglary"):
	            	arrayThing[1]++;
	            case ("robbery"):
	            	arrayThing[2]++;
	            case "vehicle-crime":
	            	arrayThing[3]++;
	            case "violent-crime":
	                arrayThing[4]++;
	            case "other-crime":
	                arrayThing[5]++;
	            case "other-theft":
	            	arrayThing[6]++;
	            case "criminal-damage-arson":
	            	arrayThing[7]++;
	             default:
	            	arrayThing[8]++;
	        }
		}
		return arrayThing;
	}
	
	public void Printing(int[] array){
		for(int i = 0; i< array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	 public static void main(String[] _args){

	    	
	        CrimeURLDataParsing.parseCrime("{'persistent_id': '38c1343f22ae8b609702e61c019c437f85e960b6ddce191690342ea98cca3092', 'id': 10468694, 'category': 'other-theft', 'location_type': 'Force', 'outcome_status': {'date': '2012-02', 'category': 'Crime reported'}, 'month': '2012-02', 'context': '', 'location_subtype': '', 'location': {'latitude': '52.643950', 'street': {'name': 'On or near Abbey Gate', 'id': 884227}, 'longitude': '-1.143042'}}");
	        ArrayList<String> arrayList = CrimeURLDataParsing.readFile("single_query_response");
	        
	        Statistics something = new Statistics("Something");
	        
//	        for(int i = 0; i< arrayList.size(); i++) {
//	        	System.out.println(arrayList.get(i));
//	        }
	        
	        //ArrayList<Crime> arrayListCrime = CrimeURLDataParsing.extractCrimeDataFromFile("single_query_response");
	    }
}
