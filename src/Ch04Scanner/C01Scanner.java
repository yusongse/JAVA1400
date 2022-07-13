package Ch04Scanner;

import java.util.Scanner;

public class C01Scanner {

	public static void main(String[] args) {
		
		//키보드로부터 값을 받아 처리하기위한
		
		//System.out : APP->표준출력장치 방향으로 스트림 형성
		//System.out :표준입력장치 ->APP방향으로 스트림 형성
		
		//new Scanner(System.ln)
		//->표준입력스트림을 Scanner객체에 연결
		//->Scanner객체는 다양한 형태위 값을 스트림으로부터 받아올수있는
		//->기능을 가지는 단위
		
		//Scanner sc= new Scanner(System.in)\
		//->생성된 Scanner객체의 위치값을 sc참조변수에 달아
		//->제어함
		Scanner sc= new Scanner(System.in);
		
		System.out.print("첫번째 : ");
		int num1= sc.nextInt();
		//sc스캐너객체의 기능을통해 정수값하나를 받아 num1공간에 초기화
		System.out.print("두번쨰: ");
		int num2= sc.nextInt();
		System.out.print("세번쨰: ");
		int num3= sc.nextInt();
		
		int sum= num1 +num2+num3;
		System.out.println("SUM : "+ sum);
		
		sc.close();
	}

}
