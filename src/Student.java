public class Student extends Person{
    String university;
    int course;
    public Student(String name, int age, String gender, String university, int course) {
        super(name, age, gender);
        this.university = university;
        this.course = course;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("University: " + university + ", Course: " + course);

    }

    @Override
    public void work() {
        System.out.println("Student is studying");
    }
}
