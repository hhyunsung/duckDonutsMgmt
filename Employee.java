import java.util.ArrayList;
public class Employee {

    private String name;
    private String phone;
    private int pin;
    private int age;
    private String email;
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
    
    public String getTasks()
    {
        String print = "";
        for( Task t : tasks)
        {
            print += (t.getDescription()+" \n");
        }
        return print;
    }
    /**
    //general methods + variables needed for tasks

    //prep    
    public String typeFrosting; //from selection

    public todaysDate() {
    } //get

    public goodUntil() {
    } //todaysDate + 4

    public todaysDay = ; // get

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

    if (typeFrosting == "Vanilla") or (typeFrosting == "Chocolate") or (typeFrosting == "Glaze") {
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

    else if (typeFrosting == "Blueberry") or (typeFrosting == "Strawberry") {
    System.out.println();
    labelPrint();
    }

    else {
    System.out.println("Error, please reselect the frosting.");
    }
    }

    //dough
    public String size;

    public void smallGuide() {
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
    public currentTime() {
    } //get

    public void changeTime() {
    } //get, currentTime + 3

    public void coffeeGuide() {
    //guide
    }
     */
}
