package module3.Homework33;

import java.util.Date;

  public class Course {
  private   Date stardate;
  private   String name;
   private int hoursDuration;
   private String techerName;

    public Course(String name, int hoursDuration, String techerName) {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.techerName = techerName;
    }


      public Course(Date stardate, String name) {
          this.stardate = stardate;
          this.name = name;
      }

      public int getHoursDuration() {
        return hoursDuration;
    }

    public Course setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
        return this;
    }

    public String getName() {
        return name;
    }

    public Course setName(String name) {
        this.name = name;
        return this;
    }

    public Date getStardate() {
        return stardate;
    }

    public Course setStardate(Date stardate) {
        this.stardate = stardate;
        return this;
    }

    public String getTecherName() {
        return techerName;
    }

    public Course setTecherName(String techerName) {
        this.techerName = techerName;
        return this;

    }

}
