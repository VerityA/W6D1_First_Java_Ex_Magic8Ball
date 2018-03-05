import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MagicBall {

    private ArrayList<String> magicBall;

    public MagicBall(ArrayList<String> magicBall) {
        this.magicBall = magicBall;
    }


    public String getRandomAnswer() {
        Collections.shuffle(this.magicBall);
        return this.magicBall.get(0);
    }

    public ArrayList<String> getAnswers() {
        ArrayList<String> copyOfMagicBall = new ArrayList<>(this.magicBall);
        return copyOfMagicBall;
    }


    public int getCountOfAnswers() {
        return this.magicBall.size();
    }

    public void addAnswer(String answer) {
        this.magicBall.add(answer);
    }

    public void removeAnswer(String answer) {
        this.magicBall.remove(answer);
    }
}
