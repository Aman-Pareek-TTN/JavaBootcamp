package springproject2.Q3;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements Person{


    public String getIdentification() {
        return "Teacher";
    }
}
