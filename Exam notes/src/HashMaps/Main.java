package HashMaps;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //Create a HashMap object called capitalCities

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        //add keys and values (Country, City)

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
    }
}
