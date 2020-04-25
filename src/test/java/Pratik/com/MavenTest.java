package Pratik.com;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MavenTest {

		@Test
		public void testCase1()
		{
			System.out.println("testCase1");
		}
		
		@BeforeTest
		public void testCase2()
		{
			System.out.println("testCase2");
		}
		
		@AfterTest
		public void testCase3()
		{
			System.out.println("testCase3");
		}
}
