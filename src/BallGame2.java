import sun.security.util.DerEncoder;

import javax.swing.*;
import java.awt.*;

/**
 * @author ujiuye_guo
 * @date 2019 12 23 10:49
 */


    public class BallGame2 extends JFrame {
        Image ball = Toolkit.getDefaultToolkit().getImage("img/Ball.png");
        Image desk = Toolkit.getDefaultToolkit().getImage("img/desk.jpg");

        double x = 100;//小球的横坐标
        double y = 100;//小球的纵坐标
        double degree = 3.14/3; // 弧度：此处是60度
        public void paint(Graphics g){
            System.out.println("图片被画了一次");
            //涉及图片加载的懒加载问题
            g.drawImage(desk,0,0,null);
            g.drawImage(ball,(int) x,(int) y,null);
            // g.drawImage(desk,0,0,null);
            x = x+ 10*Math.cos(degree);
            y = y+ 10*Math.sin(degree);
            if(y>500-40-30||y<40+40){
                degree = -degree;
            }
            if(x>856-40-30||x<40){
                degree = 3.14-degree;
            }
        }
        void launchFrame(){
            setSize(856,500);
            setLocation(50,50);
            setVisible(true);


            while (true){
                repaint();
                try {
                    Thread.sleep(40);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }

        public static void main(String[] args) {
            System.out.println("我是优就业的一员");
            BallGame2 ballGame = new BallGame2();
            ballGame.launchFrame();

        }

    }


