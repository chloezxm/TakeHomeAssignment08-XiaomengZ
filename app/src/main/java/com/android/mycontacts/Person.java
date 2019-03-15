package com.android.mycontacts;

public class Person {

    private int photoId;
    private int nameId;
    private int phoneNumberId;

    public Person(int photoId, int nameId, int phoneNumberId) {
        this.photoId = photoId;
        this.nameId = nameId;
        this.phoneNumberId = phoneNumberId;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getNameId() {
        return nameId;
    }

    public void setNameId(int nameId) {
        this.nameId = nameId;
    }

    public int getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(int phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }
}
