package p71019;
import java.util.Scanner;
//caden finley
public class Pmain {
	static Scanner input = new Scanner(System.in);
	static int variant;
	static String resultWithPadding;
	static String replace0;
	static String replace1;
	static char[] [] arr = new char [3] [3];
	public static void main(String[] args) {
		takeInput();
		binaryConvert();
		replaceBinary();
		arrayInput();
		finalOutput();
	}
	private static void takeInput() {
		System.out.println("Enter an integer representing the state of the coins:");
		variant = input.nextInt();		
	}
	private static void binaryConvert() {
		String binaryOutput = Integer.toBinaryString(variant);
		resultWithPadding = String.format("%9s", binaryOutput).replaceAll(" ", "0");
	}
	private static void replaceBinary() {
		replace0 = resultWithPadding.replaceAll("0","H");
		replace1 = replace0.replaceAll("1","T");
	}
	private static void arrayInput() {
		int s =0;
		for(int i =0; i < 3;i++) {
			for (int r =0;r<3;r++) {
				arr[r][i]=replace1.charAt(s);
				s++;
			}			
		}
	}
	private static void finalOutput() {
		for(int i=0;i<3;i++) {
			System.out.println(arr[i][0] +" "+ arr[i][1] +" "+ arr[i][2]);
		}		
	}
}
