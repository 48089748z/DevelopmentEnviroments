package Game;

/**
 * Created by 48089748z on 08/03/16.
 */
public class Mage
{
    Weapon weapon;
    public Mage(){}
    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }
    public void whatWeaponHeWearing()
    {
        weapon.whatWeaponHeWearing();
    }
}
