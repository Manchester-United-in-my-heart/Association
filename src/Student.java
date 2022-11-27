public class Student extends Person{
    public Student(String ID, String name) {
        super(ID, name);
    }
    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
