package pl.sda.readStudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentModel.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        File file = new File("studens.json");

        try {
            Student[] students = mapper.readValue(file, Student[].class);
            List<Student> studentList = Arrays.asList(students);
            System.out.println(students);
            List<Student> fristLetterA = studentList
                    .stream()
                    .filter(f -> f.getName().charAt(0) == 'A')
                    .collect(Collectors.toList());
            fristLetterA.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }







    }
}
