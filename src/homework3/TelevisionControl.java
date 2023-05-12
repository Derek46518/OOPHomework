package homework3;

public class TelevisionControl implements Device{
    Television tv = new Television();
    @Override
    public void execute() {
        if(tv.getStatus()) tv.off();
        else tv.on();
    }
}
