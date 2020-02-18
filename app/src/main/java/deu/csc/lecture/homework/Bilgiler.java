package deu.csc.lecture.homework;

import java.io.Serializable;

public class Bilgiler implements Serializable {
    private int myAvatar;
    private String myName;
    private String myPhone;

    public Bilgiler(int avatar, String name, String phone) {
        myAvatar = avatar;
        myName = name;
        myPhone = phone;
    }

    public void setAvatar(int avatar) {
        myAvatar = avatar;
    }

    public int getAvatar() {
        return myAvatar;
    }

    public void setName(String name) {
        myName = name;
    }

    public String getName() {
        return myName;
    }

    public void setPhone(String phone) {
        myPhone = phone;
    }

    public String getPhone() {
        return myPhone;
    }
}