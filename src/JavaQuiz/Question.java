package JavaQuiz;

public abstract class Question {
    public String prompt;
   public abstract String actualAnswer();

    public Question(String prompt){
        this.prompt = prompt;
    }
    public String getQuestion(){
        return prompt;
    }
    public void SetQuestion(String Prompt){
        this.prompt = prompt;
    }
}
