package homework3;

public class TelevisionControl implements Device{
    Television tv;
    public TelevisionControl(){
        this.tv = new Television();
    }
    public TelevisionControl(Television tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        if(tv.getStatus()) tv.off();
        else tv.on();
    }
}
