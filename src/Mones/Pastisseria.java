package Mones;

public abstract class Pastisseria
{
	Mona mona;
	public Pastisseria() {}
	public Mona encarregarMona(String type)
	{
		mona = crearMona(type);
		mona.preparar();
		mona.fornejar();
		mona.embolicar();
		return mona;
	}
	public Mona crearMona(String type)
	{
		switch (type)
		{
			case "tradicional": return new MonaOus();
			case "pokemon": return new MonaPokemon();
			case "xocolata": return new MonaXocolata();
			default: return null;
		}
	}
}
