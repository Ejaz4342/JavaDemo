package interfaces;

public class Manager implements Employee{
    @Override
    public void getDesignation() {
        System.out.println("EMPLOYEE DESIGNATION IS MANAGER");
    }

    @Override
    public void getSalaryDetails(double basic) {
        double totalSalary=basic+basic*0.15;
        System.out.println("EMPLOYEE SALARY IS "+totalSalary);
    }

}
