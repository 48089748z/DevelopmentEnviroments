package GameSTRATEGY;
public abstract class Character //LA FEM ABSTRACTA PER NO PODER DECLARAR UN PERSONATGE SI NO ES DEFINEIX QUIN TIPUS ES
{
    Weapon weapon;
    public void fight(Character character){ }
    public void whatWeaponHeWearing(){weapon.useWeapon();}
}
