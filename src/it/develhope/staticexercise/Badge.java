package it.develhope.staticexercise;


public class Badge {

    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees += 1;
    }

    private String generateBadgeIdCode(){
        return "xyz" + employee.name + employee.surname + "zyz";
    }

    public void showBadgeDetails(){
        System.out.println("Employees with badges: " + totalNumberOfEmployees);
        System.out.println(employee.getEmployeeDetails());
        System.out.println("Badge ID code: " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }
}
