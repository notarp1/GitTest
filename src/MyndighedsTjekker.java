import java.sql.SQLOutput;

public class MyndighedsTjekker{

    public static void main (String[] args){
//tilføjer dette tekst
        double alder;

        java.util.Scanner brugerinput = new java.util.Scanner(System.in);

        alder = brugerinput.nextInt();

        if (alder < 18) {

            System.out.println("Du er ikke myndig!");

        } //hej

        if (alder > 18) {


            System.out.println("Du er myndig!");


        }




    }


}