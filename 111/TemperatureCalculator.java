import java.util.Scanner;
public class TemperatureCalculator {
	
	//convert temperature in Farenheit to temperature in celcius. 
	public static double convertFarenheitToCelsius(double temperatureInFarenheit) 
	{
        return  (temperatureInFarenheit - 32) * 5 / 9;
	}
	
	//convert weight in  pounds to weight in kilogram
	public double convertPoundsToKilograms(double weightInPounds) 
	{
		//from the question : 1 pounds = 0.454 kg
		return weightInPounds * 0.454; 
	}
	
	//convert weight in  kilogram to weight in pounds
	public double convertKilogramsToPounds(double weightInKilograms) 
	{
		//therefore, 0.454 kg = 1 pounds, how many 0.454 kg in x kg. (kg/0.454)
		return weightInKilograms / 0.454; 
	}
  
  
  public static void main(String[] args) 
	{
		//พิมพ์ข้อความให้ User พิมพ์ค่าน้าหนักของตนเองจากคีย์บอร์ดแล้วทำการเรียก Method 
		//เพื่อแปลง้นำหนักตัวเองหน่วยกิโลกรัมเป็นปอนด์พร้อมแสดงผลลัพธ์โดยใส่ทศนิยม 3 ตำแหน่ง
		//declare attributes and relations with other classes
		double inputWeight = 0.0,outputWeight = 0.0, temperatureInFarenheit = 0.0, temperatureInCelcius = 0.0;
		int mode = 0;
		String inputUnit = "", outputUnit ="";
		try (Scanner scanner = new Scanner(System.in)) {
			Calculator cal = new Calculator();
			
			System.out.println("Please Choose Your mode: (1) for Pounds to Kg (2) for Kg to Pounds (3) for temperature");
			mode = scanner.nextInt();
			
			
			if(mode == 1) {
				System.out.println("Please Input your weight in Kilogram:");
				inputWeight = scanner.nextDouble();
				outputWeight = cal.convertKilogramsToPounds(inputWeight);
				inputUnit = "kilogram(kg)";
				outputUnit = "ponds(lbs)";
				System.out.printf("Weigh in" +inputUnit+ " : %.3f\n", inputWeight);
			    System.out.printf("Weigh in" +outputUnit+ " : %.3f\n", outputWeight);
			    
			}else if(mode == 2) {
				System.out.println("Please Input your weight in Pounds:");
				inputWeight = scanner.nextDouble();
				outputWeight = cal.convertPoundsToKilograms(inputWeight);
				outputUnit = "kilogram(kg)";
				inputUnit = "ponds(lbs)";
				System.out.printf("Weigh in" +inputUnit+ " : %.3f\n", inputWeight);
			    System.out.printf("Weigh in" +outputUnit+ " : %.3f\n", outputWeight);
				
			}else if(mode == 3){
				System.out.println("Please Input your temperature in Farenheit:");
				temperatureInFarenheit = scanner.nextDouble();
				temperatureInCelcius = Calculator.convertFarenheitToCelsius(temperatureInFarenheit);
			     System.out.println("Temperature Result from input");
			     System.out.printf("%.1f\u00b0F ", temperatureInFarenheit);
			     System.out.printf("%.1f\u00b0C\n", temperatureInCelcius);
			     
			}
		}
		/*แปลงอุณภูมิ 98.6 องศาฟาเรนไฮท์ และ 32 องศาฟาเรนไฮท์
		 * convert 98.6 F 
		 */
		temperatureInFarenheit = 98.6;
        temperatureInCelcius = Calculator.convertFarenheitToCelsius(temperatureInFarenheit);
         System.out.println("\nTemperature Result 98.6 Farenhit");
         System.out.printf("%.1f\u00b0F ", temperatureInFarenheit);
	     System.out.printf("%.1f\u00b0C\n", temperatureInCelcius);
	     
	     //covert 32 F
	    temperatureInFarenheit = 32;
	    temperatureInCelcius = Calculator.convertFarenheitToCelsius(temperatureInFarenheit);
	    System.out.println("Temperature Result 32 Farenheit");
	    System.out.printf("%.1f\u00b0F ", temperatureInFarenheit);
	    System.out.printf("%.1f\u00b0C\n\n", temperatureInCelcius);
		//แสดง Output ค่า result ตามโจทย์
		
	}
	
}
