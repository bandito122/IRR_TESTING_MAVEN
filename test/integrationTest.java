/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Calcul.calcul;
import Exception.NumberNotValidException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projet.projet;

/**
 *
 * @author vincent
 */
public class integrationTest
{


    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testIntegration()
    {
        projet proj2;
        try {
            proj2 = new projet("projet 2", -7500, 4, 0.1);
            proj2.addCashflow(3000);
        proj2.addCashflow(5000);
        proj2.addCashflow(1200);
        proj2.addCashflow(4000);

        double npv = calcul.CalculateNPV(proj2);
        double irr = calcul.CalculateIRR(proj2, 0.1);
        
        assertEquals(2993.13571477, npv, 0.000001);
        assertEquals(0.27666841, irr, 0.000001);
        
        } catch (NumberNotValidException ex) {
            Logger.getLogger(integrationTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
