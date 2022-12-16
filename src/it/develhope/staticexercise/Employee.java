package it.develhope.staticexercise;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private String surname;
    private String address;

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    public String getEmployeeDetails(){
        return "Employee's details: fullName: " + name + " " + surname + ", address: " + address;
    }


}
