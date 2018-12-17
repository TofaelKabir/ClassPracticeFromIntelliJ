package mathProblems;

public class MissingNumber {
    public static void main(String[] args) {
        int [] array = new int[] {3,1,4,2,7,5,9,10,8};
        System.out.println(findMissingNumber(array,10));
    }
    public static int findMissingNumber(int[]array, int n){
        int total = 0;
        int sum =0;
        for(int i=0; i<n; i++){
            sum +=i;
        }
       for(int i=0; i<array.length; i++){
           total +=i;
       }
       return (sum-total);
    }
}
//Wrong have to check again
//from Siddik