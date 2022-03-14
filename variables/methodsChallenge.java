public class methodsChallenge {
    public static void main(String[] args){
        
        int position = calculateHighScorePosition(1000);
        displayHighScore("Tim" , position);

        position = calculateHighScorePosition(800);
        displayHighScore("kim", position);

        position = calculateHighScorePosition(40);
        displayHighScore("Tam", position);

        position = calculateHighScorePosition(200);
        displayHighScore("San", position);

        position = calculateHighScorePosition(1500);
        displayHighScore("Hope", position);
    }


    public static void displayHighScore(String name, int position){
        System.out.println(name +" managed to get into position "+ position+ " on the highscore table.");
         
    }
    public static int calculateHighScorePosition(int score){
        // if (score >= 1000){
        //     return 1;
        // }else if (score >= 500){
        //     return 2;
        // }else if (score >= 100 ){
        //     return 3;
        // }
        // return 4;
        int position = 4;
        if (score >= 1000){
            position = 1;
        }else if (score >= 500){
            position = 2;
        }else if (score >= 100){
            position = 3;
        }
        return position;
        
    }
}

