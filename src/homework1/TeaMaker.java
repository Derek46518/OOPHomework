package homework1;

public class TeaMaker extends BeverageMaker{
    TeaType type;
    IceType iceType;
    public TeaMaker(){
        type = TeaType.HOTGREENTEA;
    }
    public TeaMaker(TeaType type, IceType iceType){
        this.type = type;
        this.iceType = iceType;
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
        if(type==TeaType.ICEGREENTEA||type == TeaType.ICELEMONTEA || type ==TeaType.ICEMILKTEA)IceType.add(iceType);
    }
    public void addCondiments(){
        if(type==TeaType.HOTLEMONTEA||type==TeaType.ICELEMONTEA)addLemon();
        if(type==TeaType.HOTMILKTEA||type==TeaType.ICEMILKTEA)addMilk();
    }
}
