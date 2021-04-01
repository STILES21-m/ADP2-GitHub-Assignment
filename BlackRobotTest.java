/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.robot;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author kululouvuyo
 */


public class BlackRobotTest {
    private BlackRobot name;
    private BlackRobot color;
    private BlackRobot weight;
    
    

    public BlackRobotTest() {
    }
    
    @Before
    public void setUp() {
        BlackRobot name,color,weight;
        name=new BlackRobot();
        color=new BlackRobot();
        weight=new BlackRobot();
  name=color;
    }
    
  @Disabled
 
    @Test
    public void testEquality() {
        assertEquals(name,color);
    }

    @Test
    public void testIdentity() {
        assertSame(name,color);
    }

 @Test(timeout = 100)
    public void testTimeout(){
        while (true);
    }

    @Test
    public void testFailingtest() {
        
        if(name==null){
            fail("name should not be null");
        }
    }

   
}
