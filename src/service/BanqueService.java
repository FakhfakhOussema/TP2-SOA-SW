package service;

import java.util.ArrayList;
import java.util.List;

public class BanqueService {

	public static double conversion(double montant) 
	{
		return montant*10.6;
	}
	
	public Compte getCompte()
	{
		Compte compte = new Compte(1,20000,"20/10/2023");
		return compte;
	}
	
	public List<Compte> getComptes()
	{
		List<Compte> list=new ArrayList<Compte>();
		Compte compte1 = new Compte(2,30000.500,"20/10/2023");
		Compte compte2 = new Compte(3,500000,"22/10/2023");
		Compte compte3 = new Compte(4,988.600,"23/10/2023");
		
		list.add(compte2);
		list.add(compte1);
		list.add(compte3);
		return list;
	}


}
