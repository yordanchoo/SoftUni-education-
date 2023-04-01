package Exercise04_Articles;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ver2 {
    public static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linesCount = Integer.parseInt(sc.nextLine());

        List<Article> articlesList = new ArrayList<>();
        String commandLine = sc.nextLine();
        int rotationsCount = 0;

        while (!commandLine.equals("title") && !commandLine.equals("content") && !commandLine.equals("author")) {
            rotationsCount++;
            String[] articleData = commandLine.split(", ");
            String title = articleData[0];
            String content = articleData[1];
            String author = articleData[2];

            Article currentArticle = new Article(title,content,author);
            articlesList.add(currentArticle);

            commandLine = sc.nextLine();
        }
        for (Article article : articlesList){
            System.out.println(article.toString());

        }
    }
}
