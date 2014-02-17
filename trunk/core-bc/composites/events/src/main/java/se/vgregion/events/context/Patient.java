package se.vgregion.events.context;

import java.io.Serializable;

public class Patient implements Serializable {
    public enum Sex {
        MALE("Man"), FEMALE("Kvinna"), UNKNOWN("Kön okänt"), NODATA("");

        public final String displayName;

        Sex(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
    private static final long serialVersionUID = -3164297652632714945L;

    public final String patientId;
    public final String patientDisplayName;
    public final int age;
    public final Sex sex;
    public final boolean haveInformation;

    public Patient(String patientId) {
        this.patientId = patientId;
        this.patientDisplayName = "";
        this.sex = Sex.NODATA;
        this.age = 0;
        this.haveInformation = false;
    }

    public Patient(String patientId, String patientDisplayName, int age, Sex sex) {
        this.patientId = patientId;
        this.patientDisplayName = patientDisplayName;
        this.age = age;
        this.sex = sex;
        this.haveInformation = true;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getPatientDisplayName() {
        return patientDisplayName;
    }

    public String getSexDisplayName() {
        return sex.displayName;
    }

    public boolean isHaveInformation() {
        return haveInformation;
    }

    // Format 193404231234 into 19340423-1234
    public String getPatientIdFormatted() {
        return new StringBuilder(patientId).insert(patientId.length()-4, "-").toString();
    }

    public Patient mapPatientInfo(String newName, int newAge, Sex newSex) {
        return new Patient(patientId, newName, newAge, newSex);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", patientDisplayName='" + patientDisplayName + '\'' +
                ", sex=" + sex +
                ", haveInformation=" + haveInformation +
                '}';
    }
}