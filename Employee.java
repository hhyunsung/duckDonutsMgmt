import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.io.*;

public class Employee {
    private String name;
    private String phone;
    private int pin;
    private int age;
    private String email;
    private String id;
    private ArrayList<Task> tasks;
    private static ArrayList<Integer> pins = new ArrayList();
    private static ArrayList<Employee> emps = new ArrayList();
    public Employee()
    {
        this("","",0,0,"");
    }

    /**
     * constructor
     * adds itself to list once created to be kept track of
     * 
     */public Employee(String name, String phone, int pin, int age, String email)
    {
        this.name = name;
        this.phone = phone;
        this.pin = pin;
        this.age = age;
        this.email = email;
        pins.add(this.pin);
        tasks = new ArrayList();
        emps.add(this);
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

    public void addTask(Task task)
    {
        tasks.add(task);
        Collections.sort(tasks);
    }

       public static ArrayList<Employee> getEmployees()
    {
        return emps;
    }

    public static ArrayList<Integer> getPinList()
    {
        return pins;
    }
    
    public ArrayList<Task> getTasks()
    {
        return tasks;
    }
    
    /**
     * joins task descriptiosn into one line to be displayed
     * 
     */public String writeTasks()
    {
        ArrayList<String> taskDescriptions = new ArrayList();
        for( Task t : tasks)
        {
            taskDescriptions.add(t.getDescription());
        }
        return String.join(", ", taskDescriptions);

    }

    /**
     *  writes attributes from employee objects to be loaded when the program is ran again
     * 
     */public static void save()
    {
        try 
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt",false));

            for(Employee e : emps)
            {
                writer.write(e.name);
                writer.write("-");
                writer.write(e.phone);
                writer.write("-");
                writer.write(new Integer(e.pin).toString());
                writer.write("-");
                writer.write(new Integer(e.age).toString());
                writer.write("-");
                writer.write(e.email);
                writer.write("-");
                writer.newLine();
            }
            writer.close();
        }
        catch(IOException ex) 
        {
            System.out.println("Error writing to file '"+ "employees.txt" + "'");
        }
    }

    /**
     * reads employees.txt file and creates employees from saved attributes
     * 
     */public static void load()
    {
        String line = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("employees.txt"));
            String name = "";
            String phone = "";
            String pin = "";
            String age = "";
            String email = "";
            String[] obj = new String[5];
            
            while((line = reader.readLine()) != null) 
            {
                 obj = line.split("-");
                name = obj[0];
                phone = obj[1];
                pin = obj[2];
                age = obj[3];
                email = obj[4];
          
            
                Employee temp = new Employee(name, phone, Integer.parseInt(pin), Integer.parseInt(age), email);
            }   
            if((line = reader.readLine()) == null)
            {
                return;
            }
            reader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file " + "employees.txt" + "");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file " + "employees.txt" + "");                  
        }
    }

}