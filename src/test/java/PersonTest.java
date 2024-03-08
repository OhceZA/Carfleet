import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {
    //region private attributes
    private static String _name = "Einstein";
    private static String _firstname = "Albert";
    private static String _phonenumber = "+41793456789";
    private static String _emailaddress = "ae@relativity.org";

    private static ArrayList<String> _languages = new ArrayList<String>();
    private static Person _person;
    //endregion private attributes

    @BeforeAll
    public static void beforeAll() {
        _languages = new ArrayList<String>();
        _person = new Person(_name, _firstname, _phonenumber, _emailaddress, _languages);
    }

    @Test
    public void allProperties_afterInstantiation_getCorrectValues() {
        //given
        //refer to BeforeAll method

        //when
        //refer to BeforeAll method

        //then
        assertEquals(_name, _person.getName());
    }

    @Test
    public void AllProperties_AfterInstantiation_GetCorrectValues()
    {
        //given

        //when

        //then
        assertEquals(_name, _person.getName());
        assertEquals(_firstname, _person.getFirstname());
        assertEquals(_phonenumber, _person.getPhonenumber());
        assertEquals(_emailaddress, _person.getEmailaddress());
        assertEquals(_languages, _person.getLanguages());
    }

    @Test
    public void languages_AddFirstLanguage_getCorrectUniqueLanguage() {
        ArrayList<String> initialLanguages = new ArrayList<>();
        initialLanguages.add("French");
        String expectedLanguage = "French";
        _person.setLanguages(initialLanguages);
        assertEquals(expectedLanguage, _person.getLanguages().getFirst());
    }

    @Test
    public void languages_AddMultipleLanguagesAtOnce_GetCorrectListOfLanguages() {
        // given
        ArrayList<String> expectedLanguages = new ArrayList<>();
        expectedLanguages.add("French");
        expectedLanguages.add("Spanish");
        expectedLanguages.add("German");

        // when
        _person.setLanguages(new ArrayList<>(expectedLanguages)); // La conversion est nécessaire si setLanguages attend ArrayList spécifiquement.

        // then
        assertEquals(expectedLanguages.size(), _person.getLanguages().size());
        for(String expectedLanguage : expectedLanguages) {
            assertTrue(_person.getLanguages().contains(expectedLanguage));
        }
    }

    @Test
    public void Languages_AddMultipleLanguagesInExistingLanguagesList_GetCorrectListOfLanguages()
    {
        //given
        ArrayList<String> initialLanguages = new ArrayList<>();
        initialLanguages.add("French");
        initialLanguages.add("Spanish");
        initialLanguages.add("German");

        ArrayList<String> additionalLanguages = new ArrayList<>();
        additionalLanguages.add("Vietnamese");

        ArrayList<String> expectedLanguages = new ArrayList<>(initialLanguages);
        expectedLanguages.addAll(additionalLanguages);

        _person.setLanguages(initialLanguages);
        Assertions.assertEquals(initialLanguages.size(), _person.getLanguages().size());

        //when
        _person.setLanguages(additionalLanguages);

        //then
        Assertions.assertEquals(expectedLanguages.size(), _person.getLanguages().size());
        for (String expectedLanguage : expectedLanguages) {
            assertTrue(_person.getLanguages().contains(expectedLanguage));
        }
    }

    @Test
    public void languages_AddMultipleLanguagesInExistingLanguagesListWithDuplicate_GetCorrectListOfLanguages() {
        // given
        ArrayList<String> additionalLanguages = new ArrayList<>();
        additionalLanguages.add("Vietnamese");
        additionalLanguages.add("French");
        additionalLanguages.add("French");
        additionalLanguages.add("Spanish");
        additionalLanguages.add("German");
        additionalLanguages.add("Vietnamese");
        ArrayList<String> expectedLanguages = new ArrayList<>();
        expectedLanguages.add("French");
        expectedLanguages.add("Spanish");
        expectedLanguages.add("German");
        expectedLanguages.add("Vietnamese");

        // Pour ajouter des langues sans remplacer la liste existante, supposons l'existence d'une méthode addLanguages dans Person
        _person.addLanguages(new ArrayList<>(additionalLanguages)); // Cette méthode n'existe pas dans votre exemple original; vous devrez l'implémenter.

        // then
        Assertions.assertEquals(expectedLanguages.size(), _person.getLanguages().size(), "Le nombre de langues ne correspond pas.");

        for (String expectedLanguage : expectedLanguages) {
            assertTrue(_person.getLanguages().contains(expectedLanguage), "La langue attendue n'est pas présente : " + expectedLanguage);
        }
    }
}
