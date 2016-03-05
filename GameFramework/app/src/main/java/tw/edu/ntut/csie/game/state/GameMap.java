package tw.edu.ntut.csie.game.state;

import tw.edu.ntut.csie.game.GameObject;
import tw.edu.ntut.csie.game.R;
import tw.edu.ntut.csie.game.core.MovingBitmap;

/**
 * Created by gmai on 2015/3/12.
 */

public class GameMap implements GameObject {
    private MovingBitmap blue;
    private MovingBitmap green;
    private int[][] map={{1,2,1,2},{2,1,2,1},{0,1,0,1},{2,0,2,0},{1,2,1,2}};

    private final int X=100;
    private final int Y=60;

    private final int MW=70;
    private final int MH=40;

    public GameMap() {
        blue = new MovingBitmap(R.drawable.blue);
        green = new MovingBitmap(R.drawable.green);
    }
    public void release(){
        blue.release();
        blue=null;
        green.release();
        green=null;
    }

    public void move() {
    }

    public void show() {
        for(int i = 0;i<5;i++){
            for(int j=0;j<4;j++){
                switch (map[i][j]){
                    case 0:
                        break;
                    case 1:
                        blue.setLocation(X+(MW*j),Y+(MH*i));
                        blue.show();
                        break;
                    case 2:
                        green.setLocation(X+(MW*j),Y+(MH*i));
                        green.show();
                        break;
                    default:
                        break;
                }
            }
        }
    }

}

