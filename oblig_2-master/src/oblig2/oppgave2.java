package oblig2;

import static javax.swing.JOptionPane.*;

class Tallspill
{

    public int nyttTall() {
        int rand = (int) (Math.random() * 201);
        return rand;
    }

    public void visMelding(String melding){
        // Viser parameterens innhold i en meldingsboks.
        showInputDialog(null,melding);
    }

    private void forLite(int tall){
    /* Viser melding om at parameterens verdi er for
       lite tall og ber spilleren prøve igjen. */
        if (tall < nyttTall()) {
            showMessageDialog(null,tall + " er for lite! Prøv igjen!");
        }
    }

    private void forStort(int tall) {
    /* Viser melding om at parameterens verdi er for
      stort tall og ber spilleren prøve igjen. */
        if (tall > nyttTall()) {
            showMessageDialog(null,tall + " er for stor! Prøv igjen!");
        }
    }

    public void avsluttRunde(int antall, int gjetning) {
    /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */
        showMessageDialog(null, gjetning + " er riktig tall!" + "\n" + "Du gjettet riktig på " + antall + " forsøk");
    }

    public void kjørSpill() {
        int randomNumber = nyttTall();
        int antall = 0;
        int gjetning = 0;
        boolean test = true;
        String stringTall = "";
        while (test) {
            try {
                stringTall = showInputDialog("Jeg tenker på et tall mellom 1 og 200." + "\n" + "Prøv å gjett:");
                int thisTall = Integer.parseInt(stringTall);
                if (thisTall < randomNumber) {
                    forLite(thisTall);


                    antall++;
                }
                else if (thisTall > randomNumber){
                    forStort(thisTall);
                    antall++;
                }
                else {
                    gjetning = randomNumber;
                    avsluttRunde(antall,gjetning);

                }

            } catch (Exception E) {
                visMelding("Inntastet verdi er feil!");
            }

            if (gjetning == randomNumber) {
                test = false;
            }

        }


    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */

    }


}

public class oppgave2 {
    public static void main (String [] args) {
        Tallspill nySpill = new Tallspill();
        nySpill.kjørSpill();
    }
}
