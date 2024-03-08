import java.util.ArrayList;

public class Person {
    //region private attributes
    private String _name;
    private String _firstname;
    private String _phonenumber;
    private String _emailaddress;
    private ArrayList<String> _languages;
    //endregion private attributes

    //region public methods
    public Person(String name, String firstname, String phonenumber, String emailaddress, ArrayList<String> languages)
    {
        _name = name;
        _firstname = firstname;
        _phonenumber = phonenumber;
        _emailaddress = emailaddress;
        _languages = languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        for (String language : languages) {
            if (!_languages.contains(language)) {
                _languages.add(language);
            }
        }
    }



    public String getName(){
        return _name;
    }

    public String getFirstname(){
        return _firstname;
    }

    public String getPhonenumber(){
        return _phonenumber;
    }

    public String getEmailaddress(){
        return _emailaddress;
    }

    public ArrayList<String> getLanguages(){
        return _languages;
    }
    //endregion public methods

    public void addLanguages(ArrayList<String> newLanguages) {
        for (String language : newLanguages) {
            if (!_languages.contains(language)) { // Évite les doublons
                _languages.add(language);
            }
        }
    }

}
