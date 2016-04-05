package WeatherDisplayOBSERVER;
public class Member
{
    WeatherDetails weatherDetails;
    Integer id;
    String username;
    String password;
    public Member(WeatherDetails weatherDetails, Integer id, String username, String password)
    {
        this.weatherDetails=weatherDetails;
        this.id=id;
        this.username=username;
        this.password=password;
    }
    public void notifyMember()
    {
        System.out.println("\nNOTIFICATION for Member: "+username+", with ID: "+id+"!\nWEATHER DETAILS HAVE CHANGED!");
    }
    public void display()
    {
        System.out.println("\nDISPLAYING MEMBER: "+username.toUpperCase()+
                "\nTemperatura: "+weatherDetails.getTemperatura(this)+
                "\nHumitat: "+weatherDetails.getHumitat(this)+
                "\nPressió: "+weatherDetails.getPressio(this));
    }
}
