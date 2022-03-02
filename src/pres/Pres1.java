package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class Pres1 {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		/*
		DaoImpl dao=new DaoImpl();
		MetierImpl metier=new MetierImpl();
		//metier.setDao(dao);
		System.out.println("Résulatst=>"+metier.calcul());
		*/
		Scanner scanner=new Scanner(new File("config.txt"));
		
		String daoClassName=scanner.nextLine();
		Class cDao=Class.forName(daoClassName);
		//IDao dao=(IDao)cDao.newInstance();
		IDao dao=(IDao)cDao.getDeclaredConstructor().newInstance();
		
		String metierClassName=scanner.nextLine();
		Class cMetier=Class.forName(metierClassName);
		//IMetier metier=(IMetier) cMetier.newInstance();
		IMetier metier=(IMetier)cMetier.getDeclaredConstructor(IDao.class).newInstance(dao);
		
		
		System.out.println("Résultat=>"+metier.calcul());
		
		
	}

}
