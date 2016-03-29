package Mones;

/**
 * Created by 48089748z on 29/03/16.
 */
public class PasstisseriaMadrid extends Pastisseria
{
    @Override
    public Mona encarregarMona(String type)
    {
        return super.encarregarMona(type);
    }
    @Override
    public Mona crearMona(String type)
    {
        return super.crearMona(type);
    }

    public PasstisseriaMadrid()
    {
        System.out.println("PASSTISSERIA MADRID");
        mona.details();
    }
}
