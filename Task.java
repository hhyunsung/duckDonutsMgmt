public class Task implements Comparable<Task>
{
    private String description;
    private int priority;
    
    @Override public int compareTo(Task t)
    {
        return t.getPriority()-this.getPriority();
    }
    public Task(String description, int priority)
    {
        this.description = description;
        this.priority = priority;
    }
    public String getDescription()
    {
        return this.description;
    }
    public int getPriority()
    {
        return this.priority;
    }
}
