package codingProject;

import java.util.Random;

public class CodingProject {
	public static  int[] subtractlastbyfirst(int[] a) { 
	System.out.println(a[a.length - 1] - a[0]); // Step 1a.
	return a;
	 }
	
	public static String stringTogetherWordNTimes(String word, int n) { // step 7.
		String strungWord = "";
		for(int i = 0; i < n; i++) {
			strungWord += word;
		}
		return strungWord;
	}
	
	public static String fullName(String firstName, String lastName) { // step 8.
		String fullName = firstName +  " " + lastName;
		return fullName;
	}
	
	public static boolean bigNumber(int[] numbers) { //step 9.
		int totalNumber = 0;
		for(int i = 0; i < numbers.length; i++) {
			totalNumber += numbers[i];
		}
		if (totalNumber <= 100) {
			return false;
		} else {
			return true;
		}
	}
	public static  double averageDouble(double[] a) { // step 10.
		double totalOfA = 0;
		for(int i = 0; i < a.length; i++) {
			totalOfA += a[i];
		}
		double averageOfA = totalOfA / a.length;
		return averageOfA;
	}
	public static  boolean averageDoubleABiggerThanAverageDoubleB(double[] a, double[] b) { // step 11.
		double totalOfA = 0;
		for(int i = 0; i < a.length; i++) {
			totalOfA += a[i];
		}
		double averageOfA = totalOfA / a.length;
		double totalOfB = 0;
		for(int i = 0; i < a.length; i++) {
			totalOfB += b[i];
		}
		double averageOfB = totalOfB / b.length;
		if (averageOfA < averageOfB) {
			return true;
		} else {
			return false;
		}
	}
	public static  boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { // step 12
		if(isHotOutside || moneyInPocket > 10.50) {
			return true;
		}else {
			return false;
		}
	}
	public static void whatGameDoIPlay() {
		Random rand = new Random(); // creating a generated random number with java.util.Random.
		int int1 = rand.nextInt(43); // I have 43 games ready to play on steam. 
		System.out.println("the next game you will play is: " + int1); //Picks a game for me because I can't decide.
	}
	
public static void main(String[] args) {
	int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 }; //step 1.
		subtractlastbyfirst(ages);
		
	int[] nineElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // step 1b.
		subtractlastbyfirst(nineElements); // step 1b pt2.
		
	int ageAverage = 0; // step 1c.
	for(int i = 0; i < ages.length; i++) {
		ageAverage += ages[i];
	}
	ageAverage = ageAverage / ages.length;
	System.out.println("The average age in age is: " + ageAverage); // step 1c pt2.
	double lengthOfNames = 0;
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" }; // step 2.
	System.out.println("the number of names in names is: " + names.length);
	for(int i = 0; i < names.length; i++){ // step 2a.
		lengthOfNames += names[i].length();
	}
	System.out.println("the total length of names in names is: " + lengthOfNames); 
	double averageLengthOfNames = lengthOfNames / names.length;
	System.out.println("the average length of names in names is: " + averageLengthOfNames); // Step 2a pt2.
	
	String listNames = "";
	for(int i = 0; i < names.length; i++) { // step 2b.
		listNames = listNames.concat(names[i]) + " ";
	}
	System.out.println("the list of names in names is: " + listNames);
	/*
	 * step 3. "How do you access the last element of any array?"
	 * array.length - 1.
	 * 
	 * step 4 "How do you access the first element of any array?"
	 * array[0].
	 */
	int[] nameLengths = new int[names.length]; //step 5
	for(int i = 0; i < names.length; i++) { //step 5 pt2.
		nameLengths[i] = names[i].length();
	}
	int totalLengthOfToatalNames = 0; 
	for(int i = 0; i < nameLengths.length; i++) { // step 6.
		totalLengthOfToatalNames += nameLengths[i];
	}
	System.out.println("the total characters in the names of names is: " + totalLengthOfToatalNames); // step 6 pt2.
	
	whatGameDoIPlay();
}
}
