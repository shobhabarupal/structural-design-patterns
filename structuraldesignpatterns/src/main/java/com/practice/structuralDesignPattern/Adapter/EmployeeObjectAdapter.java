package structuralDesignPattern.Adapter;

/**
 * An object adapter. Using composition to translate interface
 */
public class EmployeeObjectAdapter implements Customer {
    Employee employee;

    public EmployeeObjectAdapter(Employee employee) {
        this.employee = employee;
    }

    //another way of implimentation but it is tightly coupled to Employee class and cant be used for child classes of Employee
    /*public EmployeeObjectAdapter() {
        this.employee = new Employee();
    }*/

    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getDesignation() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeLocation();
    }
}
