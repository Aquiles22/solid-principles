package com.example.solid.liskov.wrong;

// Violación del principio
public class Bird {
    public void fly() {
        /* código para volar */ }
}

class Penguin extends Bird {
    public void fly() {
        /* código para no volar (viola el principio) */ }
}