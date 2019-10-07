import java.util.Scanner;

public class Regnemaskine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Indtast tal nummer 1");
        int a = scan.nextInt();
        System.out.println("Indtast tal nummer 2");
        int b = scan.nextInt();
        int resultat = a * b;
        System.out.println(resultat);

    }
}
