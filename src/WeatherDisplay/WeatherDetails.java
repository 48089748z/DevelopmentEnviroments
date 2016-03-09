package WeatherDisplay;
import java.util.ArrayList;
public class WeatherDetails
{
    private ArrayList<Member> members = new ArrayList<>();
    private Double temperatura;
    private Double humitat;
    private Double pressio;
    protected void update(Double temperatura, Double humitat, Double pressio)
    {
        this.temperatura=temperatura;
        this.humitat=humitat;
        this.pressio=pressio;
        notifyMembers();
    }
    public void subscribe(Member member)
    {
        members.add(member);
    }
    public void notifyMembers()
    {
        for (Member member : members)
        {
            member.notifyMember();
        }
    }


    public Double getTemperatura(Member member)
    {
        if (members.contains(member)){ return temperatura;}
        else{return null;}
    }
    public Double getHumitat(Member member)
    {
        if (members.contains(member)){ return humitat;}
        else{return null;}
    }
    public Double getPressio(Member member)
    {
        if (members.contains(member)){ return pressio;}
        else{return null;}
    }
}
