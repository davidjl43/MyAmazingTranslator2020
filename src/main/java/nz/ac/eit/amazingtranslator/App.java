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
        TranslationDictionaries dictionaries = new TranslationDictionaries();
        dictionaries.setDatasource(new TranslationInMemoryDatasource());
        dictionaries.initializeDictionaries();
        //Moved to TranslationDictionaries class

        InputCollector collector = new InputCollector();
        collector.collectNumber();
        //Moved to InputCollector class - Temporarily fixed? I think I might have cut and pasted a chunk to InputCollecter.java

        //JP Ehret placed this back into the App.Java file (this one)
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
        try {
            System.out.println(dictionaries.getTranslationOf(number, languageOption));
        } catch (LanguageNotSupportedException e) {
            System.out.println("Only french and german are supported.");
        } catch (NumberOutOfRangeException e) {
            System.out.println("Number should be between 1 and 30 (including)");
        }

    }
}