package nz.ac.eit.amazingtranslator;

public class TranslationStubDatasource implements ITranslationDatasource{

    @Override
    public int initializeDictionaries() {
        return 0;
    }

    @Override
    public String getTranslationOf(int number, int languageOption) throws LanguageNotSupportedException, NumberOutOfRangeException{

        if (languageOption==1){
            switch(number){
                case 1:
                    return "Un";
                case 2:
                    return "Deux";
            }
        }
        else {
            switch (number){
                case 1:
                    return "Einz";
                case 2:
                    return "Zwei";
            }
        }

        return null;
    }

}