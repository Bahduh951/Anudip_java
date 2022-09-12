package com.java.Java_project;
/*Create a class having student details like name,marks in 3 subjects and a percentage variable
create a student business logic which should return the percentage of three subjects
and then test the business logic using junit.*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Businesslogic_test {
	Student s1=new Student();
	Business busn=new Business();
	
	

		@Test
		void test() {
			s1.setName("Aman");
			s1.setMarks1(50);
			s1.setMarks2(50);
			s1.setMarks3(50);
			double p=busn.calpercentage(s1);
			assertEquals(50,p);
		}
		
}



