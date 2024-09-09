package com.example.solid.interfaces.wrong;

// Violación del principio
public class Photocopier implements Printer {
    public void printDocument() {
        /* código para imprimir documento */ }

    public void scanDocument() {
        /* código para escanear documento */ }
}