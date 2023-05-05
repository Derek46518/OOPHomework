package homework1;

public class TeaMaker extends BeverageMaker{
    private TeaType type;

    public TeaMaker(){
        super();
        this.type = TeaType.HOTGREENTEA;

    }
    public TeaMaker(TeaType type, IceType iceType){
        super(iceType,SugarType.NONE);
        this.type = type;

    }



    public TeaMaker(TeaType type, IceType iceType,SugarType sugarType){
        super(iceType,sugarType);
        this.type = type;


    }
    public TeaMaker(TeaType type, SugarType sugarType){
        super(IceType.NONE,sugarType);
        this.type = type;

    }

    public TeaMaker(TeaType type){
        this.type = type;
        this.iceType = IceType.NONE;
        this.sugarType = SugarType.NONE;
    }
    public void brew(){
        System.out.print("浸泡");
        type.getType();
        System.out.println("3分鐘");
    }
    public void addLemon() {
        System.out.println("添加檸檬");
    }
    public void addMilk(){
        System.out.println("加入牛奶");
    }
    public void addIce(){
        // if(type==TeaType.ICEGREENTEA||type == TeaType.ICELEMONTEA || type ==TeaType.ICEMILKTEA)iceType.add();
        type.addIce(iceType);
    }
    public void addCondiments(){
        type.addLemon();
        type.addMilk();
        sugarType.add();
    }
}
