package gym_management_system;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class Home_Page extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    Font f,f1,f2;
    JPanel p1;
    Home_Page() {
        super("Home Page");
        setSize(1600, 900);
        setLocation(0, 0);
        f = new Font("Lavenda", Font.BOLD, 19);
        f2 = new Font("Lavenda", Font.BOLD, 35);
        f1 = new Font("Lavenda", Font.BOLD, 18);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("gym_management_system/Icons/home.jpg"));
        Image img = ic.getImage().getScaledInstance(1600, 900, Image.SCALE_DEFAULT);
        ImageIcon ic1 = new ImageIcon(img);
        l1 = new JLabel(ic1);

        JMenuBar m1 = new JMenuBar();
        JMenu men1 = new JMenu("Enroll");
    
        JMenuItem ment2 = new JMenuItem("Add Customer");
        ImageIcon ic4 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img3 = ic4.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment2.setIcon(new ImageIcon(img3));
        ment2.setMnemonic('C');
        ment2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));

        JMenu men3 = new JMenu("Personal Information");
        JMenuItem ment6 = new JMenuItem("Customer Information");
        ImageIcon ic8 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img7 = ic8.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment6.setIcon(new ImageIcon(img7));
        ment6.setMnemonic('S');
        ment6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        JMenu men4 = new JMenu("Update Information");
        JMenuItem ment8 = new JMenuItem("Update Customer");
        ImageIcon ic10 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img9 = ic10.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment8.setIcon(new ImageIcon(img9));
        ment8.setMnemonic('M');
        ment8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));

        JMenu men7 = new JMenu("Exit");
        JMenuItem ment13 = new JMenuItem("Exit");
        ImageIcon ic15 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img14 = ic15.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment13.setIcon(new ImageIcon(img14));
        ment13.setMnemonic('X');
        ment13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        men1.add(ment2);
        men3.add(ment6);
        men4.add(ment8);
        men7.add(ment13);
        m1.add(men1);
        m1.add(men3);
        m1.add(men4);
        m1.add(men7);
        men1.setFont(f);
        men3.setFont(f);
        men4.setFont(f);
        men7.setFont(f);
        ment2.setFont(f1);
        ment6.setFont(f1);
        ment8.setFont(f1);
        ment13.setFont(f1);
        m1.setBackground(Color.WHITE);
        men1.setForeground(Color.DARK_GRAY);
        men3.setForeground(Color.DARK_GRAY);
        men4.setForeground(Color.DARK_GRAY);
        men7.setForeground(Color.RED);
        ment2.setBackground(Color.black);
        ment6.setBackground(Color.black);
        ment8.setBackground(Color.black);
        ment13.setBackground(Color.black);
        ment2.setForeground(Color.DARK_GRAY);
        ment6.setForeground(Color.DARK_GRAY);
        ment8.setForeground(Color.DARK_GRAY);
        ment13.setForeground(Color.RED);
        ment2.addActionListener(this);
        ment6.addActionListener(this);
        ment8.addActionListener(this);
        ment13.addActionListener(this);
        setJMenuBar(m1);
        add(l1);
    }
    public void actionPerformed(ActionEvent e) {
        String comnd = e.getActionCommand();
      if (comnd.equals("Add Customer")) 
       {
            new Add_Customer().setVisible(true);
        } 
      else if (comnd.equals("Customer Information")) {
            new Customer_Information().setVisible(true);
        } 
      else if (comnd.equals("Update Customer")) {
            new Update_Customer().setVisible(true);
        }
    else if(comnd.equals("Exit")) {
            System.exit(0);
      }
    }
    public static void main(String[] args)
    {
        new Home_Page().setVisible(true);
    }
}
