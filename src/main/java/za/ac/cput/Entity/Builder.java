package za.ac.cput.Entity;

import java.time.LocalDate;

public class Builder {

    public static void main(String[] args) {
        University university = new University.Builder().withUniversityID(15484).withName("Cape Peninsula University of Technology")
                .withCity("Cape Town").withAddress("Corner of Hanover and Tennant Street\n" +
                        "Zonnebloem").build();

        Faculty faculty = new Faculty.Builder().withFacultyID(415477).withName("Informatics and Design").withPhone("021854781")
                .build();

        System.out.println(university);
        System.out.println(faculty);

        //student and test method

        Student student = new Student.Builder().setStudentNumber(218328591)
                .setFirstName("Athi")
                .setLastName("Fukama")
                .setStudentEmail("athif@gmail.com")
                .setCourseID("362S")
                .build();



        Test test = new Test.Builder().setTestID("362S")
                .setLecturerID("2021S")
                .setTestInfo("ADP# Assignment")
                .setTestDate(LocalDate.of(2019, 12, 1))
                .build();

        System.out.println(student);
        System.out.println(test);

        //Subject

        Subject subject = new Subject.Builder()
                .subjectName("Python Fundamentals")
                .subjectID(78)
                .subjectCredit("NQF36")
                .lecturerID(12)
                .build();

        System.out.println(subject);


    }

}