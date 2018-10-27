package laba5_v2;

public class fclass1 {
	/*
Создайте приложение, в котором имеются два класса:
fclass1, fclass2. В классе fclass1 содержится метод main().
Создайте методы в fclass2 для доступа к закрытым переменным
класса fclass1.
	 */
	private int a=20;
	protected int b=50;
	public int c=100;
	int k=150;
	public int geta(){
		return this.a;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fclass2 f2= new fclass2();

		f2.srt();

	}
	



}
