package application;

import java.time.LocalDate;

public class Student {
    private Long studentId;
    private String name;
    private LocalDate dateOfAdmission;

    public Student() {
    }

    public Student(Long studentId) {
        this.studentId = studentId;
    }

    public Student(Long studentId, String name) {
        this(studentId);
        this.name = name;
    }

    public Student(Long studentId, String name, LocalDate dateOfAdmission) {
        this(studentId, name);
        this.dateOfAdmission = dateOfAdmission;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dateOfAdmission=" + dateOfAdmission +
                '}';
    }
}
