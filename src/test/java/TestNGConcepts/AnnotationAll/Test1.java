package TestNGConcepts.AnnotationAll;

import org.testng.annotations.*;

public class Test1 {
    @Test
    public void b() {
        System.out.println("Runinng B");
    }

    @Test(priority = 1)
    public void a() {
        System.out.println("Runinng A");
    }

    public void z() {
        System.out.println("Running ----Z");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class is running");
    }

    @BeforeTest
    public void beforeTest(){
    System.out.println("Before test is running");}

    @AfterTest
    public void afterTest(){
        System.out.println("After test is running");}

}