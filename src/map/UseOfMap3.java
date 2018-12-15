package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseOfMap3 {
    public static void main(String[] args) {
        Map<Integer,String> cityNCountry = new LinkedHashMap<Integer,String>();
        cityNCountry.put(1,"NY");
        cityNCountry.put(2,"London");
        cityNCountry.put(3,"Toronto");

        for(Map.Entry<Integer,String> value: cityNCountry.entrySet()){
            System.out.println(value.getKey()+ "----->" +value.getValue());
        }




    }
}
