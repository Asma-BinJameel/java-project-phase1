package JavaProject;

//edit
public class Customer {
private String Name;
private String PhoneNum;
private int NoOfApp;
private Appointment AppList[];

public Customer(String name , String phn , int size){


Name=name;
PhoneNum=phn;
NoOfApp=0;
AppList=new Appointment[size];
}

public boolean AddApp(Appointment A){
if(NoOfApp < AppList.length){
AppList[NoOfApp++]=A;
return true;}
return false;
}


public Appointment[] getNailApp(){

Appointment NApp[]=new Appointment[NoOfApp];
int j=0;
for(int i=0 ; i<NoOfApp ; i++)
if( AppList[i] instanceof Nails){
NApp[i]=AppList[i];
j++ ; }

return NApp;

}


public Appointment[] getNMassageApp(){

Appointment MApp[]=new Appointment[NoOfApp];
j=0;
for(int i=0 ; i<NoOfApp ; i++)
if(AppList[i] instanceof Massage){
MApp[i]=AppList[i];
j++; }

return NApp;

}

public double getTotalPrice(){
double total=0;

for(int i=0 ; i<NoOfApp ; i++)
total=total+ AppList[i].getPrice();

return price;


}

public boolean DeleteApp(Appointment A){

for( int i = 0 ; i < NoOfApp ; i++)
	if( AppList[i] == A )
		{
			AppList[i] = AppList[NoOfApp - 1 ] ;
			AppList[--NoOfApp] = null ;
		return true;
		}


return false;
}




public String toString(){


String str= "Your Name is:  "+Name +",   Your Phone Number: "+PhoneNum+  "\n" +"Number of Appointment that you reserve is:  "+ NoOfApp +"\n" ;

for(int i=0 ; i <NoOfApp ;i++)
str=str + "Your Appointment details:\n" +AppList[i].toString();

return str;
}

























}
