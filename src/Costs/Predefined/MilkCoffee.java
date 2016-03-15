package Costs.Predefined;

import Costs.Drink;
import Costs.Ingredients.Coffee;
import Costs.Ingredients.Milk;

/**
 * Created by 48089748z on 15/03/16.
 */
public class MilkCoffee extends Drink
{
    public MilkCoffee(){
        ingredients.add(new Coffee());
        ingredients.add(new Milk());
    }
}
