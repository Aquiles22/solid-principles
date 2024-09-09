package com.example.solid.interfaces.wrong;

// Violación del principio
public class Scanner implements Printer {
    public void printDocument() {
        /* código para no imprimir documento (viola el principio) */ }

    public void scanDocument() {
        /* código para escanear documento */ }
}