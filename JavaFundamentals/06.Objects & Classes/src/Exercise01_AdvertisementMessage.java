import java.util.Random;
import java.util.Scanner;

public class Exercise01_AdvertisementMessage {
    static class Advertisement {
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!"
                , "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rnd = new Random();

        public String getAdvertisement() {
            String output = String.format("%s %s %s - %s",phrases[rnd.nextInt(phrases.length)]
                    ,events[rnd.nextInt(events.length)],author[rnd.nextInt(author.length)],cities[rnd.nextInt(cities.length)]);

            return output;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <=count ; i++) {
            Advertisement advert = new Advertisement();
            System.out.println(advert.getAdvertisement());
        }

    }
}
