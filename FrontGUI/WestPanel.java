package FrontGUI;

import CoreEngine.*;
import javax.swing.*;
import java.awt.*;
/**
 * WestPanel 클래스는 도서관리시스템 GUI의 왼쪽 패널을 구성하며 이용자 및 책등록 GUI를 구현한 클래스입니다.
 *
 * @author (유준석, 김민겸, 정하경)
 * @version (2025.12.08)
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
        
        JLabel borrowersetTitleLB = new JLabel("이용자 등록");
        JLabel blank1 = new JLabel("");
        JLabel borrowerNameLB = new JLabel("이용자 이름");
        borrowerNameLB.setHorizontalAlignment(SwingConstants.CENTER);
        borrowerNameTF = new JTextField(20);
        JLabel borrowerEmailLB = new JLabel("이용자 이메일");
        borrowerEmailLB.setHorizontalAlignment(SwingConstants.CENTER);
        borrowerEmailTF = new JTextField(20);
        JLabel borrowerUniqueNumberLB = new JLabel("이용자 고유번호");
        borrowerUniqueNumberLB.setHorizontalAlignment(SwingConstants.CENTER);
        borrowerUniqueNumberTF = new JTextField(20);
        JLabel blank2 = new JLabel("");
        borrowerBT = new JButton("이용자 등록하기");
        
        JLabel booksetTitleLB = new JLabel("책 등록");
        JLabel blank3 = new JLabel("");
        JLabel bookTitleLB = new JLabel("책 이름");
        bookTitleLB.setHorizontalAlignment(SwingConstants.CENTER);
        bookTitleTF = new JTextField(20);
        JLabel bookAuthorLB = new JLabel("책 저자");
        bookAuthorLB.setHorizontalAlignment(SwingConstants.CENTER);
        bookAuthorTF = new JTextField(20);
        JLabel bookUniqueNumberLB = new JLabel("책 고유번호");
        bookUniqueNumberLB.setHorizontalAlignment(SwingConstants.CENTER);
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