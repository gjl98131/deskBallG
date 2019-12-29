/**
 * @author ujiuye_guo
 * @date 2019 12 23 11:39
 */
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import sun.awt.image.ToolkitImage;

import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame {
    Image ball = Toolkit.getDefaultToolkit().getImage("img/Ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("img/desk.jpg");
    double x= 100;
    double y =100;
    boolean right = true;
    //绘制窗口中图片的方法
    public void paint(Graphics g){

        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int) y,null);


        if(right){
            x=x+10;
        }else{
            x= x-10;
        }
        if (x>856-40-30){
         right=false;
        }
        if(x<40){
            right = true;
        }
    }
    void winJ(){
        setSize(856,500); //设置窗口的宽高
        setLocation(50,50);//设置窗口所在的位置
        setVisible(true);//是否开启窗口


        while (true){
            repaint();
            try {
                Thread.sleep(40);
            }catch (Exception e ){
             e.printStackTrace();
            }

        }
    }


    public static void main(String[] args) {
        //程序的入口
        BallGame ballGame = new BallGame();
        ballGame.winJ();
        System.out.println("ujiuye");
    }


}
