package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
	BaseLogger[] logger = new BaseLogger[]	{new FileLogger(), new EmailLogger(), new DatabaseLogger(),new ConsoleLogger()};
	for(BaseLogger loggers:logger) {
		loggers.Log("Log message");
	}
	CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
	customerManager.add();
	
	
	}

}
	