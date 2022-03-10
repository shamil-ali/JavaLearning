package com.qa.Iteration;

public class Coins {
	
	public void calcChange(double totalCost, double amountPaid) {
	
	int oneP = 0;
	int twoP = 0;
	int fivP = 0;
	int tenP = 0;
	int tweP = 0;
	int fifP = 0;
	int onePound = 0;
	int twoPound = 0;
	int fivPound = 0;
	int tenPound = 0;
	int twePound = 0;
//	double totalCost;
//	double amountPaid;
	double changeDue = amountPaid - totalCost;
	
	while (changeDue >= 20)	{
		changeDue -= 20;
		twePound++;
	}
	
	if (changeDue != 0) {
			System.out.println(twePound + " £20 Notes");
		}
	
	while (changeDue >= 10)	{
		changeDue -= 10;
		tenPound++;
	}
	
	if (changeDue != 0) {
			System.out.println(tenPound + " £10 Notes");
		}
	
	while (changeDue >= 5)	{
		changeDue -= 5;
		fivPound++;
	}
	
	if (changeDue != 0) {
			System.out.println(fivPound + "  £5 Notes");
		}
	
	while (changeDue >= 2)	{
		changeDue -= 2;
		twoPound++;
	}
	
	if (changeDue != 0) {
			System.out.println(twoPound + "  £2 Coins");
		}
	
	while (changeDue >= 1)	{
		changeDue -= 1;
		onePound++;
	}
	
	if (changeDue != 0) {
			System.out.println(onePound + "  £1 Coins");
		}
	
	while (changeDue >= 0.50)	{
		changeDue -= 0.50;
		fifP++;
	}
	
	if (changeDue != 0) {
			System.out.println(fifP + " 50p Coins");
		}
	
	while (changeDue >= 0.20)	{
		changeDue -= 0.20;
		tweP++;
	}
	
	if (changeDue != 0) {
			System.out.println(tweP + " 20p Coins");
		}
	
	while (changeDue >= 0.10)	{
		changeDue -= 0.10;
		tenP++;
	}
	
	if (changeDue != 0) {
			System.out.println(tenP + " 10p Coins");
		}
	
	while (changeDue >= 0.05)	{
		changeDue -= 0.05;
		fivP++;
	}
	
	if (changeDue != 0) {
			System.out.println(fivP + "  5p Coins");
		}
	
	while (changeDue >= 0.02)	{
		changeDue -= 0.02;
		twoP++;
	}
	
	if (changeDue != 0) {
			System.out.println(twoP + "  2p Coins");
		}
	
	while (changeDue >= 0.01)	{
		changeDue -= 0.01;
		oneP++;
	}
	
	if (changeDue != 0) {
			System.out.println(oneP + "  1p Coins");
			System.out.println("________________");
		}
	
		if (amountPaid == totalCost) {
			System.out.println("Thank you for shopping at Tesco!");
		}
		
		else if (amountPaid > totalCost) {
			System.out.println("Please take your change!");
			System.out.println("Thank you for shopping at Tesco!");
		}
		
	}
	
}
