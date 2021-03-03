package springproject2.Q3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Q3Q4Q5Q6Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Q3Q4Q5Q6Application.class,args);

        PrintClass printClass=applicationContext.getBean(PrintClass.class);

        //Accessing Bean's Property (Question 4)
        printClass.printPerson();
    }
}
