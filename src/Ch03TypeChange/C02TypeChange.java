package Ch03TypeChange;

public class C02TypeChange {

	public static void main(String[] args) {
		
		//강제 형변환
		int intval ='가';
		char charval = (char)intval;//강제형변환
		System.out.println(charval);
		
		long longval =1000;
		intval =(int)longval;
		System.out.println(intval);//강제형변환
		
		double doubleva1 =3.14;
		intval =(int)doubleva1;//강제형변환(데이터손실!)
		System.out.println(intval);
	}

}
