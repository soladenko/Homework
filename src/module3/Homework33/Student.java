package module3.Homework33;


public class Student {
    String firstName;
    String lastName;
    int group;
    Course[]coursesTaken;
    int age;

    public Student(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }



    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;

    }

    public String getFirstName() {
        return firstName;

    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getGroup() {
        return group;
    }

    public Student setGroup(int group) {
        this.group = group;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public Student setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
        return this;
    }
}
