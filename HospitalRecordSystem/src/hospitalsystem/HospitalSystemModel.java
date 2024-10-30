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
public class HospitalSystemModel {
    private ArrayList<Patient> PatientList = new ArrayList<Patient>();
    private ArrayList<Staff> StaffList = new ArrayList<Staff>();
    
    
    public HospitalSystemModel(){
        PatientList.add(new Patient("Toni O.","612-000-000","Elmo Street","Sick"));
        PatientList.add(new Patient("Adonai","714-000-000","HollyWood Street","Healthy"));
        PatientList.add(new Patient("Abshir","762-000-000","Batman Street","Mild Sickness"));
        
        StaffList.add(new Staff(4550,"hello"));
        StaffList.add(new Staff(6120,"helloWorld"));
        StaffList.add(new Staff(7630,"passWrd"));
    }
        public ArrayList<String> getPatientList(){
            ArrayList<String> patients = new ArrayList<String>();
            for(Patient p:PatientList){
                patients.add(p.getName());
            }
            return patients;
            
        }
        public void editPatientInfo(String name, String phoneNumber,String address,String condition){
            Patient patient= this.findPatient(name);
            patient.setPhoneNumber(phoneNumber);
            patient.setAddress(address);
            patient.setCondition(condition);
            
        }
        public void addPatient(String name, String phoneNumber, String address, String condition){
            PatientList.add(new Patient(name, phoneNumber, address, condition));
            
        }
        public void removePatient(String name){
            PatientList.remove(findPatient(name));
           
        }
        public boolean checkStaff(int staffId, String password){
            for(Staff s:StaffList){
                if (s.getStaffId() == staffId){
                    if(s.getPassword().equals(password)){
                       return true;
                    }
                    else{
                        return false;
                    }
                        
                }
            }
            return false;
        }

        
        public Patient findPatient(String name){
            for(Patient p:PatientList){
                if (p.getName().equals(name)){
                    return p;
                }
            }
            return null;
        
        }
        
        
           
}
