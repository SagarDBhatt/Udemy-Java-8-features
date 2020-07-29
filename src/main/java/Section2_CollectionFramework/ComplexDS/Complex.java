package Section2_CollectionFramework.ComplexDS;

import java.util.*;

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
        Set<String> driversSet = new LinkedHashSet<String>();

        Map<String,Set<String>> vehicleAndDriver = new LinkedHashMap<>();

        /**
         * Iterate vehicles and add each vehicle in the vehicleList.
         */
        for(int i =0; i<vehicles.length;i++){
            String vehicle = vehicles[i];
            String[] driver = drivers[i];

            Set<String> driverSet = new LinkedHashSet<>();
            for(String driverlist : driver){
                driverSet.add(driverlist);
            }

            vehicleAndDriver.put(vehicle,driverSet);
        }

        for(String vehicle : vehicleAndDriver.keySet()){
            System.out.println("Vehicle == " + vehicle + " Driver Set == " + vehicleAndDriver.get(vehicle));
        }
    }
}
