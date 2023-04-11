package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignUp extends JFrame {
    String[] estado_civil = {"Solteiro", "Casado", "Divorciado", "Viúvo"};
    String[] estado = {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"};
    Random rand = new Random();
    long first4 = (rand.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);
    JTextField textName, textFname, textEmail, textAddress, textCity, textCodigoPostal;
    JDateChooser dateChooser;
    JRadioButton radioMale, radioFemale;
    JComboBox comboBox_estado_civil, comboBox_estado;

    SignUp(){
        super("Formulario de Cadastro");
        ImageIcon image_banco = new ImageIcon(ClassLoader.getSystemResource("icon/bancoImage.png"));
        Image image_banco_size = image_banco.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon image_banco_icon= new ImageIcon(image_banco_size);
        JLabel image_banco_ok = new JLabel(image_banco_icon);
        image_banco_ok.setBounds(25, 10, 100,100);
        add(image_banco_ok);

        JLabel label_forn_main = new JLabel("Formulario de Cadastro NO." + first);
        label_forn_main.setBounds(160, 20, 600, 40);
        label_forn_main.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label_forn_main);

        JLabel label_page = new JLabel("Página 1");
        label_page.setFont(new Font("Raleway", Font.BOLD, 22));
        label_page.setBounds(330, 70, 600, 30);
        add(label_page);

        JLabel label_details = new JLabel("Detalhes Pessoais");
        label_details.setFont(new Font("Raleway", Font.BOLD, 22));
        label_details.setBounds(290, 120, 600, 30);
        add(label_details);

        JLabel label_name = new JLabel("Nome:");
        label_name.setFont(new Font("Raleway", Font.BOLD, 20));
        label_name.setBounds(100, 190, 100, 30);
        add(label_name);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel label_fname = new JLabel("Nome do Pai:");
        label_fname.setFont(new Font("Raleway", Font.BOLD, 20));
        label_fname.setBounds(100, 240, 200, 30);
        add(label_fname);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 240, 400, 30);
        add(textFname);

        JLabel label_aniversario= new JLabel("Data de Aniversário:");
        label_aniversario.setFont(new Font("Raleway", Font.BOLD, 20));
        label_aniversario.setBounds(100, 340, 200, 30);
        add(label_aniversario);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        JLabel Label_genero = new JLabel("Gênero:");
        Label_genero.setFont(new Font("Raleway", Font.BOLD, 20));
        Label_genero.setBounds(100, 290, 200, 30);
        add(Label_genero);

        radioMale = new JRadioButton("Masculino");
        radioMale.setFont(new Font("Raleway", Font.BOLD, 14));
        radioMale.setBackground(new Color(222, 255, 228));
        radioMale.setBounds(300, 290, 100, 30);
        add(radioMale);

        radioFemale = new JRadioButton("Feminino");
        radioFemale.setFont(new Font("Raleway", Font.BOLD, 14));
        radioFemale.setBackground(new Color(222, 255, 228));
        radioFemale.setBounds(450, 290, 90, 30);
        add(radioFemale);

        ButtonGroup buttonGroup_genero = new ButtonGroup();
        buttonGroup_genero.add(radioMale);
        buttonGroup_genero.add(radioFemale);

        JLabel label_email = new JLabel("Email:");
        label_email.setFont(new Font("Raleway", Font.BOLD, 20));
        label_email.setBounds(100, 390, 200, 30);
        add(label_email);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel label_estado_civil = new JLabel("Estado Civil:");
        label_estado_civil.setFont(new Font("Raleway", Font.BOLD, 20));
        label_estado_civil.setBounds(100, 440, 200, 30);
        add(label_estado_civil);

        comboBox_estado_civil = new JComboBox(estado_civil);
        comboBox_estado_civil.setBackground(Color.WHITE);
        comboBox_estado_civil.setBounds(300, 440, 400, 30);
        add(comboBox_estado_civil);

        JLabel label_endereco = new JLabel("Endereço:");
        label_endereco.setFont(new Font("Raleway", Font.BOLD, 20));
        label_endereco.setBounds(100, 490, 200, 30);
        add(label_endereco);

        textAddress = new JTextField();
        textAddress.setFont(new Font("Raleway", Font.BOLD, 14));
        textAddress.setBounds(300, 490, 400, 30);
        add(textAddress);

        JLabel label_cidade = new JLabel("Cidade:");
        label_cidade.setFont(new Font("Raleway", Font.BOLD, 20));
        label_cidade.setBounds(100, 540, 200, 30);
        add(label_cidade);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        add(textCity);

        JLabel label_codigo_postal = new JLabel("Código Postal:");
        label_codigo_postal.setFont(new Font("Raleway", Font.BOLD, 20));
        label_codigo_postal.setBounds(100, 590, 200, 30);
        add(label_codigo_postal);

        textCodigoPostal = new JTextField();
        textCodigoPostal.setFont(new Font("Raleway", Font.BOLD, 14));
        textCodigoPostal.setBounds(300, 590, 400, 30);
        add(textCodigoPostal);

        JLabel label_estado = new JLabel("Estado:");
        label_estado.setFont(new Font("Raleway", Font.BOLD, 20));
        label_estado.setBounds(100, 640, 200, 30);
        add(label_estado);

        comboBox_estado = new JComboBox(estado);
        comboBox_estado.setBackground(Color.WHITE);
        comboBox_estado.setBounds(300, 640, 400, 30);
        add(comboBox_estado);









        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(900, 800);
        setLocation(460, 40);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
