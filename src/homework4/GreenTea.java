package homework4;

public class GreenTea extends Ingredients{

    public GreenTea(){
        this.cost = 20;
        this.ingredients = null;
    }
    public GreenTea(Ingredients ingredients){
        this.cost = 20 + ingredients.cost;
        this.ingredients = ingredients;
    }
    @Override
    public void getIngredient() {
        super.getIngredient();
        System.out.println("加綠茶");
    }
}
