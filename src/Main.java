import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        int counter = 0;
        double sum = 0;
        System.out.println("For how many days you want to compute the average");
        int size = keyboard.nextInt();
        double[] temperature = new double[size];
        System.out.println("We will compute average for: " + size +"  days");
        for(int i = 0; i<temperature.length; i++)
        {
            System.out.println("Enter temperature for day: " + (i+1));
            temperature[i] = keyboard.nextDouble();
            sum = sum+ temperature[i];

        }
        double average = sum/temperature.length;
        for(int i  = 0; i< temperature.length; i++)
        {
            if(temperature[i] > average)
            {


                temperature[counter] = temperature[i];
                counter++;

            }
        }
        System.out.println("Average is: " + average);
        System.out.println( counter + " days temperature is above the average");
        System.out.println("Days temperature above the average");
        for(int i = 0; i<counter; i++)
        {
            System.out.println(temperature[i]);

        }






    }
}
