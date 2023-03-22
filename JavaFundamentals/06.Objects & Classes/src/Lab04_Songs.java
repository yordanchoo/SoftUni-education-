import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab04_Songs {
    static class Song {
        String listType;
        String name;
        String time;

        public String getListType() {
            return listType;
        }

        public void setListType(String listType) {
            this.listType = listType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());

        List<Song> listSongs = new ArrayList<>();
        for (int i = 1; i <= lines; i++) {
            String[] inputLine = sc.nextLine().split("_");
            String inputType = inputLine[0];
            String inputName = inputLine[1];
            String inputTime = inputLine[2];

            Song currentSong = new Song();
            currentSong.setListType(inputType);
            currentSong.setName(inputName);
            currentSong.setTime(inputTime);

            listSongs.add(currentSong);
        }

        String command = sc.nextLine();
        if (command.equals("all")) {
            for (Song item : listSongs) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : listSongs) {
                if (item.getListType().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
