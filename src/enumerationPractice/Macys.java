package enumerationPractice;


public class Macys {
    Size chart;
    public Macys(){
        System.out.println("default");
    }
    public Macys(Size chart){
        this.chart = chart;
    }
    public void whatSizeYouAreLookingFor(){
        switch (chart){
            case Small:
                System.out.println("This is small size what you are looking for");
                break;
            case Medium:
                System.out.println("This is medium size what you are looking for");
                break;
            default:
                System.out.println("We don't have this size");
                break;
        }

    }

}
