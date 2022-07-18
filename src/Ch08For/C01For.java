package Ch08For;

import java.util.Scanner;

public class C01For {

	public static void main(String[] args) {
			
//			int i=1;
//			while(i<=10)
//			{
//				System.out.println("i : " + i);
//				i++;
//			}
//			for(int i=1;i<=10;i++) {
//				System.out.println("i : "+1);
//			}
			
		//1부터 N까지의 합
		/*
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=N;i++) {
			sum=sum+i;
			System.out.println("i : " + i);
		}
		System.out.println("1부터 N까지의 합 : "+sum);
		*/
			
		//N부터 M까지의 합
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		System.out.println("N과 M을 입력하시오 :" );
		int sum=0;
		
		for(int i=N ;N<=M;N++) {
			sum=sum+N;
			System.out.println("N : " + N);
		}
		System.out.println("N부터 M까지의 합 : "+sum);
			//N부터 M까지의 수중의 3의 배수를 제와한 합
			//구구단 출력
			//-----------------중첩 for-----------------
			//전체 구구단 출력
			//전체 구구단 역순 출력
			//별찍기(직삼각형,역직삼각형,정삼각형,역점삼각형...)
	}

}
