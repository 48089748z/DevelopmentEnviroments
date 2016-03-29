package Mones;
import java.util.ArrayList;
public abstract class Mona
{
	String nom;
	String massa;
	String cobertura;
	ArrayList decoracions = new ArrayList();
	public void preparar() {
		System.out.println("Preparant els ingredients de la " + nom);
	}
	public void fornejar() {
		System.out.println("Posant la " + nom + " al forn");
	}
	public void embolicar() {
		System.out.println("Embolicant la " + nom + " per a regalar");
	}
	public void details()
	{
		StringBuffer display = new StringBuffer();
		display.append("\n---- " + nom + " ----");
		display.append("\n"+massa);
		display.append( "\n"+cobertura);
		for (int i = 0; i < decoracions.size(); i++)
		{
			display.append(decoracions.get(i) + "\n");
		}
		System.out.println("Hem encarregat una " + nom +"\n"+display+"\n-------------------------------------------------");
	}
}
