package com.bit.javaex.practice.extra02.problem03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	List<Goods> goodsList = new ArrayList<>();
    	Scanner sc = new Scanner(System.in);
    	int sum = 0;

        System.out.println("상품 3개를 입력해주세요");
        for (int i = 0; i < 3; i++) {
        	String str = sc.nextLine();
        	/*String[] strArrays = str.split(" ");
        	Goods goods = new Goods();
        	goods.setName(strArrays[0]);
        	goods.setPrice(Integer.valueOf(strArrays[1]));
        	goods.setCount(Integer.valueOf(strArrays[2]));
        	
        	goodsList.add(goods);
        	sum += Integer.valueOf(strArrays[2]);*/
        	List<String> strList = Arrays.asList(str.split(" "));
        	Goods goods = new Goods();
        	goods.setName(strList.get(0));
        	goods.setPrice(Integer.valueOf(strList.get(1)));
        	goods.setCount(Integer.valueOf(strList.get(2)));
        	
        	goodsList.add(goods);
        	sum += Integer.valueOf(strList.get(2));
        }
        
        for (int i = 0; i < goodsList.size(); i++) {
        	goodsList.get(i).showInfo();
        }
        System.out.printf("모든 상품의 갯수는 %d개입니다.%n", sum);
    }

}
