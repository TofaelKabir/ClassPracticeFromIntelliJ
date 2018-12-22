package mathProblems;

public class StringManipulation {
    public static void main(String[] args) {
        String str1 = "We are in Java Selenium"; //follow 20884
        String str2 = "we are in java selenium";

        int start = str1.indexOf(" ")+1;  //case sensitive, start from index 0  //can't understand next 3 line
        int end = str1.indexOf(" ",start+1);
        System.out.println(start);
        System.out.println(end);
        System.out.println(str1.substring(start,end));

        System.out.println(str1.length()); //it includes also space  //code lab
        System.out.println(str1.charAt(3));  //code lab
        System.out.println(str1.charAt(str1.length()-1));  //codelab
        System.out.println(str1.charAt(5));
        System.out.println(str1.charAt(0));
        System.out.println(str1.length()-1);  //code lab

        System.out.println(str1.indexOf('e')); //first one is index 0
        System.out.println(str1.indexOf('s')); //case sensetive
        System.out.println(str1.indexOf('i',str1.indexOf('i')+1)); //don't get it! have to ask
        System.out.println(str1.indexOf("-")); //?
        System.out.println(str1.indexOf("i"));//first one is index 0
        System.out.println(str1.indexOf("J")); //case sensetive
        System.out.println(str1.equals(str2));  //case matter
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.substring(0,2)); //code lab
        System.out.println(str1.substring(1)); //code lab
        System.out.println(str1.substring(str1.length()-3, str1.length()));  //code lab


        String date = "12-12-76";
        System.out.println(date.replace("-","/"));


        String x = "Hello";
        String y = "World!";
        int a = 100;
        int b = 200;
        System.out.println(x+y);
        System.out.println(a+b);
        System.out.println(x+y+a+b);
        System.out.println(a+b+x+y);





    }
}
