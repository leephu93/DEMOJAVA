package demojava;

public class TEACHER extends PERSON {

    private float salary;
    
    public TEACHER() {}

    public TEACHER(String name, int age) {
        super(name, age);
    }

    @Override
    public void viewINFO() {
        super.viewINFO();
        System.out.println("LEVEL SALARY: "+salary);
    }

    @Override
    public void show() {
        System.out.println("HELLO ABSTRACT");
    }
    
    @Override
    public void insertINFO(){
        super.insertINFO();
        System.out.print("SALARY: ");
        this.salary = scanner.nextInt();
    }
}
