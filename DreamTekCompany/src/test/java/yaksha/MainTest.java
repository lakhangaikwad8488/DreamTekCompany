package test.java.yaksha;


import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import main.java.yaksha.Associate;
import main.java.yaksha.TestUtils;

class MainTest {

	@Test
	void testTrackAssociateStatus() throws IOException {
		//String output1="Project phase";
		//String output2="Deployed in project";
		Associate a=new Associate();
		a.setAssociateName("john");
		//assertEquals(output1,a.trackAssociateStatus(45) );
		 TestUtils.yakshaAssert(TestUtils.currentTest(),a.trackAssociateStatus(45).equals("Project phase")==true?"true":"false",TestUtils.businessTestFile);

		//a.setAssociateName("ram");
		//assertEquals(output2,a.trackAssociateStatus(70) );
	    
 	}
	@Test
	public void testExceptionConditon() throws Exception{

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.boundaryTestFile);	             

	}	 

	@Test
	public void testBoundaryCondition() throws Exception {

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.exceptionTestFile);
	}

}
