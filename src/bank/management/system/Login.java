package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField;
    JButton button_login , button_clear, button_new_login;

    Login(){
        super("Gerenciamento Bancario");
        ImageIcon image_banco = new ImageIcon(ClassLoader.getSystemResource("icon/bancoImage.png"));
        Image image_banco_size = image_banco.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon image_banco_icon= new ImageIcon(image_banco_size);
        JLabel image_banco_ok = new JLabel(image_banco_icon);
        image_banco_ok.setBounds(350, 10, 100,100);
        add(image_banco_ok);

        ImageIcon image_creditCards = new ImageIcon(ClassLoader.getSystemResource("icon/handsCreditCards.png"));
        Image image_creditCards_size = image_creditCards.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon image_creditCards_icon= new ImageIcon(image_creditCards_size);
        JLabel image_creditCards_ok = new JLabel(image_creditCards_icon);
        image_creditCards_ok.setBounds(630, 320, 100,100);
        add(image_creditCards_ok);

        label1 = new JLabel("Bem-Vindo ao Banco");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(230, 125, 450, 40);
        add(label1);

        label2 = new JLabel("NUMERO:");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325, 190, 230, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);

        label3 = new JLabel("SENHA: ");
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150, 250, 375, 30);
        add(label3);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(325, 250, 230, 30);
        passwordField.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField);

        button_login = new JButton("ENTRAR");
        button_login.setFont(new Font("Arial", Font.BOLD, 14));
        button_login.setForeground(Color.WHITE);
        button_login.setBackground(Color.BLACK);
        button_login.setBounds(324, 300, 100, 30);
        button_login.addActionListener(this);
        add(button_login);

        button_clear = new JButton("LIMPAR");
        button_clear.setFont(new Font("Arial", Font.BOLD, 14));
        button_clear.setForeground(Color.WHITE);
        button_clear.setBackground(Color.BLACK);
        button_clear.setBounds(457, 300, 100, 30);
        button_clear.addActionListener(this);
        add(button_clear);

        button_new_login = new JButton("CRIAR");
        button_new_login.setFont(new Font("Arial", Font.BOLD, 14));
        button_new_login.setForeground(Color.WHITE);
        button_new_login.setBackground(Color.BLACK);
        button_new_login.setBounds(324, 350, 234, 30);
        button_new_login.addActionListener(this);
        add(button_new_login);

        ImageIcon image_banco_back = new ImageIcon(ClassLoader.getSystemResource("icon/fundoBank.jpg"));
        Image image_banco_back_size = image_banco_back.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon image_banco_back_icon= new ImageIcon(image_banco_back_size);
        JLabel image_banco_back_ok = new JLabel(image_banco_back_icon);
        image_banco_back_ok.setBounds(0, 0, 850,480);
        add(image_banco_back_ok);

        setLayout(null);
        setSize(850, 450);
        setLocation(450, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource() == button_login){

            }
            else if(e.getSource() == button_clear){
                textField2.setText("");
                passwordField.setText("");
            }
            else if (e.getSource() == button_new_login){

            }
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
