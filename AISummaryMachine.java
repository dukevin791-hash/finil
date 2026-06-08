import java.util.*;

public class AISummaryMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AI文章重點擷取機 =====");
        System.out.println("請輸入文章（句子請用。結尾）：");

        String text = sc.nextLine();

        String[] sentences = text.split("。");

        Map<String, Integer> wordCount = new HashMap<>();

        // 統計字詞出現次數
        for (String sentence : sentences) {
            String[] words = sentence.split("");

            for (String word : words) {
                if (!word.trim().isEmpty()) {
                    wordCount.put(word,
                            wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }

        int highestScore = 0;
        String summary = "";

        // 計算句子分數
        for (String sentence : sentences) {

            int score = 0;

            String[] words = sentence.split("");

            for (String word : words) {
                score += wordCount.getOrDefault(word, 0);
            }

            if (score > highestScore) {
                highestScore = score;
                summary = sentence;
            }
        }

        System.out.println("\n===== AI分析結果 =====");
        System.out.println("文章重點：");
        System.out.println(summary + "。");

        sc.close();
    }
}