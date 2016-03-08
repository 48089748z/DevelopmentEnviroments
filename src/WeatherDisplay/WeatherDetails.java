package WeatherDisplay;

import java.util.ArrayList;

public class WeatherDetails
{
    private ArrayList<Member> members = new ArrayList<>();
    private Double temperatura;
    private Double humitat;
    private Double pressio;
    public void update(Double temperatura, Double humitat, Double pressio)
    {
        this.temperatura=temperatura;
        this.humitat=humitat;
        this.pressio=pressio;
        notifyMembers();
    }


    private Boolean isMember(Member member)
    {
        if (members.contains(member))
        {
            return true;
        }
        else return false;
    }

    public Double getTemperatura(Member member)
    {
        if (isMember(member))
        {
            return temperatura;
        }
        return null;
    }
    public Double getHumitat(Member member)
    {
        if (isMember(member))
        {
            return humitat;
        }
        return null;
    }
    public Double getPressio()
    {
        return pressio;
    }
    public void notifyMembers()
    {

    }

}
