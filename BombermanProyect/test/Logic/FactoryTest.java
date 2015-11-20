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
import static org.junit.Assert.*;

/**
 *
 * @author _ADRIAN_
 */
public class FactoryTest {
    
    public FactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createGame method, of class Factory.
     */
    @Test
    public void testCreateGame() {
        System.out.println("createGame");
        int size = 21;
        int block = 4;
        int balloons = 6;
        int barrels = 8;
        int itemSize = 42;
        int items = 1;
        Factory instance = new Factory();
        Game expResult = null;
        Game result = instance.createGame(size, block, balloons, barrels, itemSize, items);
        assertEquals(expResult, result);
        
    }
    
}
