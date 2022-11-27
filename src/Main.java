public class Main {
    public static void main(String[] args) {
        Person ADAM=new Person("A123","Adam");
        College PU=new College();
        PU.addStudent(ADAM);
        System.out.println(ADAM.toString());
        System.out.println(PU.list[0].toString());
    }
}