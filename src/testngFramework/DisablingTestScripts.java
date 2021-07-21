package testngFramework;

import org.testng.annotations.Test;

public class DisablingTestScripts {
  @Test
  public void f1() {
	  System.out.println("printing f1");
  }
  @Test
  public void f2() {
	  System.out.println("printing f2");
  }
  @Test (enabled=false)
  public void f3() {
	  System.out.println("printing f3");
  }
  @Test
  public void f4() {
	  System.out.println("printing f4");
  }
  @Test
  public void f5() {
	  System.out.println("printing f5");
  }
}
