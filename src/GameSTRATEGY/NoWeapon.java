package GameSTRATEGY;

/**
 * Created by 48089748z on 08/03/16.
 */
public class NoWeapon implements Weapon
{
    private Integer damage = 0;
    @Override
    public void useWeapon()
    {
        System.out.println("Weapon: No Weapon");
    }
    public Integer getDamage() {
        return damage;
    }
}