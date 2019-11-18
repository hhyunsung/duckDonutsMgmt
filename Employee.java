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
}
