public class ty {
    public static void main(String[] args) {
        int totalQuestions = 150;
        double candidate1Percentage = 0.80;
        double candidate2Percentage = 0.72;

        int candidate1Correct = (int) (totalQuestions * candidate1Percentage);
        int candidate2Correct = (int) (totalQuestions * candidate2Percentage);

        System.out.println("Candidate 1 got " + candidate1Correct + " questions correct.");
        System.out.println("Candidate 2 got " + candidate2Correct + " questions correct.");
    }
}


