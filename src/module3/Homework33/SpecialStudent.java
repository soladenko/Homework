package module3.Homework33;


public class SpecialStudent extends CollegeStudent {
       private long secretKey;
       private String email;

    public SpecialStudent(String firstName, String lastName, int group, String collegeName) {
        super(firstName, lastName, group, collegeName);
    }


    public SpecialStudent(String firstName, String lastName, int group, long id) {
        super(firstName, lastName, group, id);
    }

    public SpecialStudent(String firstName, String lastName, int group, String collegeName, long secretKey) {
        super(firstName, lastName, group, collegeName);
        this.secretKey = secretKey;
    }


    public long getSecretKey() {
        return secretKey;
    }

    public SpecialStudent setSecretKey(long secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public SpecialStudent setEmail(String email) {
        this.email = email;
        return this;
    }
}



