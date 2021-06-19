package interfaces;

public class HR implements Employee {
    @Override
    public void getDesignation() {
        System.out.println("EMPLOYEE DESIGNATION IS HR");
    }

    @Override
    public void getSalaryDetails(double basic) {
        double totalSalary = basic + basic * 0.1;
        System.out.println("EMPLOYEE SALARY IS " + totalSalary);
    }
}
