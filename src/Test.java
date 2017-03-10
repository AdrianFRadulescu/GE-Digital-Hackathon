
public class Test {


    public static void main(String[] _args){

        CrimeURLDataParsing.parseLocation("");
        Street str = CrimeURLDataParsing.parseStreet("{'name': 'On or near Abbey Gate', 'id': 884227}");

        //System.out.println(str.getName());

    }

}
