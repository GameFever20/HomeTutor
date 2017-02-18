package com.example.gamef.hometutor;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Aisha on 2/18/2017.
 */

public class StudentInfo  {

    private String studentId;
    private  String studentName;
    private int studentAge;
    private String studentLocation;
    private String studentPhoneNo;
    private int studentClass;
    private String studentAddress;

    public StudentInfo(){

    }


    public String getStudentLocation() {
        return studentLocation;
    }

    public void setStudentLocation(String studentLocation) {
        this.studentLocation = studentLocation;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentPhoneNo() {
        return studentPhoneNo;
    }

    public void setStudentPhoneNo(String studentPhoneNo) {
        this.studentPhoneNo = studentPhoneNo;
    }

    public void getStudentInfo(String studentId){

         /*
         *get full detail of student by particular id
         */

    }

    public void postStudentInfo(StudentInfo studentInfo){
        /*
        * post/INSERT full info of student in database*/


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("studentInfo/"+studentInfo.getStudentId());


        myRef.setValue(studentInfo);
    }

    public void updateStudentInfo(){

    }



}
