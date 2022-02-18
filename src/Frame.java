import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

//------------GUI COMPONENT------------//
public class Frame extends JFrame {

    // Make the JavaSwing Interface//
    JFrame frame = new JFrame();
    JTable table;
    JButton randomRace,calculatedRace;
    JScrollPane spn;
    Object[][] data;
    DriverStatics ds = new DriverStatics();

    String [] columnNames = {"Driver Name","Location","Driver Team", "Total Races", "1st Places Count", "2nd Places Count", "3rd Places Count", "Total Points" };


    public Frame (ArrayList<Formula1Driver> drivers) {

//Input data to the array//
        data = new Object[drivers.size()][7];

        for (int i= 0; i< drivers.size() ;i++) {
            data[i][0] = drivers.get(i).getDriverName();
            data[i][1] = drivers.get(i).getLocation();
            data[i][2] = drivers.get(i).getTeam();
            data[i][3] = drivers.get(i).getStatistic().getFirstPlaceCount();
            data[i][4] = drivers.get(i).getStatistic().getSecondPlaceCount();
            data[i][5] = drivers.get(i).getStatistic().getThirdPlaceCount();
            data[i][6] = drivers.get(i).getDriverPoints(ds);

 //2D array references -https://www.geeksforgeeks.org/multidimensional-arrays-in-java/ //
        }

        table = new JTable (new DefaultTableModel(data,columnNames));
        spn = new JScrollPane(table);

        frame.add(spn);

//Declaring 2 buttons//
        randomRace = new JButton( "Random Race");
        calculatedRace = new JButton("Advanced Race");
        add(randomRace);
        add(calculatedRace);
        JPanel btnPanel = new JPanel();
        btnPanel.add(calculatedRace);
        btnPanel.add(randomRace);
        frame.add(spn, BorderLayout.CENTER);
        frame.add(btnPanel, BorderLayout.SOUTH);

        frame.setTitle("Formula 1");
        frame.setSize(500,600);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Sorting JTable//
        table.setAutoCreateRowSorter(true);
//Sorting JTable References https://www.codejava.net/java-se/swing/6-techniques-for-sorting-jtable-you-should-know //

//Shuffle the Array//
        randomRace.addActionListener(e -> {

            Collections.shuffle(drivers);

            for (int i= 0; i< drivers.size() ;i++) {
                data[i][0] = drivers.get(i).getDriverName();
                data[i][1] = drivers.get(i).getLocation();
                data[i][2] = drivers.get(i).getTeam();
                data[i][3] = drivers.get(i).getStatistic().getFirstPlaceCount();
                data[i][2] = drivers.get(i).getStatistic().getSecondPlaceCount();
                data[i][2] = drivers.get(i).getStatistic().getThirdPlaceCount();
                //2D array references -https://www.geeksforgeeks.org/multidimensional-arrays-in-java/ //


            }


    });



}
}
