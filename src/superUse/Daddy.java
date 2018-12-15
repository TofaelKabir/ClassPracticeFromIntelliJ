package superUse;

public class Daddy {
    String familyName="Sharkar";
    int age =100;
    public Daddy(){
        System.out.println("Default from my dad");
    }
    public Daddy(String familyName){
        this.familyName = familyName;
        System.out.println("Daddy get his family name from his papa: "+familyName);
    }
    public Daddy(String familyName, int age){
        this.familyName = familyName;
        System.out.println("Daddy get his family name from his papa: "+familyName+" and his dad age is: "+age);
    }
    public void eye(){
        System.out.println("Daddy have brown eyes");
    }
}
