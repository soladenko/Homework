package module3.Homework33;


import java.util.Date;

public class Main {
    public static void main(String[] args) {
    //создаем  3+2 объектов в Course (иницилизируем name,HouseDuration,TeacherName)
        Date date=new Date(1999,1,1);
        Course course1=new Course(date,"Ivan");
        Course course2 = new Course(date, "Petr" );

        Course course3=new Course("Name3",1,"TeacherName3");
        Course course4=new Course("Name4",2,"TeacherName4");
        Course course5=new Course("Name5",3,"TeacherName5");

        //создаем 2 объекта в Student, т.к 2 конструктора
        Course[]courses1={course1,course2};
        Student student1=new Student("Petr","Petrov",5);
        Student student2=new Student("Ivanov",courses1);

        //создаем 3 объекта в CollegeStudent, т.к 3 конструктора
        Course[]courses2={course1,course2,course3};
        CollegeStudent collegeStudent=new CollegeStudent("Sergei","Sergienko",5,"CollegeName");
        CollegeStudent collegeStudent1=new CollegeStudent("Kolia","Nikolaenko",5,100);
        CollegeStudent collegeStudent2=new CollegeStudent("Sergienko",courses2,"CollegeName");

        //создаем 3 объекта в SpecialStudentStudent, т.к 3 конструктора
        SpecialStudent specialStudent=new SpecialStudent("Ivan","Petrenko",5,"CollegeNane");
        SpecialStudent specialStudent1=new SpecialStudent("Ivan","Petrenko",5,"CollegeNane",200);
        SpecialStudent specialStudent2=new SpecialStudent("Ivan","Petrenko",1000,"CollegeNane");


    }
}
