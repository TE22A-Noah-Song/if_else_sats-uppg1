import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in); 
        int poäng = 0;
        
        System.out.println("Fråga 1: 2+3=?");
        int svar = t.nextInt();
        
        if (svar == 5) {
            poäng += 1;
        }
        else
        {
        poäng += 0;
        }
        System.out.println("Fråga 2: 23+5=?");
        int svar2 = t.nextInt();

        if (svar2 == 28) {
            poäng += 1;
        }
        else
        {
        poäng += 0;
        }

        System.out.println("Fråga 3: 5*5=?");
        int svar3 = t.nextInt();
        if (svar3 == 25) 
        {
            poäng += 1;
        }
        else
        {
        poäng += 0;
        }
        System.out.println("Fråga 4: 120/3=?");
        int svar4 = t.nextInt();
        if (svar4 == 40) {
            poäng += 1;
        }
        else
        {
        poäng += 0;
        }
        System.out.println("Fråga 5: 10/5*3=?");
        int svar5 = t.nextInt();
        if (svar5 == 6) {
            poäng += 1;
        }
        else
        {
        poäng += 0;
        }

        System.out.println("Du fick "+poäng+" utav 5 poäng");
    }
    }

