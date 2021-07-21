package testngFramework;

import org.testng.annotations.Test;

public class Grouping {
	 @Test(groups="X")
	  public void f1() {
		  System.out.println("printing f1");
	  }
	  @Test(groups="Y")
	  public void f2() {
		  System.out.println("printing f2");
	  }
	  @Test (groups="X")
	  public void f3() {
		  System.out.println("printing f3");
	  }
	  @Test(groups="Y")
	  public void f4() {
		  System.out.println("printing f4");
	  }
	  @Test(groups="X")
	  public void f5() {
		  System.out.println("printing f5");
	  }
	  @Test(groups="Y")
	  public void f6() {
		  System.out.println("printing f6");
	  }


}
