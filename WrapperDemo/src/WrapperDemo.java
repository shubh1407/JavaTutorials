
public class WrapperDemo {
	
	
	public static void main(String[] args) {
		
		Double num = 5.0d;
		
		Boolean bol = true;
		
		Byte b = 5;
		
		
		
		System.out.println(num.toString());
		
		double d=Double.valueOf("123");
		System.out.println(d);
		
		char [][][] ch = new char[3][3][3];   // size -3
		
		
		char [][][] ch2 = {
				{
					{
						'a','b','c'
						},{
							'1','2','3'
							},{
								'd','e','f'
								},{
									'4','5','6'
									}
					}
		};
		
		System.out.println(ch2[1][1][1]);   // program will stop execution after exception
		
		System.out.println("end of program");
		// boolean
		
		// byte < short < char < int < long < float < double 
		
		// Byte < Short < Character < Integer < Long < Float < Double
		
		
		
		// <dataType> [] [] <var-name> = new <dataType>[<size>] [<size>]   // static  // empty array
		
		// <dataType> [] <var-name> = {<value>,value,value,value ....}
		
		
		
		
	}
}
