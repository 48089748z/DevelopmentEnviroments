package WeatherDisplay;

/**
 * Created by uRi on 09/03/2016.
 */
public class Controller
{
    public static void main(String[] args)
    {
        WeatherDetails weatherDetails = new WeatherDetails(); //INSTANCIEM UN WEATHERDETAILS.
        Member oriol = new Member(1, "48089748z", "alumne"); //CREEM UN MEMBER.
        weatherDetails.subscribe(oriol); //EL SUBSCRIBIM.
        weatherDetails.update(0.1, 0.2, 0.3); //FEM UN UPDATE PER VEURE SI NOTIFICA AL MEMBER, SI EL NOTIFICA.

        Member sergi = new Member(2, "sergi", "sergi123"); //CREEM UN ALTRE MEMBER PERO NO EL SUBSCRIBIM.
        weatherDetails.update(0.1, 0.2, 0.3); //FEM UN UPDATE PER VEURE SI NOTIFICA AL MEMBER NO SUBSCRIT, NO EL NOTIFICA.

        System.out.println(weatherDetails.getTemperatura(oriol)); //INTENTEM QUE EL MEMBER SUBSCRIT AGAFI UN ELEMENT, EL RESULTAT HAURIA DE SER 0.1
        System.out.println(weatherDetails.getTemperatura(sergi)); //INTENTEM QUE EL MEMBER NO SUBSCRIT AGAFI UN ELEMENT, EL RESULTAT HAURIA DE SER NULL
    }
}
