package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Student;

public class Studentdao 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction t=em.getTransaction();

	public void save(Student student)
	{
		t.begin();
		em.persist(student);
		t.commit();

	}
	
	public List<Student> Fetchall()
	{
		return em.createQuery("select x from Student x").getResultList();
		
	}
	
	 public Student fetch(int Id)
	 {
		return em.find(Student.class,Id);
		 
	 }
	}
