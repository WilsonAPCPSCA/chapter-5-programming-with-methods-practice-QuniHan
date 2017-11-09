import java.util.Scanner;
public class romanNumeral {
	public static String romanDigits(int x, String one, String five, String ten){
		String num="";
		if (x==1){
			num = one;
		}
		if (x==2){
			num = one+one;
		}
		if (x==3){
			num = one+one+one;
		}
		if (x==4){
			num = one+five;
		}
		if (x==5){
			num = five;
		}
		if (x==6){
			num = five+one;
		}
		if (x==7){
			num = five+one+one;
		}
		if (x==8){
			num = five+one+one+one;
		}
		if (x==9){
			num = one+ten;
		}
		return num;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("enter a number: ");
		int n=in.nextInt();	
		String romanOne = romanDigits(n%10,"I","V","X");
		n = n/10;
		String romanTen = romanDigits(n%10,"X","L","C");
		n = n/10;
		String romanHun = romanDigits(n%10,"C","D","M");
		System.out.println(romanHun+romanTen+romanOne);
	}

}
