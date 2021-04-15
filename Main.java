package it.castelli;

public class Main {
    public static void main(String [] args){
        PariThread  pari;
        PasswordThread password;
        pari = new PariThread(0);
        pari.start();
        password = new PasswordThread(10);
        password.start();

    }
}
