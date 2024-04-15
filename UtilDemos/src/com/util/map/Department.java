package com.util.map;

public class Department {
    private String deptName;
    private int depId;
    private String depHead;

    public Department() {
    }

    public Department(String deptName, int depId, String depHead) {
        this.deptName = deptName;
        this.depId = depId;
        this.depHead = depHead;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepHead() {
        return depHead;
    }

    public void setDepHead(String depHead) {
        this.depHead = depHead;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", depId=" + depId +
                ", depHead='" + depHead + '\'' +
                '}';
    }
}
