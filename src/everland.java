import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;


public class everland {

	public static void main(String[] args) 
	 {

		
	      // TODO Auto-generated method stub

	Scanner myInput = new Scanner(System.in) ;
  
  
  int useDate;
  int registNumber;
  int Count;
  int PriorCount;
  int Price;
  int birthdate;
  double num;
  String name; 
  int age =0;
  String ticket = null;
  String ���̺з� ;
  int originPrice = 0;
  String ������ = null;

 System.out.println("����� ��¥��?");
  Scanner myInput1 = new Scanner(System.in);
  int useDate1;
  useDate1 = myInput1.nextInt();
  
  
  if(useDate1 == 20210904 || useDate1 == 20210905 || useDate1 == 20210911 || useDate1 == 20210912 || useDate1 == 20210918 || useDate1 == 20210919 ||
				useDate1 == 20210920 || useDate1 == 20210921 || useDate1 == 20210922 || useDate1 == 20210925 || useDate1 == 20210926 || useDate1 == 20211002 ||
				useDate1 == 20211003 || useDate1 == 20211009 || useDate1 == 20211010 || useDate1 == 20211016 || useDate1 == 20211017 || useDate1 == 20211023 ||
				useDate1 == 20211024 || useDate1 == 20211030 || useDate1 == 20211106 || useDate1 == 20211107) {
			ticket = "AƼ��"; 
		}
		else if(useDate1 == 20210601 || useDate1 ==  20210602 || useDate1 ==  20210603 || useDate1 ==  20210604 || useDate1 ==  20210605 ||
				useDate1 ==  20210606 || useDate1 ==  20210607 || useDate1 ==  20210608 || useDate1 ==  20210909 || useDate1 ==  20210610 ||
				useDate1 ==  20210611 || useDate1 ==  20210612 || useDate1 ==  20210613 || useDate1 ==  20210619 || useDate1 ==  20210620 ||
				useDate1 ==  20210626 || useDate1 ==  20210627 || useDate1 ==  20210703 || useDate1 ==  20210704 || useDate1 ==  20210710 ||
				useDate1 ==  20210711 || useDate1 ==  20210717 || useDate1 ==  20210718 || useDate1 ==  20210724 || useDate1 ==  20210725 ||
				useDate1 ==  20210729 || useDate1 ==  20210930 || useDate1 ==  20210931 || useDate1 ==  20210801 || useDate1 ==  20210802 ||
				useDate1 ==  20210803 || useDate1 ==  20210807 || useDate1 ==  20210808 || useDate1 ==  20210814 || useDate1 ==  20210815 ||
				useDate1 ==  20210821 || useDate1 ==  20210822 || useDate1 ==  20210828 || useDate1 ==  20210829 || useDate1 ==  20210903 ||
				useDate1 ==  20210906 || useDate1 ==  20210906 || useDate1 ==  20210907 || useDate1 ==  20210908 || useDate1 ==  20210909 ||
				useDate1 ==  20210910 || useDate1 ==  20210913 || useDate1 ==  20210914 || useDate1 ==  20210915 || useDate1 ==  20210916 ||
				useDate1 ==  20210917 || useDate1 ==  20210923 || useDate1 ==  20210924 || useDate1 ==  20210927 || useDate1 ==  20210928 ||
				useDate1 ==  20210929 || useDate1 ==  20210930 || useDate1 ==  20211001 || useDate1 ==  20211004 || useDate1 ==  20211005 ||
				useDate1 ==  20211006 || useDate1 ==  20211007 || useDate1 ==  20211008 || useDate1 ==  20211011 || useDate1 ==  20211012 ||
				useDate1 ==  20211013 || useDate1 ==  20211014 || useDate1 ==  20211015 || useDate1 ==  20211018 || useDate1 ==  20211019 ||
				useDate1 ==  20211020 || useDate1 ==  20211021 || useDate1 ==  20211022 || useDate1 ==  20211025 || useDate1 ==  20211026 ||
				useDate1 ==  20211027 || useDate1 ==  20211028 || useDate1 ==  20211029 || useDate1 ==  20211101 || useDate1 ==  20211102 ||
				useDate1 ==  20211103 || useDate1 ==  20211104 || useDate1 ==  20211105 || useDate1 ==  20211108 || useDate1 ==  20211109 ||
				useDate1 ==  20211110 || useDate1 ==  20211112 || useDate1 ==  20211113 || useDate1 ==  20211114 || useDate1 ==  20211120 ||
				useDate1 ==  20211121 || useDate1 ==  20211127 || useDate1 ==  20211128) {
			ticket = "BƼ��"; 
		}
		else if(useDate1 == 20210614 || useDate1 == 20210615 || useDate1 == 20210616 || useDate1 == 20210617 || useDate1 == 20210618 || useDate1 == 20210621 ||
				useDate1 == 20210622 || useDate1 == 20210623 || useDate1 == 20210624 || useDate1 == 20210625 || useDate1 == 20210628 || useDate1 == 20210629 ||
				useDate1 == 20210630 || useDate1 == 20210701 || useDate1 == 20210702 || useDate1 == 20210705 || useDate1 == 20210706 || useDate1 == 20210707 ||
				useDate1 == 20210708 || useDate1 == 20210709 || useDate1 == 20210711 || useDate1 == 20210713 || useDate1 == 20210714 || useDate1 == 20210715 ||
				useDate1 == 20210716 || useDate1 == 20210719 || useDate1 == 20210720 || useDate1 == 20210721 || useDate1 == 20210722 || useDate1 == 20210723 ||
				useDate1 == 20210726 || useDate1 == 20210727 || useDate1 == 20210728 || useDate1 == 20210804 || useDate1 == 20210805 || useDate1 == 20210806 ||
				useDate1 == 20210809 || useDate1 == 20210810 || useDate1 == 20210811 || useDate1 == 20210812 || useDate1 == 20210813 || useDate1 == 20210816 ||
				useDate1 == 20210817 || useDate1 == 20210818 || useDate1 == 20210819 || useDate1 == 20210820 || useDate1 == 20210823 || useDate1 == 20210824 ||
				useDate1 == 20210825 || useDate1 == 20210826 || useDate1 == 20210827 || useDate1 == 20210830 || useDate1 == 20210831 || useDate1 == 20210901 ||
				useDate1 == 20210902 || useDate1 == 20211115 || useDate1 == 20211116 || useDate1 == 20211117 || useDate1 == 20211118 || useDate1 == 20211119 ||
				useDate1 == 20211122 || useDate1 == 20211123 || useDate1 == 20211124 || useDate1 == 20211125 || useDate1 == 20211126 || useDate1 == 20211129 ||
				useDate1 == 20211130) 
			
				{
			ticket = "CƼ��"; 
			
		} 
		else {
			ticket ="�ٽ� �Է�"; 
			 
		
		}
  
  
  
  
  

	    Date date = new Date();
	     
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
	     SimpleDateFormat today = new SimpleDateFormat("MMdd");
	     
	     String a = (today.format(date));
	     int day = Integer.parseInt(a);
	     
	     		     
	
	     
	     String n1 ="";
	     String n2 ="";
	     String n3 ="";
	     String n4 ="";
	     
	     System.out.print("��������� �Է��ϼ���");
	     n1 = myInput.nextLine();
	     n2 = n1.substring(0,2);
	     n3 = n1.substring(2);
	     
	     int yy = Integer.parseInt(n2);
	     int md = Integer.parseInt(n3);
	     
	   
	     
	     if(md>=day & yy>21)
	     {
	    	 age = 120-yy;
	    	 
	     }
	     else if(md>=day & yy<=21 )
	     {
         age = 20-yy;
	     }
	     else if(md<day & yy>21 )
	     {
         age = 121-yy;
	     }
	     else if(md<day & yy<21)
	     {
         age = 21-yy;
	     }
	     
	     
	     
	     
	    if ( 1<=age && age <= 3)
	     {���̺з� = "���Ʊ�";}
	     else if (4<= age && age <= 13)
	     {���̺з� = "����";}
	     else if(14<= age && age <= 19)
	     {���̺з� = "û�ҳ�";}
	     else if(20<= age && age <= 65)
	     {���̺з� = "����";}
	     else {���̺з� = "���";}
	     
	    switch(ticket) {
	    case "AƼ��": originPrice = 60000; break;
	    case "BƼ��": originPrice = 56000; break;
	    case "CƼ��": originPrice = 50000; break;
	    }
	    

	     System.out.println("�� ���� �ֹ��Ͻðڽ��ϱ�?");
	      
	     
	     
	     Count = myInput.nextInt();	    	
	     System.out.printf("�������� �����ϼ���.\n");
	 

  
  
  
  System.out.printf("1. ���� (���� ���� �ڵ�ó��) \n");
  System.out.printf("2. ����� \n");
  System.out.printf("3. ���������� \n");
  System.out.printf("4. ���ڳ� \n");
  System.out.printf("5. �ӻ�� \n");
  PriorCount = myInput.nextInt();
 
int FinalPrice = 0;
/*  int originPrice1 = originPrice * 60 /100000*1000;
int originPrice2 = originPrice * 50 /100000*1000;
int originPrice3 = originPrice * 80 /100000*1000;
int originPrice4 = originPrice * 85 /100000*1000; */

  if (PriorCount == 1) {
  	if (���̺з� == "����")
  	if (ticket == "AƼ��"){FinalPrice = 60000;}
  	else if (ticket == "BƼ��") {FinalPrice =56000;}
  	else if (ticket == "CƼ��") {FinalPrice =50000;}}
  { if (���̺з� == "���")
  	      	if (ticket == "AƼ��"){FinalPrice = 48000;}
      	else if (ticket == "BƼ��") {FinalPrice =44000;}
      	else if (ticket == "CƼ��") {FinalPrice =40000;}}
  { if (���̺з� == "����")
    	if (ticket == "AƼ��"){FinalPrice = 48000;}
	else if (ticket == "BƼ��") {FinalPrice =44000;}
	else if (ticket == "CƼ��") {FinalPrice =40000;}}

  { if (���̺з� == "û�ҳ�")
    	if (ticket == "AƼ��"){FinalPrice = 60000;}
	else if (ticket == "BƼ��") {FinalPrice =56000;}
	else if (ticket == "CƼ��") {FinalPrice =50000;}}
  
  if (PriorCount == 2) {
  	if (���̺з� == "����")
  	if (ticket == "AƼ��"){FinalPrice = 36000;}
  	else if (ticket == "BƼ��") {FinalPrice =33000;}
  	else if (ticket == "CƼ��") {FinalPrice =30000;}}
  { if (���̺з� == "���")
  	      	if (ticket == "AƼ��"){FinalPrice = 28000;}
      	else if (ticket == "BƼ��") {FinalPrice =26000;}
      	else if (ticket == "CƼ��") {FinalPrice =24000;}}
  { if (���̺з� == "����")
    	if (ticket == "AƼ��"){FinalPrice = 28000;}
	else if (ticket == "BƼ��") {FinalPrice =26000;}
	else if (ticket == "CƼ��") {FinalPrice =24000;}}

  { if (���̺з� == "û�ҳ�")
    	if (ticket == "AƼ��"){FinalPrice = 28000;}
	else if (ticket == "BƼ��") {FinalPrice =26000;}
	else if (ticket == "CƼ��") {FinalPrice =24000;}}
  
  if (PriorCount == 3) {
  	if (���̺з� == "����")
  	if (ticket == "AƼ��"){FinalPrice = 30000;}
  	else if (ticket == "BƼ��") {FinalPrice =28000;}
  	else if (ticket == "CƼ��") {FinalPrice =25000;}}
  { if (���̺з� == "���")
  	      	if (ticket == "AƼ��"){FinalPrice = 24000;}
      	else if (ticket == "BƼ��") {FinalPrice =22000;}
      	else if (ticket == "CƼ��") {FinalPrice =20000;}}
  { if (���̺з� == "����")
    	if (ticket == "AƼ��"){FinalPrice = 24000;}
	else if (ticket == "BƼ��") {FinalPrice =22000;}
	else if (ticket == "CƼ��") {FinalPrice =20000;}}

  { if (���̺з� == "û�ҳ�")
    	if (ticket == "AƼ��"){FinalPrice = 24000;}
	else if (ticket == "BƼ��") {FinalPrice =22000;}
	else if (ticket == "CƼ��") {FinalPrice =20000;}}
  
  if (PriorCount == 4) {
  	if (���̺з� == "����")
  	if (ticket == "AƼ��"){FinalPrice = 48000;}
  	else if (ticket == "BƼ��") {FinalPrice =44000;}
  	else if (ticket == "CƼ��") {FinalPrice =40000;}}
  { if (���̺з� == "���")
  	      	if (ticket == "AƼ��"){FinalPrice = 38000;}
      	else if (ticket == "BƼ��") {FinalPrice =35000;}
      	else if (ticket == "CƼ��") {FinalPrice =32000;}}
  { if (���̺з� == "����")
    	if (ticket == "AƼ��"){FinalPrice = 38000;}
	else if (ticket == "BƼ��") {FinalPrice =35000;}
	else if (ticket == "CƼ��") {FinalPrice =32000;}}

  { if (���̺з� == "û�ҳ�")
    	if (ticket == "AƼ��"){FinalPrice = 48000;}
	else if (ticket == "BƼ��") {FinalPrice =44000;}
	else if (ticket == "CƼ��") {FinalPrice =40000;}}
  
  if (PriorCount == 5) {
  	if (���̺з� == "����")
  	if (ticket == "AƼ��"){FinalPrice = 51000;}
  	else if (ticket == "BƼ��") {FinalPrice =47000;}
  	else if (ticket == "CƼ��") {FinalPrice =42000;}}
  
  if (PriorCount == 1) {������ = "����";}
  if (PriorCount == 2) {������ = "�����";}
  if (PriorCount == 3) {������ = "����������";}
  if (PriorCount == 4) {������ = "���ڳ�";}
  if (PriorCount == 5) {������ = "�ӻ��";}
  
  
  
  
  int Sum   ;
  Sum = Count * FinalPrice ;
  System.out.printf("������ %d�� �Դϴ�. \n", Sum);
  System.out.println("�����մϴ�.");
  
  System.out.println("=============== �������� =================");
  System.out.printf("%s   %s X %d    %d��   *%s ���� \n", ticket, ���̺з�, Count, Sum, ������);
  System.out.println("========================================");
  
  
  


}}