package polymorphism;

public class Led extends Tv{
    @Override
    void getType() {
        System.out.println("LED TV");
    }
}
