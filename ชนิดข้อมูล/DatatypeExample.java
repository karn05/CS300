public class DatatypeExample {
	 public static void main(String args[]) {
//integer
	System.out.println("===== integer =====");
		int i = 9;
		int thisNum = 99999;
		System.out.println(thisNum); //output : 99999
		System.out.println(thisNum+i); //output : 100008
     
//float, double
  	System.out.println("===== float and double =====");
		     double num1 = 10.11;
		     double num2 = 11.12;
		     float floater1 = 1.5f;
		     System.out.println(num1); //output : 10.11
		     System.out.println(num1+num2); //output : 21.229999999999997
		     double num3 = num1 + num2;
		     double num4 = 10.11 + 11.12;
		     System.out.println(num3); //21.229999999999997
		     System.out.printf("Number num1 is %.2f and num2 is %.2f so num3 is %.2f",num1,num2,num3); 
		     //output = Number num1 is 10.11 and num2 is 11.12 so num3 is 21.23 and for float it's 1.5000003
		     System.out.printf(" and for float it's %f",floater1);
		     System.out.printf("\n");
//String
	System.out.println("===== String =====");
	         String sultan = "sultans";
	         String swing = "swing";
	         String space = " ";
	         String of = "of";
	         System.out.println(sultan.substring(0, 1).toUpperCase() + sultan.substring(1) 
				    + space + of.substring(0, 1).toUpperCase() + of.substring(1, 2)
				    + space + swing.substring(0, 1).toUpperCase() + swing.substring(1));
		 //output = Sultans Of Swing
		 
//boolean
	System.out.println("====== boolean ======");
	boolean willSomedayEverCome = false;
	boolean isThisTheAnswer = true;
	System.out.println(willSomedayEverCome);
	System.out.println(isThisTheAnswer);
	 }
}
