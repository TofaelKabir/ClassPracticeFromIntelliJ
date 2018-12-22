package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeObject {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmpName("Mohammad Sharkar");
        emp1.setEmpAddress("625W 57th St, Apt 2952, NY 10019");
        emp1.setEmpDOB("12-12-1976");
        emp1.setEmpID(2188458);

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/mohammadsharkar/eclipse-workspace/classPractice1208To1209/data/test.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(emp1);
            System.out.println("Employee Object is Serialized");
        }catch (Exception ex){
            ex.printStackTrace();

        }

    }
}
//09.08.2018, time 1;23pm to see how to get the link