import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TRY
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		BigDecimal INR=new BigDecimal("1");
		BigDecimal USD=new BigDecimal("82.739");
		BigDecimal JPY=new BigDecimal("0.561");
		BigDecimal AUD=new BigDecimal("54.752");
		BigDecimal CAD=new BigDecimal("61.408");
		BigDecimal HKD=new BigDecimal("10.575");
		BigDecimal SGD=new BigDecimal("62.178");
		BigDecimal KRW=new BigDecimal("0.063");
		BigDecimal XCD=new BigDecimal("30.635");
		BigDecimal GBP=new BigDecimal("105.942");
		BigDecimal fromval = null ;			
		BigDecimal toval;
		String curfrom = null;
		String curto;
		List1();
		System.out.println("\nSelect the currency covert from\n");
		int Select=sc.nextInt();
		System.out.println("\nSelect the currency covert to\n");
		int Select1=sc.nextInt();
		switch(Select)
		{
		case(1):
		{
		curfrom="INR";
		 fromval = INR;
		break;
		}
		case(2):
		{
			curfrom="USD";
		 fromval = USD;
		break;
		}
		case(3):
		{	 
				curfrom="JPY";
				 fromval = JPY;
		break;
		}
		case(4):
		{
			curfrom="AUD";
		 fromval = AUD;
		break;
		}
		case(5):
		{
			curfrom="CAD";
		 fromval = CAD;
		break;
		}
		case(6):
		{
			curfrom="HKD";
		 fromval = HKD;
		break;
		}
		case(7):
		{
			curfrom="SGD";
		 fromval = SGD;
		break;
		}
		case(8):
		{
			curfrom="KRW";
		 fromval = KRW;
		break;
		}
		case(9):
		{
			curfrom="XCD";
		 fromval = XCD;
		break;
		}
		case(10):
		{
			curfrom="GBP";
		 fromval = GBP;
		break;
		}
		}
switch(Select1)
		{
		case(1):
		{
			curto="INR";
			toval = INR;
			con(curfrom, curto, fromval, toval);
		break;
		}
		case(2):
		{
			curto="USD";
			toval = USD;
			con(curfrom, curto, fromval, toval);
		break;
		}
		case(3):
		{
			curto="JPY";
			toval=JPY;
			con(curfrom, curto, fromval, toval);
			
		break;
		}
		case(4):
		{
			curto="AUD";
		 toval = AUD;
		 con(curfrom, curto, fromval, toval);
		break;
		}
		case(5):
		{
			curto="CAD";
			toval = CAD;
			con(curfrom, curto, fromval, toval);
		break;
		}
		case(6):
		{
			curto="HKD";
			toval = HKD;
			con(curfrom, curto, fromval, toval);
		break;
		}
		case(7):
		{
			curto="SGD";
			toval = SGD;
			con(curfrom, curto, fromval, toval);
		break;
		}
		case(8):
		{
			curto="KRW";
			toval = KRW;
			con(curfrom, curto, fromval, toval);
		break;
		}
		case(9):
		{
			curto="XCD";
			toval = XCD;
			con(curfrom, curto, fromval, toval);
		break;
		}
		case(10):
		{
			curto="GBP";
			toval = GBP;
			con(curfrom, curto, fromval, toval);
		break;
		}
		}
sc.close();
		}
	public static void List1()
	{
		Map <Integer,String> Currency=new HashMap<>();
		System.out.println("s/n"+"  currency"+"               ISO code" );
		Currency.put(1,"   Rupee"+"                     INR");
		Currency.put(2,"   US Dollar"+"                 USD");	
		Currency.put(3,"   Japanese yen"+"              JPY");
		Currency.put(4,"   Austraian Dollar"+"          AUD");
		Currency.put(5,"   Canadian Dollar"+"           CAD");
		Currency.put(6,"   Hong kong Dollar"+"          HKD");
		Currency.put(7,"   Singapore Dollar"+"          SGD");
		Currency.put(8,"   South Korean Won"+"          KRW");
		Currency.put(9,"   Eastern Caribbean Dollar"+"  XCD");
		Currency.put(10,"  Sterling"+"                  GBP");
		
		for(Map.Entry<Integer,String> a:Currency.entrySet())
		{
			System.out.println(" "+ a.getKey()+" " + a.getValue());
		}
	}
		public static void con(String curfrom, String curto, BigDecimal fromval, BigDecimal toval)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter the amount \n");
			String amount=sc.nextLine();
			BigDecimal a=new BigDecimal(amount);
			System.out.println("Coverting   "+curfrom+"  to  "+curto);
			BigDecimal res=(a.multiply(fromval)).divide(toval,4, RoundingMode.HALF_UP);;
			System.out.println(res);
			sc.close();
		}
	}