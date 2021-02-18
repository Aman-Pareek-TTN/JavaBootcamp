package com.company;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date myDateObj=new Date();

        System.out.println("Before Formatting: " + myDateObj);
        DateFormat df=new SimpleDateFormat("dd-MMM-yy");

        System.out.println("After Formatting: " + df.format(myDateObj));
    }
}
