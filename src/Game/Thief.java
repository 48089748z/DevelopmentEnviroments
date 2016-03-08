package Game;

/**
 * Created by 48089748z on 08/03/16.
 */
public class Thief
{
    Weapon weapon;
    public Thief(){}
    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }
    public void whatWeaponHeWearing()
    {
        weapon.whatWeaponHeWearing();
    }
}
