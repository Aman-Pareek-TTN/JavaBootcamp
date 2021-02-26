import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.platform.engine.support.hierarchical.ThrowableCollector;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {

    EmailService emailServiceInstance;

    @BeforeEach
    void setup(){
        emailServiceInstance=EmailService.getInstance();
    }

    @Test
    void getInstanceTest() {
        //given
        EmailService newEmailServiceInstance=EmailService.getInstance();

        //when
        EmailService resultEmailServiceInstance=EmailService.getInstance();

        //then
        assertEquals(newEmailServiceInstance,resultEmailServiceInstance);

    }

    @Test
    void sendEmail_TestWithOrderOnlyParameter_shouldThrowRuntimeExpception() {

        //given
        EmailService newEmailServiceInstance=EmailService.getInstance();
        Order newOrder=new Order();
        boolean excepted=true;

        //when
        Executable executable = ()-> newEmailServiceInstance.sendEmail(newOrder);


        //then
        assertThrows(RuntimeException.class, (org.junit.jupiter.api.function.Executable) executable);

    }

    @Test
    void should_Test_SendEmailWithOrderAndCcEmailParametersReturnTrue_WhenObjectOrCcIsValid() {
        //given
        EmailService newEmailServiceInstance=EmailService.getInstance();
        Order newOrder=new Order(1,"cellphone",25000);
        String cc="example.myemail@gmail.com";
       // boolean excepted=true;

        //when
        boolean res=newEmailServiceInstance.sendEmail(newOrder,cc);

        //then
        assertTrue(res);
    }

    @Test
    void should_Test_SendEmailWithOrderAndCcEmailParametersReturnFalse_WhenObjectOrCcIsInvalid() {
        //given
        EmailService newEmailServiceInstance=EmailService.getInstance();
        Order newOrder=new Order(1,"cellphone",25000);
        String cc=null;

        //when
        boolean res=newEmailServiceInstance.sendEmail(newOrder,cc);

        //then
        assertFalse(res);
    }
}