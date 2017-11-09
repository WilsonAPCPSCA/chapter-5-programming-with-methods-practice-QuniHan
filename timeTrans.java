import java.util.Scanner;
public class timeTrans {
	public static String getTimeName(int hours,int minutes){
		String hr="";
		String min="";
		String time="";
		boolean order=true; // if true, min goes behind hr, else min goes infornt hr
		boolean num=false; // if min!=0,15,30, or 45, then min will be displayed in numbers
		
		if (minutes==0){
			min="O'clock";
			order = true;
		}
		else if (minutes==30){
			min="half past";
			order = false;
		}
		else if (minutes==15){
			min="quarter after";
			order = false;
		}
		else if (minutes==45){
			min="quarter til";
			hours++;
				if(hours>12)
					hours=hours-12;
			order = false;
		
		if (hours==1)hr="one";
		else if (hours==2)hr="two";
		else if (hours==3)hr="three";
		else if (hours==4)hr="four";
		else if (hours==5)hr="five";
		else if (hours==6)hr="six";
		else if (hours==7)hr="seven";
		else if (hours==8)hr="eight";
		else if (hours==9)hr="nine";
		else if (hours==10)hr="ten";
		else if (hours==11)hr="eleven";
		else hr="twelve";
		
		
		}
		else num=true;
		
		if(order==true && num==false){
			time= "it is "+ hr +" " + min+ ".";
		}
		else if(order==false && num==false){
			time= "it is "+ min +" " + hr+ ".";
		}
		else if(num==true){
			time= "it is "+ hr +" " + minutes + ".";
		}
		return time;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Please enter the hour: ");
		int hours= in.nextInt();
		System.out.print("Please enter the minutes: ");
		int minutes= in.nextInt();
		System.out.print(getTimeName(hours,minutes));

	}

}
