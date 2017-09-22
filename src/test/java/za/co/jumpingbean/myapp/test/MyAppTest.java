/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.jumpingbean.myapp.test;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import za.co.jumpingbean.myapp.MyApp;

/**
 *
 * @author mark
 */
public class MyAppTest {
 
        @Test
        public void addTest(){
            MyApp app = new MyApp();
            int r = app.addInt(6,7);
            assertEquals(13,r);
        }
}
