package com.arao.topics.designPatterns.creational.singleton;

public class ClientMain {

    public static void main(String[] args) {
        Database db = Database.getInstance();
        db.getConnection();
    }
}
