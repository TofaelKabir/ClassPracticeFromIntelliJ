package Singleton;

public class Singleton {
    Singleton singleton = new Singleton();
    private Singleton(){
    }
    public static Singleton getInstance(){
        System.out.println("Singleton is being called");
        return new Singleton();
    }

    public static void main(String[] args) {
        Singleton.getInstance();  //Singleton()' has private access in 'Singleton.Singleton'

    }

}

//I did this way