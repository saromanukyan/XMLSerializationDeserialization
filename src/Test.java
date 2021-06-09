import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

         Cocktail cocktail1 = new Cocktail("Mudslide", 250.69, true);

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("Dark chocolate", 50));
        ingredients.add(new Ingredient("Coffee-flavoured liqueur", 60));
        ingredients.add(new Ingredient("Vodka", 70));
        ingredients.add(new Ingredient("Irish cream liqueur", 60));
        ingredients.add(new Ingredient("Double cream", 100));

        cocktail1.setIngredients(ingredients);

        String xml = CocktailService.serializeXML(cocktail1);
        System.out.println(xml);

        Cocktail cocktail2=CocktailService.deserializeXML(xml);
        System.out.println(cocktail2);
    }

}
