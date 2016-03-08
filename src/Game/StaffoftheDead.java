package Game;

public class StaffoftheDead implements Weapon
{
    private Integer damage = 35;
    @Override
    public void useWeapon()
    {
        System.out.println("Weapon: Staff of the Dead");
    }

    public Integer getDamage() {
        return damage;
    }
}
