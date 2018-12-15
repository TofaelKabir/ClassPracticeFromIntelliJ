package map;

import java.util.HashMap;
import java.util.Map;

public class UseOfMap {
    public static void main(String[] args) {
        Map<String,String> cityNCountry = new HashMap<String, String>(); //as we used hashmap, the
                                                            //result didn't come sequentially
        cityNCountry.put("USA","NY");
        cityNCountry.put("UK","London");
        cityNCountry.put("Canada","Toronto");

        for(Map.Entry<String,String> value: cityNCountry.entrySet()){
            System.out.println(value.getKey()+ "----->" +value.getValue());
        }




    }
}
