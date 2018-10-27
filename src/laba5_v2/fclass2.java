package laba5_v2;

public class fclass2 extends fclass1 {
	 
	public void srt() {
		System.out.println("Значение инкапсулированного закрытого\r\n" + 
				"private поля - a - "+geta());
		System.out.println("Значение защищенного protected\r\n" + 
				"поля - b - "+this.b);
		System.out.println("Значение открытого public поля - c - "+this.c);
		System.out.println("Значение поля без модификатора - k - "+k);
	}

 
}
