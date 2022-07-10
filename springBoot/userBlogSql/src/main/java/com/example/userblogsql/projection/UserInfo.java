package com.example.userblogsql.projection;

public interface UserInfo {
    Integer getId();
    String getName();
    String getEmail();
    String getAvatar();

    default void showInfo() {
        System.out.println(getId() + " -- " + getName() + " -- " + getEmail() + " -- " + getAvatar());
    }
}
