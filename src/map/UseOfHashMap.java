package map;

import java.util.*;

public class UseOfHashMap {
    public static void main(String[] args) {
        List<String> cityOfUSA = new ArrayList<String>();
        cityOfUSA.add("New York");
        cityOfUSA.add("Chicago");

        List<String> cityOfUK = new ArrayList<String>();
        cityOfUK.add("London");
        cityOfUK.add("Manchester");
        cityOfUK.add("Liverpool");

        List<String> cityOfBD = new ArrayList<String>();
        cityOfBD.add("Dhaka");
        cityOfBD.add("Comilla");
        cityOfBD.add("Chittagong");
        cityOfBD.add("Gazipur");

        Map<String, List<String>> cityNCountry = new HashMap<String, List<String>>();
        cityNCountry.put("USA", cityOfUSA);
        cityNCountry.put("UK", cityOfUK);
        cityNCountry.put("BD", cityOfBD);

        for(Map.Entry<String,List<String>> value: cityNCountry.entrySet()){
            System.out.println(value.getKey()+ "----->" +value.getValue());
        }
    }
}
