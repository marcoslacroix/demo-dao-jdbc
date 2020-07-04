package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {

    private int id;
    private String name;
    private String emaill;
    private Date birthDate;
    private double salary;

    private Department department;

    public Seller() {

    }

    public Seller(int id, String name, String emaill, Date birthDate, double salary, Department department) {
        this.id = id;
        this.name = name;
        this.emaill = emaill;
        this.birthDate = birthDate;
        this.salary = salary;
        this.department = department;
    }

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

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller)) return false;
        Seller seller = (Seller) o;
        return getId() == seller.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emaill='" + emaill + '\'' +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
