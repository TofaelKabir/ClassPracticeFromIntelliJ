package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeObject {
    public static void main(String[] args) {
        Employee emp1 = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/Users/mohammadsharkar/eclipse-workspace/classPractice1208To1209/data/test.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            emp1 = (Employee)objectInputStream.readObject();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Object is deserialized");
        System.out.println("Employee Name: "+emp1.getEmpName());
        System.out.println("Employee Address: "+emp1.getEmpAddress());
        System.out.println("Employee DOB: "+emp1.getEmpDOB());
        System.out.println("Employee ID: "+emp1.getEmpID());
    }
}
