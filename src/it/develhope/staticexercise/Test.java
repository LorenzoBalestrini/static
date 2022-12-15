package it.develhope.staticexercise;

public class Test {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Lorenzo", "Balestrini", "Piazza Paolo da Novi");
        Employee employee2 = new Employee("Silvia", "Bagni", "Piazza Palermo");

        Badge badge1 = new Badge(employee1);
        badge1.showBadgeDetails();

        System.out.println("---------------");

        Badge badge2 = new Badge(employee2);
        badge2.showBadgeDetails();
    }
}
