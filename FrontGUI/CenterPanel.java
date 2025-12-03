package FrontGUI;

import javax.swing.*;
import java.awt.*;
/**
 * CenterPanel 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class CenterPanel extends JPanel
{
    private JTextField loanBookTF;
    private JTextField loanBorrowerTF;
    private JTextField returnBookTF;
    
    private JRadioButton loanRB;
    private JRadioButton returnRB;
    private JButton submitBT;
    
    private JButton displayForLoanBT;
    private JButton displayOnLoanBT;
    
    public CenterPanel(){
        this.setLayout(new GridLayout(9,2,10,10));
        //this.setBackground(Color.CYAN);
        
        JLabel loansetTitleLB = new JLabel("대출");
        JLabel blank1 = new JLabel("");
        JLabel loanBookLB = new JLabel("책 고유번호");
        loanBookTF = new JTextField(20);
        JLabel loanBorrowerLB = new JLabel("이용자 고유번호");
        loanBorrowerTF = new JTextField(20);
        
        JLabel returnsetTitleLB = new JLabel("반납");
        JLabel blank2 = new JLabel("");
        JLabel returnBookLB = new JLabel("책 고유번호");
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
    }
}