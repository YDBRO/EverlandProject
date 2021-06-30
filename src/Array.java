package EverLand;


import java.util.ArrayList;

public class Array {
//	public ArrayList<String> arrTicket = new ArrayList<String>();
//	public ArrayList<String> arrAge = new ArrayList<String>();
//	public ArrayList<Integer> arrCount = new ArrayList<Integer>();
//	public ArrayList<Integer> arrPrice = new ArrayList<Integer>();
//	public ArrayList<String> arrB= new ArrayList<String>();
	public ArrayList<DataClass> arrData = new ArrayList<DataClass>();
	
	
//	public void ClearAll() {
//		arrTicket.clear();
//		arrAge.clear();
//		arrCount.clear();
//		arrPrice.clear();
//		arrB.clear();}
		
	public void ArrayAdd(String ticket, String age, int CountTicket, int Price, String B, String isEventCoupon) {
		

		DataClass item = new DataClass();
		item.ticket = ticket;
		item.age = age ;
		item.CountTicket = CountTicket ;
		item.Price = Price ;
		item.B = B ;
		item.isEventCoupon = isEventCoupon ;
		arrData.add(item);
		}
	
	public void Result() {
//		for(int index = 0; index < arrData.size(); index++) {
			int totalPrice = 0;
			for(int index = 0; index < arrData.size(); index++) {
				totalPrice += arrData.get(index).Price * arrData.get(index).CountTicket;}
			System.out.println("가격은" +totalPrice +"원입니다.\n 감사합니다.");
			System.out.println("===============에버랜드==============");
			
			for(int index = 0; index < arrData.size(); index++) {
			System.out.printf("%s %s X %d %d %s \n",arrData.get(index).ticket, arrData.get(index).age,
					arrData.get(index).CountTicket, arrData.get(index).CountTicket*arrData.get(index).Price, arrData.get(index).B, arrData.get(index).isEventCoupon
					,arrData.get(index).isEventCoupon);
		}
		
		System.out.println("========================================");
	}
}