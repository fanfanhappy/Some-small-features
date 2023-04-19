package com.fcg.EmployeeMangeSystem.domin;

/**
 * @author 好女人蕾赛
 * @version 1.0
 */
public class Employee {
    private String name;
    private String id;
    private double sal;

    public Employee(String name, String id, double sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void show()
    {
        System.out.println(name + "\t" + "员工号：" + id + "\t" + "工资：" + sal);
    }
}

