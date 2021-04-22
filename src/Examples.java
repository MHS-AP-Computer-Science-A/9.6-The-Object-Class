

public class Examples {

	public static void main(String[] args) {

		// Before overriding, .equals and ==
		// do the same thing
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println("Compare objects with == " + (o1 == o2));
		System.out.println("Compare objects with equals " + (o1.equals(o2)));

		// String overrides equals
		String s1 = "AP Computer Science";
		String s2 = "AP Computer Science";
		boolean result = s1.equals(s2);
		System.out.println("Compare Strings with equals: " + result);

		// Student now overrides equals
		Student student1 = new Student("Amy", "4/28", 3.9, "Band, Computer Science");
		Student student2 = new Student("Amy", "4/28", 3.9, "Band, Computer Science");
		result = student1.equals(student2);
		System.out.println("Compare Students with equals: " + result);

		// Default toString
		System.out.println("\nDefault toString: " + o1);

		// Overridden toString for Student object
		System.out.println("\nOverridden toString in student class:\n" + student1);

	}


}
