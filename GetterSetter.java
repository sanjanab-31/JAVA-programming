public class GetterSetter {
    private String name;
    private Integer id;
    private Integer age;
    private Float salary;
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name!=null &&  !name.trim().isEmpty()){
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }
    public Integer getID(){
        return id;
    }
    public void setID(Integer id){
        if(id!=null && id>0){
            this.id = id;
        } else {
            System.out.println("Invalid ID");
        }
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age)
    {
        if(age!=null && age>0)
        {
            this.age=age;
        }
        else
        {
            System.out.println("Invalid age");
        }
    }
    public float getsalary(){
        return salary;
    }
    public void setsalary(Float salary)
    {
        if(salary!=null && salary>0)
        {
            this.salary=salary;
        }
        else
        {
            System.out.println("Invalid salary");
        }
    }
    public GetterSetter(String name,Integer id,Integer age,Float salary) {
        this.name=name;
        this.id=id;
        this.age=age;
        this.salary=salary;
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getID());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + getsalary());
    }

    public static void main(String[] args)
    {
        GetterSetter obj=new GetterSetter("Sanjana",1,17,50000f);
    }
}
