package TestNGConcepts.AnnotationAll;

import org.testng.annotations.*;

public class TestAnnotation1 {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method  is running");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method  is running");
        System.out.println();
    }

    @Test
    public void testA1(){

        System.out.println("TestAnotation Class - Method TestA1 running");
    }
    @Test
    public void testA2(){

        System.out.println("TestAnotation Class - Method TestA2 running");
    }

}
