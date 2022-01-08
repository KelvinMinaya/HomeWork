package arrays;

import java.util.ArrayList;

//Customized Arraylist
public class EnthrallStudents {
	public String studentName;// Global variable

	public EnthrallStudents(String studnetName) {
		this.studentName = studnetName;// local variable link keyword "this."
	}

	// calling the Constructor the object can be created then passing through the
	// constructor
	public static void main(String[] args) {
		ArrayList<EnthrallStudents> c1 = new ArrayList<>();
		// Neither integer,string only st1 type accepted.
		EnthrallStudents st1 = new EnthrallStudents("Kelvin");
		EnthrallStudents st2 = new EnthrallStudents("Marsha");
		EnthrallStudents st3 = new EnthrallStudents("Charlie");
		EnthrallStudents st4 = new EnthrallStudents("Adaya");

		c1.add(st1);
		c1.add(st2);
		c1.add(st3);
		c1.add(st4);

		System.out.println(c1.size());

		// for each loop
		for (EnthrallStudents student : c1) {
			System.out.println(student.studentName);// studentName from keyword pass through
		}

		//for loop
		for(int i=0;i<c1.size();i++) {
			
		}
		
		
		
	}
}
