class Mobile
{
	String brand; 
	double price;
	Mobile()
	{
	    
	}
       Mobile(String brand,double price)
      {

	this.brand=brand;
	this.price=price;
       }
}
class Application extends Mobile
{
	float app_version;
	String app_name;

Application(float app_version,String app_name,String brand,double price)
{
	super(brand,price);
	this.app_version=app_version;
	this.app_name=app_name;
}
}
class Paytm extends Application
{
	double balance;
	String UserName;
Paytm(double balance,String UserName,float app_version,String app_name,String brand,double price)
{
	super(app_version,app_name,brand,price);
	this.balance=balance;
	this.UserName=UserName;
}
public void display()
{
System.out.println("Mobile Brand : "+brand);
System.out.println("Price : "+price);
System.out.println("App Name : "+app_name);
System.out.println("App version : "+app_version);
System.out.println("User Name is: "+UserName);
System.out.println("Balance is : "+balance);
}
}
class PaytmDriver
{
public static void main(String[] args)
{
Paytm p=new Paytm(3000d,"Sivanaveen",2.3f,"Paytm","Oppo",35000d);
Paytm p1=new Paytm(5000d,"Sivanaveen L.",2.0f,"Paytm","Vivo",17000d);

p.display();
System.out.println();
p1.display();
}
}
