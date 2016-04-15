package dcll.projet;

/**
 * Created by mousa on 15/03/2016.
 */

public class Frame {
    /**
     * score de premier lancer.
     */
    private int firstLancer = 0;
    /**
     * score de deuxieme lancer.
     */
    private int secondLancer = 0;
    /**
     * Score maximum.
     */
    static final int QUILLE = 10;

    /**
     * constructeur.
     *
     * @param preLancer the firstLancer
     * @param dexLancer the secondlancer
     */
    public Frame(final int preLancer, final int dexLancer) {
        firstLancer = preLancer;
        secondLancer = dexLancer;
    }

    /**
     * Acceder au score de premier Lancer.
     *
     * @return firstLancer
     */
    final int getFirstScore() {
        return firstLancer;
    }

    /**
     * Score totale de chaque frame.
     *
     * @return firstlancer + secondlancer
     */
    final int getTotalScore() {
        return firstLancer + secondLancer;
    }

    /**
     * retourne le status de la frame (strike,spare,normal).
     *
     * @return status
     */
    final int getStatus() {
        if (getFirstScore() == QUILLE) {
            return 2; // strike
        }
        if (getTotalScore() == QUILLE) {
            return 1; // spare
        }
        return 0; // normal
    }
}
