
import java.util.Scanner;
import java.util.Locale;

public class BMICalculator{
	public static void main(String[] args) {
		Scanner receiver = new Scanner(System.in);
		receiver.useLocale(Locale.US);

	System.out.println("Welcome BMIcalculator");

	System.out.println("");

	String name;
	int age;
	double weight;
	double height;

	/*int option = receiver.nextInt();
	receiver.nextLine();
	if(option ==1);*/

	System.out.println("State your name");
	name = receiver.nextLine();

	System.out.println("State your age");
	age = receiver.nextInt();

System.out.println("My name is"+" "+ "name"+" and I am "+"age"+"years old");

System.out.println("State your weight(kg) from 5 to 200");
weight = receiver.nextDouble();

System.out.println("State your height(m) from 0,5 to 3,5");
height = receiver.nextDouble();

double bmi = weight / (height * height);
System.out.println("Your results: "+ bmi);

if (bmi < 10.5) {
	System.out.println("Category : Underweight");
	}
else if (bmi <25) {
	System.out.println("Category : Normal weight");
}
else if (bmi <40) {
	System.out.println("Category : Overweight");
}
else if (bmi <55) {
	System.out.println("Category : Obese");
}
System.out.println("Thank You"+" "+ name);

receiver.close();
}
}