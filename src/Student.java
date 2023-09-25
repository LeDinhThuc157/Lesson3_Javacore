public class Student {
    
    protected String sbd;
    protected String name;
    protected String priority;

    public Student(String sbd, String name, String priority){
        this.sbd = sbd;
        this.name = name;
        this.priority = priority;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSbd(String sbd) {
        this.sbd = sbd;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public String getName() {
        return name;
    }
    public String getPriority() {
        return priority;
    }
    public String getSbd() {
        return sbd;
    }
}
