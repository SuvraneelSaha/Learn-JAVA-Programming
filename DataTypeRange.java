import java.util.*;


public class DataTypeRange
{
	public static void main(String args[])
	{
		// for every primtive data type 
		// there exists a wrapper class - which contains the size of the datatype and the  range of the datatype 
		// java.lang.Integer -- for finding out the methods present inside of a class - we can use 
		// in terminal - javap java.lang.Integer - slowly  we will learn which classes are present inside of which packages 
		
		System.out.println("Int Min: "+Integer.MIN_VALUE);
		System.out.println("Int Max: "+Integer.MAX_VALUE);
		System.out.println("Int Bytes: "+Integer.BYTES);
		
		// In case of Booolean - it is unsure will it take 1 byte or 1 bit 
		// 1 byte = 8 bits 
		System.out.println("Byte Min: "+Byte.MIN_VALUE);
		System.out.println("Byte Max: "+Byte.MAX_VALUE);
		System.out.println("Byte Bytes: "+Byte.BYTES);
		
		System.out.println("Float Min: "+Float.MIN_VALUE);
		System.out.println("Float Max: "+Float.MAX_VALUE);
		System.out.println("Float Bytes: "+Float.BYTES);
		
		// we can get to know about the methods using the javap command 
		// and remember classes start with capital letter
		// Wrapper Classes are based upon the primitive data types. 
		
		
	}
}
