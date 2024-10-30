/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author edowa
 */
import java.util.ArrayList;
public class HospitalSystemController {
    private HospitalSystemModel m;
    private HospitalSystemPatientView pv; //This class will be for our Patient Window Display
    private HospitalSystemLogInView v;
    public HospitalSystemController(HospitalSystemModel m, HospitalSystemLogInView v, HospitalSystemPatientView pv){
        this.m = m;
        this.v = v;
        this.pv = pv;
        System.out.println("In Controller");
        
    }
    public void start(){
        v.startup();
        System.out.println("yurr");
        
    }
    public void validateStaff(int staffId, String password){
        boolean validation = m.checkStaff(staffId,password);
        if(validation){
            pv.PatientStartUp(this.getPatients()); //This function should display our patient display window
            v.closeup();
            
        }
        
    }
    public Patient getPatient(String name){
        return m.findPatient(name);
    }
    public ArrayList<String> getPatients(){
        System.out.println("here");
        return m.getPatientList();
    }
    
}


