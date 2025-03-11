import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "size of int", "A. 2", "B. 6", "C. 4", "D. 8", "C");
        questions[1] = new Question(2, "size of double", "A. 2", "B. 6", "C. 4", "D. 8", "D");
        questions[2] = new Question(3, "size of char", "A. 2", "B. 6", "C. 4", "D. 8", "A");
        questions[3] = new Question(4, "size of long", "A. 2", "B. 6", "C. 4", "D. 8", "D");
        questions[4] = new Question(5, "size of boolean", "A. 1", "B. 2", "C. 4", "D. 8", "A");
    }

    public void playQuiz(){
                int i = 0;
                for (Question q: questions){
                    System.out.println("Question no:" + q.getId());
                    System.out.println(q.getQuestion());
                    System.out.println(q.getOpt1());
                    System.out.println(q.getOpt2());
                    System.out.println(q.getOpt3());
                    System.out.println(q.getOpt4());
                    System.out.println("Choose Option : ");
                    Scanner sc = new Scanner(System.in);
                    selection[i] = sc.nextLine();
                    i++;
                }

                for(String s : selection){
                    System.out.println(s);
                }
    }

    public void printScore(){
        int score = 0;
        for(int i = 0 ;i < questions.length;i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score is: " + score);

    }
}
