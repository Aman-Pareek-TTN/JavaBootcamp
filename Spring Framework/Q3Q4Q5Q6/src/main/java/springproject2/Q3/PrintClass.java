package springproject2.Q3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //Making this class object a bean(Question 3)
public class PrintClass {

    @Autowired //Dependency (Question 3)
    Person person;

    //After dependency declaration
    //we can either add bean to it using
    //1. setters and 2. constructor
    //so we used constructor injection here

    //Constructor Injection (Question 6)
    public PrintClass(Person person) {
        this.person = person;
    }

    public void printPerson()
    {
        System.out.println("This Person is a " + person.getIdentification());
    }
}
