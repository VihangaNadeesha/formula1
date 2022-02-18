public interface ChampionshipManager {
    public void CreateNewDriver(Formula1Driver newDriver);
    public void DeleteDriver(String driverName);
    public void ChangeDriver(String oldDriver,String newDriver ,String newTeam);
    public void DisplayStaticByDriver(String driverName);
    public void DisplayDriversPoint();
    public void SavingDetials();

}
