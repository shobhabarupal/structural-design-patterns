package structuralDesignPattern.Adapter;

public class Main {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/

		BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
		EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();

		populateEmployeeData(employeeClassAdapter);

		String card = businessCardDesigner.designCard(employeeClassAdapter);
		System.out.println(card);


		System.out.println("*********************");
		/** Using Object Adapter **/

		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
		String card1 = businessCardDesigner.designCard(employeeClassAdapter);
		System.out.println(card1);

	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
