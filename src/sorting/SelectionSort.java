package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {5,67,24,2,45};
        System.out.println("Before Sorting");
        for(int k =0; k<array.length; k++){
            System.out.println(array[k]);
        }
        for(int j=0; j<array.length-1;j++ ){
            for(int i=j+1; i<array.length; i++){
                if(array [i]< array [j]){
                    int temp = array [i];
                    array [i] = array [j];
                    array [j] = temp;
                }//end of if
            }//end of inner for loop
        }//end of out for loop
        System.out.println("After Sorting");
        for(int k =0; k<array.length; k++){
            System.out.println(array[k]);
        }
    }//end of main method
}//end of class body
