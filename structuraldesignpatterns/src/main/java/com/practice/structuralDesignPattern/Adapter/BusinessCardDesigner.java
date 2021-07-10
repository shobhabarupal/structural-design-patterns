package structuralDesignPattern.Adapter;

/**
 * Client code which requires Customer interface.
 */
public class BusinessCardDesigner {
//Client need customer interface
	public String designCard(Customer customer) {
		String card = "";
		card += customer.getName();
		card += "\n" + customer.getDesignation();
		card += "\n" + customer.getAddress();
		return card;
	}
}
