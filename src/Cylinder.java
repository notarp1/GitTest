import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Indtast radius for en cylinder");
            double Radius = scan.nextDouble();
            System.out.println("Indtast højde for en cylinder");
            double Height = scan.nextDouble();
            double resultat = (Math.PI * (Math.pow(Radius, Radius) * Height));
            System.out.printf("Rumfanget af den ønskede cylinder er: " + "%.2f", resultat);
            System.out.println("");
        }while (true);
    }
}
