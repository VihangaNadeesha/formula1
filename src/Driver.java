import java.util.ArrayList;
import java.io.Serializable;

public abstract   class Driver implements Serializable {
    private String DriverName;
    private String Location;
    private String Team;
    private DriverStatics Statistic;
    private int DriverPoints;
    protected ArrayList<DriverStatics> list=new ArrayList<DriverStatics>();
    Driver(String DriverName ,String Location ,String Team ,DriverStatics Statistic){
        this.DriverName = DriverName;
        this.Location =Location;
        this.Statistic =Statistic;

    }

    public String getDriverName(){
        return  this.DriverName;
    }
    public String getLocation() {return  this.Location;}
    public String getTeam(){return  this.Team;}
    public DriverStatics getStatistic(){return  this.Statistic; }
    public  void setDriverName(String value){this.DriverName =value;}
    public abstract  int getDriverPoints(DriverStatics statistic);

}
