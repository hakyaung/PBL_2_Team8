package FrontGUI;

import CoreEngine.*;
import javax.swing.*;
import java.awt.*;
/**
 * MyFrame 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (2025.12.04)
 */
public class MyFrame extends JFrame
{
    LibraryApplication la;
    private JTextArea logTA;
    
    public MyFrame(){
        this.setTitle("과제#2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,500);
        this.setLayout(new GridLayout(1,3));
        
        la = new LibraryApplication();
        
        logTA = new JTextArea("[출력화면]\n");
        logTA.setEditable(false);
        
        JScrollPane logSP = new JScrollPane(logTA);
        
        WestPanel westP = new WestPanel(logTA, la);
        CenterPanel centerP = new CenterPanel(logTA, la);
        //EastPanel eastP = new EastPanel();
        
        this.add(westP);
        this.add(logSP);
        this.add(centerP);
        
        
        this.setVisible(true);
    }
}