package selenium_practise_all;

import org.testng.annotations.*;

public class TestNG_annotations {
	// TODO Auto-generated method stub

	@BeforeMethod
	void before_every_test() {
		System.out.println("Multiple times Before every Test method -> @BeforeMethod");
	}

	@AfterMethod
	void after_every_test() {
		System.out.println("Multiple times After every Test method -> @AfterMethod");
	}

	@Test
	void test1() {
		System.out.println("This is test1");
	}

	@Test
	void test2() {
		System.out.println("This is test2");
	}
	
	@BeforeClass
	void beforeclass()
	{
		System.out.println("executed before first @Test method execution. It will be executed one only time throughout the test case. -> @beforeClass");
	}
	
	@AfterClass
	void afterclass()
	{
		System.out.println("executed after all test methods in the current class have been run -> @AfterClass");
	}
	
	@BeforeSuite
	void beforeSuite()
	{
		System.out.println("run before the first test run of that specific group -> @BeforeSuite");
	}
	
	@AfterSuite
	void afterSuite()
	{
		System.out.println("run once after the execution of all tests in the suite is complete. -> @AfterSuite");
	}
	
	@BeforeGroups
	void beforeGroup()
	{
		System.out.println("run before the first test run of that specific group -> @BeforeGroup");
	}	
	
	@AfterGroups
	void afterGroups()
	{
		System.out.println("run after all test methods of that group complete their execution -> @AfterGroup");
	}

}
