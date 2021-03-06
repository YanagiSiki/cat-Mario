package tw.edu.ntut.csie.game.state;

import tw.edu.ntut.csie.game.GameObject;
import tw.edu.ntut.csie.game.R;
import tw.edu.ntut.csie.game.core.MovingBitmap;

/**
 * Created by gmai on 2015/3/12.
 */
public class Practice implements GameObject{
    private MovingBitmap mPractice;
    private int px,py;
    public Practice() {
        mPractice = new MovingBitmap(R.drawable.ntut_csie);
        px=250;
        py=50;
    }

    public void initialize(){
        mPractice.setLocation(px,py);
    }

    public void release(){
        mPractice.release();
        mPractice=null;
    }

    public void move() {
        if(px <350){
            px+=5;
        }else {
            py+=5;
        }
        mPractice.setLocation(px,py);
    }
    public void show() {
        mPractice.show();
    }

}


