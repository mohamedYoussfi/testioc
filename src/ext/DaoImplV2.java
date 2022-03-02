package ext;

import dao.IDao;

public class DaoImplV2 implements IDao {

	@Override
	public double getData() {
		System.out.println("Version capteurs");
		double temp=34;
		return temp;
	}

}
