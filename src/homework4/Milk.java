package homework4;

public class Milk extends Ingredients{
    public Milk(){
        this.cost = 20;
        this.ingredients = null;
    }
    public Milk(Ingredients ingredients){
        this.cost = 20 + ingredients.cost;
        this.ingredients = ingredients;
    }
    @Override
    public void getIngredient(){
        super.getIngredient();
        System.out.println("加牛奶");
    }
}
