import java.util.ArrayList;
public class Employee {
    
    private String name;
    private int phone;
    private int pin;
    private int age;
    private String email;
    private ArrayList<String> tasks; // to be sorted by priority
    
    public Employee()
    {
        this("",0,0,0,"");
    }
    public Employee(String name, int phone, int pin, int age, String email)
    {
        this.name = name;
        this.phone = phone;
        this.pin = pin;
        this.age = age;
        this.email = email;
        
        tasks = new ArrayList();
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    
    public void setPhone(int phone)
    {
        this.phone = phone;
    }
    public int getPhone()
    {
        return this.phone;
    }
    
    public void setPin(int pin)
    {
        this.pin = pin;
    }
    public int getPin()
    {
        return this.pin;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return this.age;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return this.email;
    }
    
    
    public void addTask(String task)
    {
        tasks.add(task);
    }
    public void removeTask(String task)
    {
        tasks.remove(task);
    }
    public void switchTask(String task, Employee employee)
    {
        this.removeTask(task);
        employee.addTask(task);
    }
        
    //general methods + variables needed for tasks
    
    //prep    
    public String typeFrosting; //from selection
    
    public void todaysDate() {
    } //get
    
    public void goodUntil() {
    } //todaysDate + 4
    
    public void todaysDay() {
    }
    
    public void labelPrint() {
      System.out.println(typeFrosting);
      System.out.println(todaysDate);
      System.out.println(goodUntil + "                " + name);
      System.out.println("Made on: " + todaysDay);
      System.out.println("M T W R F S S");
    }
    
    public void prepGuide() {
      typeFrosting = ;
      todaysDate = ;
      
      if (typeFrosting == "Vanilla" || typeFrosting == "Chocolate" || typeFrosting == "Glaze") {
        System.out.println();
        labelPrint();
      }
      else if (typeFrosting == "Peanut Butter") {
        System.out.println();
        labelPrint();
      }
      else if (typeFrosting == "Lemon") {
        System.out.println();
        labelPrint();
      }
      else if (typeFrosting == "Maple") {
        System.out.println();
        labelPrint();
      }
      else if (typeFrosting == "Blueberry") {
        System.out.println();
        labelPrint();
      }
      else if (typeFrosting == "Strawberry") {
        System.out.println();
        labelPrint();
      }
      else {
        System.out.println("Error, please reselect the frosting.");
      }
    }
    
    //dough
    public String size;
    public float dryMix;
    public float waterAmt;
    
    public void smallGuide() {
      dryMix = ;
      waterAmt = ;
    }
    
    public void mediumGuide() {
    }
    
    public void largeGuide() {
      
    }
    
    public void doughGuide() {
      if (size == "Small") {
        smallGuide();
      }
      
      else if (size == "Medium") {
        mediumGuide();
      }
      
      else if (size == "Large") {
        largeGuide();
      }
      
      else {
        System.out.println("Error, please reselect the dough size.");
      }
    }
    
    //paycheck approximation
    public float hourlyWage; //needs input
    public float taxPercentage; //need to scrape
    public float taxDeduction;
    public float paycheckGross;
    public float paycheckNet;
    public float hoursWorkedWeek; //needs input
    
    public void paycheckApprox() {
      paycheckGross = hourlyWage * hoursWorked;
      taxDeduction = paycheckGross * taxPercentage;
      paycheckNet = paycheckGross - taxDeduction;
      System.out.println("Gross paycheck (before taxes): $" + paycheckGross);
      System.out.println("Net paycheck (after taxes): $" + paycheckNet);
      System.out.println("The current income tax percentage is " + taxPercentage);
    }
    
    //coffee
    public void currentTime() {
    } //get
    
    public void changeTime() {
    } //get, currentTime + 3
    
    public void coffeeGuide() {
      //guide
    }
}
