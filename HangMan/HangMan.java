import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {

    Category cat = new Category();//
    private   String category;
    private    String word;
    private  String mystery;
    private  Scanner sc = new Scanner(System.in);
    private  int life = 6; // life
    private   int hintNum = 1; // hint
    private static boolean play = true;//

    public HangMan() {

        while (play) {
            category = cat.getCategory();
            word = cat.getWord();
            mystery =  cat.getMystery();

            System.out.println(" _                                             \n" +
                    "| |                                            \n" +
                    "| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __  \n" +
                    "| '_ \\ / _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\ \n" +
                    "| | | | (_| | | | | (_| | | | | | | (_| | | | |\n" +
                    "|_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|\n" +
                    "                    __/ |                      \n" +
                    "                   |___/ ");

            System.out.println(" ___________.._______\n" +
                    "| .__________))______|\n" +
                    "| | / /      \n"+
                    "| |/ /       \n"+
                    "| | /        \n"+
                    "| |/         \n"+
                    "| |          \n"+
                    "| |          \n"+
                    "| |         \n"+
                    "| |       \n"+
                    "| |       \n"+
                    "| |      \n"+
                    "| |     \n"+
                    "| |          \n"+
                    "| |          \n"+
                    "| |          \n"+
                    "| |          \n"+
                    "| |         \n"+
                    "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"| |\n" +
                    "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"| |\n" +
                    "| |               | |\n" +
                    ": :               : :  sk\n" +
                    ". .               . .");

            while (life < 7 && 0 < life && mystery .contains("_")) {
                System.out.println(mystery);
                System.out.println("Your life: " + life);
                System.out.println("Your category is " + category);
                System.out.println("Please enter a letter or a word:  ");
                String guess = sc.next();
                hang(guess);//Wheather it is available or not

            }
            restart();
        }
        sc.close();//

    }

    public  void hang(String guess) {
        String newUnderscore = "";

        if (guess.length() == 1) {//
            for (int i = 0; i < word.length(); i++) {
                if (word.substring(i, i + 1).equalsIgnoreCase(guess)) {
                    newUnderscore += guess;
                } else if (mystery.charAt(i) != '_') {
                    newUnderscore += word.charAt(i);
                } else {
                    newUnderscore += "_";
                }
            }

            if (mystery.equals(newUnderscore)) {
                life--;
                getPicture();

            } else if (mystery.equals(word)) {
                System.out.println("Correct! You win! The word was " + word);
                getScore(life);

            } else {
                mystery = newUnderscore;
            }
            getHint(word);

        }else {//written the word



            if (guess.equalsIgnoreCase(word)) {
                System.out.println("Correct! You win! The word was " + word);
                mystery = word;
                getScore(life);

            } else {
                life--;
                getPicture();
                getHint(word);
            }

            getHint(word);
        }

    }

    public  void getPicture() {

        switch (life) {
            case 5:
                System.out.println(" ___________.._______\n" +
                        "| .__________))______|\n" +
                        "| | / /      ||\n" +
                        "| |/ /       ||\n" +
                        "| | /        ||\n" +
                        "| |/         ||\n" +
                        "| |          ||\n"+
                        "| |          \n"+
                        "| |         \n"+
                        "| |       \n"+
                        "| |       \n"+
                        "| |      \n"+
                        "| |     \n"+
                        "| |          \n"+
                        "| |          \n"+
                        "| |          \n"+
                        "| |          \n"+
                        "| |         \n"+
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"| |\n" +
                        "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"| |\n" +
                        "| |               | |\n" +
                        ": :               : :  sk\n" +
                        ". .               . .");
                break;
            case 4:
                System.out.println(" ___________.._______\n" +
                        "| .__________))______|\n" +
                        "| | / /      ||\n" +
                        "| |/ /       ||\n" +
                        "| | /        ||\n" +
                        "| |/         ||.-''.\n" +
                        "| |/         |/  _  \\\n" +
                        "| |          ||  `/,|\n" +
                        "| |          (\\\\`_.'\n" +
                        "| |       \n"+
                        "| |       \n"+
                        "| |      \n"+
                        "| |     \n"+
                        "| |          \n"+
                        "| |          \n"+
                        "| |          \n"+
                        "| |          \n"+
                        "| |         \n"+
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"| |\n" +
                        "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"| |\n" +
                        "| |               | |\n" +
                        ": :               : :  sk\n" +
                        ". .               . .");
                break;
            case 3:
                System.out.println(" ___________.._______\n" +
                        "| .__________))______|\n" +
                        "| | / /      ||\n" +
                        "| |/ /       ||\n" +
                        "| | /        ||\n" +
                        "| |/         ||.-''.\n" +
                        "| |/         |/  _  \\\n" +
                        "| |          ||  `/,|\n" +
                        "| |          (\\\\`_.'\n" +
                        "| |        .-`--'.\n" +
                        "| |        /Y . . Y\\  \n" +
                        "| |          |   |    \n" +
                        "| |          | . |      \n" +
                        "| |          |   |     \n" +
                        "| |               \n" +
                        "| |               \n" +
                        "| |               \n" +
                        "| |               \n" +
                        "| |                \n" +
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"| |\n" +
                        "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"| |\n" +
                        "| |               | |\n" +
                        ": :               : :  sk\n" +
                        ". .               . .");
                break;
            case 2:
                System.out.println(" ___________.._______\n" +
                        "| .__________))______|\n" +
                        "| | / /      ||\n" +
                        "| |/ /       ||\n" +
                        "| | /        ||\n" +
                        "| |/         ||.-''.\n" +
                        "| |/         |/  _  \\\n" +
                        "| |          ||  `/,|\n" +
                        "| |          (\\\\`_.'\n" +
                        "| |        .-`--'.\n" +
                        "| |        /Y . . Y\\\n" +
                        "| |       // |   | \\\\\n" +
                        "| |      //  | . |  \\\\\n" +
                        "| |     ')   |   |   (`\n" +
                        "| |               \n" +
                        "| |               \n" +
                        "| |               \n" +
                        "| |               \n" +
                        "| |                \n" +
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"| |\n" +
                        "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"| |\n" +
                        "| |               | |\n" +
                        ": :               : :  sk\n" +
                        ". .               . .");
                break;
            case 1:
                System.out.println(" ___________.._______\n" +
                        "| .__________))______|\n" +
                        "| | / /      ||\n" +
                        "| |/ /       ||\n" +
                        "| | /        ||\n" +
                        "| |/         ||.-''.\n" +
                        "| |/         |/  _  \\\n" +
                        "| |          ||  `/,|\n" +
                        "| |          (\\\\`_.'\n" +
                        "| |        .-`--'.\n" +
                        "| |        /Y . . Y\\\n" +
                        "| |       // |   | \\\\\n" +
                        "| |      //  | . |  \\\\\n" +
                        "| |     ')   |   |   (`\n" +
                        "| |          ||'||\n" +
                        "| |          || ||\n" +
                        "| |          || ||\n" +
                        "| |          || ||\n" +
                        "| |         / | | \\\n" +
                        "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"| |\n" +
                        "|\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"| |\n" +
                        "| |               | |\n" +
                        ": :               : :  sk\n" +
                        ". .               . .");
                break;

            case 0:
                System.out.println("right leg");
                System.out.println(" ___________.._______\n" +
                        "| .__________))______|\n" +
                        "| | / /      ||\n" +
                        "| |/ /       ||\n" +
                        "| | /        ||.-''.\n" +
                        "| |/         |/  _  \\\n" +
                        "| |          ||  `/,|\n" +
                        "| |          (\\\\`_.'\n" +
                        "| |         .-`--'.\n" +
                        "| |        /Y . . Y\\\n" +
                        "| |       // |   | \\\\\n" +
                        "| |      //  | . |  \\\\\n" +
                        "| |     ')   |   |   (`\n" +
                        "| |          ||'||\n" +
                        "| |          || ||\n" +
                        "| |          || ||\n" +
                        "| |          || ||\n" +
                        "| |         / | | \\\n" +
                        "\"\"\"\"\"\"\"\"\"\"|_`-' `-' |\"\"\"|\n" +
                        "|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|\n" +
                        "| |        \\ \\        | |\n" +
                        ": :         \\ \\       : :  sk\n" +
                        ". .          `'       . .");
                System.out.println("Game is over");
                System.out.println("The word was "+ word);


        }

    }

    public  void getHint(String word){

        ArrayList<String> letters = new ArrayList<>();

        for (int i= 0; i < word.length(); i++) {

            if (!mystery.substring(i,i+1).equalsIgnoreCase(word.substring(i,i+1))) {

                letters.add(word.substring(i,i+1));

            }
        }
        if (hintNum ==1 && !mystery.equalsIgnoreCase(word)){
            System.out.println(mystery);
            System.out.println("Do you want to take hint?(Y/N)");
            String dec = sc.next();
            if (dec.equalsIgnoreCase("y")) {
                int randIndex = (int) (Math.random() * letters.size());
                String hint = letters.get(randIndex);
                hintNum--;
                hang(hint);

            }
        }

    }

    public  void getScore(int li){

        System.out.println("Your score: " + (li*10));
    }

    public void restart(){//playing again or not
        System.out.println("Do you want to play again (Y/N): ");
        String decision1 = sc.next();

        if (decision1.equalsIgnoreCase("y")) {
            word = cat.getWord();
            mystery = "_".repeat(word.length());
            life = 6;
            hintNum = 1;
            play = true;

        }
        else if (decision1.equalsIgnoreCase("n")){
            play = false;
            System.out.println("Ok then see you later!");
        }
        else {
            System.out.println("Please enter a valid value");
            restart();
        }
    }

}