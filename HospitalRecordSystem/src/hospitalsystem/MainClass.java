/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author tonio
 */

public class MainClass {
    public static void main(String[] args){
        //creates instances of MVC classes & calls Controllers start method
        HospitalSystemModel m = new HospitalSystemModel();
        HospitalSystemLogInView lv = new HospitalSystemLogInView();
        HospitalSystemPatientView pv = new HospitalSystemPatientView();
        HospitalSystemController c = new HospitalSystemController(m,lv,pv);
        c.start();
        
        
                
        
    }
}
