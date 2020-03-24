package TestSelenium;

public class RunnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BDUtilities.setupConnection();
		BDUtilities.runQuery();
		BDUtilities.closeConnection();
	}

}
