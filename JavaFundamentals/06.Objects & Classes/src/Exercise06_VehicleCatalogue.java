import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise06_VehicleCatalogue {
    public static class Vehicle {
        private String type;
        private String model;
        private String colour;
        private int horsepower;

        public Vehicle(String type, String model, String colour, int horsepower) {
            this.type= type;
            this.model = model;
            this.colour = colour;
            this.horsepower = horsepower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColour() {
            return colour;
        }

        public int getHorsepower() {
            return horsepower;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String commandLine = sc.nextLine();
        double carAverageHp = 0.0;
        int carCount = 0;
        int trucksCount = 0;
        double truckAverageHp = 0.0;

        List<Vehicle> catalogueList = new ArrayList<>();

        while (!commandLine.equals("End")){
            String[] commandParts = commandLine.split(" ");
            String type = commandParts[0];
            String model = commandParts[1];
            String color = commandParts[2];
            int horsepower = Integer.parseInt(commandParts[3]);

            if (type.equals("car")) {
                type = "Car";
                carAverageHp += horsepower;
                carCount++;
            } else {
                type = "Truck";
                truckAverageHp += horsepower;
                trucksCount++;
            }
            Vehicle catalogue = new Vehicle(type,model,color,horsepower);
            catalogueList.add(catalogue);

            commandLine = sc.nextLine();
        }
        String finalCommand = sc.nextLine();

        while (!finalCommand.equals("Close the Catalogue")) {

            for (Vehicle current : catalogueList) {
                if (finalCommand.equals(current.getModel())){
                    System.out.printf("Type: %s%n",current.getType());
                    System.out.printf("Model: %s%n",current.getModel());
                    System.out.printf("Color: %s%n",current.getColour());
                    System.out.printf("Horsepower: %d%n",current.getHorsepower());
                }
            }
            finalCommand = sc.nextLine();
        }
        double averageCar = carAverageHp / carCount;
        double averageTruck = truckAverageHp / trucksCount;

        if (Double.isNaN(averageTruck)) {
            averageTruck = 0.0;
        } else if (Double.isNaN(averageCar)){
            averageCar = 0.0;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n",averageCar);
        System.out.printf("Trucks have average horsepower of: %.2f.",averageTruck);
    }
}

