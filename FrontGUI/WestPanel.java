package FrontGUI;

import CoreEngine.*;
import javax.swing.*;
import java.awt.*;
/**
 * WestPanel 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class WestPanel extends JPanel
{
    public JTextField borrowerNameTF;
    public JTextField borrowerEmailTF;
    public JTextField borrowerUniqueNumberTF;
    public JButton borrowerBT;
    
    public JTextField bookTitleTF;
    public JTextField bookAuthorTF;
    public JTextField bookUniqueNumberTF;
    public JButton bookBT;
    
    LibraryApplication la;
    
    public WestPanel(JTextArea logTA, LibraryApplication la){
        this.setLayout(new GridLayout(10,2,10,10));
        //this.setBackground(Color.GREEN);
        this.la = la;
        
        JLabel borrowersetTitleLB = new JLabel("                  이용자 등록");
        JLabel blank1 = new JLabel("");
        JLabel borrowerNameLB = new JLabel("                  이용자 이름");
        borrowerNameTF = new JTextField(20);
        JLabel borrowerEmailLB = new JLabel("                  이용자 이메일");
        borrowerEmailTF = new JTextField(20);
        JLabel borrowerUniqueNumberLB = new JLabel("                  이용자 고유번호");
        borrowerUniqueNumberTF = new JTextField(20);
        JLabel blank2 = new JLabel("");
        borrowerBT = new JButton("이용자 등록하기");
        
        JLabel booksetTitleLB = new JLabel("                  책 등록");
        JLabel blank3 = new JLabel("");
        JLabel bookTitleLB = new JLabel("                  책 이름");
        bookTitleTF = new JTextField(20);
        JLabel bookAuthorLB = new JLabel("                  책 저자");
        bookAuthorTF = new JTextField(20);
        JLabel bookUniqueNumberLB = new JLabel("                  책 고유번호");
        bookUniqueNumberTF = new JTextField(20);
        JLabel blank4 = new JLabel("");
        bookBT = new JButton("책 등록하기");
        
        this.add(borrowersetTitleLB);
        this.add(blank1);
        this.add(borrowerNameLB);
        this.add(borrowerNameTF);
        this.add(borrowerEmailLB);
        this.add(borrowerEmailTF);
        this.add(borrowerUniqueNumberLB);
        this.add(borrowerUniqueNumberTF);
        this.add(blank2);
        this.add(borrowerBT);
        
        this.add(booksetTitleLB);
        this.add(blank3);
        this.add(bookTitleLB);
        this.add(bookTitleTF);
        this.add(bookAuthorLB);
        this.add(bookAuthorTF);
        this.add(bookUniqueNumberLB);
        this.add(bookUniqueNumberTF);
        this.add(blank4);
        this.add(bookBT);
        
        borrowerBT.addActionListener(new MainListener(logTA,this, la));
        bookBT.addActionListener(new MainListener(logTA,this, la));
    }
}