import javax.persistence.EntityManager;
public class Main {
  public static void main(String[] args) {
    Emp employee = new Emp();
    employee.setId(1).setFirstName("RoBaby")
        .setLastName("Yelnare")
        .setSalary(100000);
        
    EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
    em.getTransaction()
        .begin();
    em.persist(employee);
    em.getTransaction()
        .commit();
    em.close();
    PersistenceManager.INSTANCE.close();
  }
}