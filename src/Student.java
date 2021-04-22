

public class Student extends Person {
	private double gpa;
	private String schedule;

	// Constructor
	public Student(String n, String b, double g, String s) {
		// Call superclass constructor first
		super(n, b);
		// Do anything else we want
		gpa = g;
		schedule = s;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		String result = super.toString();
		result += "\nSchedule: " + schedule + "\nGPA: " + gpa;
		return result;
	}
	
	@Override
	public boolean equals(Object other) {
		Student otherStudent = (Student) other;

		if (this.getName().equals(otherStudent.getName()) && 
				this.getBirthday().equals(otherStudent.getBirthday())) {
			return true;
		}
		return false;
	}
}
