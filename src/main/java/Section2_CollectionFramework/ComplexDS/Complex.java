package Section2_CollectionFramework.ComplexDS;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Complex {

    public static String[] vehicles = {"Bus", "Car", "Van", "Bike"};

    public static String[][] drivers = {
            {"Ram", "Sam", "Kan"},
            {"Josh", "Kosh", "Hosh", "Rosh"},
            {"Ja", "Ra", "Ma"},
            {"Ken", "Ren"}
    };

    public static void main(String[] args) {

        List<String> vehiclesList = new ArrayList<String>();
        String[] driver= new String[vehicles.length];
        Set<String> driversSet = new LinkedHashSet<String>();

        /**
         * Iterate vehicles and add each vehicle in the vehicleList.
         */
        for (String vehicle : vehicles) {
            vehiclesList.add(vehicle);


        }




        for (int i = 0; i < drivers.length; i++) {
            driver = drivers[i];
            System.out.println(" Drivers Length" + drivers.length);

            for(String driverName : driver)
                driversSet.add(driverName);
        }

       /* System.out.println("Vehicles List = " + vehiclesList.toString());
        System.out.println("Drivers List = " + driversSet.toString());*/

    }
}
