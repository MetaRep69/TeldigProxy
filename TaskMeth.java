import java.util.Random;
import java.time.*;

class TaskMeth {
	public static void main(String[] args) {
		
		int a=2,b=4,c=6;
		System.out.println(berechne(a,b,c));
		/* Numbers to chars: lower case alphabet 97=a , 122=z */
		char num = (char)122;
		System.out.println(num);
		System.out.println(randomstr(10));
		System.out.println(schaltjahr(2020));
		System.out.println(tage(2021,5));
		
		double[] arrei = buildArray(5.0,33.0,8);
		
		for(double s : arrei) {
			System.out.print(" - "+s+" - ");
		}
		System.out.println("");
		System.out.println(palindrome("08Hell eh!"));
	}
	
	public static int berechne(int x,int y,int z) {
		if(x>0&&y>0&&z>0) {
			return (x+y)/z;
		}
		else {
			return 0;
		}
	}
	
	public static String randomstr(int n) {
		Random r = new Random();
		var tempWord = new StringBuilder();
		for(int i=0;i<n;i++) {
			int number = r.nextInt(26)+97;
			tempWord.append((char)number);
		}
		String word = tempWord.toString();
		return word;
	}
	
	public static boolean schaltjahr(int jahr) {
		if ((jahr%400==0||jahr%4==0)&&jahr%100!=0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int tage(int jahr, int monat) {
		if((1<=monat)&&(monat<=12)) {
			LocalDate temp = LocalDate.of(jahr, monat, 10);
			LocalDate temp2 = temp.withMonth(monat);
			return temp2.lengthOfMonth();
		}
		else {
			return 0;
		}
	}
	
	public static double[] buildArray(double x0,double x1,int n) {
		double[] arr = new double[n];
		double x0y,x1y,n0;
		
		if(x0<=x1) {
			x0y = x0;
			x1y = x1;
		}
		else {
			x0y = x1;
			x1y = x0;
		}
		
		n0 = (x1y-x0y)/(n-1);
		double current = x0y;
		for(int i=0;i<n;i++) {
			arr[i] = current;
			current += n0;
		}
		return arr;
	}
	
	public static boolean palindrome(String s) {
		boolean bol = true;
		s = s.toLowerCase();
		s = s.strip();
		var s1 = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isLetter(c)) {
				s1.append(c);
			}
		}
		String s2 = s1.toString();
		System.out.println(s2);
		int end;
		if(s2.length()%2==0) {
			end = s2.length()/2;
		}
		else {
			end = (s2.length()-1)/2;
		}
		for(int i=0;i<end;i++) {
			char c1 = s2.charAt(i);
			char c2 = s2.charAt((s2.length()-1)-i);
			String cs1 = Character.toString(c1);
			String cs2 = Character.toString(c2);
			if(cs1.equals(cs2)) {
				continue;
			}
			else {
				bol = false;
				break;
			}
		}
		return bol;
	}
		
	
}

/* web reference:
https://study.basicnetwork.ro/
https://use.delcarmen.cl/
https://portal.mikalxavier.com/
https://desmosgraph.xyz/
https://travels.smel.ls/
https://planes.bsfa.info/
https://steakyeggy.jumpingcrab.com/
http://educationalebooksforfriendsandfamilywithschools-nationwide.potomacriversafetycommittee.org/
https://nosoybrais.mooo.com/
https://learnwithcircos.circosdesigns.com/
https://japhareducation.japhar.com/
https://edu.werder.li/
https://edutours.tuumin.net/
https://globalstudents.tuumin.net/
https://purchase.badrag.net/
https://learnabroad.japhar.com/
https://studyhubs.hqcloud.de/
https://travel.connect.hqcloud.de/
https://teach.excel.shidex.or.id/
https://skills.think.residencewizard.com/
https://goal.field.bot.nu/
https://focus.login.flatmando.com/
https://edu.atom.bauersachs.name/
https://coach.basic.yashoda.com.np/










































