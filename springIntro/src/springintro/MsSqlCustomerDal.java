package springintro;

public class MsSqlCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Mssql database added");
		
	}

}
