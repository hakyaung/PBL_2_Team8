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
    private JTextArea logTA;
    
    public MyFrame(){
        this.setTitle("과제#2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,500);
        this.setLayout(new GridLayout(1,3));
        
        logTA = new JTextArea("[출력 화면]\n");
        logTA.setEditable(false);
        
        JScrollPane logSP = new JScrollPane(logTA);
        
        WestPanel westP = new WestPanel(logTA);
        CenterPanel centerP = new CenterPanel(logTA);
        //EastPanel eastP = new EastPanel();
        
        this.add(westP);
        this.add(centerP);
        this.add(logSP);
        
        this.setVisible(true);
    }
}