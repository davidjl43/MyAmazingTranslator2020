package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> frenchTranslations=new ArrayList<>();
        frenchTranslations.add("Un");
        frenchTranslations.add("Deux");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Quatre");
        frenchTranslations.add("Cinq");
        frenchTranslations.add("Six");
        frenchTranslations.add("Sept");
        frenchTranslations.add("Huit");
        frenchTranslations.add("Neuf");
        frenchTranslations.add("Dix");
        frenchTranslations.add("Onze");
        frenchTranslations.add("Douze");
        frenchTranslations.add("Treize");
        frenchTranslations.add("Quatorze");
        frenchTranslations.add("Quinze");
        frenchTranslations.add("Seize");
        frenchTranslations.add("Dix-sept");
        frenchTranslations.add("Dix-huit");
        frenchTranslations.add("Dix-neuf");
        frenchTranslations.add("Vingt");
        frenchTranslations.add("Vingt et un");
        frenchTranslations.add("Vingt deux");
        frenchTranslations.add("Vingt trois");
        frenchTranslations.add("Vingt quatre");
        frenchTranslations.add("Vingt cinq");
        frenchTranslations.add("Vingt six");
        frenchTranslations.add("Vingt sept");
        frenchTranslations.add("Vingt huit");
        frenchTranslations.add("Ving neuf");
        frenchTranslations.add("Trente");

        List<String> germanTranslations=new ArrayList<>();
        germanTranslations.add("Ein");
        germanTranslations.add("Zwei");
        germanTranslations.add("Drei");
        germanTranslations.add("Vier");
        germanTranslations.add("Fünf");
        germanTranslations.add("Sechs");
        germanTranslations.add("Sieben");
        germanTranslations.add("Acht");
        germanTranslations.add("Neun");
        germanTranslations.add("Zehn");
        germanTranslations.add("elf");
        germanTranslations.add("zwölf");
        germanTranslations.add("dreizehn");
        germanTranslations.add("vierzehn");
        germanTranslations.add("fünfzehn");
        germanTranslations.add("Sechszehn");
        germanTranslations.add("siebzhen");
        germanTranslations.add("achtzhen");
        germanTranslations.add("neunzhen");
        germanTranslations.add("zwanzig");
        germanTranslations.add("einundzwanzig");
        germanTranslations.add();
        germanTranslations.add();
        germanTranslations.add();
        germanTranslations.add();
        germanTranslations.add();
        germanTranslations.add();
        germanTranslations.add();
        germanTranslations.add();
        germanTranslations.add();




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

        System.out.println("What language would you like to translate to?");
        System.out.println("Please type 1 for french, and 2 for german.");
        String languageOptionAsString=scanner.nextLine();
        Integer languageOption=null;
        try {
            languageOption = Integer.parseInt(languageOptionAsString);
            System.out.println(languageOption);
        }
        catch (NumberFormatException nfe){
            System.out.println("Wrong data type.");
            System.out.println("Please enter a number...");
            System.exit(0);
        }

        //Check that the option is 1 or 2
        if (languageOption==1){
            System.out.println(frenchTranslations.get(number-1));
        }



    }
}