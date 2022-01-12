//package practice;
//
//import org.testng.Assert;
//import org.testng.asserts.SoftAssert;
//
//public class Assertion {
//
//	public void Test1() {
//
//		System.out.println("Hard Assertion stops the test after a fail");
//		Assert.assertEquals(false, true);
//		System.out.println("This will not be seen unless there's a soft assert");
//	}
//
//	public void Test2() {
//		System.out.println("Soft Assertion does not stop the test after a fail");
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(false, true);
//		System.out.println("This will not be seen unless there's a soft assert");
//	}
//}
