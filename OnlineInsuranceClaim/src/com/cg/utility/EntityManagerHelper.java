package com.cg.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerHelper {
	private static EntityManagerFactory factory = null;
	private EntityManager entityManager = null;
	
	static 
	{
		factory=Persistence.createEntityManagerFactory("JPABasic");
	}
	
	public static EntityManager getEntityManager()
    {
		EntityManager em=factory.createEntityManager();
        return em;
    }
}
