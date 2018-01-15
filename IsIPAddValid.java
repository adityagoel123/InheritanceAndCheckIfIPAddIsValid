package com.aditya.mlabs.tester;


abstract class Arthmetic {
	abstract int add(int a, int b);
}


class Adder extends Arthmetic {

	@Override
	int add(int a, int b) {
		return a + b;
	}
	
}



class MyRegex extends IsIPAddValid {
    private static String pattern = "/* Write your RegEx here. */";
    public String currentIp;
    
    public MyRegex(String iP) { 
    	currentIp = iP;
    }
    
    public boolean isMatch() {
    	String[] fourBreaklets = currentIp.split("\\.");
    	if(fourBreaklets.length != 4){
    		return false;
    	} else {
    		boolean res4ThisCase = true;
    		for(String eachBreaklet : fourBreaklets) {
    			try {
    				int intBreaklet = Integer.parseInt(eachBreaklet);
    				if(intBreaklet < 0 || intBreaklet > 255) {
        				res4ThisCase = false;
        				break;
        			}
    			} catch (NumberFormatException e) {
    				res4ThisCase = false;
    				break;
    			}
    		}
    		return res4ThisCase;
    	}
    }
}


public class IsIPAddValid {
	public static void main(String args[]){
		/*Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		
		Adder adderObject = new Adder();
		
		System.out.println(adderObject.getClass().getSuperclass().getName());
		System.out.println(adderObject.add(a, b));
		*/
		MyRegex myReg = new MyRegex(".213.123.23.32");
		
		System.out.println(myReg.isMatch());
		
	}
}
