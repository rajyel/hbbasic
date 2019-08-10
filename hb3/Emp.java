import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table; 
@Entity  
@Table(name="emp")  

public class Emp {
  
   @Id
   private int id;
   private String firstName; 
   private String lastName;   
   private int salary;  

   public Emp() {}
   public Emp(String fname, String lname, int salary) {
      this.firstName = fname;
      this.lastName = lname;
      this.salary = salary;
   }
   
   public int getId() {
      return id;
   }
   
   public Emp setId( int id ) {
      this.id = id;
	  return this;
   }
   
   public String getFirstName() {
      return firstName;
   }
   
   public Emp setFirstName( String first_name ) {
      this.firstName = first_name;
	  return this;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public Emp setLastName( String last_name ) {
      this.lastName = last_name;
	  return this;
   }
   
   public int getSalary() {
      return salary;
   }
   
   public Emp setSalary( int salary ) {
      this.salary = salary;
	  return this;
   }
}