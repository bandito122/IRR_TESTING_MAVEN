/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import Exception.NumberNotValidException;
import java.util.Hashtable;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vincent
 */
public class projetTest
{

    public projetTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }
    
    
    @Test(expected=NumberNotValidException.class)
    public void testRendNegatif() throws NumberNotValidException
    {
        projet proj2 = new projet("projet 2", -7500,4,- 0.1);
    }
    @Test(expected=NumberNotValidException.class)
    public void testRendPositif10() throws NumberNotValidException
    {
        projet proj2 = new projet("projet 2", -7500,40, 10);
    }
    @Test(expected=NumberNotValidException.class)
    public void testPeriodeNegatif() throws NumberNotValidException
    {
        projet proj2 = new projet("projet 2", -7500,-4, 0.1);
    }
    @Test(expected=NumberNotValidException.class)
    public void testPeriodeMaxValue() throws NumberNotValidException
    {
        projet proj2 = new projet("projet 2", -7500,Integer.MAX_VALUE+1, 0.1);
    }
    
    @Test(expected=NumberNotValidException.class)
    public void testPeriobdeMaxValue() throws NumberNotValidException
    {
        projet proj2 = new projet("projet 2", -7500,Integer.MAX_VALUE+1, 0.1);
    }
    
    
    
    
    /*@Test
    public void testNPV() throws NumberNotValidException
    {
        projet proj2 = new projet("projet 2", -7500,-4, -10); 
    }
    
    
    @Test
    public void testIRR() throws NumberNotValidException
    {
        projet proj2 = new projet("projet 2", -7500,-4, 0.1); 
    }*/
    
    
    
   
}
