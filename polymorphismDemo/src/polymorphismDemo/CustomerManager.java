package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	
	public CustomerManager(BaseLogger logger) {
		this.logger=logger;
		
	}
	public void add() {
		System.out.println("customer added");
		DatabaseLogger logger= new DatabaseLogger();
		logger.log("Log message");
		this.logger.log("Log message");
	}

}
