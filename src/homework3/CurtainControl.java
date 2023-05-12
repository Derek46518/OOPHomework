package homework3;

public class CurtainControl implements Device {
    Curtain curtain = new Curtain();
    @Override
    public void execute() {
        if(curtain.getStatus())curtain.off();
        else curtain.on();
    }
}
