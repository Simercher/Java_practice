import java.util.Scanner;

public class mileTokKilometer {
     public static void main(String[] args) {
          Scanner mile = new Scanner(System.in);
          float kiloMeter = mile.nextFloat();
          // kiloMeter = Math.round(kiloMeter * 1.6);
          kiloMeter *= 1.6;
          System.out.printf("%.2f", kiloMeter);
          mile.close();
     }
}