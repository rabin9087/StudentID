package com.example.studentid;

public class StudentData {
    private String yourId;
    private String yourName;
    private String MobileNUmber;
    private int test1;
    private int LabTest;
    private int test2;

    public StudentData(String yourId, String yourName, String mobileNUmber, int test1, int labTest, int test2) {
        this.yourId = yourId;
        this.yourName = yourName;
        MobileNUmber = mobileNUmber;
        this.test1 = test1;
        LabTest = labTest;
        this.test2 = test2;
    }

    public StudentData() {

    }

    @Override
    public String toString() {
        return "StudentData{" +
                "yourId='" + yourId + '\'' +
                ", yourName='" + yourName + '\'' +
                ", MobileNUmber='" + MobileNUmber + '\'' +
                ", test1=" + test1 +
                ", LabTest=" + LabTest +
                ", test2=" + test2 +
                '}';
    }

    public String getYourId() {
        return yourId;
    }

    public void setYourId(String yourId) {
        this.yourId = yourId;
    }

    public String getYourName() {
        return yourName;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }

    public String getMobileNUmber() {
        return MobileNUmber;
    }

    public void setMobileNUmber(String mobileNUmber) {
        MobileNUmber = mobileNUmber;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public int getLabTest() {
        return LabTest;
    }

    public void setLabTest(int labTest) {
        LabTest = labTest;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }
}
