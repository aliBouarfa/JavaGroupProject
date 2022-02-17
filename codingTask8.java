package codingGroupTasks;

import java.util.Scanner;

public class codingTask8 {

	public static void main(String[] args) {
		//Maximum and minimum number in the array?
		//Numbers={1000, 55, 300, 100, 9, 4600...we can enter any number}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements in array:");
		int min,max;
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
		System.out.println("enter the element "+(i)+": ");
		arr[i]=scan.nextInt();}
		min=arr[0];
		max=arr[0];
		for(int i=0; i<n; i++) {
		if(min>arr[i]) {
		min=arr[i];}
		if(max<arr[i]) {
		max=arr[i];}
		}
		System.out.println("Manimum number is "+min);
		System.out.println("Maximum number is "+max);
		//OTHER WAY
		System.out.println("***************************************************");
		int number[]= {1000, 55, 300, 100, 9, 4600};
		number[0]=1000;
		number[1]=55;
		number[2]=300;
		number[3]=100;
		number[4]=9;
		number[5]=4600;
		System.out.println("Manimum number is"+number[4]);
		System.out.println("Maximum number is"+number[number.length-1]);}
		}


