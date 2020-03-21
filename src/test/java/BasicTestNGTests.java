import org.apache.http.util.Asserts;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.testng.Assert;
import org.testng.annotations.*;


public class BasicTestNGTests {
    @BeforeTest
    public void BeforeTest(){
        System.out.println("Before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");

    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }




    @BeforeMethod
    public void setup(){
        System.out.println("Before Method");
    }

    @Test
    public void test1(){
        System.out.println("Test1");
        String expected = "apple"   ;
        String actual = "apple";
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void test2() {
        System.out.println("Test2");
        int num1 =50;
        int num2 = 10;
        Assert.assertTrue(num1>num2);
    }
    @AfterMethod
    public void teardown(){
        System.out.println("After Method");
    }
}
