package nestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println("Enter your choice for the following multiple question: ");
            System.out.print(i);
            for (int j=0; j<1; j++){
                System.out.print(" a.");
                System.out.print(" b.");
                System.out.print(" c.");
                System.out.print(" d.");
            }
            System.out.println();
        }
    }
}
