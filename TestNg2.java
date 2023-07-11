package selenium_practise_all;

import org.testng.annotations.*;

public class TestNg2 {

	
	@BeforeTest
	void beforeTest()
	{
		System.out.println("Before Whole Test");
	}
	
	@AfterTest
	void afterTest()
	{
		System.out.println("After Whole Test");
	}
	
	@Test
	void test3(){
		System.out.println("Test 3 in new class");
	}
	
	@Test
	void test4()
	{
		System.out.println("Test 4 ");
	}
}
