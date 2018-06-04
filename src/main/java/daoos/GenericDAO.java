package daoos;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class GenericDAO<T> {
	
	/* The "clazz" field is only needed for the readObject() and deleteObject() methods, so with these
	 * methods you have to use the constructor with parameter (Class<T> classToSet)
	 */
	
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private Class<T> clazz = null;
	
	
	// The constructors instantiate the entityManager and entityManagerFactory
	
	public GenericDAO() {
		this.entityManagerFactory = Persistence.createEntityManagerFactory("BaasHond");
		this.entityManager = entityManagerFactory.createEntityManager();
	}
	
	
	public GenericDAO(Class<T> classToSet){
		this.entityManagerFactory = Persistence.createEntityManagerFactory("BaasHond");
		this.entityManager = entityManagerFactory.createEntityManager();
		this.clazz = classToSet;
	}
	
	
	
	public void createObject(T entity) {
		
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		
	}

/*	public void createObjectWithList(T entity) {
	
		entityManager.getTransaction().begin();
		for (Dog dog: dogs) {
			Feature feature = new Feature;
		}
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		entityManagerFactory.close();
	}
	*/
	
	public T readObject(long id) {
		
		entityManager.clear(); //empties the entitymanager from persistence context
		
		T entity = entityManager.find(clazz, id);

			
		return entity;
	}
	
	
	public void updateObject(T entity) {
		
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
	
		
	}
	
	
	public void deleteObject(long id) {
			
			entityManager.getTransaction().begin();
			entityManager.clear();//empties the entitymanager from persistence context
			T entity = entityManager.find(clazz, id);
			entityManager.remove(entity);
			entityManager.getTransaction().commit();
	
		
	}
	
	public void closeEntityManager() {
		entityManager.close();
	}
	
	
//	ALTERNATIVE WAY FOR READ METHOD, BUT	
/*	DON'T KNOW HOW TO WORK OUT THE READ METHOD WITH THIS SIGNATURE...
 * 	public T readObject(Class<?> type, long id) {
 
		entityManager.clear(); //empties the entitymanager from persistence context
		entityManager.find(type, id);
		
			//	System.out.println((entityManager.find(type.getClass(), id)).toString());
		
		entityManagerFactory.close();
			
		return null;
	}
*/
	
}
