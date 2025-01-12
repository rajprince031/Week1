

//importing Scanner read the input 

import java.util.Scanner;

//Creating the class NumberCheckerMethod 

public class NumberCheckerMethod{
	
	public static int countDigit(int num){
		int count = 0 ;
		while (num != 0){
			num = num/10; 
			count++;
		}
		return count;
	}
	
	public static int[] digitArray(int num, int count){
		int[] digitArray = new int[count];
		
		for (int i = 0 ; i < count ; i ++){
			int element = num%10;
			digitArray[i] = element;
			num = num/10;
		}
		
		return digitArray;
	}
	
	public static String checkDuck(int[] digitArray){
		boolean checkDuck = true; 
		for (int i : digitArray){
			if (i == 0){
				checkDuck = false ;
				break;
			}
		}
		if (checkDuck){
			return "Duck Number";
		}
		else{
			return "Not a Duck Number";
		}
	}
	
	public static String checkArmstrong(int[] digitArray,int num,int count){
		int temp = 0 ;
		for (int i:digitArray){
			temp += Math.pow(i,count);
		}
		if (temp == num){
			return "ArmsStrong Number";
		}
		else{
			return Integer.toString(temp);
		}
	}
	
	public static String largestSecondLargest(int[] digits , int index){
		// Variables to store the largest and second largest digits
        int largest =  Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the digits array to find the largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
		return "Largest: " + largest + "\n" + "SecondLargest: "+secondLargest;
	}
	
	public static String smallestSecondsmallest(int[] digits , int index){
		// Variables to store the smallest and second smallest 
        int smallest =  Integer.MAX_VALUE; // Initializing to -1 assuming non-negative digits
        int secondSmallest = Integer.MAX_VALUE;

        // Loop through the digits array to find the smallest and smallest second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
		return "Smallest: " + smallest + "\n" + "SecondLargest: "+secondSmallest ;
	}
	
	
	public static void main(String args[]){
		//Creating object of Scanner class for taking input 
		Scanner input = new Scanner(System.in);
		
		//Taking num variable from user and using method as per the requirement  
		System.out.println("Enter the Number");
		int num = input.nextInt();
		
		int count = countDigit(num);
		
		int[] digitArray = digitArray(num,count);
		
		String checkDuck = checkDuck(digitArray);
		
		String armstrong = checkArmstrong(digitArray,num,count);
		
		String largestSecondLargest = largestSecondLargest(digitArray,count);
		
		String smallestSecondsmallest = smallestSecondsmallest(digitArray,count);
		
		//Print Final Values 
		System.out.println("Number: " + num + "\n" + "Count of digit: "+count+ "\n" + checkDuck + "\n" + armstrong + "\n" + largestSecondLargest + "\n" + smallestSecondsmallest );
		
	}
	



}