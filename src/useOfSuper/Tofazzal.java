package useOfSuper;

public class Tofazzal extends Daddy {

    public Tofazzal(){
        //super(); //can we write it after sout? no
        //super.familyName(); //we can't call variable by super
        //super("Sharkar"); //only one constructor can be called by super
        super("Sharkar", 100);
        super.eye();
        System.out.println("defaut from tofazzal");

    }
    public void age(){

        System.out.println("Tofazzal is 38");
    }
    public void CarryingFamilyName(){
        System.out.println("My family name is: "+familyName);
    }
    public void familyStatus(){
        super.eye();
        System.out.println(super.familyName);
        super.eye();
    }


}
