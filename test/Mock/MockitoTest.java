/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;
import Calcul.calcul;
import Exception.CashFlowException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
//import org.mockito.Mockito;
import static org.mockito.Mockito.*;
//import org.powermock.api.mockito.PowerMockito;
//import org.powermock.core.classloader.annotations.PrepareForTest;
import projet.projet;
/**
 *
 * @author vincent
 */

public class MockitoTest {
    
    @Test
   public void testCalculNPV() throws CashFlowException
   {
       projet project = mock(projet.class);
       when(project.getTauxActualisation()).thenReturn(0.1);
       when(project.getPeriode()).thenReturn(2);
       when(project.getCashflow(0)).thenReturn(-2000.0);
       when(project.getCashflow(1)).thenReturn(1500.0);
       when(project.getCashflow(2)).thenReturn(1500.0);
       
       //603.305785
       double res = calcul.CalculateNPV(project);
       assertEquals(603.305785, res, 0.000001);
    }
   
   /*
   @Test
   public void testCalculIRR()
   {
       projet project = mock(projet.class);
       when(project.function(0)).thenReturn(Double.NaN);
       
       double res = calcul.CalculateIRR(project, 0.1);
       System.out.println("resultat : "+res);
       assertEquals(0.31872930, res, 0.0000001);
   }
*/
}
