package homework1;

public class CoffeeMaker extends BeverageMaker{
    CoffeeType type;
    public CoffeeMaker(CoffeeType type){
        this.type = type;
    }
    public CoffeeMaker(){
        type = CoffeeType.ICEAMERICANO;
    }
    public void brew(){
        System.out.println("把熱水倒進磨好的咖啡粉");
    }
    public void addSugarAndMilk() {
        System.out.println("添加糖或牛奶等額外添加物");
    }
    public void addIce(){
        if(type == CoffeeType.ICEAMERICANO || type == CoffeeType.ICELATTE) System.out.println("加冰塊");

    }

    public void addCondiments(){
        addSugarAndMilk();
    }
}
