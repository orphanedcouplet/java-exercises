package class_exercises.class2;

public class FiveLetterWords {
    public static void main(String[] args) {
        String[] wordArray = {"you", "need", "me", "like", "the", "wind", "needs", "the", "trees", "to", "blow", "in", "like", "the", "moon", "needs", "poetry", "you", "need", "me"};
        for (String word : wordArray) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
