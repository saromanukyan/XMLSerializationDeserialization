import java.util.List;

public class Cocktail {
    private String name;
    private double price;
    boolean isAlcoholic;
    private List<Ingredient> ingredients;

    public Cocktail(String name, double price, boolean isAlcoholic) {
        this.name = name;
        this.price = price;
        this.isAlcoholic = isAlcoholic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "name='" + name + '\'' +
                ", price= $" + price +
                ", isAlcoholic=" + isAlcoholic +
                ", ingredients=" + ingredients +
                '}';
    }
}
