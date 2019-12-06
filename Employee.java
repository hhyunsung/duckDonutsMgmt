import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Employee {
    private String name;
    private String phone;
    private int pin;
    private int age;
    private String email;
    private String id;
    public ArrayList<Task> tasks; // to be sorted by priority 0 - highest
    private static ArrayList<Integer> pins = new ArrayList();
    public static ArrayList<Employee> emps = new ArrayList();
    public Employee()
    {
        this("","",0,0,"");
    }

    public Employee(String name, String phone, int pin, int age, String email)
    {
        this.name = name;
        this.phone = phone;
        this.pin = pin;
        this.age = age;
        this.email = email;
        pins.add(this.pin);
        tasks = new ArrayList();
        id = Integer.toString(((int)Math.random()*100)+1000);
        emps.add(0,this);
        
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
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


    public String shortView()

    {
        return (this.name+" "+this.email);
    }

    public void addTask(Task task)
    {
        /**
        for(int i = 0;i<tasks.size();i++)
        {
            if(task.getPriority() >= tasks.get(i).getPriority())
            {
                tasks.add(i, task);
            }
            else if(i == tasks.size() - 1)
            {
                tasks.add(task);
            }
            
           
        }
        */
        tasks.add(task);
        Collections.sort(tasks);
    }

    public void removeTask(Task task)
    {
        tasks.remove(task);
    }

    public void switchTask(Task task, Employee employee)
    {
        this.removeTask(task);
        employee.addTask(task);
    }
    public String getId()
    {
        return this.id;
    }
    public static boolean exists(String id)
    {
        for(Employee e : emps)
        {
            if(id == e.getId())
            {
                return true;
            }
        }
        return false;
    }

    public String getTasks()
    {
        ArrayList<String> taskDescriptions = new ArrayList();
        for( Task t : tasks)
        {
            taskDescriptions.add(t.getDescription());
        }
        return String.join(", ", taskDescriptions);
        
    }

    //general methods + variables needed for tasks

    //prep    
    public String typeFrosting; //from selection

    
    public Date todaysDate;
    
    public void getDate() {
      long millis = System.currentTimeMillis();
      java.sql.Date date = new java.sql.Date(millis);
      todaysDate = date;
    }
    
    public LocalDate goodUntil;
    
    public void getGoodUntil() {
      LocalDate goodUntil = LocalDate.now().plusDays(4);
    } //todaysDate + 4
    
    public String todaysDay;
    
    public Calendar localCalendar;
    
    public void getDay() {
     int currentDayOfWeek = localCalendar.get(Calendar.DAY_OF_WEEK);
     if (currentDayOfWeek == 1) {
       todaysDay = "x";
     }
     else if (currentDayOfWeek == 2) {
       todaysDay = "  x";
     }
     else if (currentDayOfWeek == 3) {
       todaysDay = "    x";
     }
     else if (currentDayOfWeek == 4) {
       todaysDay = "      x";
     }
     else if (currentDayOfWeek == 5) {
       todaysDay = "        x";
     }
     else if (currentDayOfWeek == 6) {
       todaysDay = "          x";
     }
     else if (currentDayOfWeek == 7) {
       todaysDay = "            x";
     }
    }

    public void labelPrint() {
      System.out.println(typeFrosting);
      System.out.println(todaysDate);
      System.out.println(goodUntil + "                " + name);
      System.out.println("Made on: " + todaysDay);
      System.out.println("S M T W R F S");

    }

    public void prepGuide() {
      
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
    public double dryMix;
    public double waterAmt;

    public void smallGuide() {

      dryMix = 1.65;
      waterAmt = 3.0;

    }

    public void mediumGuide() {


      dryMix = 2.75;
      waterAmt = 5.0;

    }

    public void largeGuide() {

      dryMix = 4.4;
      waterAmt = 8.0;
    }
    
    public void doughGuideValues() {
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
    
    public void doughGuide() {
      System.out.println("1. Spray bowl, mixing paddle, and spatula with cooking spray");
      System.out.println("2. Place empty water pitcher on scale and press Tare to zero");
      System.out.println("3. Measure out" + waterAmt + " pounds of water and pour into the bowl");
      System.out.println("4. Place empty dry mix container on scale and press Tare to zero");
      System.out.println("5. Measure out" + dryMix + " pounds of dry mix and pour into the bowl");
      System.out.println("6. Mix with paddle, then place bowl and paddle on the mixer");
      System.out.println("7. Set mixer for 1 minute on speed one and mix");
      System.out.println("8. When finished, set mixer for 2 minutes on speed two and mix");
      System.out.println("9. Unlatch the bowl and paddle and scrape extra dough off of the paddle using the spatula");
    }
    
    //paycheck approximation
    public double hourlyWage; //needs input
    public double taxPercentage; //need to scrape
    public double taxDeduction;
    public double paycheckGross;
    public double paycheckNet;
    public double hoursWorked; //needs input

    public void paycheckApprox() {
        paycheckGross = hourlyWage * hoursWorked;
        taxDeduction = paycheckGross * taxPercentage;
        paycheckNet = paycheckGross - taxDeduction;
        System.out.println("Gross paycheck (before taxes): $" + paycheckGross);
        System.out.println("Net paycheck (after taxes): $" + paycheckNet);
        System.out.println("The current income tax percentage is " + taxPercentage);
    }

    //coffee
    public LocalTime currentTime;
    
    public static void main(String[] args) {
      LocalTime currentTime = LocalTime.now();
    }
    
    public LocalTime changeTime;
    
    public void coffeeChangeTime() {
      changeTime = currentTime.plusHours(3);
    }
    
    public void coffeeGuide() {
      System.out.println("1. Place large coffee filter in empty coffee drip");
      System.out.println("2. Place the coffee drip in the grinder, select the desired amount of coffee, and press Grind");
      System.out.println("3. Once the grinder is finished, place the drip into the brewer");
      System.out.println("4. Place the empty coffee holder under the drip and begin brewing");
      System.out.println("5. Once finished, place in front of store\n");
      System.out.println("The current time is " + currentTime + ". Remember that coffee must be changed every 3 hours, so it will need to be changed at " + changeTime);
    }
}