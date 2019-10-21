import java.util.Scanner;

public class program1 {

    public static void main(String[] args) {

        double g = 9.8337;

        Scanner scan = new Scanner(System.in);

        System.out.println("Indtast din højde i meter");


        boolean fejl = true;

        while (fejl = true) {

            double h = scan.nextDouble();
            if (h >= 0) {
                double t = Math.sqrt((2 * h) / g);

                System.out.println("Stenen falder i " + t + "s");
                fejl = false;
            } else
                System.out.println("fejl, prøv igen; Husk din indtastning ikke kan være negativ!");


        }

    }
}
