package service;

public class Compte 
{
	int code ;
	double solde;
	String dateCreation;
	
	Compte(int code,double solde,String dateCreation)
	{
		this.code=code;
		this.solde=solde;
		this.dateCreation=dateCreation;
	}
	
	public void getCode(int code)
	{
		this.code=code;
	}
	
	
	public void getSolde(float solde)
	{
		this.solde=solde;
	}
	
	public void getDateCreation(String date)
	{
		this.dateCreation=date;
	}
	
	public int setCode()
	{
		return code ; 
	}
	
	public double setSolde()
	{
		return solde;
	}
	
	public String setDateCreation()
	{
		return dateCreation ;
	}
	
	public String toString()
	{
		return "le code est  "+code+" le solde est  "+solde+" la date de creation est "+dateCreation;
		
	}
}

