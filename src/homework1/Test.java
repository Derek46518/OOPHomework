package homework1;

public class Test {
    public static void main(String[] args){
        BeverageMaker coffee = new TeaMaker(TeaType.HOTLEMONTEA);
        coffee.prepare();
    }
}
