package TestNGConcepts.AnnotationAll;

import org.testng.annotations.*;

public class TestAnnotation2 extends  Test1{

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite is running");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("After Suite is running");
    }

    @Test

    void testMethodD(){
        System.out.println("TesAnnotation2 -class -testMethod is running");
    }



}
