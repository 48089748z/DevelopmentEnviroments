package Game;

/**
 * Created by 48089748z on 08/03/16.
 */
public class DragonScimitar implements Weapon
{
    private Integer damage = 20;

    @Override
    public void useWeapon() {
        System.out.println("Weapon: Dragon Scimitar");

    }
    public Integer getDamage() {
        return damage;
    }
}
