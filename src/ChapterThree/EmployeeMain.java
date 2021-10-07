package ChapterThree;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee firstEmployee = new Employee("Ben", "Mee", 500);
        Employee secondEmployee = new Employee("Steve", "Ilori", 100);

        System.out.println("First's guy's salary before 10% raise " + firstEmployee.getSalary());
        System.out.println("Second guy's salary before 10% raise " + secondEmployee.getSalary());

        double increaseOne = firstEmployee.getSalary()/10;
        increaseOne = increaseOne + firstEmployee.getSalary();

        double increaseTwo = firstEmployee.getSalary()/10;
        increaseTwo = increaseTwo + secondEmployee.getSalary()/10;

        System.out.println(" ");
        System.out.println("First guy's salary after 10% raise " + increaseOne);
        System.out.println("Second guy's salary after 10% raise " + increaseTwo);


    }
}
