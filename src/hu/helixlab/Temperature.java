package hu.helixlab;

import java.util.Scanner;

/**
 * Created by Andrea on 2017.12.09..
 */
public class Temperature {
    private float[] temperatureArray = new float[10];

    //Létrehoztam egy 10 hellyel rendelkező float típusú tömböt, feltöltöttem a bekért adatokkal, forral megkerestem az
    //adatok maximumát és minimumát.
    public void getTemperatureDataFromConsole() {

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < temperatureArray.length; i++) {
            System.out.println("Kérek szépen egy hőmérsékleti adatot: ");
            float inputNum = scan.nextFloat();
            temperatureArray[i] = inputNum;
        }
    }

    public void printHighestTemperature() {
        float max = temperatureArray[0];
        for (int i = 0; i < temperatureArray.length; i++) {
            if (temperatureArray[i] > max) {
                max = temperatureArray[i];
            }

        }
        System.out.println("A legmagasabb hőmérséklet: " + max);
    }

    public void printLowestTemperature() {
        float min = temperatureArray[0];
        for (int i = 0; i < temperatureArray.length; i++) {
            if (temperatureArray[i] < min) {
                min = temperatureArray[i];
            }

        }
        System.out.println("A legalacsonyabb hőmérséklet: " + min);
    }
}
