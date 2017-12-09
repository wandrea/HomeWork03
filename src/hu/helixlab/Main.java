package hu.helixlab;

public class Main {

    public static void main(String[] args) {
        System.out.println(PasswordGenerator.generatePassword(10));
       // Game game = new Game();
        //game.playBarcobaWithNumbers();
        Temperature temperature = new Temperature();
        temperature.getTemperatureDataFromConsole();
        temperature.printHighestTemperature();
        temperature.printLowestTemperature();

    }
}
