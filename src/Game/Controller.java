package Game;

/**
 * Created by 48089748z on 08/03/16.
 */
public class Controller
{
    public static void main(String[] args)
    {
        Warrior warrior = new Warrior();
        warrior.setWeapon(new DragonScimitar());
        warrior.whatWeaponHeWearing();

        Mage mage = new Mage();
        mage.setWeapon(new StaffoftheDead());
        mage.whatWeaponHeWearing();

        Thief thief = new Thief();
        thief.setWeapon(new Knife());
        thief.whatWeaponHeWearing();
        thief.setWeapon(new DragonScimitar());
        thief.whatWeaponHeWearing();
    }
}
