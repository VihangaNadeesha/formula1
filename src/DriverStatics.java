import java.io.Serializable;

//Getting statistics details of a new driver
public class DriverStatics implements Serializable {
    private int FirstPlaceCount ;
    private int SecondPlaceCount;
    private int ThirdPlaceCount;
    private int FourthPlacesCount;
    private int FifthPlaces;
    private int SixthPlaces;
    private int SeventhPlaces;
    private  int EightPlaces;
    private  int NinthPlaces;
    private  int TenthPlaces;
    private int NumberOfRaces;

    public int getFirstPlaceCount() {
        return FirstPlaceCount;
    }

    public int getSecondPlaceCount() {
        return SecondPlaceCount;
    }
    public int getThirdPlaceCount(){
        return  ThirdPlaceCount;
    }

    public int getFourthPlacesCount() {
        return FourthPlacesCount;
    }

    public int getFifthPlaces() {
        return FifthPlaces;
    }

    public int getSixthPlaces() {
        return SixthPlaces;
    }

    public int getSeventhPlaces() {
        return SeventhPlaces;
    }

    public int getEightPlaces() {
        return EightPlaces;
    }

    public int getNinthPlaces() {
        return NinthPlaces;
    }

    public int getTenthPlaces() {
        return TenthPlaces;
    }

    public int getNumberOfRaces() {
        return NumberOfRaces;
    }

    public void setFirstPlaceCount(int firstPlaceCount) {
        FirstPlaceCount = firstPlaceCount;
    }

    public void setSecondPlaceCount(int secondPlaceCount) {
        SecondPlaceCount = secondPlaceCount;
    }

    public void setThirdPlaceCount(int thirdPlaceCount) {
        ThirdPlaceCount = thirdPlaceCount;
    }

    public void setFourthPlacesCount(int fourthPlacesCount) {
        FourthPlacesCount = fourthPlacesCount;
    }

    public void setFifthPlaces(int fifthPlaces) {
        FifthPlaces = fifthPlaces;
    }

    public void setSixthPlaces(int sixthPlaces) {
        SixthPlaces = sixthPlaces;
    }

    public void setSeventhPlaces(int seventhPlaces) {
        SeventhPlaces = seventhPlaces;
    }

    public void setEightPlaces(int eightPlaces) {
        EightPlaces = eightPlaces;
    }

    public void setNinthPlaces(int ninthPlaces) {
        NinthPlaces = ninthPlaces;
    }

    public void setTenthPlaces(int tenthPlaces) {
        TenthPlaces = tenthPlaces;
    }

    public void setNumberOfRaces(int numberOfRaces) {
        NumberOfRaces = numberOfRaces;
    }
}
