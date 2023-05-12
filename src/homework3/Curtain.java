package homework3;

public class Curtain {
    private boolean isOn = false;

    public void on(){
        isOn = true;
        System.out.println("開窗廉");
    }
    public void off(){
        isOn = false;
        System.out.println("關窗簾");
    }
    public boolean getStatus(){
        return isOn;
    }
}
