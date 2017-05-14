/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import Exception.CashFlowException;
import Exception.NumberNotValidException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        projet proj2 = new projet("projet 2", -7500,0,- 0.1);
    }
    @Test(expected=NumberNotValidException.class)
    public void testRendPositif10() throws NumberNotValidException
    {
        projet proj2 = new projet("projet 2", -7500,0, 10);
    }
    @Test(expected=NumberNotValidException.class)
    public void testPeriodeNegatif() throws NumberNotValidException, CashFlowException
    {
        projet proj2 = new projet("projet 2", -7500,-1, 0.1);
        proj2.addCashflow(2000);
    }
    @Test(expected=NumberNotValidException.class)
    public void testPeriodeMaxInt() throws NumberNotValidException
    {
        projet proj2 = new projet("projet 2", -7500,Integer.MAX_VALUE+1, 0.1);
    }
    
    @Test(expected=CashFlowException.class)
    public void testPeriodeAndCashFlow() throws NumberNotValidException,CashFlowException
    {
        projet proj2 = new projet("projet 2", -7500,1, 0.1);
        proj2.addCashflow(200);
        proj2.addCashflow(2000);

    }

    @Test(expected=CashFlowException.class)
    public void testPeriodeAndCashFlow2() throws NumberNotValidException,CashFlowException
    {
        Hashtable<Integer,Double> flux = new Hashtable<Integer,Double>();
        flux.put(0, -7500.0);
        flux.put(1,2000.0);
        flux.put(1,2000.0);
        projet proj2 = new projet("projet 2", flux,1, 0.1);


    }
    
    
    
    
    
    
    @Test
    public void testNPV() throws NumberNotValidException
    {
        projet proj2 = new projet("projet 2", -7500,-4, -10); 
    }
    
    
    @Test
    public void testIRR() throws NumberNotValidException
    {
        projet proj2 = new projet("projet 2", -7500,-4, 0.1); 
    }
    /**
     * Test of addCashflow method, of class projet.
     */
    @Test
    public void testAddCashflow()
    {
        System.out.println("addCashflow");
        double flux = 10.0;
        projet instance;
        try 
        {
            instance = new projet("test", -15, 1, 0.1);
            instance.addCashflow(flux);
            // TODO review the generated test code and remove the default call to fail.
            Hashtable result = instance.getCashflow();
            /*for(int i=0;i<result.size();i++)
             System.out.println("cashflows : "+result.get(i));
             */
            /*
             if((double)result.get(0) == -15 && (double)result.get(1)==flux)
             System.out.println("add cashflow OK");
             else
             System.out.println("add cashflow not OK");
             */
            assertEquals(-15, (double) result.get(0), 0);
        } 
        catch (NumberNotValidException ex) 
        {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CashFlowException ex) {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    /**
     * Test of getTauxActualisation method, of class projet.
     */
    @Test
    public void testGetTauxActualisation()
    {
        System.out.println("getTauxActualisation");
        projet instance;
        try 
        {
            instance = new projet("test", -15, 1, 0.1);
            double result = instance.getTauxActualisation();
            // TODO review the generated test code and remove the default call to fail.
            if (result == 0.1)
            {
                System.out.println("getTauxActualisation OK");
            }
            else
            {
                System.out.println("getTauxActualisation not OK");
            }
            assertEquals(0.1, result, 0);
        } 
        catch (NumberNotValidException ex) 
        {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Test of getPeriode method, of class projet.
     */
    @Test
    public void testGetPeriode()
    {
        System.out.println("getPeriode");
        projet instance;
        try 
        {
            instance = new projet("test", -15, 1, 0.1);
            int result = instance.getPeriode();
            // TODO review the generated test code and remove the default call to fail.
            //System.out.println("periode : " +result);
            /*if(result == 1)
             System.out.println("getPeriode OK");
             else
             System.out.println("getPeriode not OK");
             */
            assertEquals(1, result, 0);
        } 
        catch (NumberNotValidException ex) 
        {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Test of getCashflow method, of class projet.
     */
    @Test
    public void testGetCashflow_0args()
    {
        System.out.println("getCashflow without args");
        projet instance;
        try 
        {
            instance = new projet("test", -15, 1, 0.1);
            double flux = 10.0;
            instance.addCashflow(flux);
            Hashtable result = instance.getCashflow();
            //assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            /*
             for(int i=0;i<result.size();i++)
             System.out.println("cashflow "+(i+1)+" : "+result.get(i));
             */
            /*
             if((double)result.get(0) == -15 && (double)result.get(1)==flux)
             System.out.println("getcashflow without args OK");
             else
             System.out.println("getcashflow without args not OK");
             */
            assertEquals(-15, (double) result.get(0), 0);
            assertEquals(flux, (double) result.get(1), 0);
        } 
        catch (NumberNotValidException ex) 
        {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CashFlowException ex) {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Test of getCashflow method, of class projet.
     */
    @Test
    public void testGetCashflow_int()
    {
        System.out.println("getCashflow with args");
        int periode = 0;
        projet instance;
        try 
        {
            instance = new projet("test", -15, 0, 0.1);
            double result = instance.getCashflow(periode);
            // TODO review the generated test code and remove the default call to fail.
            /*if(result==-15)
             System.out.println("getcashflow with args OK");
             else
             System.out.println("getcashflow with args not OK");
             */
            assertEquals(-15, result, 0);
        } 
        catch (NumberNotValidException ex) 
        {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Test of getName method, of class projet.
     */
    @Test
    public void testGetName()
    {
        System.out.println("getName");
        projet instance;
        try 
        {
            instance = new projet("test", -15, 1, 0.1);
            //String expResult = "";
            String result = instance.getName();
            //assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            /*if(result.equals("test"))
             System.out.println("getName OK");
             else
             System.out.println("getName not OK");
             */
            assertEquals("test", result);
        } 
        catch (NumberNotValidException ex) 
        {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Test of function method, of class projet.
     */
    @Test
    public void testFunction()
    {
        System.out.println("function");
        double x = 1;
        projet instance;
        try 
        {
            instance = new projet("test", -15, 1, 0.1);
            double flux = 10.0;
            instance.addCashflow(flux);
            double result = instance.function(x);
            // TODO review the generated test code and remove the default call to fail.
            //System.out.println("resultat de la foncion avec x=1 : "+result);
            /*if(result ==-10)
             System.out.println("function OK");
             else
             System.out.println("function not OK");
             */
            assertEquals(-10, result, 0.0000001);
        } 
        catch (NumberNotValidException ex) 
        {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CashFlowException ex) {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Test of derivee method, of class projet.
     */
    @Test
    public void testDerivee()
    {
        System.out.println("derivee");
        double x = 1;
        projet instance;
        try 
        {
            instance = new projet("test", -15, 1, 0.1);
            double flux = 10.0;
            instance.addCashflow(flux);
            double result = instance.derivee(x);
            // TODO review the generated test code and remove the default call to fail.
            //System.out.println("resultat de la foncion avec x=1 : "+result);
            assertEquals(-17.5, result, 0.000001);
        } 
        catch (NumberNotValidException ex) 
        {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CashFlowException ex) {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Test
    public void testCalculateNPv()
    {
        System.out.println("calcul npv");
        projet instance;
        try 
        {
            instance = new projet("test", -2000, 2, 0.1);
            double flux = 1500;
            instance.addCashflow(flux);
            instance.addCashflow(flux);

            instance.CalculateNPV();
           double res = instance.getNPV();
           assertEquals(603.305785, res, 0.000001);
        } 
        catch (NumberNotValidException ex) 
        {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CashFlowException ex) {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Test
    public void testCalculateIRR()
    {
        System.out.println("calcul irr");
        projet instance;
        try 
        {
            instance = new projet("test", -2000, 2, 0.1);
            double flux = 1500;
            instance.addCashflow(flux);
            instance.addCashflow(flux);

            instance.CalculateIRR(0.1);
           double res = instance.getIRR();
           assertEquals(0.31872930, res, 0.000001);
        } 
        catch (NumberNotValidException ex) 
        {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CashFlowException ex) {
            Logger.getLogger(projetTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
