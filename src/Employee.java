import java.math.BigDecimal;

public class Employee {

    private int id;
    private String name;
    private double sal;
    private String location;

//    public Employee(int id, String name, double sal, String location) {
//        this.id = id;
//        this.name = name;
//        this.sal = sal;
//        this.location = location;
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", location='" + location + '\'' +
                '}';
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
