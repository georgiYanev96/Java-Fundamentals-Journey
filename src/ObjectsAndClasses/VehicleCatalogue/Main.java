package ObjectsAndClasses.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//You have to make a catalogue for vehicles. You will receive two types of vehicle - car or truck.
//Until you receive the command "End" you will receive lines of input in the format:
//{typeOfVehicle} {model} {color} {horsepower}
//After the "End" command, you will start receiving models of vehicles. Print for every received vehicle its data in the format:
//Type: {typeOfVehicle}
//Model: {modelOfVehicle}
//Color: {colorOfVehicle}
//Horsepower: {horsepowerOfVehicle}
//
//When you receive the command "Close the Catalogue", stop receiving input and print the average horsepower
//for the cars and for the trucks in the format:
//"{typeOfVehicles} have average horsepower of {averageHorsepower}."
//The average horsepower is calculated by dividing the sum of horsepower for all vehicles of the type by the
//total count of vehicles from the same type.
//Format the answer to the 2nd decimal point.
//Constraints
//•	The type of vehicle will always be car or truck
//•	You will not receive the same model twice
//•	The received horsepower will be integer in the interval [1…1000]
//•	You will receive at most 50 vehicles
//•	Single whitespace will be used for separator
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> myVehicles = new ArrayList<>();
        boolean toContinue = true;
        while (toContinue){
            String[] input = scanner.nextLine().split(" ");
            if(input[0].equals("End")) {
                toContinue = false;
                break;
            }
            //input - {typeOfVehicle} {model} {color} {horsepower}
            Vehicle current = new Vehicle();
            current.setType(input[0]);
            current.setModel(input[1]);
            current.setColor(input[2]);
            current.setHorsepower(Integer.parseInt(input[3]));
            myVehicles.add(current);
        }
        toContinue = true;
        while (toContinue) {
            String input = scanner.nextLine();
            if (input.equals("Close the Catalogue")) {
                toContinue = false;
                break;
            }
            for (int i = 0; i < myVehicles.size(); i++) {
                if(myVehicles.get(i).getModel().equals(input)){
                    System.out.println(myVehicles.get(i).toString());
                }
            }

        }
        double carsAverageHorsepower = 0;
        int carsCounter = 0;
        double trucksAverageHorsepower = 0;
        int trucksCounter = 0;
        for (int i = 0; i < myVehicles.size(); i++) {
            if(myVehicles.get(i).getType().equals("car")){
                carsAverageHorsepower = carsAverageHorsepower + myVehicles.get(i).getHorsepower();
                carsCounter++;
            }else{
                trucksAverageHorsepower = trucksAverageHorsepower + myVehicles.get(i).getHorsepower();
                trucksCounter++;
            }
        }
        carsAverageHorsepower = carsAverageHorsepower / carsCounter;
        trucksAverageHorsepower = trucksAverageHorsepower / trucksCounter;
        System.out.printf("Cars have average horsepower of: %.2f.%n",carsAverageHorsepower);
        System.out.printf("Trucks have average horsepower of: %.2f.",trucksAverageHorsepower);
    }
}
