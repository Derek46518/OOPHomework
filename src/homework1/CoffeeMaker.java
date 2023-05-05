package homework1;

public class CoffeeMaker extends BeverageMaker{
    private CoffeeType type;

    public CoffeeMaker(CoffeeType type){
        super();
        this.type = type;

    }

    public CoffeeMaker(CoffeeType type, SugarType sugarType){
        super(IceType.NONE,sugarType);
        this.type = type;

    }

    public CoffeeMaker(CoffeeType type, IceType iceType){
        super(iceType,SugarType.NONE);
        this.type = type;

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
