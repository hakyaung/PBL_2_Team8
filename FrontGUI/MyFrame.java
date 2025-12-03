package FrontGUI;

import javax.swing.*;
import java.awt.*;
/**
 * MyFrame 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class MyFrame extends JFrame
{
    public MyFrame(){
        this.setTitle("과제#2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,500);
        this.setLayout(new GridLayout(1,3));
        
        WestPanel westP = new WestPanel();
        CenterPanel centerP = new CenterPanel();
        EastPanel eastP = new EastPanel();
        
        this.add(westP);
        this.add(centerP);
        this.add(eastP);
        
        this.setVisible(true);
    }
}