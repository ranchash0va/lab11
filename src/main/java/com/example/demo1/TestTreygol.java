package com.example.demo1;
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;

public class TestTreygol {

    private Treygol treygol;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @BeforeClass
    public static void globalSetUp() {
        System.out.println("Initial setup...");
        System.out.println("Code executes only once");
    }
    @Before
    public void setUp() {
        System.out.println("Code executes before each test method");
        Treygol treygol1 = new Treygol();
        Treygol treygol2 = new Treygol();
        Treygol treygol3 = new Treygol();
        treygol1.setStro1(5);
        treygol1.setStro2(3);
        treygol1.setStro3(8);
        treygol1.setYglA(60);
        treygol1.setYglB(30);
        treygol1.setYglY(15);
        treygol1.setS(55);
        treygol1.setP(34);
        treygol2.setStro1(6);
        treygol2.setStro2(9);
        treygol2.setStro3(13);
        treygol2.setYglA(88);
        treygol2.setYglB(30);
        treygol2.setYglY(18);
        treygol2.setS(60);
        treygol2.setP(40);
        treygol3.setStro1(9);
        treygol3.setStro2(10);
        treygol3.setStro3(13);
        treygol3.setYglA(60);
        treygol3.setYglB(14);
        treygol3.setYglY(45);
        treygol3.setS(58);
        treygol3.setP(37);
        List<Treygol> trList = new ArrayList<>();
        trList.add(treygol1);
        trList.add(treygol2);
        trList.add(treygol3);
        treygol = new Treygol (trList);

    }
    @Test
   public void standardTest() {
        System.out.println("Test is running");
    }
    @Test
    public void   TreygolTest(){
        treygol.setStro1(3);
        treygol.setStro2(6);
        treygol.setStro3(8);
        System.out.println("Sides of a triangle");
    }

    @Test
    public  void  YglTreygolTest(){
        treygol.setYglY(43);
        treygol.setYglB(54);
        treygol.setYglA(16);
        System.out.println("Angles of a triangle");
    }
    @Test
    public  void  STreygolTest(){
        treygol.setS(43);

        System.out.println("S of a triangle");
    }
    @Test
    public  void  PTreygolTest(){
        treygol.setP(18);

        System.out.println("P of a triangle");
    }
    @AfterClass
    public static void tearDown() {
        System.out.println("Tests finished");
    }
    @After
    public void afterMethod() {
        System.out.println("Code executes after each test method");
    }
}
