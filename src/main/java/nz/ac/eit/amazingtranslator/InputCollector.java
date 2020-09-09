package nz.ac.eit.amazingtranslator;

import java.util.Scanner;

public class InputCollector {

    public int collectNumber() {
        System.out.println("What is the number you would like to translate?");
        System.out.println("Please type from 1-30. (numerical)");
        Scanner scanner=new Scanner(System.in);  //System.in means the default input on the pc (computer keyboard)
        //scanner.nextInt(); //Scan the next number typed on keyboard. (Without sanitation, will crash program)
        String numberAsString=scanner.nextLine();


        //System.out.println(numberAsString);
        Integer number=null;
        try {
            number = Integer.parseInt(numberAsString); //Checks that the 'numberAsString' variable is an int - throws exception if not
            System.out.println(number);
        }
        catch(NumberFormatException nfe){ //If the try block works, then catch won't be executed - exception won't be thrown
            System.out.println("The number has to be a numeric");
            System.exit(0);
        }

        return 0;

    }

    public int collectLanguage() {
return 0;
    }

    //public int collectRepeat(){ This can be uncommented when added into the App part
    //}
}
