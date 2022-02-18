import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    private static int IterateID=0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        //Displaying the menu
        System.out.println("Formula 1 Championship Manager");
        System.out.println("===========================================");
        System.out.println("Menu Item");
        System.out.println("");
        System.out.println("Create Driver : CD");
        System.out.println("Delete Driver : DD");
        System.out.println("Change Driver : UD");
        System.out.println("Display Static : DSD");
        System.out.println("Display Driver Table : DDT");
        System.out.println("Save Detail : SD");
        System.out.println("Exit Application : EX");
        System.out.println("===========================================");

        System.out.println("");
        System.out.println("");


        Formula1ChampionshipManager obj = new Formula1ChampionshipManager();
        obj.SetInitialDriverDetail();
        while (IterateID < 1) {
            System.out.println("Please enter menu code :");
            String MenuCode = reader.readLine().toUpperCase(Locale.ROOT);
            obj.GetMenu(MenuCode);
        }


    }


    }
