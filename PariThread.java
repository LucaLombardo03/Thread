package it.castelli;

public class PariThread extends Thread {
    private int num;
    private final int FINE = 100;

    public PariThread(int num){
        this.num = num;
    }
    @Override
    public void run(){
        for(int i = 0; i <= FINE; i++) {
            System.out.println("indice:"+i+" "+num);
            num=num+2;

        }
    }
}
