package homework4;

public class BlackTea extends Ingredients{


    public BlackTea(){

        this.ingredients = null;
    }
    public BlackTea(Ingredients ingredients){
        this.cost = 20 + ingredients.cost;
        this.ingredients = ingredients;
    }
    @Override
    public void getIngredient() {
        super.getIngredient();
        System.out.println("加紅茶");

    }
}
