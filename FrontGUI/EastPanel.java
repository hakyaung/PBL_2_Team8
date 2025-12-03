package FrontGUI;

import javax.swing.*;
import java.awt.*;
/**
 * EastPanel 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class EastPanel extends JPanel
{
    private JTextArea logTA;
    
    public EastPanel(){
        this.setLayout(new GridLayout(1,1));
        
        logTA = new JTextArea("[출력화면]\n");
        logTA.setEditable(false);
        
        JScrollPane logSP = new JScrollPane(logTA);
        
        this.add(logSP);
    }
}