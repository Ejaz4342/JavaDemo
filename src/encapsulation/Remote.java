package encapsulation;

public class Remote {
    private boolean onValue=false;
    public void performOperation(){
        System.out.println("the valu of remote is toggled");
        onValue=!onValue;
        System.out.println("Remote value is "+onValue);
    }
}
