/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tp3_mgl7460.domain;

/**
 *
 * @author sergedelil
 */
public class Psychologue extends Membre{
    
    private final int heureMinCycle = 90;

    public Psychologue(String nom, String prenom, int sexe, String cycle, String numeroPermis) {
        super(nom, prenom, sexe, cycle, numeroPermis);
    }
    
    @Override
    public boolean validerCycle() {
        return false;
    }

    @Override
    public boolean validerNumeroPermis() {
        return false;
    }

    @Override
    public boolean atteintHeureMinCycle() {
        return false;
    }

    @Override
    public String toString() {
        return "Psychologue{" + "nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", cycle=" + cycle + ", numeroPermis=" + numeroPermis + ", heureMinCycle=" + heureMinCycle + ", activites=" + activites + '}';
    }
   
}
