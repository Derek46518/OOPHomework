package homework4;

public class Peral extends Ingredients{
    public Peral(){
        this.cost = 10;
    }
    public Peral(Ingredients ingredients){
        this.cost = 10+ ingredients.cost;
        this.ingredients = ingredients;
    }

    @Override
    public void getIngredient() {
        super.getIngredient();
        System.out.println("加珍珠");
    }


}
