package com.nour.test;

import com.nour.dao.PlanteDao;
import com.nour.entities.Plante;

public class PlanteTest {
    public static void main(String[] args) {
        // Create a Plante object
        Plante p = new Plante();
        p.setNomPlante("Rose");
        p.setCouleur("Rouge");

        // Create a PlanteDao instance
        PlanteDao planteDao = new PlanteDao();

        // Call methods from PlanteDao to interact with the database
        planteDao.ajouter(p);
        System.out.println("Appel de la méthode listerTous");
        for (Plante pl : planteDao.listerTous())
            System.out.println(pl.getIdPlante() + " " + pl.getNomPlante());

        System.out.println("Appel de la méthode listerParNom");
        for (Plante pl : planteDao.listerParNom("rou"))
            System.out.println(pl.getIdPlante() + " " + pl.getNomPlante());
    }
}
