package common;

import enums.Designation;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String address;
    final private String EMAIL;
    private String password;
    private Designation designation;


    public Person(String firstName, String lastName, String address, String email, String password, Designation designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        EMAIL = email;
        this.password = password;
        this.designation = designation;
    }


    public String getFirstName(){return firstName;}
    public void setFirstName(String name){firstName = name;}
    public String getLastName(){return  lastName;}
    public void setLastName(String surname){lastName = surname;}
    public String getAddress(){return address;}
    public void setAddress(String customerAddress){address = customerAddress;}
    public String getEMAIL(){return EMAIL;}
    public String getPassword(){return password;}
    public void setPassword(String userPassword){password = userPassword;}


}
