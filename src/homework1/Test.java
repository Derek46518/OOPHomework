package homework1;

public class Test {
    public static void main(String[] args){
        BeverageMaker tea = new TeaMaker(TeaType.ICELEMONTEA,IceType.FULL,SugarType.SEVEN);
        BeverageMaker tea2 = new TeaMaker(TeaType.ICEGREENTEA,IceType.THREE,SugarType.FULL);
        BeverageMaker tea3 = new TeaMaker(TeaType.HOTGREENTEA,SugarType.THREE);
        BeverageMaker coffee = new CoffeeMaker(CoffeeType.ICEAMERICANO,IceType.SEVEN,SugarType.THREE);
        BeverageMaker coffee2 = new CoffeeMaker(CoffeeType.HOTLATTE);
        tea.prepare();
        System.out.println("===========");
        tea2.prepare();
        System.out.println("===========");
        tea3.prepare();
        System.out.println("===========");
        coffee.prepare();
        System.out.println("===========");
        coffee2.prepare();
    }
}
