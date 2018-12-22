package unitTest;

import org.testng.Assert;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int resultOfAddition = cal.addition(15, 10);
        Assert.assertEquals(25, resultOfAddition);
        int resultOfSubtraction = cal.subtraction(35,30);
        Assert.assertEquals(5, resultOfSubtraction);

    }
}
//how to make a directory, didn't find it , so created lib in package
