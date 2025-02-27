package com.quaindinteractive.androidpractice.model;

public class UserTable {

    static final String TABLE = "users";

    public static class COLUMN {
        static final String ID = "_id";
        public static final String USERNAME = "username";
        public static final String PASSWORD = "password";
    }

    static final String CREATE_SCRIPT =
            String.format("create table %s (" +
                          "%s integer primary key autoincrement," +
                          "%s text," +
                          "%s text" + ");",
                          TABLE, COLUMN.ID, COLUMN.USERNAME, COLUMN.PASSWORD);
}
