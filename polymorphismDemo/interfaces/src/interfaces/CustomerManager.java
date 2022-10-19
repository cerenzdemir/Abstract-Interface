package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal) {
		this.customerDal = customerDal;
		
	}
	public void add() {
		//iş kodları yazılır
		customerDal.Add();
		
		
	}

}
