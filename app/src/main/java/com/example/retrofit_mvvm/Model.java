package com.example.retrofit_mvvm;

public class Model {
    private int id;
    private String username;
    private String password;
    private String work;
    private String photoUrl;

    public Model(int id, String username, String password, String work, String photoUrl) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.work = work;
        this.photoUrl = photoUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
