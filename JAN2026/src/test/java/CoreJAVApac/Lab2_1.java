package CoreJAVApac;

public class Lab2_1 {
	
	public static class Person {
		
	    private String name;
	    private float age;

	    public Person(String name, float age) {
	        this.name = name;
	        this.age = age;
	    }
	
	    public String getName() {
	        return name;
	    }
	
	    public void setName(String name) {
	        this.name = name;
	    }
	
	    public float getAge() {
	        return age;
	    }
	
	    public void setAge(float age) {
	        this.age = age;
	    }
	}
	
	public static class Account {
		
	    private long accNum;
	    private double balance;
	    private Person accHolder;
	
	    private static final double MIN_BALANCE = 500.0;
	    
	    public Account(long accNum, Person accHolder, double balance) {
	        this.accNum = accNum;
	        this.accHolder = accHolder;
	
	        if (balance >= MIN_BALANCE) {
	            this.balance = balance;
	        } else {
	            this.balance = MIN_BALANCE;
	            System.out.println("Minimum balance ₹500 maintained.");
	        }
	    }
	
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }
	
	    public void withdraw(double amount) {
	        if (balance - amount >= MIN_BALANCE) {
	            balance -= amount;
	        } else {
	            System.out.println("Withdrawal denied! Minimum balance ₹500 must be maintained.");
	        }
	    }
	
	    // Get balance
	    public double getBalance() {
	        return balance;
	    }
	
	    // Getters and Setters
	    public long getAccNum() {
	        return accNum;
	    }
	
	    public void setAccNum(long accNum) {
	        this.accNum = accNum;
	    }
	
	    public Person getAccHolder() {
	        return accHolder;
	    }
	
	    public void setAccHolder(Person accHolder) {
	        this.accHolder = accHolder;
	    }
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p = new Person("Rahul", 25);
        Account acc = new Account(123456789L, p, 1000);
 
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance());
 
        acc.withdraw(1200); // allowed
        acc.withdraw(500);  // not allowed
 
	}
 
}
 
 