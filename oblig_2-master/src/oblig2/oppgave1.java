package oblig2;

import static javax.swing.JOptionPane.*;

public class oppgave1 {
    public static void main (String[] args) {
        // input for nedre og øvre grense
        int nedreGrense = Integer.parseInt(showInputDialog("Skriv inn nedre grense!"));
        int øvreGrense = Integer.parseInt(showInputDialog("Skriv inn øvre grense!"));
        int sum = 0;
        // if setning som tester på om øvre grense er større eller lik nedregrense
        if (øvreGrense <= nedreGrense) {
            showMessageDialog(null,"Øvregrense må være større, prøv igjen!");
        }
        // for loop for å printe ut tallene i mellom nedre og øvre grense
        for (int i=nedreGrense; i <= øvreGrense; i++) {
            System.out.print(" + " + i);
            // lager ny linje for 10ende tall
            if (i % 10 == 0) {
                System.out.println("\n");
            }
            sum += i;

        }
            System.out.print(" = " + sum);
    }
}
