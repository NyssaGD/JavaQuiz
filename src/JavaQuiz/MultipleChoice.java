package JavaQuiz;

public class MultipleChoice extends Question{

        String q1 = "Who is not an Avenger?\n"
                  + "(a)Captain America\n(b)Batman\n(c)Deadpool";
        String q2 = "Who is a regular Spider-Man Villain?\n"
                  + "(a)Lobo\n(b)Green Goblin\n(c)Captain Boomerang";
Question [] questions = {
        new Question(q1,"b"),
        new Question(q2,"b")};
}



