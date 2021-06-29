package EverLand;


import java.util.ArrayList;

public class Array {
	public ArrayList<String> arrTicket = new ArrayList<String>();
	public ArrayList<String> arrAge = new ArrayList<String>();
	public ArrayList<Integer> arrCount = new ArrayList<Integer>();
	public ArrayList<Integer> arrPrice = new ArrayList<Integer>();
	public ArrayList<String> arrB= new ArrayList<String>();
	
	public void ClearAll() {
		arrTicket.clear();
		arrAge.clear();
		arrCount.clear();
		arrPrice.clear();
		arrB.clear();}
		
	public void Arrayadd(String ticket, String age, int CountTicket, int Price, String B )	
	{
		arrTicket.add(ticket);
		arrAge.add(age);
		arrCount.add(CountTicket);
		arrPrice.add(Price);
		arrB.add(B);
		}
	
	public void Result() {
		for(int index = 0; index < arrTicket.size(); index++) {
			System.out.printf("%s %s X %d %d %s\n",arrTicket.get(index), arrAge.get(index),
					arrCount.get(index), arrCount.get(index)*arrPrice.get(index), arrB.get(index));
		}
		
		System.out.println("========================================");
	}
}