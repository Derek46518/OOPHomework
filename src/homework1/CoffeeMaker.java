package homework1;

public class CoffeeMaker extends BeverageMaker{
    private CoffeeType type;

    public CoffeeMaker(CoffeeType type){
        this.type = type;
        this.sugarType = SugarType.NONE;
        this.iceType = IceType.NONE;
    }

    public CoffeeMaker(CoffeeType type, SugarType sugarType){
        this.type = type;
        this.sugarType = sugarType;
        this.iceType = IceType.NONE;
    }

    public CoffeeMaker(CoffeeType type, IceType iceType){
        this.type = type;
        this.iceType = iceType;
        this.sugarType = SugarType.NONE;
    }

    public CoffeeMaker(CoffeeType type, IceType iceType, SugarType sugarType){
        super(iceType,sugarType);
        this.type = type;
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
        type.addMilk();
    }
    public void addSugar(){
        sugarType.add();
    }
    public void addIce(){

        type.addIce(iceType);
    }

    public void addCondiments(){
        addMilk();
        addSugar();
    }
}
