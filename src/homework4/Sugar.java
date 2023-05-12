package homework4;

public class Sugar extends Ingredients{
    public Sugar(){
        this.cost = 5;
        this.ingredients = null;
    }
    public Sugar(Ingredients ingredients){
        this.cost = 5 + ingredients.cost;
        this.ingredients = ingredients;
    }

    @Override
    public void getIngredient() {
        super.getIngredient();
        System.out.println("加糖");
    }
}
