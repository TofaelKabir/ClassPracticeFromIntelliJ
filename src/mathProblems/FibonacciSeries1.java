package mathProblems;

public class FibonacciSeries1 {
    public static void main(String[] args) {
        int next = 0;
        int prev = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println(next);
            next = next + prev;
            prev = next - prev;
        }

    }
}