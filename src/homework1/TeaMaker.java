package homework1;

public class TeaMaker extends BeverageMaker{
    TeaType type;
    public TeaMaker(){
        type = TeaType.HOTGREENTEA;
    }
    public TeaMaker(TeaType type){
        this.type = type;
    }
    public void brew(){
        System.out.println("浸泡茶葉3分鐘");
    }
    public void addLemon() {
        System.out.println("添加檸檬");
    }
    public void addMilk(){
        System.out.println("加入牛奶");
    }
    public void addIce(){
        if(type==TeaType.ICEGREENTEA||type == TeaType.ICELEMONTEA || type ==TeaType.ICEMILKTEA)System.out.println("加冰塊");
    }
    public void addCondiments(){
        if(type==TeaType.HOTLEMONTEA||type==TeaType.ICELEMONTEA)addLemon();
        if(type==TeaType.HOTMILKTEA||type==TeaType.ICEMILKTEA)addMilk();
    }
}
