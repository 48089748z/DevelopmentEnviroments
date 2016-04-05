package GameSTRATEGY;

/**
 * Created by 48089748z on 08/03/16.
 */
public class DarkBow implements Weapon
{
    private Integer damage = 30;
    @Override
    public void useWeapon()
    {
        System.out.println("Weapon: Dark Bow");
    }
    public Integer getDamage() {
        return damage;
    }
}
