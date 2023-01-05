package theoreticalExam;

public class Main {
    public static void main(String[] args) {
      Customer c = new RegularCustomer("John", 100);
      RegularCustomer rc = new RegularCustomer("Jane", 150);
      SeniorCustomer sc = new SeniorCustomer("Bob", 200);
  
      // initialize the Customer object to the RegularCustomer object
      c = rc;
      System.out.println("Bill for regular customer: " + c.calculateBill());
  
      // initialize the Customer object to the SeniorCustomer object
      c = sc;
      System.out.println("Bill for senior customer: " + c.calculateBill());
    }
  }
 
  
  
  