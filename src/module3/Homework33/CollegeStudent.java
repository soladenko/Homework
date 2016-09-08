package module3.Homework33;


public class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(String firstName, String lastName, int group, String collegeName) {
        super(firstName, lastName, group);
        this.collegeName = collegeName;
    }


    public CollegeStudent(String lastName, Course[] coursesTaken, String collegeName) {
        super(lastName, coursesTaken);
        this.collegeName = collegeName;
    }



    public CollegeStudent(String firstName, String lastName, int group, long id) {
        super(firstName, lastName, group);
        this.id = id;
    }



    public String getCollegeName() {
        return collegeName;
    }

    public CollegeStudent setCollegeName(String collegeName) {
        this.collegeName = collegeName;
        return this;

    }

    public int getRating() {
        return rating;
    }

    public CollegeStudent setRating(int rating) {
        this.rating = rating;
        return this;
    }

    public long getId() {
        return id;
    }

    public CollegeStudent setId(long id) {
        this.id = id;
        return this;
    }
}





