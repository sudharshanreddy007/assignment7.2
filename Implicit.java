package implicitTypePromotion;

public class Implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x=10;//we are taking byte data type and initialized the variable as 15 
		int y=20;//and another variable of integer data type which is greater than 
		//byte data type
		System.out.println("x:"+x+"\n y:"+y);
		x=(byte)y;
		//here we are converting integer value into byte
		System.out.println("int to byte:"+x);
		y=x;//value of int is equal to byte
		System.out.println("byte to int:"+y);
		int z=30;//we are taking another integer
		float a=z;//and float value. integer value is equal to float
		System.out.println("int to float:"+z);
		short b=(short)a;//taking another value in short and converting it from integer to short
		System.out.println("float to short:"+b);
	}

}
