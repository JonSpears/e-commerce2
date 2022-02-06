package Admin;

import common.Person;
import enums.Designation;

public class Admin extends Person {

    private String staffId;

    public Admin(String firstName, String lastName, String address, String email, String password, String staffId){
        super(firstName, lastName, address,email, password, Designation.STAFF);
    }

//    Getter and setter methods

    public String getStaffId(){return staffId;}
    public void setStaffId (String newStaffId){staffId = newStaffId;}

}