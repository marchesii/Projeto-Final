package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;

public class ViewClientes {

	private JFrame frmCadastroDeCliente;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewClientes window = new ViewClientes();
					window.frmCadastroDeCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDeCliente = new JFrame();
		frmCadastroDeCliente.setTitle("Cadastro de Cliente");
		frmCadastroDeCliente.setBounds(100, 100, 539, 494);
		frmCadastroDeCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDeCliente.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(52, 48, 220, 20);
		frmCadastroDeCliente.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(79, 73, 193, 20);
		frmCadastroDeCliente.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(52, 98, 220, 20);
		frmCadastroDeCliente.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(62, 123, 210, 20);
		frmCadastroDeCliente.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 51, 32, 14);
		frmCadastroDeCliente.getContentPane().add(lblNome);
		
		JLabel lblNewLabel = new JLabel("Sobrenome:");
		lblNewLabel.setBounds(10, 76, 59, 14);
		frmCadastroDeCliente.getContentPane().add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 101, 35, 14);
		frmCadastroDeCliente.getContentPane().add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 126, 48, 14);
		frmCadastroDeCliente.getContentPane().add(lblTelefone);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
		lblDataDeNascimento.setBounds(10, 151, 101, 14);
		frmCadastroDeCliente.getContentPane().add(lblDataDeNascimento);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setBounds(10, 238, 48, 14);
		frmCadastroDeCliente.getContentPane().add(lblRua);
		
		JLabel lblN = new JLabel("N:");
		lblN.setBounds(376, 183, 18, 14);
		frmCadastroDeCliente.getContentPane().add(lblN);
		
		JLabel lblNewLabel_1 = new JLabel("Bairro:");
		lblNewLabel_1.setBounds(10, 208, 36, 14);
		frmCadastroDeCliente.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Complemento:");
		lblNewLabel_2.setBounds(33, 285, 72, 14);
		frmCadastroDeCliente.getContentPane().add(lblNewLabel_2);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(33, 310, 72, 14);
		frmCadastroDeCliente.getContentPane().add(lblComplemento);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 183, 48, 14);
		frmCadastroDeCliente.getContentPane().add(lblCidade);
	}
}
