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
    private HospitalSystemLogInView lv;
    public HospitalSystemController(HospitalSystemModel m, HospitalSystemLogInView lv, HospitalSystemPatientView pv){
        this.m = m;
        this.lv = lv;
        this.pv = pv;
    }
    public void start(){
        //calls HospitalSystemLogInView's startup method
        lv.startup();
    }
    public boolean validateStaff(int staffId, String password){
        //calls the Model class's checkStaff method to validate the Staff Credentials
        boolean validation = m.checkStaff(staffId,password);
        if(validation){
            //calls HospitalSystemPatientView startup method and calls HospitalSystemLogInView closeup method
            pv.PatientStartUp(this.getPatients()); //This method should display our patient display window
            lv.closeup();
            return true;
        }
        else{
            //returns false if unvalid credentials
            return false;
        }
    }
    public void addNewPatient(String name, String phoneNumber,String address,String condition){
        //calls Model's addPatient method to add a new Patient to the array
        m.addPatient(name, phoneNumber, address,condition);
    }
    public void deletePatient(String name){
        //calls Model's removePatient method to remove a patient from the array
        m.removePatient(name);
    }
    public Patient getPatient(String name){
        //returns the Patient found by name through the Model's findPatient method
        return m.findPatient(name);
    }
    public ArrayList<String> getPatients(){
        //returns the Patient List name's by using the Model's getPatientList method
        return m.getPatientList();
    }
    public void updatePatient(String name,String phoneNumber,String address, String condition){
        //calls Model's editPatientInfo to update Patients information
        m.editPatientInfo(name, phoneNumber, address, condition);
    }
}


