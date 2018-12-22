package mathProblems;

public class MissingNumber {
    public static void main(String[] args) {
        int [] array = {3,1,4,2,7,5,9,10,8};
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum =sum+array[i];
        }
        System.out.println(sum);

        int total = 0;
        for(int j=1; j<=10; j++){
            total = total + j;
        }
        System.out.println(total);
        System.out.println("Missing number is ----> "+(total-sum));
    }
}
//fixed
//from Siddik