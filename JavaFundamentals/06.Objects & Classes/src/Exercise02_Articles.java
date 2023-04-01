import java.util.Scanner;

public class Exercise02_Articles {
    public static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void editContent(String newContent) {
            this.content = newContent;
        }

        public void changeAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        public void renameTitle(String newTitle) {
            this.title = newTitle;
        }

        @Override
        public String toString() {
            return this.title + " - " + this.content + ":" + this.author;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String articleData = sc.nextLine();
        String title = articleData.split(", ")[0];
        String content = articleData.split(", ")[1];
        String author = articleData.split(", ")[2];

        Article currentArticle = new Article(title, content, author);

        int commandsCount = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= commandsCount; i++) {
            String command = sc.nextLine();
            String commandType = command.split(": ")[0];
            String newValue = command.split(": ")[1];
            switch (commandType) {
                case "Edit":
                    currentArticle.editContent(newValue);
                    break;
                case "ChangeAuthor":
                    currentArticle.changeAuthor(newValue);
                    break;
                case "Rename":
                    currentArticle.renameTitle(newValue);
                    break;
            }
        }
        System.out.println(currentArticle.toString());
    }
}
