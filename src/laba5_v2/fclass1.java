package laba5_v2;

public class fclass1 {
	/*
�������� ����������, � ������� ������� ��� ������:
fclass1, fclass2. � ������ fclass1 ���������� ����� main().
�������� ������ � fclass2 ��� ������� � �������� ����������
������ fclass1.
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