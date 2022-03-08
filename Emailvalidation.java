package practisejava;
import java.util.Scanner;

public class Emailvalidation {

	public static void main(String[] args) {
		String emails[] = new String[5];
		emails[0] = "Bhavaniml35@gmail.com";
		emails[1] = "pulipatiprincy03@gmail.com";
		emails[2] = "BhavikWadiya@gmail.com";
		emails[3] = "MeetPatel@gmail.com";
		emails[4] = "RajPatel@gmail.com";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email: ");
		String userEmail = sc.next();
		
	
		
	
		{
			System.out.println("Invalid User");
		}