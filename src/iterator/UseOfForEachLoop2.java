package iterator;

import java.util.ArrayList;
import java.util.List;

public class UseOfForEachLoop2 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(483);
        intList.add(484);
        intList.add(485);
        intList.add(486);

        for(Integer number : intList){
            System.out.println(number);
        }
    }
}