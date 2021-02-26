import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private int quantity=5;
    private String itemName="Soap";
    private double price=13.50;

    private Order order;

    @BeforeEach
    void setup(){
        this.order=new Order(quantity,itemName,price);
    }

    @AfterEach
    void printMessage(){
        System.out.println("Unit test is completed");

    }

    @org.junit.jupiter.api.Test
    void getQuantityTest(){
        //given
        quantity=5;

        //when
        int resultQuantity= order.getQuantity();

        //then
        assertEquals(quantity,resultQuantity);
    }

    @org.junit.jupiter.api.Test
    void setQuantityTest() {
        //given
        int newQuantity=8;

        //when
        //Order newOrder=new Order();
        Order resultOrderObject=order.setQuantity(newQuantity);
        int resultQuantity=resultOrderObject.getQuantity();

        //then
        assertEquals(newQuantity,resultQuantity);
    }

    @org.junit.jupiter.api.Test
    void getItemNameTest() {

        //given
        itemName="Soap";

        //when
        String resultItemName=order.getItemName();

        //then
        assertEquals(itemName,resultItemName);
    }

    @org.junit.jupiter.api.Test
    void setItemNameTest() {

        //given
        String newItemname="Bat";

        //when
        Order resultOrderObject=order.setItemName(newItemname);
        String resultItemName=resultOrderObject.getItemName();

        //then
        assertEquals(newItemname,resultItemName);

    }

    @org.junit.jupiter.api.Test
    void getPriceTest() {

        //given
        price=13.50;

        //when
        double resultPrice=order.getPrice();

        //then
        assertEquals(price,resultPrice);
    }

    @org.junit.jupiter.api.Test
    void setPriceTest() {

        //given
        double newPrice=14.9;

        //when
        Order resultOrderObject=order.setPrice(newPrice);
        double resultPrice=resultOrderObject.getPrice();

        //then
        assertEquals(newPrice,resultPrice);
    }

    @org.junit.jupiter.api.Test
    void getPriceWithTexTest() {
        //given
        double texPrice=price+5.5;

        //when
        double resultPrice=order.getPriceWithTex();

        //then
        assertEquals(texPrice,resultPrice);
    }

    @org.junit.jupiter.api.Test
    void setPriceWithTexTest() {

        //given
        double texPrice=price+5.5;

        //when
        Order resultOrderObject=order.setPriceWithTex(texPrice);
        double resultTexPrice=resultOrderObject.getPriceWithTex();

        //then
        assertEquals(texPrice,resultTexPrice);


    }
}