public class DataRunner {
    public static void main(String[] args) {

        UserStory us = new UserStory("species.txt", "year.txt", "dangers.txt", "values.txt");

        System.out.println(us);
    }
}
