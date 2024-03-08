import java.util.ArrayList;

public class Person {
    //region private attributes
    private String _name;
    //endregion private attributes

    //region public methods
    public Person(String name, String firstname, String phonenumber, String emailaddress, ArrayList<String> languages)
    {
        _name = name;
    }

    public String getName(){
        return _name;
    }

    public String getFirstname(){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String getPhonenumber(){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String getEmailaddress(){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public ArrayList<String> getLanguages(){
        throw new UnsupportedOperationException("Not yet implemented");
    }
    //endregion public methods
}
