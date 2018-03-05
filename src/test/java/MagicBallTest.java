import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MagicBallTest {

        private MagicBall magic8Ball;

        @Before
        public void before() {
            ArrayList<String> testMagicBall = new ArrayList<>();
            testMagicBall.add("Maybe next time");
            testMagicBall.add("Definitely, yes");
            testMagicBall.add(("Probably not"));
            this.magic8Ball = new MagicBall(testMagicBall);
        }

        @Test
        public void canGetRandomAnswer() {
            ArrayList<String> copy = magic8Ball.getAnswers();
            String randomAnswer = magic8Ball.getRandomAnswer();
            assertTrue(copy.contains(randomAnswer));
        }

        @Test
        public void canGetCountOfAnswers() {
            assertEquals(3, magic8Ball.getCountOfAnswers());
        }

        @Test
        public void canAddAnswer() {
            magic8Ball.addAnswer("It's debatable");
            assertEquals(4, magic8Ball.getCountOfAnswers());
    }

        @Test
        public void canRemoveAnswer() {
            magic8Ball.removeAnswer("Maybe next time");
            assertEquals(2, magic8Ball.getCountOfAnswers());
        }
}
