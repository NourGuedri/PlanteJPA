package com.nour.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.nour.entities.Plante;
import com.nour.util.JPAutil;
//classe contenant les méthodes génériques ajouter, supprimer,
//consulter par clé primaire (Id)

public class PlanteDao {
	private EntityManager entityManager=JPAutil.getEntityManager("MonProjetJPAPlante");
	//méthode ajouter d'une entité à la bd
	public void ajouter(Plante c)
	{
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	entityManager.persist(c);
	tx.commit();
	}
	//méthode modifier d'une entité à partir de la bd
	public void modifier(Plante c)
	{
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	entityManager.merge(c);
	tx.commit();
	}
	//méthode Supprimer d'une entité à partir de la bd
	public void supprimer(Plante c)
	{
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	c=entityManager.merge(c); // important
	entityManager.remove(c);
	tx.commit();
	}
	//méthode Consulter d'une entité à partir de la bd
	public Plante consulter(Plante c,Object id)
	{
	return entityManager.find(c.getClass(), id);
	}
	//méthode pour lister tous les objets à partir de la bd
	public List<Plante> listerTous() {
	List<Plante> plantes =entityManager.createQuery("select c from Plante c").getResultList();

	return plantes;
	}
	//méthode pour lister tous les plantes dont le nom contient un
	//texte donné en paramètre (pnom)
	public List<Plante> listerParNom(String nom) {List<Plante> plantes=entityManager.createQuery( "select c from Plante c where c.nom like :pnom").setParameter("pnom","%"+nom+"%").getResultList();

	return plantes; }}