package JavaQuiz;


public class TrueOrFalse extends Question{
    private char actualAnswer;

    public String getActualAnswer() {
        return actualAnswer + "";
    }
    public void setActualAnswer(char ActualAnswer){
        this.actualAnswer = actualAnswer;
    }
public TrueOrFalse(String Prompt){
        super(prompt);
}

}
