package exercises.project;

import java.util.Random;

public class Coin {
    private String side;
    public static String HEADS = "head";
    public static String TAILS = "tail";

    public String getSide(){
        return side;
    }

    public void setSide(String side){
        this.side = side;
    }

    public String flip(){
        if(new Random().nextBoolean()){
            setSide(HEADS);
        }
        else {
            setSide(TAILS);
        }
        return getSide();
    }

}
