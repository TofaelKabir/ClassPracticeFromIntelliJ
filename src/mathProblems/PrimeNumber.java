package mathProblems;

public class PrimeNumber {
    public static void main(String[] args) {
        int counter = 0;
        for (int i=0; i<10; i++){
            if (i==0){
                System.out.println(i);
            }else{
                if(isPrime(i)){
                    counter++;
                    System.out.println("prime: "+i);
                }else{
                    System.out.println("non-prime: "+i);
                }
            }
        }
    }

public static boolean isPrime(int n) {
    if (n % 2 == 0) return false;
    for (int i = 3; i * i <= n; i = i + 2) {
        if (n % i == 0) return false;
    }
    return true;
    }
}