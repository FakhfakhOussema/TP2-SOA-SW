package service;

public class main {

	public static void main(String[] args) 
	{

		BanqueService bs = new BanqueService();
		System.out.println(bs.conversion(1254));
		System.out.println(bs.getCompte());
		System.out.println(bs.getComptes());
	}

}
