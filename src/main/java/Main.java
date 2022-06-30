import application.Student;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(110001L, "Dave", LocalDate.of(1951, 11, 18)),
                new Student(110002L, "Anna", LocalDate.of(1990, 12, 7)),
                new Student(110003L, "Erica", LocalDate.of(1974, 1, 31)),
                new Student(110004L, "Carlos", LocalDate.of(2009, 8, 22)),
                new Student(110005L, "Bob", LocalDate.of(1990, 3, 5))
        };

//        printListOfStudents(students);
//        getListOfPlatinumAlumniStudents(students).forEach(System.out::println);

        printHelloWorld(new int[]{1, 5,6, 2, 7, 3});
    }

    public static void printListOfStudents(Student[] students){
        Arrays.stream(students).sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
    }

    public static List<Student> getListOfPlatinumAlumniStudents(Student[] students){
        return Arrays.stream(students)
                .filter(student -> LocalDate.now().getYear() - student.getDateOfAdmission().getYear() >= 30)
                .toList();
    }

    public static void printHelloWorld(int[] numbers){
        for(int n: numbers){
            if(n % 5 == 0)
                System.out.print("Hello");
            if(n % 7 == 0)
                System.out.print("World");
            System.out.println();
        }
    }

}
