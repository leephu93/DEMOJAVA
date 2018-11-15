package demojava;

import java.util.Scanner;

abstract public class PERSON {
    
    public String name;
    public int age;
    Scanner scanner = new Scanner(System.in);
    
    public PERSON() {
        
    }

    public PERSON(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void insertINFO(){
        System.out.print("NAME: ");
        this.name = scanner.nextLine();
        System.out.print("AGE: ");
        this.age = scanner.nextInt();
    }

    public void viewINFO() {
        System.out.println(name);
        System.out.println(age);
    }
    
    abstract public void show();
}
