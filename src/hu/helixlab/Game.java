package hu.helixlab;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Andrea on 2017.12.09..
 */
public class Game {

    public void playBarcobaWithNumbers(){
        //Generáltam random számot, egy for ciklus segítségével
        // 10 lehetőséget adva bekérek lehetőségenként egy számot a konzolról,
        // ezeket összehasonlítottam if szerkezetekben, ezeknek megfelelően írja ki az eredményt.
        Random random = new Random();
        int randomNum = random.nextInt(51);
        Scanner scan = new Scanner(System.in);
        boolean wasWin = false;
        int count = 10;
        System.out.println("Gondoltam egy egész számra 0 és 50 között.\nKezdődjön a játék!");
        for (int i = 0; i <10; i++) {
            System.out.println("Mi a tipped? Lehetőségek száma: "+count);
            int inputNum = scan.nextInt();
            count--;
           if (inputNum<randomNum){
               System.out.println("A számod kisebb, mint amire én gondoltam!");
           }
            if (inputNum>randomNum){
                System.out.println("A számod nagyobb, mint amire én gondoltam!");
            }
            if (inputNum==randomNum){
                wasWin=true;
                System.out.println("Gratulálok, eltaláltad!");
                break;
            }
        }
        if (!wasWin){
            System.out.println("Egyszer sem találtad el a számot!Lúúúzer");
        }
    }
}
