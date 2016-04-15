package dcll.projet;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mousa on 15/04/2016.
 */
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by rottanaly on 3/8/16.
 */
public class ScoreBoardTest {

    @Test
    public void testCalculateScore() throws Exception {
        ArrayList<Frame> scoreTotaleDuJeu = new ArrayList<Frame>();

        scoreTotaleDuJeu.add(new Frame(10, 0));
        scoreTotaleDuJeu.add(new Frame(10, 0));
        scoreTotaleDuJeu.add(new Frame(10, 0));
        scoreTotaleDuJeu.add(new Frame(10, 0));
        scoreTotaleDuJeu.add(new Frame(10, 0));
        scoreTotaleDuJeu.add(new Frame(10, 0));
        scoreTotaleDuJeu.add(new Frame(10, 0));
        scoreTotaleDuJeu.add(new Frame(10, 0));
        scoreTotaleDuJeu.add(new Frame(10, 0));
        scoreTotaleDuJeu.add(new Frame(10, 0));
        scoreTotaleDuJeu.add(new Frame(10, 0));
        scoreTotaleDuJeu.add(new Frame(10, 0));
        ScoreBoard score = new ScoreBoard();
        int scorefinal = score.calculateScore(scoreTotaleDuJeu);
        assertEquals(scorefinal, 300);

        ArrayList<Frame> scoreTotaleDuJeu1 = new ArrayList<Frame>();

        scoreTotaleDuJeu1.add(new Frame(5, 5));
        scoreTotaleDuJeu1.add(new Frame(5, 5));
        scoreTotaleDuJeu1.add(new Frame(5, 5));
        scoreTotaleDuJeu1.add(new Frame(5, 5));
        scoreTotaleDuJeu1.add(new Frame(5, 5));
        scoreTotaleDuJeu1.add(new Frame(5, 5));
        scoreTotaleDuJeu1.add(new Frame(5, 5));
        scoreTotaleDuJeu1.add(new Frame(5, 5));
        scoreTotaleDuJeu1.add(new Frame(5, 5));
        scoreTotaleDuJeu1.add(new Frame(5, 5));
        scoreTotaleDuJeu1.add(new Frame(5, 5));
        scoreTotaleDuJeu1.add(new Frame(0, 0));

        int score1 = score.calculateScore(scoreTotaleDuJeu1);
        assertEquals(score1, 150);


        ArrayList<Frame> scoreTotaleDuJeu2 = new ArrayList<Frame>();
        scoreTotaleDuJeu2.add(new Frame(9, 0));
        scoreTotaleDuJeu2.add(new Frame(9, 0));
        scoreTotaleDuJeu2.add(new Frame(9, 0));
        scoreTotaleDuJeu2.add(new Frame(9, 0));
        scoreTotaleDuJeu2.add(new Frame(9, 0));
        scoreTotaleDuJeu2.add(new Frame(9, 0));
        scoreTotaleDuJeu2.add(new Frame(9, 0));
        scoreTotaleDuJeu2.add(new Frame(9, 0));
        scoreTotaleDuJeu2.add(new Frame(9, 0));
        scoreTotaleDuJeu2.add(new Frame(9, 0));
        scoreTotaleDuJeu2.add(new Frame(0, 0));
        scoreTotaleDuJeu2.add(new Frame(0, 0));

        int score2 = score.calculateScore(scoreTotaleDuJeu2);
        assertEquals(score2, 90);
        ArrayList<Frame> scoreTotaleDuJeu3 = new ArrayList<Frame>();
        scoreTotaleDuJeu3.add(new Frame(9, 0));
        scoreTotaleDuJeu3.add(new Frame(9, 1));
        scoreTotaleDuJeu3.add(new Frame(8, 2));
        scoreTotaleDuJeu3.add(new Frame(9, 0));
        scoreTotaleDuJeu3.add(new Frame(10, 0));
        scoreTotaleDuJeu3.add(new Frame(7, 0));
        scoreTotaleDuJeu3.add(new Frame(9, 0));
        scoreTotaleDuJeu3.add(new Frame(10, 0));
        scoreTotaleDuJeu3.add(new Frame(6, 4));
        scoreTotaleDuJeu3.add(new Frame(3, 0));
        scoreTotaleDuJeu3.add(new Frame(0, 0));
        scoreTotaleDuJeu3.add(new Frame(0, 0));

        int score3 = score.calculateScore(scoreTotaleDuJeu3);
        assertEquals(score3, 124);
    }
}