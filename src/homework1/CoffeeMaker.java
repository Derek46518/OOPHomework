package homework1;

public class CoffeeMaker extends BeverageMaker{
    CoffeeType type;
    IceType iceType;
    public CoffeeMaker(CoffeeType type){
        this.type = type;
        this.iceType = IceType.NONE;
    }
    public CoffeeMaker(CoffeeType type, IceType iceType){
        this.type = type;
        this.iceType = iceType;
    }

    public CoffeeMaker(){
        type = CoffeeType.ICEAMERICANO;
        this.iceType = IceType.NONE;
    }
    public void brew(){
        System.out.println("把熱水倒進磨好的咖啡粉");
    }
    
    public void addMilk(){
        System.out.println("加牛奶");
    }
    public void addSugar(){
        System.out.println("加糖");
    }
    public void addIce(){
        if(type == CoffeeType.ICEAMERICANO || type == CoffeeType.ICELATTE) IceType.add(iceType);

    }

    public void addCondiments(){
        if(type==CoffeeType.ICELATTE||type==CoffeeType.HOTLATTE)addMilk();
        addSugar();
    }
}
