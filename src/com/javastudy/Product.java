package com.javastudy;

import java.util.Scanner;

public class Product {
	private String name;
	private int price;
	
	public Product(String n,int p){
		this.name = n;
		this.price = p;
	}
	public void result() {
		Scanner sc = new Scanner(System.in);
		System.out.println(name+","+price);
		
		
	}

}
