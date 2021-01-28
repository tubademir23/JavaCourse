package springintro;

public class CustomerManager {

	private ICustomerDal _customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		this._customerDal = customerDal;
		// TODO Auto-generated constructor stub
	}

	public void add() {
		// iþ kurallarý
		_customerDal.add();
		
	}
}
