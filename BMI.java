package bodyMassIndex;

/*Title: Body Mass Index
* Created: Saturday November 10, 2018
* Updated: Saturday November 10, 2018
* Owner: Stefanos Moungkoulis
* Email: stefanos.moungkoulis@gmail.com
* Description: Program to calculate the user's Body Mass Index and also, suggesting user to correct or limit their BMI
 * just so user is categorized as a Normal Weight Person.*/

import java.text.DecimalFormat;
import java.util.*;
public class BMI {

    static Scanner key = new Scanner(System.in); // Create a new Scanner so we can work with inputs.
    public static void main(String[] args) {
        double down = 18.5; // Minimum DMI in order to have Normal Weight
        double up = 25; // Maximum DMI in order to have Normal Weight
        System.out.println("Insert your total weight please: "); // Show this specific output to the user
        float varos = key.nextFloat(); // Save his inputted weight to varos

        System.out.println("Insert your height please: "); // Show this specific output to the user
        float ipsos = key.nextFloat(); // Save his inputted height to ipsos

        float diktis = varos / (ipsos * ipsos); // Determine his BMI | DMI = weight / (height^2)

        double elaxisto = down*(ipsos*ipsos); // Calculate the smaller possible DMI number in order to be categorized as Normal Weight person.
        double megisto = up*(ipsos*ipsos); // Calculate the bigger possible DMI number in order to be categorized as Normal Weight person.

        /*IF REPEAT
        * First Line: It outputs the BMI number.
        * Second Line: Tt just prints an empty line so we will have a clearer output.
        * Third Line:  It outputs the necessary changes to the users weight. In some chases it requires to add more kilos, in some chases it requires
        * the user not to lose more than a specific number of kilos etc. When needed Math.abs (absolute value) so we don't have minus.
        * Fourth Line: It just prints an empty line so we will have a clearer output
        * Fifth Line: It outputs the necessary changes to the users weight. In some chases it requires to add more kilos, in some chases it requires
        * the user not to lose more than a specific number of kilos etc. When needed Math.abs (absolute value) so we don't have minus.*/


        DecimalFormat df = new DecimalFormat(".00"); // New decimal format so we don't have those ugly numbers.

        if (diktis < 18.5){
            System.out.println("Your Body Mass Index is : "+diktis+" and you are at 1st Category. Elipovares Atomo.");
            System.out.println(" ");
            System.out.println("In order to achieve the correct BMI for having Normal Weight you need to gain : "+df.format(elaxisto-varos)+" more kilos");
            System.out.println(" ");
            System.out.println("In order to avoid exceeding the correct BMI for having Normal Weight you can't gain more than : "+df.format(megisto-varos)+" kilos");
        }
        else if (diktis >= 18.5 && diktis < 25){

            System.out.println("Your Body Mass Index is : "+diktis+" and you are at 2nd Category. Fisiologiko Varos.");
            System.out.println(" ");
            System.out.println("In order to stay at the correct BMI you should not loose more than : "+df.format(Math.abs((elaxisto-varos)))+" kilos");
            System.out.println(" ");
            System.out.println("In order to stay at the correct BMI you should not gain more than: "+df.format(megisto-varos)+" kilos");
        }
        else if (diktis >= 25 && diktis < 30){
            System.out.println("Your Body Mass Index is : "+(diktis)+" and you are at 3rd Category. Ipervaro Atomo.");
            System.out.println(" ");
            System.out.println("In order to be at the correct BMI you should not loose more than "+df.format(Math.abs((elaxisto-varos)))+" kilos");
            System.out.println(" ");
            System.out.println("In order to be at the correct BMI you should at least loose: "+df.format(Math.abs((megisto-varos)))+" kilos");
        }
        else{
            System.out.println("Your Body Mass Index is : "+diktis+" and you are at 4th category. Paxisarko Atomo.");
            System.out.println(" ");
            System.out.println("In order to be at the correct BMI you should not loose more than: "+df.format(Math.abs((elaxisto-varos)))+" kilos");
            System.out.println(" ");
            System.out.println("In order to be at the correct BMI you should at least loose: "+df.format(Math.abs((megisto-varos)))+" kilos");
        }

    }

}













