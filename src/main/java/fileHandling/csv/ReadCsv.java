package fileHandling.csv;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class ReadCsv {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("persons.csv");

        // Create mapping strategy
        ColumnPositionMappingStrategy strat = new ColumnPositionMappingStrategy();
        strat.setType(Person.class);

        String[] columns = new String[]{"id", "name", "email"};
        strat.setColumnMapping(columns);

        CsvToBean<Person> csvToBean = new CsvToBeanBuilder(reader)
                .withType(Person.class)
                .withMappingStrategy(strat)
                .withSkipLines(1)
                .build();

        List<Person> myUsers = csvToBean.parse();

        myUsers.forEach(System.out::println);

        reader.close();
        System.out.println("Read data from persons.csv");
    }
}
