package CostsDECORATOR.Predefined;

import CostsDECORATOR.Drink;
import CostsDECORATOR.Ingredients.Coffee;
import CostsDECORATOR.Ingredients.Milk;

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
