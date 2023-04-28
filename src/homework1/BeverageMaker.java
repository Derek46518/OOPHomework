package homework1;

public abstract class BeverageMaker {
    public void boilWater() {
        System.out.println("煮水");
    }

    public void pourInCup() {
        System.out.println("倒進杯子");
    }
    public abstract void brew();
    public abstract void addCondiments();

    public abstract void addIce();
    public final void prepare() {
        boilWater();     // 步驟1
        brew();          // 步驟2
        pourInCup();     // 步驟3
        addIce();
        addCondiments(); // 步驟5
    }
}
