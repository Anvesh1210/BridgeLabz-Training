package com.junit.basic;

public class DatabaseConnection {
	//code for DB connection
    private boolean connected;

    //connect function
    public void connect() {
        connected = true;
    }

    //disconnect function
    public void disconnect() {
        connected = false;
    }

    //checking connection
    public boolean isConnected() {
        return connected;
    }
}
