package Alpha02;

import java.util.ArrayList;
public class teste {
    public static void main (String args[]){
        ArrayList<Integer> teste = new ArrayList<Integer>();
        int a=0;
        int b=2;
        teste=abc(a,b);
        System.out.println(teste.get(0));

    }

    public static ArrayList<Integer> abc(int b,int a){
        ArrayList<Integer> retornar = new ArrayList<Integer>();
        b=10;a=10;
        retornar.add(a);
        retornar.add(b);
        return retornar;
    }
}
