package com.bit.javaex.practice.practice03.problem03;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    	System.out.printf("%s 계좌가 개설되었습니다.", this.accountNo);
    }
    
    //필요한 메소드 작성
    public void deposit(int money) {
    	balance += money;
    }
    public void withdraw(int money) {
    	balance -= money;
    }
    public void showBalance() {
    	System.out.print(balance);
    }

}
