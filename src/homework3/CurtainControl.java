package homework3;

public class CurtainControl implements Device {
    Curtain curtain;
    public CurtainControl(){
        this.curtain = new Curtain();
    }
    public CurtainControl(Curtain curtain){
        this.curtain = curtain;
    }
    @Override
    public void execute() {
        if(curtain.getStatus())curtain.off();
        else curtain.on();
    }
}
