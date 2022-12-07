import entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setFirstName("Peter");
        employee1.setLastName("Jackson");

        Employee employee2 = new Employee();
        employee2.setFirstName("Anna");
        employee2.setLastName("Smith");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(employee1);
        entityManager.persist(employee2);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
