package cn.shuoshuge.pojo;

import java.io.Serializable;
import java.util.List;

public class Dept implements Serializable {

    public Dept() {}

    public Dept(Integer id , String deptName) {
        this.id = id;
        this.deptName = deptName;
    }

    public Dept(String deptName) {
        this.deptName = deptName;
    }

    private Integer id;
    private String deptName;
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
