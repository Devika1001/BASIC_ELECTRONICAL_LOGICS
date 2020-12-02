package com.firstprogram.abc;
import java.util.Scanner;
/**
 * created interface of logics
 * 0 for OR operation
 * 1 for AND operation
 * 2 for XOR operation
 * 3 for XNOR operation
 * 4 for NAND operation
 * 5 for  NOT operation
 * 6 for NOR operation
 * 7 for FAUL operation
 * @author Dev
 * @version 15.0
 * @since 14-11-2020
 */
// interface is to declare only behavioral characteristic in the form of method without declaring feed in it.
interface Logics
{
	int OR=0;
	int AND=1;
	int XOR=2;
	int XNOR=3;
	int NAND=4;
	int NOT=5;
	int NOR=6;
	int FAUL=7;
}
/**
 * class for operation
 * check the selected choice and perform the particular action according to the choice
 * @author Dev
 * @version 15.0
 * since 14-11-2020
 */

class Operatorations implements Logics 
{
	static int selectingLogic( )
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("which operation you want select you can select."+"\n"+"0 "+ " for OR"+" \n"+"1 for  and"+"\n"+"2 for XOR"+"\n"+"3 for XNOR"+"\n"+"4 for NAND"+"\n"+"5 for NOT"+"\n"+"6 for NOR");
//	for asking choise
		int choice=scan.nextInt();
	{
//		choice is 0 jump to or operation 
		if(choice==0)
		{
			return(OR);
		}
		//		choice is 1 jump to and operation
		if(choice==1)
		{
			return(AND);
		}
//		choice is 2 jump to xor operation 
		if(choice==2) 
		{
			return(XOR);
		}
//		choice is 3 jump to xnor operation 
		if(choice==3)
	    {
			return(XNOR);
	    }
//		choice is 4 jump to nand operation 
		if(choice==4)
	    {
			return(NAND);
	    }
//		choice is 5 jump to not operation 
		if(choice==5)
	    {
			return(NOT);
	    }
//		choice is 6 jump to nor operation 
		if(choice==6)
	    {
			return(NOR);
	    }
//		no match then faul will displayed
		else
			return(FAUL);
		
	} 
	}
	
}
/**
 * created class as electronic components
 * this will perform the operation according to operator selected and returns the value
 * @see opertor()
 * @see selectingLogic()
 * @param arguments are not used
 * @author Dev
 * @version 15.0
 * @since 14-11-2020
 *
 */
public class ElectronicsComponent implements Logics
{  

	 static void operator(int op)
	{ Scanner scan =new Scanner(System.in);
//	asking first value
	System.out.println("enter a value ");
	int a=scan.nextInt();
//	asking second value
	System.out.println("enter b value");
	int b=scan.nextInt();
	
		switch(op)
		{
//    and operation done 
		case AND:
		{
			
			System.out.println("a&b"+"\t"+(a&b));
		}
		break;
//		or operation done
		case  OR:
		{
			System.out.println("a|b"+"\t"+(a|b));
		}
		break;
//		nor operation done
		case NOR:
		{
			System.out.println("a $ b"+"\t"+(~(a|b)));
		}
		break;
//		xor operation done
		case XOR:
		{
			System.out.println("a^b"+"\t"+(a^b));
		}
		break;
//		xnor operation done
		case XNOR:
		{
			System.out.println(("a ~^ b")+"\t"+(~(a^b)));
			
		}break;
//		nand operation done
		case NAND:
		{
			System.out.println("a ~& b"+"\t"+(~(a&b)));
		}break;
//		not operation done
		case NOT:
		{
			System.out.println("~a "+"\t"+~a);
		}break;
//		declare as faul attempt
		case FAUL:
		 {
			 System.out.println("you have choosen invalid operator");
		 }
		
		}
	}
	 /*
	  * 
	  * object created of class operations
	  * @see operator() method called to perform the oparation according to choice
	  * @see selectingLogic()method called to select operation
	  */
	public static void main(String[] args)
	{
		Operatorations opt=new Operatorations();
		operator(opt.selectingLogic());
	}

	
   }


