package Lamda_Expressions_for_Method_Removal_with_Parameters;

public class Test {

	public static void main(String[] args) {
		 I1 t = (x,y)->{
			 
			 System.out.println("Add two numbers"+(x+y));
			return x+y;
		 };
		 t.add(12, 13);

	}

}
