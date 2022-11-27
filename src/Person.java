public class Person {
    public String ID;
    public String Name;
    public Person(String ID, String name) {
        this.ID = ID;
        Name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
