package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class chuTest {
	chu a=new chu();
  @BeforeClass
  public void beforeClass() {
	  System.out.println("����beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("����afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("����beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("����aftertest");
  }


  @Test
  public void c10() {
	  String result=a.c10(50);
	  Assert.assertEquals("a���Ա�10����", result);//���ԣ��жϽ���Ƿ�һ��
	 // System.out.println("��10�Ļ�"+result);
	 // Assert.assertNotEquals("a�����Ա�10����", result);//���ԣ��жϽ���Ƿ�һ��
	  //Assert.assertNull(result);//���ԣ��жϽ���Ƿ�Ϊ��
	  //Assert.assertNotNull(result);//���ԣ��жϽ���Ƿ�Ϊ��
  }

  @Test(dependsOnMethods= {"c10"})
  public void c7() {
	  String result=a.c7(50);
	  System.out.println("��7�Ļ�"+result);
  }
}
