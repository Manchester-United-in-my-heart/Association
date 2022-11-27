public class College {
    Student list[]=new Student[20];
    int count=0;
    public void addStudent(Person p)
    {
       Student pnew= new Student(p.ID,p.Name);
       this.list[count]=pnew;
       ++count;
    }
}
