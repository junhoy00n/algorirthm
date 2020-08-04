package algorihtm;

import java.util.Scanner;

public class Num1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		short x = sc.nextShort(), y = sc.nextShort();
		short w = sc.nextShort(), h = sc.nextShort();
		
		int xresult = 0, yresult = 0;
		if(w - x > x) {
			xresult = x;
		}
		else if(w - x <= x) {
			xresult = w - x;
		}
		
		if(h - y > y) {
			yresult = y;
		}
		else if(h - y <= y) {
			yresult = h - y;
		}
		
		if(xresult > yresult) {
			System.out.println(yresult);
		}
		else if(xresult <= yresult) {
			System.out.println(xresult);
		}
	}
}
