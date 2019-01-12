import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

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
		
		//Method khởi tạo
	
	   public MyNumber (int [] number) {
		this. arrNumber = arrNumber;
	   }
		
	public ArrayList Get_Sochan() {
			
			ArrayList lstSochan = new ArrayList();
			
			for(int i=0; i< arrNumber.length; i++){
				if(i%2==0)
				{
					lstSochan.add(i);
				}
			}
			   
			return lstSochan;
		}
	   	
	   public ArrayList Get_Sole() {
			
			ArrayList lstSole = new ArrayList();
			
			for(int i=0; i< arrNumber.length; i++){
				if(i%2==0)
				{
					lstSole.add(i);
				}
			}
			   
			return lstSole;
		}
	   public ArrayList GetSum()
		{
			//Mang luu tong 
			ArrayList lstSumNumber = new ArrayList();
			//Get sochan va sole
			ArrayList lstSoChan = this.Get_Sochan();
			ArrayList lstSoLe = this.Get_Sole();
			
			if(lstSoChan.size() > lstSoLe.size())
			{
				for(int i=0; i<lstSoChan.size(); i++)
				{
					if(i<lstSoLe.size())
					{
						int sochan = (int)lstSoChan.get(i);
						int sole = (int)lstSoLe.get(i);
						lstSumNumber.add(sochan+sole);
					}
					else
					{
						lstSumNumber.add(lstSoChan.get(i));
					}
				}
			}
			else
			{
				for(int i=0; i<lstSoLe.size(); i++)
				{
					if(i<lstSoChan.size())
					{
						int sochan = (int)lstSoChan.get(i);
						int sole = (int)lstSoLe.get(i);
						lstSumNumber.add(sochan+sole);
					}
					else
					{
						lstSumNumber.add(lstSoLe.get(i));
					}
				}
			}
			return lstSoLe;
			
		}
	   @Test
	   public void Test_Get_Sochan(){
		
		   //Arrange
		   
		   MyNumber Mysochan =  new MyNumber(); 
		   MyNumber Mysole =  new MyNumber(); ///Chỗ này báo lỗi, em coi dùm anh tại sao nhé///
		   
		   //Acction
		   
		   boolean result = Mysochan.Get_Sochan(2,4,8); ///Chỗ này báo lỗi, em coi dùm anh tại sao nhé///
		   
		   
		   //Assertion
		   
		   Assert.assertEquals(true,  result );
		   
		   
	   }
	   
	   @Test
	   public void Test_Get_Sole(){
		
		   //Arrange
		   
		   MyNumber Mysole =  new MyNumber(); ///Chỗ này báo lỗi, em coi dùm anh tại sao nhé///
		   
		   //Acction
		   
		   boolean result = Mysochan.Get_Sole(3,5,7,9); ///Chỗ này báo lỗi, em coi dùm anh tại sao nhé///
		   
		   
		   //Assertion
		   
		   Assert.assertEquals(true,  result );
		   
		   
	   }
	 
   }
}

	
