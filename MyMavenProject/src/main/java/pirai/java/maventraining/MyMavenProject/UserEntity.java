package pirai.java.maventraining.MyMavenProject;

import java.util.ArrayList;
import java.util.Scanner;
class User
{
 private String name;
 private String mobileNumber;
 private String email;
 private int doorNUmber;
 private String streetName;
 private String city;
 private String district;
 private String state;
 private String pinCode;
 private String creditCardNumber; 
 public User(String name,String mobileNumber,String email)
 {
  this.name=name;
  this.mobileNumber=mobileNumber;
  this.email=email;
 }
 String getName()
      {
         return name;
      }
   String getMobileNumber()
      {
         return mobileNumber;
      }
   String getEmail()
      {
         return email;
      }
   String getCreditCardNumber()
      {
         return creditCardNumber;
      }
 void Address(int doorNUmber,String streetName,String city,String district,String state,String pinCode,String creditCardNumber)
 {
   this.doorNUmber=doorNUmber;
   this.streetName=streetName;
   this.city=city;
   this.district=district;
   this.state=state;
   this.pinCode=pinCode;
   this.creditCardNumber=creditCardNumber;
 }
}
class UserEntity
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  ArrayList arr= new ArrayList();
  User u;
  System.out.print("enter the number of user details to be inserted:");
  int n =s.nextInt();
  for(int i=1;i<=n;i++)
  {
   System.out.println();
   System.out.println("enter details of user "+i);
   System.out.print("enter name :");
   String na=s.next();
   System.out.print("enter mobile number :");
   String m=s.next();
   System.out.print("enter email address :");
   String e=s.next();
   u = new User(na,m,e);
   System.out.println();
   System.out.println("enter address details");
   System.out.print("enter door number:");
   int door=s.nextInt();
   System.out.print("enter street names:");
   String st=s.next();
   System.out.print("enter city name:");
   String ci=s.next();
   System.out.print("enter district name:");
   String di=s.next();
   System.out.print("enter state name:");
   String sta=s.next();
   System.out.print("enter pin code:");
   String pin=s.next();
   System.out.print("enter credit card number:");
   String cre=s.next();
   u.Address(door,st,ci,di,sta,pin,cre);
   arr.add(na);
   arr.add(m);
   arr.add(e);
   arr.add(cre);
  }
  do{
  System.out.println();
  System.out.println("enter your Choice:");
  System.out.println("1)Search for user details using mobile numbe");
  System.out.println("2)Search for change email id");
  System.out.println("3)List the names of users");
  System.out.println("4)exit");
  int choice=s.nextInt();
  switch(choice)
 {
 case 1:
    System.out.println("enter the mobile number");
    String r=s.next();
    boolean ans = arr.contains(r);
        if (ans){
            System.out.println("user Details");
            int d=arr.indexOf(r);
            System.out.println("name :"+arr.get(d-1));
            System.out.println("email :"+arr.get(d+1));
            System.out.println("credit :"+arr.get(d+2)); 
            } 
        else
            System.out.println("no records found");
 
    break;
 case 2:
    System.out.println("enter the email id");
    String w=s.next();
    int index= arr.indexOf(w);
    boolean anr = arr.contains(w);
  
        if (anr)
            System.out.println("enter mail id");
            String m=s.next();
            arr.remove(index);
            arr.add(index,m);
            System.out.println(arr);
    break;
 case 3:
      for(int l=0;l<arr.size();l++)
      {
    	if(l==0 || l%4==0)
    	System.out.println(arr.get(l));  
      }   
	   break;
 case 4:
       System.exit(0);
  }
  }while(true);
 }
}