import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Formula1ChampionshipManager implements   ChampionshipManager{
    private  BufferedReader reader;
    private Scanner myInput ;
    private ArrayList<Formula1Driver> drivers;
    private  ArrayList<String> carConstructor;
    private  int driverCount;

    private static String formularDb =new File(".").getAbsolutePath()+"//driverdetail.txt";
    Formula1ChampionshipManager(){
         reader = new BufferedReader(new InputStreamReader(System.in));
        myInput = new Scanner( System.in );
        drivers = new ArrayList<Formula1Driver>();
        carConstructor =new ArrayList<String>();
    }

    public void SetInitialDriverDetail(){
        try
        {
            FileInputStream fi = new FileInputStream(new File(formularDb));
            ObjectInputStream oi = new ObjectInputStream(fi);
            drivers  = (ArrayList<Formula1Driver>) oi.readObject();
            driverCount = (Integer)oi.readObject();
            carConstructor =  (ArrayList<String>) oi.readObject();
            oi.close();
            fi.close();
        }
        catch (Exception ex){
            drivers = new ArrayList<Formula1Driver>();
            carConstructor =new ArrayList<String>();
            driverCount =0;
        }
    }
    //Assigning keywords for functions
    public void GetMenu(String menuCode){
        switch (menuCode){
            case "CD":
                 CreateNewDriver();
                break;
            case "DD":
                DeleteDriver();
                break;
            case "DSD":
                DisplayStaticByDriver();
                break;
            case "DDT":
                DisplayDriversPoint();
                break;
            case "SD":
                SavingDetials();
                break;
            case "UD":
                 ChangeDriver();
                 break;
            case "EX":
                System.exit(0);

            default: System.out.println("Please enter valid menu code");
        }
    }

    //Collect details to make a new profile for a new driver
    private void CreateNewDriver(){
        try{

            System.out.println("Please enter driver name :");
            String driverName=  reader.readLine();
            System.out.println("Please enter location name :");
            String location=  reader.readLine();
            System.out.println("Please enter team name :");
            String team=  reader.readLine();
            if(IsConstructorExist(team)){
                return;
            }
            carConstructor.add(team);
            DriverStatics stats = new DriverStatics();
            System.out.println("Please enter 1st Places  :");
            int fPlaces= myInput.nextInt();
            System.out.println("Please enter 2nd Places  :");
            int sPlaces= myInput.nextInt();
            System.out.println("Please enter 3rd Places  :");
            int tPlaces= myInput.nextInt();

            System.out.println("Please enter 4th Places  :");
            int fourPlaces= myInput.nextInt();
            System.out.println("Please enter 5th Places  :");
            int fivePlaces= myInput.nextInt();
            System.out.println("Please enter 6th Places  :");
            int sixPlaces= myInput.nextInt();
            System.out.println("Please enter 7th Places  :");
            int sevenPlaces= myInput.nextInt();
            System.out.println("Please enter 8th Places  :");
            int eigPlaces= myInput.nextInt();
            System.out.println("Please enter 9th Places  :");
            int ninPlaces= myInput.nextInt();
            System.out.println("Please enter 10th Places  :");
            int tenPlaces= myInput.nextInt();

            System.out.println("Please enter faced races count :");
            int nRaces= myInput.nextInt();
            stats.setFirstPlaceCount(fPlaces);
            stats.setSecondPlaceCount(sPlaces);
            stats.setThirdPlaceCount((tPlaces));
            stats.setFourthPlacesCount(fourPlaces);
            stats.setFifthPlaces(fivePlaces);
            stats.setSixthPlaces(sixPlaces);
            stats.setSeventhPlaces(sevenPlaces);
            stats.setEightPlaces(eigPlaces);
            stats.setNinthPlaces(ninPlaces);
            stats.setTenthPlaces(tenPlaces);
            stats.setNumberOfRaces(nRaces);

            Formula1Driver newDriver= new Formula1Driver(driverName,location,team,stats);
            CreateNewDriver(newDriver);
        }
        catch(Exception ex){

        }
    }

    private Boolean IsConstructorExist(String item){
        for(int i = 0; i< carConstructor.size(); i++)
        {
            if(carConstructor.get(i).equals(item)){
                return  true;
            }
        }
        return  false;
    }

    //Delete a driver from the driver list
    private void DeleteDriver(){
        try{
            System.out.println("Please enter the new driver name :");
            String driverName=  reader.readLine();
            DeleteDriver(driverName);
        }
        catch(Exception ex){

        }
    }

    //Displace a driver from a team
    private void ChangeDriver(){
        try{
            System.out.println("Please enter driver name :");
            String driverName=  reader.readLine();
            System.out.println("Please enter old driver name :");
            String oldDriver=  reader.readLine();
            System.out.println("Please enter team name :");
            String teamName=  reader.readLine();
            ChangeDriver(oldDriver,driverName,teamName);
        }
        catch(Exception ex){

        }
    }

    //Display statistics of a driver
    private void  DisplayStaticByDriver(){
        try{
            System.out.println("Please enter driver name :");
            String driverName=  reader.readLine();
            DisplayStaticByDriver(driverName);
        }
        catch(Exception ex){

        }
    }

    private int GetDriverCount(){
        return drivers.size();
    }

    @Override
    public void CreateNewDriver(Formula1Driver newDriver) {
        drivers.add(newDriver);
        driverCount=GetDriverCount();
    }

    @Override
    public void DeleteDriver(String driverName) {
        for(int i=0 ; i<drivers.size(); i++){
            if(drivers.get(i).getDriverName().equals(driverName)){
                Formula1Driver driverDetail=   drivers.get(i);
                drivers.remove(driverDetail);
                carConstructor.remove(driverDetail.getTeam());
            }
            driverCount=GetDriverCount();
        }
    }

    @Override
    public void ChangeDriver(String oldDriver,String newDriver ,String newTeam) {
         for(int i=0 ;i<drivers.size();i++){
             if(drivers.get(i).getTeam().equals(newTeam)){
                drivers.get(i).setDriverName(newDriver);
             }
         }
    }

    @Override
    public void DisplayStaticByDriver(String driverName) {

        try{
            if(drivers.size()>0){
                for(int i=0 ; i<drivers.size();i++){
                    if(drivers.get(i).getDriverName().equals(driverName))
                    {
                        Formula1Driver driverDetail = drivers.get(i);
                        System.out.println("Driver name : "+driverDetail.getDriverName());
                        System.out.println("Driver team : "+driverDetail.getTeam());
                        System.out.println("===============================");
                        System.out.println("1st Places : " +driverDetail.getStatistic().getFirstPlaceCount() );
                        System.out.println("2nd Places : " +driverDetail.getStatistic().getSecondPlaceCount());
                        System.out.println("3rd Places : " +driverDetail.getStatistic().getThirdPlaceCount());
                        System.out.println("Number of races faced : " +driverDetail.getStatistic().getNumberOfRaces());
                        System.out.println("Total Points : " +driverDetail.getDriverPoints(driverDetail.getStatistic()));


                    }
                }
            }
            else{
                System.out.println("No driver static details to display");
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }


    @Override
    public void DisplayDriversPoint() {
        if(drivers.size()>0){
            for(int i=0 ; i<drivers.size();i++){
                Formula1Driver driverDetail = drivers.get(i);
                System.out.println("===================================");
                System.out.println("Driver name : "+driverDetail.getDriverName());
                System.out.println("1st Places : " +driverDetail.getStatistic().getFirstPlaceCount() );
                System.out.println("2nd Places : " +driverDetail.getStatistic().getSecondPlaceCount());
                System.out.println("3rd Places : " +driverDetail.getStatistic().getThirdPlaceCount());
                System.out.println("Number of races faced : " +driverDetail.getStatistic().getNumberOfRaces());
                System.out.println("Total Points : " +driverDetail.getDriverPoints(driverDetail.getStatistic()));
                System.out.println("===================================");

            }
        }


        else{
            System.out.println("No driver static details to display");
        }

        //Creating the Frame(JavaSwing) Object//
        Frame ob = new Frame(drivers);
    }

    @Override
    public void SavingDetials() {
        try {
            FileOutputStream f = new FileOutputStream(new File(formularDb));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(drivers);
            o.writeObject(driverCount);
            o.writeObject(carConstructor);
            o.close();
            f.close();
            System.out.println("The Object Was Successfully Written To A File");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
