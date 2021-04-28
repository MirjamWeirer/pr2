package einheit3;

public class Person {
    public String firstName;
    public String lastName;

    public Person(String fName, String lName){
        firstName = fName;
        lastName = lName;
    }

    public void doSomething(){
        System.out.println(firstName +" "+ lastName);
    }
}
