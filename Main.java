public class Main {

    public static void main(String[] args) {


        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);


        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int scorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Olive", scorePosition);

        scorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Anikate", scorePosition);

        scorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Pickles", scorePosition);

        scorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Lilo", scorePosition);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }




    }

    public static void displayHighScorePosition(String playerName, int scorePosition) {
        System.out.println(playerName + " managed to get into position " + scorePosition + " on the high score table");
    }



    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
            } else if(playerScore >= 500) {
                return 2;
                } else if (playerScore >= 100);{
                    return 3;
                    } else{
                        return 4;
                    }
                }


            }



            // Another way of doing the above method:
    //int position = 4;

    //if (playerScore >= 1000) {
    //      position = 1;
    //{ else if (playerScore >= 500) {
    //      position = 2;
    //{ else if (playerScore >= 100) {
    //      position = 3;
    // }
    //  return position;