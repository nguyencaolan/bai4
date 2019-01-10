import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * Viết class tên là MyNumber với các đạc điểm sau
 * - Thuộc tính
 * + int number - chứa số nhập vào từ constructor
 * - Phương thức
 * + MyNumber(int n) - Khởi tạo cho thuộc tính number;
 * + ArrayList Get_Sochan() - Trả ra danh sách tất cả các số chẵn nhỏ hơn number
   + ArrayList get_SoLe() - Trả ra danh sách tất cả các số lẻ nhỏ hơn nyumber
   + ArrayList get_SoTongHop() - Trả ra một danh sách gồm tổng các số chẵn lẻ ở 
   vị trí tương ứng, trong trường hợp khuyết 1 trong 2 số thì giữ nguyên số còn lại
 - Viết Test cho 03 methods này
 */
public class Lession04 {
	
	   class MyNumber{
		
		// thuộc tính
		
		public int[] arrNumber;
		public int min[];
		public int max[];
		//Method khởi tạo
	
	   public MyNumber (int [] number) {
		this. arrNumber = arrNumber;
	
		}
	// Method get so chan
	  
	   public ArrayList Get_Sochan() {
		
		
		ArrayList sochan = new ArrayList();
		
		//boolean sochan1 = false;
		
		for (int i = 0; i < arrNumber.length; i++) {
			
			int currsochan = arrNumber [i];
			
			boolean issochan = true;
			
			for (int k = 0; k < currsochan; k++) {
				if (currsochan % k != 0) {
					issochan = false;
					break;
					
					}	
		
				}
			if (issochan== true) {
			sochan .add(currsochan);
				}
			}
			
					return sochan;
		   
		
	}

	
	public ArrayList Get_Sole() {
		
		ArrayList sole = new ArrayList();
		
		//boolean sochan1 = false;
		
		for (int i = 0; i < arrNumber.length; i++) {
			
			int currsole = arrNumber [i];
			
			boolean issole = false;
			
			for (int k = 2; k < currsole; k++) {
				if (currsole % k == 0) {
					issole = false;
					break;
				}			
			}
			if (issole== true) {
				sole.add(currsole);
			}
		}
		return sole;
	}

	
	}
}
	
