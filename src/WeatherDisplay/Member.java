package WeatherDisplay;
public class Member
{
    Integer id;
    String username;
    String password;
    public Member(Integer id, String username, String password)
    {
        this.id=id;
        this.username=username;
        this.password=password;
    }
    public void notifyMember()
    {
        System.out.println("\nNOTIFICATION for Member: "+username+", with ID: "+id+"!\nWEATHER DETAILS HAVE CHANGED!");
    }
}
