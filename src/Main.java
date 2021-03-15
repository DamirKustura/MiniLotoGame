import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        String uneseniBrojText = JOptionPane.showInputDialog("Upisi neki broj i okusaj srecu!");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);

        int[][] brojevi = {
                {34,5543,23,42,4,3,},
                {35,62,32,53,6,3,1,},
                {22,123,345,65,32,543,}
        };

        boolean postoji = false;

      Labela:  for (int i = 0; i < brojevi.length; i++) {
            int[] nizBrojeva = brojevi[i];
            for (int j = 0; j < nizBrojeva.length; j++) {
                if (uneseniBroj == nizBrojeva[j]){
                    postoji = true;
                    break Labela;
                }
            }

        }
          String poruka = postoji ? "Sretan si!" : "Nisi sretan!";

        JOptionPane.showMessageDialog(null,poruka);

    }
}
