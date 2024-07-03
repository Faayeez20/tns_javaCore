package com.faayeez.assignment.assignment9;

import java.io.IOException;

public class Throws {

    void display() throws IOException, ClassNotFoundException {
        // Throwing different checked exceptions conditionally
        if (someCondition()) {
            throw new IOException("Simulated IOException");
        } else {
            throw new ClassNotFoundException("Simulated ClassNotFoundException");
        }
    }

    private boolean someCondition() {
        // Logic to determine if IOException should be thrown
        return Math.random() < 0.5; 
    }
}
