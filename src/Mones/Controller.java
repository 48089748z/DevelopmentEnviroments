package Mones;
public class Controller
{
	private static Pastisseria pastisseria;
	public static void main(String[] args)
	{
		pastisseria = new PasstisseriaBarcelona();
		Mona mona = pastisseria.encarregarMona("tradicional");
		mona.details();

		pastisseria = new PasstisseriaMadrid();
		mona = pastisseria.encarregarMona("xocolata");
		mona.details();

		pastisseria = new Pastisseria();
        mona = pastisseria.encarregarMona("pokemon");
		mona.details();
	}
}
