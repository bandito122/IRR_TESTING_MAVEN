/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calcul;

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
public class calculTest
{

    public calculTest()
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

    /**
     * Test of CalculateNPV method, of class calcul.
     */

    @Test
    public void testCalculateNPVValid() throws NumberNotValidException
    {
        System.out.println("CalculateNPV");
        /*
         projet project = new projet("test",-15,1,0.1);
         double flux = 10.0;
         project.addCashflow(flux);
         double result = calcul.CalculateNPV(project);
         // TODO review the generated test code and remove the default call to fail.
         System.out.println("npv = "+result);
         */
        double npv = 0;
 
        projet proj2 = new projet("projet 2", -7500, 4, 0.1);
        proj2.addCashflow(3000);
        proj2.addCashflow(5000);
        proj2.addCashflow(1200);
        proj2.addCashflow(4000);
        npv= calcul.CalculateNPV(proj2);
        System.out.println("NPV de " +proj2.getName()+" : "+npv);
        assertEquals(2993.13571477358, npv, 0.000000001);
        

    }

    /**
     * Test of CalculateIRR method, of class calcul.
     */
    @Test
    public void testCalculateIRR()
    {
        System.out.println("CalculateIRR");
        /*
         projet project = new projet("test",-15,1,0.1);
         double flux = 10.0;
         project.addCashflow(flux);
         double rend = 0.1;
         double result = calcul.CalculateIRR(project, rend);
         // TODO review the generated test code and remove the default call to fail.
         System.out.println("IRR : "+result);
         */
        try
        {
            projet proj2 = new projet("projet 2", -7500, 4, 0.1);
            proj2.addCashflow(3000);
            proj2.addCashflow(5000);
            proj2.addCashflow(1200);
            proj2.addCashflow(4000);
            double irr = calcul.CalculateIRR(proj2, 0.1);
            //System.out.println("IRR de " +proj2.getName()+" : "+irr);
            assertEquals(0.276668413, irr, 0.000000001);
        }
        catch(NumberNotValidException e)
        {
            
        }



    }

}
