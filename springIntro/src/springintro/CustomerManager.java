package springintro;

public class CustomerManager {

	private ICustomerDal _customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		this._customerDal = customerDal;
		// TODO Auto-generated constructor stub
	}

	public void add() {
		// i� kurallar�
		_customerDal.add();
		
	}
}
