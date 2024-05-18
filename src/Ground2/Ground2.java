package Ground2;

import java.util.*;

public class Ground2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[][] list = new int[num][2];
		for(int i =0; i < num; i++) {
			for(int j =0; j < 2; j++) {
				list[i][j] = sc.nextInt();
			}
		}
		int max = list[0][0];
		int min =list[0][0];
		int max1 = list[0][1];
		int min1 =list[0][1];
		int sum = 0;
		int sum2 =0;
		
		
		
		if(num == 1) {
			System.out.print(0);
		}
		else {
			
			for(int i =0; i < num; i++) {
				 if (list[i][0] > max) {
					 max = list[i][0];
				 }
				 
			}
			for(int i =0; i < num; i++) {
				 
				 if (list[i][0] < min) {
					 min = list[i][0];
				 }
			}
			sum = max - min;
			for(int i =0; i < num; i++) {
				 if (list[i][1] < min1) {
					 min1 = list[i][1];
				 }
			}
			for(int i =0; i < num; i++) {
				 if (list[i][1] > max1) {
					 max1 = list[i][1];
				 }
			}
			sum2 = max1 - min1;
			System.out.print(sum*sum2);
		}
	}
}