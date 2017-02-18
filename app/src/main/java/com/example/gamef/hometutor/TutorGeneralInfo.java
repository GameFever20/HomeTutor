package com.example.gamef.hometutor;

import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by gamef on 17-02-2017.
 */

public class TutorGeneralInfo {

    private String tutorName , tutorEducation ,tutorGender ,tutorID ,tutorProfilePicture ;
    private float tutorRating ;
    private int tutorAge;
    private int tutorPoint;
    private List<String> tutorSubject;




    public TutorGeneralInfo(String tutorEducation, String tutorName, String tutorGender, String tutorID, String tutorProfilePicture, float tutorRating, int tutorAge, List<String> tutorSubject) {
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

    public int getTutorPoint() {
        return tutorPoint;
    }

    public void setTutorPoint(int tutorPoint) {
        this.tutorPoint = tutorPoint;
    }


    public List<String> getTutorSubject() {
        return tutorSubject;
    }

    public void setTutorSubject(List<String> tutorSubject) {
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

    public ArrayList<TutorGeneralInfo> getTutorList(final TestActivity activity){

        /*return list of all tutor from database whose profile are active
        * number of profile can be limited by using int parameter*/


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("tutorGeneralInfo");

        DatabaseReference myRef2 = myRef.orderByChild("tutorPoint").limitToLast(20).getRef();

        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                ArrayList<TutorGeneralInfo> tutorArrayList =new ArrayList<TutorGeneralInfo>();

                for (DataSnapshot child : dataSnapshot.getChildren()) {
                    TutorGeneralInfo tutor =child.getValue(TutorGeneralInfo.class);
                    tutorArrayList.add(tutor);

                }
                activity.updateFromGetTutorList(tutorArrayList);



            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        return new ArrayList<TutorGeneralInfo>();
    }

    public void getTutorList(final int methodSpecifier , int limitProfile){

        /*return list of all tutor from database whose profile are active
        * number of profile can be limited by using int parameter*/


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("tutorGeneralInfo");

        DatabaseReference myRef2 = myRef.orderByChild("tutorPoint").limitToLast(limitProfile).getRef();

        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                ArrayList<TutorGeneralInfo> tutorArrayList =new ArrayList<TutorGeneralInfo>();

                for (DataSnapshot child : dataSnapshot.getChildren()) {
                    TutorGeneralInfo tutor =child.getValue(TutorGeneralInfo.class);
                    tutorArrayList.add(tutor);

                }

                switch (methodSpecifier){
                    case 1 :
                        break;
                    case 2 :
                        break;
                    case 3 :
                        break;
                    case 4 :
                        break;
                }




            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }



    public void getTutorInfo(){

        /*get full detail of a tutor from database to show in description activity
        * take tuytor id as parameter and return TutorInfo object with TutorgeneralInfo + TutorExtraInfo + tutorReview*/


    }

    public void updateTutorGeneralInfo(){
        /*Update field of Tutor informatiuon in database*/

    }

    public void postTutorGeneralInfo(TutorGeneralInfo tutorGeneralInfo){
        /*post new  Tutor informatiuon in database at desired place*/


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("tutorGeneralInfo/"+tutorGeneralInfo.getTutorID());


        myRef.setValue(tutorGeneralInfo);


    }

    public TutorGeneralInfo getTutorGeneralInfo(String tutorID , final TextView status , final TestActivity activity){

        /*get tutorgeneralinfo of a particular tutor from database
        * useful in tutor version app
        * here method will be overridder on Activity parameter
        * depending on how many activity are using this method
         * one instance for each activity using this method*/

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("tutorGeneralInfo/"+tutorID);

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                TutorGeneralInfo tutorGeneralInfo =dataSnapshot.getValue(TutorGeneralInfo.class);
                //status.setText("tutor : "+tutorGeneralInfo.getTutorID() +"\n" +tutorGeneralInfo.getTutorName()+"\n" +tutorGeneralInfo.getTutorEducation()+"\n" +tutorGeneralInfo.getTutorGender()+"\n" +tutorGeneralInfo.getTutorPoint());

                Log.d(TAG, "getTutorGeneralInfo: In Event listnerf");
                activity.updateFromGetTutorGnInfo(tutorGeneralInfo);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        Log.d(TAG, "getTutorGeneralInfo: In getTutorGeneralInfo");


        return new TutorGeneralInfo();
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
