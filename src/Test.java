import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Cocktail cocktail = new Cocktail("Mudslide", 250.69, true);

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("Dark chocolate", 50));
        ingredients.add(new Ingredient("Coffee-flavoured liqueur", 60));
        ingredients.add(new Ingredient("Vodka", 70));
        ingredients.add(new Ingredient("Irish cream liqueur", 60));
        ingredients.add(new Ingredient("Double cream", 100));

        cocktail.setIngredients(ingredients);

        String xml = CocktailService.serializeXML(cocktail);
        System.out.println(xml);

        System.out.println(CocktailService.deserializeXML(xml));

    }

}
