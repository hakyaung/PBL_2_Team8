package FrontGUI;

import CoreEngine.*;
import javax.swing.*;
import java.awt.*;
/**
 * MyFrame 클래스는 도서관리시스템의 모든 GUI를 부착한 최상위 클래스 입니다.
 *
 * @author (유준석, 김민겸, 정하경)
 * @version (2025.12.08)
 */
public class MyFrame extends JFrame
{
    LibraryApplication la;
    private JTextArea logTA;
    
    public MyFrame(){
        this.setTitle("도서관 관리 시스템 -8팀");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setLayout(new GridLayout(1,3));
        
        la = new LibraryApplication();
        
        logTA = new JTextArea("[출력화면]\n", 15, 10);
        logTA.setEditable(false);
        
        JScrollPane logSP = new JScrollPane(logTA);
        
        WestPanel westP = new WestPanel(logTA, la);
        EastPanel eastP = new EastPanel(logTA, la);
        
        this.add(westP);
        this.add(logSP);
        this.add(eastP);
        
        this.setVisible(true);
    }
}