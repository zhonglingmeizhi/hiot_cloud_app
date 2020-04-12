package com.huatec.hiot_cloud.test.mvpTest.model;

import java.io.Serializable;

public class Student implements Serializable {
    private String studentName;
    private String studentNumber;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
