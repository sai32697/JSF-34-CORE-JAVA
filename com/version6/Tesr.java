package com.version6;



public class Tesr {

	public static void main(String[] args) {
		 Employee obj=new Manager(111,"sai",40000.00);//UpCasting
		 
		 ((Manager)obj).setDop("12/05/2005");//DownCasting
		 System.out.println(((Manager)obj).getdop());
		
		 System.out.println(obj.bonus());
		 
		 
	

	}
	
}
