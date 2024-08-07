/*
 * File name: HealthProfile.java
 *
 * Subject: Patients health profiles to record their information.
 *
 * Date: August 10, 2024
 *
 * Author: Alsayed Aldkhakhni
 * 
 * Last modification: August 7, 2024 --> [10:46 AM]
 *
 * */

public class HealthProfile // class declaration.
{
	// instance varibales.
	private String fName;
	private String lName;
	private String gender;
	private double heightInInches;
	private double weightInPounds;
	private int month;
	private int day;
	private int year;

	// constructor.
	public HealthProfile(String fName, String lName, int month, int day, int year, double weight, double height, String gender)
	{
		this.fName = fName;
		this.lName = lName;
	
		// month validation.
		if(month <= 0)
			System.out.println("Invalid month.");

		if(month > 12)
			System.out.println("Invalid month.");

		if(month > 0)
			if(month <= 12)
				this.month = month;
		
		// day validation.
		if(day <= 0)
			System.out.println("Invalid day.");

		if(day > 31)
			System.out.println("Invalid day.");

		if(day > 0)
			if(day <= 31)
				this.day = day;

		// the year.
		if(year <= 0)
			System.out.println("Invalid year.");

		if(year > java.time.LocalDate.now().getYear())
			System.out.println("Invalid year.");

		if(year > 0)
			if(year <= java.time.LocalDate.now().getYear())
				this.year = year;

		// validate weight.
		if(weight <= 0)
			System.out.println("Invalid weight.");

		if(weight > 0)
			weightInPounds = weight;

		// validate height.
		if(height <= 0)
			System.out.println("Invalid height.");

		if(height > 0)
			if(height < 12)
				heightInInches = height * 12;

		// validate the gender.
		if(gender == "Male")
			this.gender = gender;

		if(gender == "Female")
			this.gender = gender;
	}

	// mutators.
	public void set1stName(String name) { fName = name;}
	public void set2ndName(String name) { lName = name;}
	public void setMonth(int month)
       	{
		if(month <= 0)
			System.out.println("Invalid month.");

		if(month > 12)
			System.out.println("Invalid month.");

		if(month > 0)
			if(month <= 12)
				this.month = month;
	}

	public void setDay(int day)
       	{
		if(day <= 0)
			System.out.println("Invalid day.");

		if(day > 31)
			System.out.println("Invalid day.");

		if(day > 0)
			if(day <= 31)
				this.day = day;
	}

	public void setYear(int year)
       	{
		if(year <= 0)
			System.out.println("Invalid year.");

		if(year > java.time.LocalDate.now().getYear())
			System.out.println("Invalid year.");

		if(year > 0)
			if(year <= java.time.LocalDate.now().getYear())
				this.year = year;
	}

	public void setWeight(double weight)
	{
		if(weight <= 0)
			System.out.println("Invalid weight.");

		if(weight > 0)
			weightInPounds = weight;
	}

	public void setHight(double height)
	{
		if(height <= 0)
			System.out.println("Invalid height.");
		
		if(height > 0)
			if(height < 12)
				heightInInches = height * 12;
	}

	public void setGender(String gender)
	{
		if(gender == "Male")
			this.gender = gender;

		if(gender == "Female")
			this.gender = gender;
	}

	// accessors.
	public String get1stName() { return fName; }
	public String get2ndName() { return lName; }
	public String getGender()  { return gender; }
	
	public int getMonth() { return month;}
	public int getDay()   { return day; }
	public int getYear()  { return year;}

	public int getAge() { return java.time.LocalDate.now().getYear() - year; }
	public int getMaxRate() { return 220 - getAge(); }
	public double getTargetRate() { return 70.0/100.0 * getMaxRate(); }

	public double getWeight() { return weightInPounds; }
	public double getHeight()  { return heightInInches / 12.0; }
	public void getBMI() 
	{
		double BMI = (weightInPounds * 703.0) / (heightInInches * heightInInches);
		System.out.printf("Your BMI is: %.1f%n", BMI);
		System.out.print("\n-------------BMI VALUES-------------\n");
	        System.out.print("Underweight: less than 18.5\n");
		System.out.print("Normal:      between 18.5 and 24.9\n");
		System.out.print("Overweight:  between 25 and 29.9\n");
		System.out.print("Obese:       30 or greater\n");
		System.out.println("====================================");
	}
}


