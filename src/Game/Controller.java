package Game;

/**
 * Created by 48089748z on 08/03/16.
 */
public class Controller
{
    public static void main(String[] args)
    {
        System.out.println("\nWARRIOR");
        Warrior warrior = new Warrior();
        warrior.setWeapon(new DragonScimitar());
        warrior.whatWeaponHeWearing();

        System.out.println("\nMAGE");
        Mage mage = new Mage();
        mage.setWeapon(new StaffoftheDead());
        mage.whatWeaponHeWearing();

        System.out.println("\nARCHER");
        Archer archer = new Archer();
        archer.setWeapon(new DarkBow());
        archer.whatWeaponHeWearing();

        System.out.println("\nTHIEF");
        Thief thief = new Thief();
        thief.setWeapon(new Knife());
        thief.whatWeaponHeWearing();
        System.out.println("Li treiem l'arma en temps d'ejecució");
        thief.setWeapon(new NoWeapon());
        thief.whatWeaponHeWearing();
    }
}
