package com.sprintqa.java.reviewclass_23_Jan;

public class SortingArrayExHW {
	// sort the numbers in the array in ascending order
	public static void main(String[] args) {
		int numbers[]= {14,56,37,0,23,9,2,80,67}, min=0, temp=0, indexOfMin=0;


		/*int temp;
		for ( int i=0; i<numbers.length; i++) {

			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[i]>numbers[j]) {
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;

				}
			}
		}

		for(int i=0; i<numbers.length-1; i++)
			System.out.print(numbers[i]+", ");

		System.out.println(numbers[numbers.length-1]);
		 */
		for(int i=0; i<numbers.length-1; i++) {
			min=numbers[i];
			for(int j=i; j<numbers.length; j++) {
				if(numbers[j]<min) {
					min=numbers[j];
					indexOfMin=j;
				}

			}
			//swapping two numbers-numbers[indexOfmin],numbers[i]
			
			temp=numbers[indexOfMin];
			numbers[indexOfMin]=numbers[i];
			numbers[i]=temp;
		}
		for(int i=0; i<numbers.length; i++) {
		System.out.println(numbers[i]);
		}
	}}
