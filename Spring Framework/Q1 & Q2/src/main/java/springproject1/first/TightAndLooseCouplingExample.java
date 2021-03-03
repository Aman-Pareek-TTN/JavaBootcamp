package springproject1.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TightAndLooseCouplingExample {
    public static void main(String[] args) {

        //We have to create another objects
        //for classes that are tightly coupled
        //its hard-coded
        TightCouplingClass1 tightCouplingClass1=new TightCouplingClass1();
        TightCouplingClass2 tightCouplingClass2=new TightCouplingClass2();
        tightCouplingClass1.print();
        tightCouplingClass1.print();

        //We are using same interface
        //for classes that are loosely coupled
        //runtime change will be here
        //its soft-coded
        LooseCouplingInterface looseCouplingInterfaceClasses= new LooseCouplingClass1();
        looseCouplingInterfaceClasses.print();

        looseCouplingInterfaceClasses= new LooseCouplingClass2();
        looseCouplingInterfaceClasses.print();

    }
}
