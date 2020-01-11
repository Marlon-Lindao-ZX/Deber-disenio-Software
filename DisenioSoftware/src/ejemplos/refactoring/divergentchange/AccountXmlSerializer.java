package ejemplos.refactoring.divergentchange;

public class AccountXmlSerializer {

	public String toXml(Account account) {
		return "<account><id>" + Integer.toString(account.getAccountNumber()) + "</id>"
				+ "<balance>" + Double.toString(account.getBalance()) + "</balance>";
	}
	
}
