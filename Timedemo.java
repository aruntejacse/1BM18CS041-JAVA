import java.util.*;

class Time
{
    int h,m,s;
    Time(int a,int b,int c)
	{
	h=a;
	m=b;
	s=c;
	}
    Time()
	{
	int h=0;int m=0;int s=0;
	}
    void currentTime(int a,int b,int c)
	{
	h=a;
	m=b;
	s=c;
	}
    void advance(int a,int b,int c)
	{
	s=s+c;
	m=m+b+(s/60);
	s=s%60;
	h=h+a+(m/60);
	m=m%60;
	h=h%24;
	}
    void print()
	{
	System.out.println("hour"+h);
	System.out.println("minute"+m);
	System.out.println("second"+s);
	}
}

class Timedemo
{
    public static void main(String args[])
	{
	Scanner se=new Scanner(System.in);
	int ch;
	System.out.println("Enter your choice:");
	ch=se.nextInt();
	switch(ch)
		{
		case 1: Time a=new Time();
		System.out.println("Enter the hour,minute and second:");
		int hh=se.nextInt();
		int mm=se.nextInt();
		int ss=se.nextInt();
		a.currentTime(hh,mm,ss);
		a.print();
		break;
		
		case 2:Time ab=new Time();
		System.out.println("Enter the hour,minute and second:");
		int hh1=se.nextInt();
		int mm1=se.nextInt();
		int ss1=se.nextInt();
		ab.currentTime(hh1,mm1,ss1);
		System.out.println("Enter the hour,minute and second that are to be added:");
		int hh2=se.nextInt();
		int mm2=se.nextInt();
		int ss2=se.nextInt();
		ab.advance(hh2,mm2,ss2);
		ab.print();
		break;
		}
	}
}
		
	
