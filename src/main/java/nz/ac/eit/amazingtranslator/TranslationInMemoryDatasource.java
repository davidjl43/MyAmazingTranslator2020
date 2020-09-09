package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;

public class TranslationInMemoryDatasource implements ITranslationDatasource {

    private List<String> germanTranslations=new ArrayList<>();
    private List<String> frenchTranslations=new ArrayList<>();

    public int initializeDictionaries(){

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

        return frenchTranslations.size();
    }

    public String getTranslationOf(int number, int languageOption) throws LanguageNotSupportedException, NumberOutOfRangeException{

        if (number < 1 || number > 30)  //Or symbol '||'
            throw new NumberOutOfRangeException();

        //Check that the option is either 1 or 2

        if (languageOption==1){
            return frenchTranslations.get(number-1);
        }
        else if (languageOption==2) {
            return germanTranslations.get(number - 1);
        }
        else {
            throw new LanguageNotSupportedException();
        }
    }

}