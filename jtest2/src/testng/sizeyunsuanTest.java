package testng;

import org.testng.annotations.Test;

//import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class sizeyunsuanTest {
	sizeyunsuan c=new sizeyunsuan();
  @BeforeClass
  public void beforeClass() {
	  System.out.println("我是beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("我是afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("我是beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("我是aftertest");
  }


  @Test
  @Parameters({"test2"})
  public void add(int test2) {
	  int result=c.add(test2,test2);
	  System.out.println(result);
	//  Assert.assertEquals(7,result);
	  
  }


  //必须依赖加法，只有加法测试成功了，乘法才可以运行
  @DataProvider(name="test2")
  public Object[][] dataprovide(){
	  return new Object[][] { {2,3},{4,5},{6,7} };
  }
  @Test(dataProvider="test2")
  
 // @Test//(dependsOnMethods= {"add"})			//跟随测试
  public void cheng(int a,int b) {
	  int result=c.cheng(a,b);
	  System.out.println("乘法的结果是"+result);
	 // Assert.assertEquals(10, result);
  }



 @Test(enabled=false)						//忽略测试
  public void chu() {
	  int result=c.chu(6,2);
	  System.out.println("除法的结果是"+result);
	  //Assert.assertEquals(3, result);
	  //Assert.assertNotNull(result);
  }

  @Test
  public void sub() {
	  int result=c.sub(3,1);
	  System.out.println("减法的结果是"+result);
	  //Assert.assertEquals(2, result);
  }
}
