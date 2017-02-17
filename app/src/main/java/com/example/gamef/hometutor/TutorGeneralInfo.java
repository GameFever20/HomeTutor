package com.example.gamef.hometutor;

import java.util.ArrayList;

/**
 * Created by gamef on 17-02-2017.
 */

public class TutorGeneralInfo {

    private String tutorName , tutorEducation ,tutorGender ,tutorID ,tutorProfilePicture ;
    private float tutorRating ;
    private int tutorAge;
    private String[] tutorSubject;

    public TutorGeneralInfo(String tutorEducation, String tutorName, String tutorGender, String tutorID, String tutorProfilePicture, float tutorRating, int tutorAge, String[] tutorSubject) {
        this.tutorEducation = tutorEducation;
        this.tutorName = tutorName;
        this.tutorGender = tutorGender;
        this.tutorID = tutorID;
        this.tutorProfilePicture = tutorProfilePicture;
        this.tutorRating = tutorRating;
        this.tutorAge = tutorAge;
        this.tutorSubject = tutorSubject;
    }

    public TutorGeneralInfo() {
    }


    public String[] getTutorSubject() {
        return tutorSubject;
    }

    public void setTutorSubject(String[] tutorSubject) {
        this.tutorSubject = tutorSubject;
    }


    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public String getTutorEducation() {
        return tutorEducation;
    }

    public void setTutorEducation(String tutorEducation) {
        this.tutorEducation = tutorEducation;
    }

    public String getTutorGender() {
        return tutorGender;
    }

    public void setTutorGender(String tutorGender) {
        this.tutorGender = tutorGender;
    }

    public String getTutorID() {
        return tutorID;
    }

    public void setTutorID(String tutorID) {
        this.tutorID = tutorID;
    }

    public String getTutorProfilePicture() {
        return tutorProfilePicture;
    }

    public void setTutorProfilePicture(String tutorProfilePicture) {
        this.tutorProfilePicture = tutorProfilePicture;
    }

    public float getTutorRating() {
        return tutorRating;
    }

    public void setTutorRating(float tutorRating) {
        this.tutorRating = tutorRating;
    }

    public int getTutorAge() {
        return tutorAge;
    }

    public void setTutorAge(int tutorAge) {
        this.tutorAge = tutorAge;
    }



    //MEthods for class

    public ArrayList<TutorGeneralInfo> getTutorList(){

        /*return list of all tutor from database whose profile are active
        * number of profile can be limited by using int parameter*/





        return new ArrayList<TutorGeneralInfo>();
    }

    public void getTutorInfo(){

        /*get full detail of a tutor from database to show in description activity
        * take tuytor id as parameter and return TutorInfo object with TutorgeneralInfo + TutorExtraInfo + tutorReview*/


    }

    public void updateTutorGeneralInfo(){
        /*Update field of Tutor informatiuon in database*/

    }

    public void postTutorGeneralInfo(){
        /*post new  Tutor informatiuon in database at desired place*/

    }


    public void getProfilePicture(){
        /*get profile pic of Tutor from database*/


    }

    public void getTutorListBySubject(){

        /*get categorised list sorted acc to subject from the result of getTutorlist method*/



    }

    public void getTutorListByCourse(){

        /*get categorised list sorted acc to course from the result of getTutorlist method*/


    }

    public void getTutorListByType(){

        /*get categorised list sorted acc to Type from the result of getTutorlist method
        * either coaching or homeTutor*/



    }




}
