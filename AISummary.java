import java.util.*;

public class AISummary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入文章：");
        String text = sc.nextLine();

        String[] sentences = text.split("。");

        System.out.println("\n【重點整理】");

        int count = 1;

        for(String s : sentences){

            s = s.trim();

            if(s.length() >= 8){

                System.out.println(
                    count + ". " + s + "。"
                );

                count++;

                if(count > 5)
                    break;
            }
        }

        sc.close();
    }
}