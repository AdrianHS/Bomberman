/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author _ADRIAN_
 */
public class FileWRTest {
    
    public FileWRTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        Game g = new Game(21,1, 1, 1, 42, 1);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createFile method, of class FileWR.
     */
    @Test
    public void testCreateFile() {
        System.out.println("create");
        String name = "Adrian";
        String min = "01";
        String seg = "14";
        String l = "";
        FileWR instance = new FileWR();
        instance.createFile(name, min, seg, l);
        System.out.println("guarded");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of readFile method, of class FileWR.
     */
    @Test
    public void testReadFile() {
        System.out.println("read");
        String name = "SocoresEasy.txt";
        FileWR instance = new FileWR();
        instance.readFile(name);
        System.out.println("well-read");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
