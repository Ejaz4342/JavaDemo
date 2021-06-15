package overriding;

public class ICICIBank extends Bank{
    @Override
    double rateOfInterest() {
        return 8.4;
    }
}
