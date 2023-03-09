import org.json.simple.JSONObject;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");

        //SKapa JSON object
        JSONObject jsonOb  = new JSONObject();

        //Spara värden i JSON object
        jsonOb.put("namn", "Ozzi");
        jsonOb.put("age", "28");

        //Skriva ut värden
        System.out.println(jsonOb.get("namn"));
        System.out.println("I am " + jsonOb.get("age") +  " years old");

        System.out.println("---------");
        System.out.println();



    }
}