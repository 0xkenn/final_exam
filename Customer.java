package theoreticalExam;

public abstract class Customer {
    private String name;
    private double amount;
  
    public Customer(String name, double amount) {
      this.name = name;
      this.setAmount(amount);
    }
  
    public String getName() {
      return this.name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public abstract double calculateBill();

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
  }