package it.develhope.staticexercise;
public class Employee {
    public String name;
    public String surname;
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
