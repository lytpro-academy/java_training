package fileHandling.csv;

import com.opencsv.bean.*;
import com.opencsv.exceptions.*;
import java.io.*;
import java.util.*;

public class WriteCsv {

    public static void main(String[] args) throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException {
        Writer writer = new FileWriter("persons.csv");

        // write header
        writer.write("id,name,email\n");

        // Create mapping strategy
        ColumnPositionMappingStrategy strat = new ColumnPositionMappingStrategy();
        strat.setType(Person.class);

        String[] columns = new String[] { "id", "name", "email" };
        strat.setColumnMapping(columns);

        StatefulBeanToCsv<Person> beanToCsv = new StatefulBeanToCsvBuilder<Person>(writer)
                .withMappingStrategy(strat)
                .withApplyQuotesToAll(false)
                .build();

        List<Person> myUsers = Arrays.asList(
                new Person(1,"Alex", "alex@example.com"),
                new Person(2,"Maria", "maria@example.com")
        );

        beanToCsv.write(myUsers);
        writer.close();
        System.out.println("persons.csv file is created with headers named 'id', 'name', 'email'");
    }
}
