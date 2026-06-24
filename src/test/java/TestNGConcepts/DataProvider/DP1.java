package TestNGConcepts.DataProvider;
import org.testng.annotations.*;

public class DP1 {

    @Parameters("name")
    @Test()
    void test_Method1(String name){
        System.out.println(name);
    }
    @Test(dataProvider = "DP1-data")
    void test_dP1(String a){
        System.out.println(a+" test");
    }

    @DataProvider(name = "DP1-data",indices = {0,2})
   public static Object[] dataProvider(){
        Object[] a ={"A",1,"B",2};
        return a;


    }
}
