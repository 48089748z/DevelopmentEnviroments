package WeatherDisplay;
public class Controller
{
    public static void main(String[] args)
    {
        WeatherDetails weatherDetails = new WeatherDetails(); //INSTANCIEM UN WEATHERDETAILS.

        Member oriol = new Member(1, "Oriol", "oriol123");  //CREEM UN MEMBER.
        weatherDetails.subscribe(oriol);                      //EL SUBSCRIBIM.
        Member sergi = new Member(2, "Sergi", "sergi123");    //CREEM UN ALTRE MEMBER PERO NO EL SUBSCRIBIM.

        //FEM UN UPDATE PER VEURE A QUI NOTIFICA. NOMÉS NOTIFICARÁ AL MEMBER SUBSCRIT.
        weatherDetails.update(0.1, 0.2, 0.3);

        //INTENTEM QUE EL MEMBER SUBSCRIT AGAFI ELS ELEMENTS, ELS RESULTATS HAURIEN DE SER 0.1, 0.2 i 0.3.
        System.out.println("\nTemperatura: "+weatherDetails.getTemperatura(oriol)+"\nHumitat: "+weatherDetails.getHumitat(oriol)+"\nPressió: "+weatherDetails.getPressio(oriol));

        //INTENTEM QUE EL MEMBER NO SUBSCRIT AGAFI ELS ELEMENTS, EL RESULTAT HAURIA DE SER NULL, NULL i NULL.
        System.out.println("\nTemperatura: "+weatherDetails.getTemperatura(sergi)+"\nHumitat: "+weatherDetails.getHumitat(sergi)+"\nPressió: "+weatherDetails.getPressio(sergi));
    }
}
