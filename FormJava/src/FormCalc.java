import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormCalc extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField email;
	private JTextField idade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCalc frame = new FormCalc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(43, 52, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(43, 107, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Idade");
		lblNewLabel_2.setBounds(43, 150, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		nome = new JTextField();
		nome.setBounds(98, 49, 176, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		email = new JTextField();
		email.setBounds(98, 104, 176, 20);
		contentPane.add(email);
		email.setColumns(10);
		
		idade = new JTextField();
		idade.setBounds(99, 147, 40, 20);
		contentPane.add(idade);
		idade.setColumns(10);
		
		JButton botao = new JButton("Processar");
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botao.setBounds(98, 205, 89, 23);
		contentPane.add(botao);
	}
}
