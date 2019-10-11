import java.util.* ;
class Account
{
	String name ;
	int accno ;
	int typeacc ;
	Scanner sc=new Scanner(System.in) ;

	void get()
	{
		System.out.println("Enter the name of the customer\n") ;
		name=sc.next() ;
		System.out.println("Enter the account number of the customer\n") ;
		accno=sc.nextInt() ;
	}
}
class Savings extends Account
{
	double bal=0 ;
	double dep, withd ;
	double interest ;
	void get()
	{
		super.get() ;
	}
	void deposit()
	{
		System.out.println("Enter the ammount to be deposited \n") ;
		dep=sc.nextDouble() ;
		bal+=dep ;
		interest=5*bal/100 ;
		bal+=interest ;
	}
	void withdraw()
	{
		System.out.println("Enter the ammount to be withdrawl \n") ;
		withd=sc.nextDouble() ;
		bal-=withd ;
	}
	void display()
	{
		System.out.println("The balance in the account is "+bal+" \n") ;
	}
}
class Current extends Account
{
	double bal=0 ;
	double dep, withd ;
	double min=1000 ;
	double charge=10 ;
	void get()
	{
		super.get() ;
	}
	void deposit()
	{
		System.out.println("Enter the ammount to be deposited \n") ;
		dep=sc.nextDouble() ;
		bal+=dep ;
		if(bal<min)
		{
			bal-=charge ;
		}
	}
	void withdraw()
	{
		System.out.println("Enter the ammount to be withdrawl \n") ;
		withd=sc.nextDouble() ;
		bal-=withd ;
		if(bal<min)
		{
			bal-=charge ;
		}
	}
	void display()
	{
		System.out.println("The balance in the account is "+bal+" \n") ;
	}
}
class Bank1
{	public static void main(String args[])
{
	Scanner css=new Scanner(System.in) ;
	int ch ;
	int chh ;
	System.out.println("Enter your choice 1 for creating savings account and 2 for current account \n") ;
	ch=css.nextInt() ;
	if(ch==1)
	{
		Savings accc=new Savings() ;
		accc.get() ;
		System.out.println("Enter your choice 1 for deposit 2 for withdrawl 3 for dispaly 0 to exit\n") ;
		chh=css.nextInt() ;
		while(chh!=0)
		{
			if(chh==1)
			{ accc.deposit() ;}
			if(chh==2)
			{ accc.withdraw() ;}
			if(chh==3)
			{ accc.display() ;}
			if(chh==0)
			{ break ;}
			System.out.println("Enter your choice \n") ;
			chh=css.nextInt() ;
		}
	}
	if(ch==2)
	{
		Current accc=new Current () ;
		accc.get() ;
		System.out.println("Enter your choice 1 for deposit 2 for withdrawl 3 for dispaly 0 to exit\n") ;
		chh=css.nextInt() ;
		while(chh!=0)
		{
			if(chh==1)
			{ accc.deposit() ;}
			if(chh==2)
			{ accc.withdraw() ;}
			if(chh==3)
			{ accc.display() ;}
			if(chh==0)
			{ break ;}
			System.out.println("Enter your choice \n") ;
			chh=css.nextInt() ;
		}
	}
}
}
