package dcll.projet;

import java.util.ArrayList;

/**
 * Created by mousa on 15/03/2016.
 */
public class ScoreBoard {

    /**
     * calcul de score.
     *
     * @param toutFrame un tableau de frame
     * @return le score totale
     */
    public final int calculateScore(final ArrayList<Frame> toutFrame) {
        int scoreTotale = 0;
        final int maxFrame = 12;
        final int frame = 10;

        int[] tableau = new int[maxFrame];
        for (int i = 0; i < maxFrame; i++) {
            // tableau: un taleau qui contient le score temporaire
            // toutFrame.get(i) va ne donner  le Frame i
            tableau[i] = toutFrame.get(i).getTotalScore();
        }
        for (int i = 0; i < frame; i++) {
            // Cas de Strike
            if (toutFrame.get(i).getStatus() == 2) {
                // Total score = Score courant + les deux prochaines scores
                scoreTotale += tableau[i] + tableau[i + 1];
                /** Cas le prochain Frame est Strike
                 * on doit ajouter encore d'autre Score
                 */
                if (toutFrame.get(i + 1).getStatus() == 2) {
                    scoreTotale += toutFrame.get(i + 2).getFirstScore();
                }
            } else if (toutFrame.get(i).getStatus() == 1) {
                // cas de spare
                int nextScore = toutFrame.get(i + 1).getFirstScore();
                scoreTotale += tableau[i] + nextScore;
            } else {
                //cas normal
                scoreTotale += tableau[i];
            }
        }
        return scoreTotale;
    }

}
