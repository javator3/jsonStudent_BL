package pl.sda.saveStudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentModel.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("Jan", "Kowalski", 7854),
                new Student("Adam", "Nowak", 6754)
        );

        ObjectMapper mapper = new ObjectMapper();
        File file  = new File("studens.json");

        try {
            mapper.writeValue(file, studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
