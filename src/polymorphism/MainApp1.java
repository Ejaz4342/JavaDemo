package polymorphism;

public class MainApp1 {
    public static void main(String[] args) {
        TvSemulator ts1=new TvSemulator();
        ts1.displayDetails(new Led());
        ts1.displayDetails(new Lcd());
    }

}
