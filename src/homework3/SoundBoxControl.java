package homework3;

public class SoundBoxControl implements Device{
    SoundBox box;
    public SoundBoxControl(){
        this.box = new SoundBox();
    }
    public SoundBoxControl(SoundBox box){
        this.box = box;
    }
    @Override
    public void execute() {

        switch (box.getLevel()){
            case 0:
                box.low();
                break;
            case 1:
                box.medium();
                break;
            case 2:
                box.high();
                break;
            case 3:
                box.off();
                break;
        }
    }
}
