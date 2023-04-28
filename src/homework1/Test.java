package homework1;

public class Test {
    public static void main(String[] args){
        BeverageMaker tea = new TeaMaker(TeaType.ICELEMONTEA,IceType.FULL);
        BeverageMaker tea2 = new TeaMaker(TeaType.ICEGREENTEA,IceType.NONE);
        BeverageMaker tea3 = new TeaMaker(TeaType.HOTGREENTEA);
        BeverageMaker coffee = new CoffeeMaker(CoffeeType.ICEAMERICANO,IceType.SEVEN);
        BeverageMaker coffee2 = new CoffeeMaker(CoffeeType.HOTLATTE);
        tea.prepare();
        tea2.prepare();
        tea3.prepare();
        coffee.prepare();
        coffee2.prepare();
    }
}
