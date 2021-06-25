package inheritance;

public class MainApp2 {
    public static void main(String[] args) {
        Father f1=new Father();
        Uncle u1=new Uncle();
        Aunty a1=new Aunty();
        f1.GrandMethod();
        f1.FatherMethod();
        u1.GrandMethod();
        u1.uncleMethod();
        a1.GrandMethod();
        a1.auntyMethod();
        Son s1=new Son();
        s1.GrandMethod();
        s1.FatherMethod();
        s1.sonMethod();
    }
}
