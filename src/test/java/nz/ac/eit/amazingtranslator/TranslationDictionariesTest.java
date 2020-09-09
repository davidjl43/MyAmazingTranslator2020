package nz.ac.eit.amazingtranslator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TranslationDictionariesTest {

    private TranslationDictionaries translationDictionaries;

    @Before
    public void setup(){
        translationDictionaries=new TranslationDictionaries();

        //Stub
        //translationDictionaries.setDatasource(new TranslationStubDatasource());

        //Mock
        ITranslationDatasource mock=Mockito.mock(ITranslationDatasource.class);

        try {
            Mockito.when(mock.getTranslationOf(1, 1)).thenReturn("Un");
            Mockito.when(mock.getTranslationOf(2, 1)).thenReturn("Deux");
            Mockito.when(mock.getTranslationOf(3, 1)).thenReturn("Trois");
            Mockito.when(mock.getTranslationOf(1, 2)).thenReturn("Ein");
            Mockito.when(mock.getTranslationOf(2, 2)).thenReturn("Zwei");
            Mockito.when(mock.getTranslationOf(3, 2)).thenReturn("Drei");
        }   catch(LanguageNotSupportedException e) {
            e.printStackTrace();
        }   catch(NumberOutOfRangeException e) {
            e.printStackTrace();
        }






        translationDictionaries.setDatasource(mock);


        translationDictionaries.initializeDictionaries();
    }

    @Test
    public void getTranslationOf_12InFrench_returnDouze(){
        TranslationDictionaries translationDictionaries=new TranslationDictionaries();
        translationDictionaries.initializeDictionaries();
        try {
            String result=translationDictionaries.getTranslationOf(12, 1);
            Assert.assertEquals("The translation of 12 in French should be Douze", result);
        } catch (LanguageNotSupportedException e) {
            e.printStackTrace();
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getTranslationOf_13InFrench_returnDouze(){
        TranslationDictionaries translationDictionaries=new TranslationDictionaries();
        translationDictionaries.initializeDictionaries();
        try {
            String result=translationDictionaries.getTranslationOf(13, 1);
            Assert.assertEquals("The translation of 13 in French should be Douze", result);
        } catch (LanguageNotSupportedException e) {
            e.printStackTrace();
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        } catch (Throwable th){
            Assert.fail("The code is an error.");
        }
    }

    @Test(expected=NumberOutOfRangeException.class)
    public void getTranslationOf_31InFrench_throwsNumberOutOfRangeException() throws NumberOutOfRangeException {
        TranslationDictionaries translationDictionaries = new TranslationDictionaries();
        translationDictionaries.initializeDictionaries();
        try {
            String result = translationDictionaries.getTranslationOf(31, 1);
            //Assert.assertEquals("The translation of 31 in French should be Trente-et-un", result);
        } catch (LanguageNotSupportedException e) {
            e.printStackTrace();
        }
    }

}