package user1fora2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import user1fora2.dto.User;

public class UserDao {

	
	public void saveUser(User  user) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
	}
	
	
	public void findUser(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		User dbUser=entityManager.find(User.class, id);
		if(dbUser!=null) {
//			that id is present and that User exist
			System.out.println(dbUser);
		}else {
//			id is not present and User doesnot exist
			System.out.println("Sorry id is not present");
		}
	}
	public void deleteUser(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		User dbUser=entityManager.find(User.class, id);
		if(dbUser!=null) {
//			id is present and that User exist then i can delete that User
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbUser);
			entityTransaction.commit();	
		}else {
//			id is not present and how i can delete the data
			System.out.println("Sorry id is not present");
		}
	}
	public void updateUser(int id,User user) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		User dbUser =entityManager.find(User.class, id);
		if(dbUser!=null) {
//			id is present then i can update the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
		    user.setId(id);
			entityManager.merge(user);
			entityTransaction.commit();	
		}else {
			System.out.println("Id is not present in the database");
		}
	}
}
