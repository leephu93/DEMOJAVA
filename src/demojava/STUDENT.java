/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojava;

public class STUDENT extends PERSON{
    
    public float point;
    
    public STUDENT() {}
    
    public STUDENT(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        
    }
    
    @Override
    public void insertINFO() {
        super.insertINFO();
        System.out.print("POINT: ");
        this.point = scanner.nextInt();
    }
    
    @Override
    public void viewINFO() {
        super.viewINFO();
        System.out.println(point);
    }

}
