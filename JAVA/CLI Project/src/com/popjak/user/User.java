package com.popjak.user;

import java.util.UUID;

public class User {

    private final UUID userid;
    private final String name;

    public User(String name) {
        userid = UUID.randomUUID();
        this.name = name;
    }

    @Override
    public String toString() {
        return userid + "," + name + "\n";
    }

}
