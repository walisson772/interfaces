package aula3.entities;

public class Employ implements Comparable<Employ> {
    private String name;
    private Double salary;
    public Employ(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public int compareTo(Employ other) {
        return name.compareTo(other.getName());
    }
}
