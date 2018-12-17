package Singleton;

public class Singleton1 {
    private static Singleton1 singleton = new Singleton1();
    private Singleton1(){
    }
    public static Singleton1 getInstance(){
        System.out.println("Singleton is being called");
        return new Singleton1();
    }
    public void display(){
        System.out.println("I am on singleton class");
    }
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();  //Singleton()' has private access in 'Singleton.Singleton'
        singleton1.display();
    }

}

//i did this way