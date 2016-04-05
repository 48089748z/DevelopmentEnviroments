package CatsSTRATEGY;

/**
 * Created by 48089748z on 01/03/16.
 */
public class Cat
{
    Miolable miolable;
    Caminable caminable;
    public void mostra(){
        System.out.println("S'ha mostrat el gat.");
    }
    public void miau() {
        miolable.miau();
    }
    public void diguemSiCamina()
    {
        caminable.diguemSiCamina();
    }
    public void setMiolable(Miolable miolable) {
        this.miolable = miolable;
    }
    public void setCaminable(Caminable caminable) {
        this.caminable = caminable;
    }
}
