/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojava;

import java.util.Scanner;

public class DEMOJAVA{

    public static void main(String[] args) {
        System.out.println("INFO OF STUDENT: ");
        STUDENT sv1 = new STUDENT();
        sv1.insertINFO();
        sv1.viewINFO();
        System.out.println("_____________________");
        System.out.println("INFO OF TEACHER: ");
        TEACHER gv1 = new TEACHER();
        gv1.insertINFO();
        gv1.viewINFO();
    }
}
