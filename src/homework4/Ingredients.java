package homework4;

public abstract class Ingredients {
    protected int cost;
    protected Ingredients ingredients;
    public void getIngredient(){
        if(ingredients!=null){
            ingredients.getIngredient();
        }
    }
    public void showCost(){
        System.out.println(this.cost);
    }
}
