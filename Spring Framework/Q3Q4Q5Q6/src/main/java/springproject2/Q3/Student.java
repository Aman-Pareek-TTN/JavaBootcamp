package springproject2.Q3;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // Ambiguity Resolved (Question 5)
public class Student implements Person{

    public String getIdentification() {
        return "Student";
    }
}