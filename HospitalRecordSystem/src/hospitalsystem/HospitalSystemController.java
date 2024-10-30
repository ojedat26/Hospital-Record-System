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
       
        
    }
    public void start(){
        v.startup();
       
        
    }
    public void validateStaff(int staffId, String password){
        boolean validation = m.checkStaff(staffId,password);
        if(validation){
            pv.PatientStartUp(this.getPatients()); //This function should display our patient display window
            v.closeup();
            
        }
        
    }
    public void addNewPatient(String name, String phoneNumber,String address,String condition){
        m.addPatient(name, phoneNumber, address,condition);
    }
    public void deletePatient(String name){
        m.removePatient(name);
    }
    public Patient getPatient(String name){
        return m.findPatient(name);
    }
    public ArrayList<String> getPatients(){
        
        return m.getPatientList();
    }
    public void updatePatient(String name,String phoneNumber,String address, String condition){
        m.editPatientInfo(name, phoneNumber, address, condition);
    }
}


