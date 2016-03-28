package Costs;
import Costs.Ingredients.*;
import Costs.Predefined.MilkCoffee;
import java.util.ArrayList;
public class Controller
{
    public static void main(String[] args)
    {
        //CLASE PREDEFINIDA DE CAFE AMB LLET, AQUESTA JA CONTINDRA ELS DOS INGREDIENTS QUAN LA INSTANCIEM
        MilkCoffee predefinit = new MilkCoffee();

        //TAMBE SE LI PODEN FICAR DE NOUS
        predefinit.ingredients.add(new Sugar());

        //OUTPRINTS
        predefinit.desc();
        predefinit.cost();

        //TAMBE PODEM CREAR DRINKS PERSONALITZATS DESDE 0 AMB ELS INGREDIENTS QUE VOLGUEM
        ArrayList<Ingredients> ingredients = new ArrayList<>();
        ingredients.add(new Milk());
        ingredients.add(new Coffee());
        Drink coffee = new Drink(ingredients);
        coffee.desc();
        coffee.cost();

        //ES VALID PER QUALSEVOL TIPUS DE BEGUDA
        ingredients.clear();
        ingredients.add(new Weed());
        Drink tea = new Drink(ingredients);
        tea.desc();
        tea.cost();

        ingredients.clear();
        ingredients.add(new Alcohol());
        ingredients.add(new Tonic());
        Drink gintonic = new Drink(ingredients);
        gintonic.desc();
        gintonic.cost();
    }
}
