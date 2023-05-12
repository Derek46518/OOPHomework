package homework3;

public class LightControl implements Device{
    private Light light;
    public LightControl(){
        light = new Light();
    }
    @Override
    public void execute() {
        int n = light.getBrightness();
        switch (light.getBrightness()){
            case 0:
                light.dim();
                break;
            case 1:
                light.bright();
                break;
            case 2:
                light.off();
        }
    }
}
