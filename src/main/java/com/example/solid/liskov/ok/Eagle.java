package com.example.liskov.substitution.principle;

public class Eagle implements FlyingBird {
    public void fly() {
        /* código para volar */ }
}

class Penguin {
    // No implementa FlyingBird, ya que no puede volar
}