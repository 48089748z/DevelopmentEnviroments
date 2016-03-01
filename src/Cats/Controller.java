package Cats;

/**
 * Created by 48089748z on 01/03/16.
 */
public class Controller
{
    public static void main(String[] args)
    {
        System.out.println("\nCAT 1");
        Cat cat1 = new Cat();
        cat1.setMiolable(new MiauNormal());
        cat1.miau();
        cat1.setCaminable(new Camina());
        cat1.diguemSiCamina();
        cat1.mostra();

        System.out.println("\nCAT 2");
        Cat cat2 = new Cat();
        cat2.setMiolable(new MiauMetalic());
        cat2.miau();
        cat2.setCaminable(new NoCamina());
        cat2.diguemSiCamina();
        cat2.mostra();


        System.out.println("\nCats.Cat 3");
        Cat cat3 = new Cat();
        cat3.setMiolable(new SenseMiau());
        cat3.miau();
        cat3.mostra();
    }
}
