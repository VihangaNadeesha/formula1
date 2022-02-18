
public class Formula1Driver  extends Driver  {

    Formula1Driver(String DriverName, String Locaton, String Team ,DriverStatics stats) {
        super(DriverName, Locaton, Team ,stats);
    }

    //Marks offering to a driver when won a place between 1 and 10
    @Override
    public int getDriverPoints(DriverStatics statistic) {
        return statistic.getFirstPlaceCount()*25
                +statistic.getSecondPlaceCount()*18
                +statistic.getThirdPlaceCount()*15
                +statistic.getFourthPlacesCount()*12
                +statistic.getFifthPlaces()*10
                +statistic.getSixthPlaces()*8
                +statistic.getSeventhPlaces()*6
                +statistic.getEightPlaces()*4
                +statistic.getNinthPlaces()*2
                +statistic.getTenthPlaces()*1;

    }
}
