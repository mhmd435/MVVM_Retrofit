package com.example.retrofit_mvvm;

import android.content.Context;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class ViewModel extends BaseObservable {
    Context context;

    private int id;
    private String username;
    private String password;
    private String work;
    private String photoUrl;

    public ViewModel(Model model) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.work = work;
        this.photoUrl = photoUrl;
    }

    public ViewModel(Context context) {
        this.context = context;
    }




    @Bindable
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        notifyPropertyChanged(BR.username);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    @Bindable
    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
        notifyPropertyChanged(BR.work);
    }

    @Bindable
    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
        notifyPropertyChanged(BR.photoUrl);
    }
}
