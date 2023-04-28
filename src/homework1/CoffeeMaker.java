package homework1;

public class CoffeeMaker extends BeverageMaker{
    CoffeeType type;
    IceType iceType;
    SugarType sugarType;
    public CoffeeMaker(CoffeeType type){
        this.type = type;
        this.iceType = IceType.NONE;
        this.sugarType = SugarType.NONE;
    }
    public CoffeeMaker(CoffeeType type, IceType iceType){
        this.type = type;
        this.iceType = iceType;
        this.sugarType = SugarType.NONE;
    }

    public CoffeeMaker(CoffeeType type, IceType iceType, SugarType sugarType){
        this.type = type;
        this.iceType = iceType;
        this.sugarType = sugarType;
    }

    public CoffeeMaker(){
        type = CoffeeType.ICEAMERICANO;
        this.iceType = IceType.NONE;
        this.sugarType = SugarType.NONE;
    }
    public void brew(){
        System.out.println("把熱水倒進磨好的咖啡粉");
    }

    public void addMilk(){
        System.out.println("加牛奶");
    }
    public void addSugar(){
        sugarType.add();
    }
    public void addIce(){
        if(type == CoffeeType.ICEAMERICANO || type == CoffeeType.ICELATTE) iceType.add();

    }

    public void addCondiments(){
        if(type==CoffeeType.ICELATTE||type==CoffeeType.HOTLATTE)addMilk();
        addSugar();
    }
}
