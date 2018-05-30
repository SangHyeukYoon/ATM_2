package ATM;

import java.util.Scanner;

public class Admin {

	private int admin_cash;
	private String admin_id;
	private int admin_pw;
	private boolean isEmpty;
	
	public Admin()
	{
		this.admin_cash = 5000000;
		this.admin_id = "sklee08";
		this.admin_pw = 1234;
		this.isEmpty = false;
	}
	
	
	
	public boolean CheckAdminID(String id)
	{
		if(id.equals("sklee08"))
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean CheckAdminPW(String pw)
	{
		if(pw.equals("1234"))
		{
			return true;
		}
		else
			return false;
	}
	
	public void AdminCalculate(int amount) 
	{
		int cash = this.admin_cash;
		if((cash += amount) < 0)
		{
			System.out.println("ATM is out of cash!");
			this.setEmpty(true);
		}
		else
		{
			this.admin_cash += amount;
		}
	}
	
	public int getAdminCash()
	{
		return this.admin_cash;
	}



	public boolean isEmpty() {
		return isEmpty;
	}



	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
}
