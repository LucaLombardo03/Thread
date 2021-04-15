package it.castelli;

import java.util.Random;

public class PasswordThread extends Thread{
    private final int LUNGHEZZA = 20;
    private int numPassword;
    Random rnd = new Random();
    private final String ALPHABET = "0123456789abcdefghilmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public PasswordThread(int numPassword){
        this.numPassword = numPassword;
    }
    @Override
    public void run(){
        for (int k = 0; k<numPassword; k++){
            String password = "";
            for(int i = 0; i<LUNGHEZZA; i++){
                password += (ALPHABET.charAt(rnd.nextInt(ALPHABET.length())));
            }
            System.out.println(password);
        }
    }
}
