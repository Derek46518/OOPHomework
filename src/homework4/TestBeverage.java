package homework4;

public class TestBeverage {
    public static void main(String[] args) {

        /* 製作珍珠奶茶 */

        // 1.產生牛奶
        // 2.加紅茶
        // 3.加珍珠
        // 完成！
        Ingredients in = new Milk();
        in = new BlackTea(in);
        in = new Peral(in);
        in.getIngredient();
        in.showCost();
    }
}
