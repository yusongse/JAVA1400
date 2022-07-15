package Ch07While;

public class C02WhileWhile {

	public static void main(String[] args) {
		
		//전체 구구단출력(2-9단)
//		int dan=2;
//		int i;
//		while(dan<=9)
//		{
//			i=1;	//i 초기화
//			while(i<=9)
//			{
//				System.out.printf("%d x %d =%d\n", dan, i, dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//문제
//		2 x 9 = 18
//		2 x 8 = 16
//		2 x 1 = 2
//		
//		3 x 9 = 27
//		3 x 8 = 24
//		3 x 1 = 3
//		..
//		9 x 1 = 9
//		int dan=2;
//		int i;
//		while(dan<=9)
//		{
//			i=9;	//i 초기화
//			while(i>0)
//			{
//				System.out.printf("%d x %d =%d\n", dan, i, dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//문제
//		9 x 9 = 81
//		9 x 8 = 72
//		
//		2 x 1 = 2
//		int dan=9;
//		int i;
//		while(dan>1)
//		{
//			i=1;	//i 초기화
//			while(i>0)
//			{
//				System.out.printf("%d x %d =%d\n", dan, i, dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
			//별찍기
			//*****
			//*****
			//*****
			//*****
			
			int i=0; //줄바꿈
			int j=0; //별
			
			while(i<4)
			{
				j=0;
				while(j<5)
				{
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
			}
			
			//*
			//**
			//***
			//****
			
			//****
			//***
			//**
			//*
			
//			   *
//			  ***
//			 *****
//			*******
		}
	}

}
