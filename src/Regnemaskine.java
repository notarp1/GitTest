import java.util.Scanner;

public class Regnemaskine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Indtast tal nummer 1");
        int a = scan.nextInt();
        System.out.println("Indtast tal nummer 2");
        int b = scan.nextInt();
        
        System.out.println("Dit resultat er ikke");



        //Konflikt test
        int resultat = a - b;
        //minus
        System.out.println(resultat);

    }
}