/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import Calcul.calcul;
import Exception.CashFlowException;
import Exception.NameException;
import Exception.NumberNotValidException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import projet.projet;

/**
 *
 * @author vincent
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(calcul.class)
public class PowerMockTest {
    @Test
   public void testProjetCalculateNPV()
   {
       projet project;
        try 
        {
           project = new projet("test CalculateNPV",-2000.0,2,0.1);
           project.addCashflow(1500);
           project.addCashflow(1500);
           //chargement de la classe statique
           PowerMockito.mockStatic(calcul.class);

           //ce que la méthode statique doit renvoyer
           Mockito.when(calcul.CalculateNPV(project)).thenReturn(603.305785);

           //PowerMockito.verifyStatic();

           //appel de la méthode qui fait appel à la méthode statique
           project.CalculateNPV();
           double res = project.getNPV();

            PowerMockito.verifyStatic();
           assertEquals(603.305785, res, 0.000001);
        } 
        catch (NumberNotValidException ex) 
        {
            Logger.getLogger(PowerMockTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CashFlowException ex) {
            Logger.getLogger(PowerMockTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NameException ex) {
            Logger.getLogger(PowerMockTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   }
   
   @Test
   public void testProjetCalculIRR()
   {
       projet project;
        try 
        {
            project = new projet("test CalculateIRR",-2000,2,0.1);
            project.addCashflow(1500);
           project.addCashflow(1500);
           //chargement de la classe statique
           PowerMockito.mockStatic(calcul.class);


           Mockito.when(calcul.CalculateIRR(project, 0.1)).thenReturn(0.31872930);

           project.CalculateIRR(0.1);
           double res = project.getIRR();

           PowerMockito.verifyStatic();
           assertEquals(0.31872930, res, 0.000001);
        } 
        catch (NumberNotValidException ex) 
        {
            Logger.getLogger(PowerMockTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CashFlowException ex) {
            Logger.getLogger(PowerMockTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NameException ex) {
            Logger.getLogger(PowerMockTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   }
}
