package Anonymous_Class_For_Sub_Class_Removal;
//Example: Thread Class Runnable Interface
public class Test {

	public static void main(String[] args) {
	 
		Slokam s = new Slokam() {

			@Override
			public void m1() {
				 
				 System.out.println("Slokam Interface Sub clss default method");
				
			}
			
		};
		s.m1();
		System.out.println(s);
		
		Slokam sl = new Siva();
		sl.m1();
		System.out.println(sl);
		
		/*Slokam b = new Siva();
		b.m1();
		 System.out.println(b);*/

	}

}
