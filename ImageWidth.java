import java.util.Scanner;
/* โจทย์จาก : https://th-th.facebook.com/BballkrabBTutor/
 * มีโปรแกรมหนึ่ง ต้องการแสดงรูปภาพขนาด w x h บนหน้าจอที่มีขนาด a x b แต่รูปภาพที่จะแสดงบางทีมันใหญ่กว่ากรอบจอโปรแกรม ถ้ารูปภาพมันใหญ่กว่าขนาดจอที่จะแสดง ให้ย่อรูปภาพนั้นให้มันพอดีที่จะแสดงมากที่สุด โดยขนาดหน้าจอยังต้องมีขนาดคงเดิม รูปภาพยังคงอัตราส่วนของรูปภาพนั้นอยู่ และไม่ต้องหมุนรูปภาพ แต่ถ้ารูปภาพเล็กกว่าหน้าจอ ไม่ต้องย่อรูปภาพ
	การรับตัวแปร input : a b w h
	โดย a b w h เป็นจำนวนเต็มบวก และไม่เกิน 5000
	แสดงผลลัพธ์บนหน้าจอ : ขนาดรูปภาพที่พอดีกับหน้าจอ
	ยกตัวอย่าง
	1. 800 600 1600 1000 -> 800 500
	2. 800 600 800 1200 -> 400 600
	3. 800 600 2400 2400 -> 600 600
	ปล. ถ้าย่อขนาดรูปภาพแล้วติดทศนิยม ให้ปัดเศษขึ้นทุกกรณี
 * */
public class ImageWidth {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 //input
		 int screen_width = sc.nextInt();
		 int screen_height = sc.nextInt();
		 int drawable_width = sc.nextInt();
		 int drawable_height = sc.nextInt();
		 //output
		 int new_width = drawable_width;
		 int new_height = drawable_height;
		 
		 if(drawable_width > screen_width) {
			 new_width = screen_width;
			 new_height = (new_width * drawable_height) / drawable_width;
		 }
		 
		 if(new_height > screen_height) {
			 new_height = screen_height;
			 new_width = (new_height * drawable_width) / drawable_height;
		 }
		 System.out.printf("%d %d",new_width, new_height);
	}

}
