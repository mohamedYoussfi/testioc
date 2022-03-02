package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
   private IDao dao;
   
   
	public MetierImpl(IDao dao) {
	  this.dao = dao;
    }


	@Override
	public double calcul() {
		double temp=dao.getData();
		double res=temp*Math.cos(temp)*700;
		return res;
	}
	
}
