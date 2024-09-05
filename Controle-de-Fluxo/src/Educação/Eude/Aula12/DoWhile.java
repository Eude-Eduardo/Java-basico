package Educação.Eude.Aula12;

public class DoWhile {
    public static void main(String[] args) {
        //loop infinito
        int num = 3; 
        int count = 1; 
        do { num += count;  
            System.out.println(num); 
        } 
        while (count <= 3);
}}