package Mones;

public class Pastisseria
{
	Mona mona;
	String location = "PER DEFECTE";
	public Pastisseria() {}
	public Mona encarregarMona(String type)
	{
		System.out.println("\n----------------------------------------------------\nPASSTISSERIA "+location);
		mona = crearMona(type);
		afegirExtrasDeCiutat();
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
	public void afegirExtrasDeCiutat()
	{
		switch (location)
		{
			default:{break;}
			case "MADRID":{mona.decoracions.add("Ingredient Extra de Madrid"); break;}
			case "BARCELONA":{mona.decoracions.add("Ingredient Extra de Barcelona");break;}
		}
	}
}
