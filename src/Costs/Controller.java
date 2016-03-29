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
        predefinit.desc();
        predefinit.cost();

        //TAMBE PODEM CREAR DRINKS PERSONALITZATS DESDE 0 AMB ELS INGREDIENTS QUE VOLGUEM
        Drink coffee = new Drink();
        coffee.ingredients.add(new Milk());
        coffee.ingredients.add(new Coffee());
        coffee.desc();
        coffee.cost();

        //ES VALID PER QUALSEVOL TIPUS DE BEGUDA
        Drink tea = new Drink();
        tea.ingredients.add(new Weed());
        tea.desc();
        tea.cost();

        Drink gintonic = new Drink();
        gintonic.ingredients.add(new Alcohol());
        gintonic.ingredients.add(new Tonic());
        gintonic.desc();
        gintonic.cost();
    }
}
