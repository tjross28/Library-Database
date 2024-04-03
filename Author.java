/*  TJ Ross
    2/25/24
    Comp 167 Section: 004
    Description: Uses constructors, getters and setters to populate the author object. 
 */




public class Author {
   private String firstName;
   private String lastName;  // First and last name declarations

    public Author() {
        this.firstName = "";
        this.lastName = "";
    }


    public Author (String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;  //Public author method that has parameters of a firstname and lastname


    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

                                                                //Accessor and mutator methods
    public void setfName(String firstName) {
        this.firstName = firstName;
    }

    public void setlname(String lastName) {
        this.lastName = lastName;
    }


    public String toString() {
        return "First Name: " + this.firstName + "\nLast Name: " + this.lastName;    //Method to return object as string
    }



}
