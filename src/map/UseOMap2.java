package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class UseOMap2 {
    public static void main(String[] args) {
        Map<String,String> cityNCountry = new LinkedHashMap<String, String>(); //but by  LinkedHashMap, the
                                                     //result didn't come sequentially
        cityNCountry.put("USA","NY");
        cityNCountry.put("UK","London");
        cityNCountry.put("Canada","Toronto");

        for(Map.Entry<String,String> value: cityNCountry.entrySet()){
            System.out.println(value.getKey()+ "----->" +value.getValue());
        }
    }
}
