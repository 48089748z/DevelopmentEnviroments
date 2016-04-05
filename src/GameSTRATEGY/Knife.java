package GameSTRATEGY;

/**
 * Created by 48089748z on 08/03/16.
 */
public class Knife implements Weapon {
    private Integer damage = 10;
    @Override
    public void useWeapon() {
        System.out.println("Weapon: Knife");
    }
    public Integer getDamage() {
        return damage;
    }
}
