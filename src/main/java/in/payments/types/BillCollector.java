package in.payments.types;

public class BillCollector {
	private IPayment ipay;
	public void setPayment(IPayment ipay) {
		this.ipay = ipay;
	}
	public BillCollector() {}
	public BillCollector(IPayment ipay) {
		this.ipay = ipay;
	}
	
	public void collectPayment(double amount) {
		String status = ipay.pay(amount);
		System.out.print(status);
	}
}
