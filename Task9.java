public class Task9 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C'},
                {'D', 'B', 'D', 'C'},
                {'A', 'A', 'D', 'C'}
        };
        char[] keys = {'D', 'B', 'D', 'C', 'D', 'A', 'A', 'D'};
        for (int i = 0; i < answers.length; i++) {
            int correctAnswers = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctAnswers++;
                }
            }
            System.out.println("Student " + i + "'s correct count is " + correctAnswers);
        }
    }
}