package com.bit.javaex.practice.extra02.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String str = null;
    	Operator cal = null;
    	
    	while(true) {
    		System.out.print(">> ");
        	str = sc.nextLine();
        	if(str.equals("/q")) {
        		break;
        	} else {
        		String strs[] = str.split(" ");
                
            	if(strs[1].equals("+")) {
            		cal = new Add();
            	} else if(strs[1].equals("-")) {
            		cal = new Sub();
            	} else if(strs[1].equals("*")) {
            		cal = new Mul();
            	} else if(strs[1].equals("/")) {
            		cal = new Div();
            	} else {
            		System.out.println("알 수 없는 연산입니다.");
            		continue;
            	}
    			cal.setValue(Integer.valueOf(strs[0]), Integer.valueOf(strs[2]));
            	System.out.println(">> " + cal.calculate());
        	}
        }
    	sc.close();
    	System.out.println("종료합니다.");
    }
}
