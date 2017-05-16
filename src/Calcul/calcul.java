/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calcul;

import Exception.CashFlowException;
import Exception.NumberNotValidException;
import projet.projet;

/**
 *
 * @author vincent
 */
public class calcul {
    
    /**
     * Calcul le coefficient NPV d'un projet
     * @param project projet dont on souhaite avoir le coefficient NPV
     * @return coefficient NPV
     */

    public static double CalculateNPV(projet project) throws CashFlowException
    {
        
        /*if(project.getCashflow().size()-1<project.getPeriode())
        {
            throw new CashFlowException("problème cashflow plus petit que la période");
        }*/
        double npv=0;
        double rendement = project.getTauxActualisation();
        int periode = project.getPeriode();
        
        for(int i=0;i<=periode;i++)
        {
            npv += project.getCashflow(i)*Math.pow((1+rendement),-i);
        }
        
        return npv;
    }
    
    /**
     * Calcul le coefficient IRR d'un projet
     * @param project projet dont on souhaite calculer l'IRR
     * @param rend coefficient estimé du taux d'actualisation
     * @return La valeur calculée de l'IRR
     */
    public static double CalculateIRR(projet project,double rend) throws NumberNotValidException
    {
        if(rend<0 || rend>0.1)
        {
            throw new NumberNotValidException("Probleme rendement irr");
        }
        double diff = 1;
        while(Math.abs(diff)>0.00001)
        {
            rend = rend-(project.function(rend)/project.derivee(rend));
            diff = project.function(rend);
        }
        return rend;
    }
}
