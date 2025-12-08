package FrontGUI;

import CoreEngine.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * CenterPanel 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class EastPanel extends JPanel implements ItemListener
{
    public JTextField loanBookTF;
    public JTextField loanBorrowerTF;
    public JTextField returnBookTF;
    public JTextField getUniqueNumberTF;
    
    public JRadioButton loanRB;
    public JRadioButton returnRB;
    public JButton submitBT;
    
    public JButton displayForLoanBT;
    public JButton displayOnLoanBT;
    
    public JButton startupFileReadBT;
    public JButton saveFileWriteBT;
    
    public JButton getUniqueNumberBT;
    
    int radioState;
    
    LibraryApplication la;
    
    public EastPanel(JTextArea logTA, LibraryApplication la){
        this.setLayout(new GridLayout(12,2,10,10));
        //this.setBackground(Color.CYAN);
        
        this.la = la;
        
        JLabel loansetTitleLB = new JLabel("대출");
        JLabel blank1 = new JLabel("");
        JLabel loanBookLB = new JLabel("책 고유번호");
        loanBookLB.setHorizontalAlignment(SwingConstants.CENTER);
        loanBookTF = new JTextField(20);
        JLabel loanBorrowerLB = new JLabel("이용자 고유번호");
        loanBorrowerLB.setHorizontalAlignment(SwingConstants.CENTER);
        loanBorrowerTF = new JTextField(20);
        
        JLabel returnsetTitleLB = new JLabel("반납");
        JLabel blank2 = new JLabel("");
        JLabel returnBookLB = new JLabel("책 고유번호");
        returnBookLB.setHorizontalAlignment(SwingConstants.CENTER);
        returnBookTF = new JTextField(20);
        
        ButtonGroup group = new ButtonGroup();
        
        loanRB = new JRadioButton("대출");
        returnRB = new JRadioButton("반납");
        
        group.add(loanRB);
        group.add(returnRB);
        
        JLabel blank3 = new JLabel("");
        submitBT = new JButton("실행하기");
        
        displayForLoanBT = new JButton("대출 가능한 책 Display");
        displayOnLoanBT = new JButton("대출 중인 책 Display");
        
        startupFileReadBT = new JButton("데이터 불러오기");
        saveFileWriteBT = new JButton("데이터 저장하기");
        
        JLabel getUniqueNumberLB = new JLabel("고유번호 찾기");
        JLabel blank4 = new JLabel("");
        getUniqueNumberTF = new JTextField("이용자 이름 입력",20);
        getUniqueNumberBT = new JButton("고유번호 찾기");
        
        this.add(loansetTitleLB);
        this.add(blank1);
        this.add(loanBookLB);
        this.add(loanBookTF);
        this.add(loanBorrowerLB);
        this.add(loanBorrowerTF);
        
        this.add(returnsetTitleLB);
        this.add(blank2);
        this.add(returnBookLB);
        this.add(returnBookTF);
        
        this.add(loanRB);
        this.add(returnRB);
        this.add(blank3);
        this.add(submitBT);
        
        this.add(displayForLoanBT);
        this.add(displayOnLoanBT);
        
        this.add(startupFileReadBT);
        this.add(saveFileWriteBT);
        
        this.add(getUniqueNumberLB); 
        this.add(blank4);
        this.add(getUniqueNumberTF);
        this.add(getUniqueNumberBT); 
        
        displayForLoanBT.addActionListener(new MainListener(logTA, la));
        displayOnLoanBT.addActionListener(new MainListener(logTA, la));
        
        loanRB.addItemListener(this);
        returnRB.addItemListener(this);
        
        submitBT.addActionListener(new MainListener(logTA, this, la));
        
        startupFileReadBT.addActionListener(new MainListener(logTA, this, la));
        saveFileWriteBT.addActionListener(new MainListener(logTA, this, la));
        getUniqueNumberBT.addActionListener(new MainListener(logTA, this, la));
    }
    
    public void itemStateChanged(ItemEvent e){
        if(e.getStateChange() == ItemEvent.DESELECTED){
            radioState = 0;
            return; // 해제된 경우 그냥 리턴
        }
        if(loanRB.isSelected()){
            radioState = 1;
            //System.out.println("1");
        }else if(returnRB.isSelected()){
            radioState = 2;
            //System.out.println("2");
        }
    }
}