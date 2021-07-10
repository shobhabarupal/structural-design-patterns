package structuralDesignPattern.Adapter;

/**
 * A class adapter, works as Two-way adapter
 *
 * This is called 2 way adapter because in the main class at line 11 we are using EmployeeClassAdapter as Employee
 * and at line 13 we are using EmployeeClassAdapter as Customer
 */
public class EmployeeClassAdapter extends Employee implements Customer  {

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
