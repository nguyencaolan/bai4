import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;



public class Lession04 {
	
	class MyNumber {
		// Thuộc tính
		public int number;

		// Constructor
		public MyNumber(int number) {
			this.number = number;
		}

		public ArrayList<Integer> Get_Sochan() {
			// Cần lặp từ đầu 0 đến number, mỗi lần lặp kiểm tra số tại vị trí lặp
			// nếu chia hết cho 2 thì lưu lại
			//ArrayList arrOrderNumber = new ArrayList(); // Để lưu kq kt
			
			//Khai báo ArrayList có kiểu như sau
			ArrayList<Integer> arrOrderNumber = new ArrayList<Integer>();
			//Mỗi một kiểu premitive sẽ có một class tương ứng. 
			// Sử dụng class này để định kiểu cho ArrayList
			//int a = arrOrderNumber.get(0);
					
			for (int i = 0; i < number; i++) {
				if (i % 2 == 0) {
					arrOrderNumber.add(i);
				}
			}
			return arrOrderNumber;
		}

		public ArrayList Get_Sole() {
			// Lặp từ đầu đến cuối, kiểm tra xem chia hết cho 2 ko?
			// Nếu ko thì lưu lại
			ArrayList arrSoLe = new ArrayList();

			for (int i = 0; i < this.number; i++) {
				if (i % 2 != 0) {
					arrSoLe.add(i);
				}
			}
			return arrSoLe;
		}

		public ArrayList Get_Sum() {
			// Lấy mảng chẵn
			// Lấy mảng lẻ
			// Thêm 0 vào mảng ngắn hơn
			// Cộng các phần tử tương ứng
			ArrayList sochan = this.Get_Sochan();
			ArrayList sole = this.Get_Sole();

			if (sochan.size() < sole.size()) {
				for (int i = sochan.size(); i < sole.size(); i++) {
					sochan.add(0);
				}
			} else {
				for (int i = sole.size(); i < sochan.size(); i++) {
					sole.add(0);
				}
			}

			// Tinh tong
			ArrayList sum = new ArrayList();
			for (int i = 0; i < sole.size(); i++) {
				int tong = (int) sole.get(i) + (int) sochan.get(i);

				sum.add(tong);
			}
			return sum;
		}
	}

	// Test
	@Test
	@Ignore
	public void Test_Get_Sochan() {
		// Arrange
		int number = 10;
		MyNumber myNum = new MyNumber(number);

		// Action
		ArrayList myResult = myNum.Get_Sochan();

		// Assertion
		Assert.assertEquals(5, myResult.size());
		Assert.assertEquals(0, myResult.get(0));
		Assert.assertEquals(8, myResult.get(myResult.size() - 1));
	}

	@Test
	@Ignore
	public void Test_Get_SoLe() {
		// Arrange
		int number = 10;
		MyNumber myNum = new MyNumber(number);

		// Action
		ArrayList myResult = myNum.Get_Sole();

		// Assertion
		Assert.assertEquals(5, myResult.size());
		Assert.assertEquals(1, myResult.get(0));
		Assert.assertEquals(9, myResult.get(myResult.size() - 1));
	}

	@Test
	public void Test_Sum() {
		// Arrange
		int number = 11;
		MyNumber myNum = new MyNumber(number);

		// Action
		ArrayList myResult = myNum.Get_Sum();
		
		for (int i = 0; i < myResult.size(); i++) {
			System.out.println(myResult.get(i));
		}
	}
}
			   
			      		   
	   
	   
	   


	   
		
		  

	
