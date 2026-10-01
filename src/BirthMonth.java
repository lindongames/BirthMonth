import java.util.Scanner;

public class BirthMonth {

    public static void main(String[] args) {

        int monthValue = 0;
        Scanner inputScanner = new Scanner(System.in);
do {

// Asks the initial question
        System.out.println("What month were you born in? (in number form)");

        monthValue = inputScanner.nextInt();
        if (monthValue >= 1 && monthValue <= 12)
//within variable
        {System.out.println("Your birth month is: " + monthValue);

        }
        //Not within a variable
        else {
            System.out.println("You entered an incorrect month value:" + monthValue);

        }} while
(monthValue < 1 || monthValue > 12);
            }



    }