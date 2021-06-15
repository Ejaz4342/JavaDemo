package overriding;

public class HDFCBank extends Bank{
    @Override
    double rateOfInterest() {
        return 7.8;
    }
}
