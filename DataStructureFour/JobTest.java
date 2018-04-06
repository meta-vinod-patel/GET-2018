package DataStructureFour;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import DataStructureFour.beans.DepartmentChair;
import DataStructureFour.beans.Graduates;
import DataStructureFour.beans.Professors;
import DataStructureFour.beans.UnderGraduates;
import DataStructureFour.service.Printer;

public class JobTest {

	DepartmentChair departmentChair;
	Professors professors;
	Graduates graduates;
	UnderGraduates underGraduates;
	List<String> actualList;
	List<String> expectedList;
	@Before
	public void setUp(){
		departmentChair = new DepartmentChair("Print Department chair");
		professors = new Professors("Print Professors");
		graduates = new Graduates("Print Grad students");
		underGraduates = new UnderGraduates("Print Under Grad Students");
		underGraduates.sendToPrinter();
		departmentChair.sendToPrinter();
		departmentChair.sendToPrinter();
		
		graduates.sendToPrinter();
		
		professors.sendToPrinter();
		actualList = new ArrayList<>();
		expectedList = new ArrayList<>();
		
	}
	@Test
	public void test() {
		actualList = Printer.getInstance().print();
		expectedList.add("Print Department chair");
		expectedList.add("Print Department chair");
		expectedList.add("Print Professors");
		expectedList.add("Print Grad students");
		expectedList.add("Print Under Grad Students");
		assertEquals(expectedList, actualList);
	}

}
