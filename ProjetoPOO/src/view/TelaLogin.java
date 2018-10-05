package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JComponent;

public class TelaLogin extends JFrame implements ActionListener{
	Canvas canvas;
	/*Components*/
	/*Panels*/
	private JPanel panelExterno;
	private JPanel panelImagem;	
	private JPanel panelCampos;
	/*Panels*/
	/*Panel Campos*/
	private JLabel labelConta;
	private JLabel labelSenha;
	
	private JTextField fieldConta;
	private JTextField fieldSenha;
	
	private JButton btnEntrar;
	private JButton btnCadastrar;
	/*Panel Campos*/
	
	/*Panel Imagem*/
	/*Panel Imagem*/
	
	/*Components*/
	
    private GridBagLayout layout;//contrele de componentes
    private GridBagConstraints constraints;//armazena valores/informaçoes de posicionamento
	
	private static TelaLogin uniqueInstance;
	
	 /**
	  * Padrao Singleton para telas
	  * @return
	  */
	public static synchronized TelaLogin getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new TelaLogin();
		}
		return uniqueInstance;
	}
	
    public TelaLogin(){
        criarComponentes();
        ajustarJanela();
    }

	
	private void criarComponentes() {
        layout = new GridBagLayout();
        constraints = new GridBagConstraints();
        
        canvas = new Canvas();
		
        setLayout(layout);
        
        Border border;
        border = BorderFactory.createEtchedBorder();
        
		panelExterno = new JPanel(layout);
        //panelExterno.setBorder(border);
		panelImagem = new JPanel(layout);
		panelImagem.setBorder(border);
		this.panelImagem.add(canvas);
		panelImagem.setSize(400,400);
		
        //panelImagem.setBorder(border);
		panelCampos = new JPanel(layout);
        //panelCampos.setBorder(border);
		
		labelConta = new JLabel("Conta: ");
		labelSenha = new JLabel("Senha: ");
		
		fieldConta = new JTextField(15);
		fieldSenha = new JTextField(15);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(this);
		btnEntrar.setBackground(Color.GREEN);
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(this);
		btnCadastrar.setBackground(Color.GREEN);
		
		addComponentes(panelCampos,labelConta,0,0,GridBagConstraints.CENTER,1,1,GridBagConstraints.BOTH);
		addComponentes(panelCampos,fieldConta,0,1,GridBagConstraints.CENTER,1,1,GridBagConstraints.BOTH);
		addComponentes(panelCampos,labelSenha,1,0,GridBagConstraints.CENTER,1,1,GridBagConstraints.BOTH);
		addComponentes(panelCampos,fieldSenha,1,1,GridBagConstraints.CENTER,1,1,GridBagConstraints.BOTH);
		addComponentes(panelCampos,btnEntrar,2,0,GridBagConstraints.CENTER,1,1,GridBagConstraints.BOTH);
		addComponentes(panelCampos,btnCadastrar,2,1,GridBagConstraints.CENTER,1,1,GridBagConstraints.BOTH);
		
        addComponentes(panelExterno, panelImagem, 0, 0, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH);
        addComponentes(panelExterno, panelCampos, 0, 1, GridBagConstraints.CENTER, 1, 1, GridBagConstraints.BOTH);
        
        addComponentes(this, panelExterno, 0, 0, GridBagConstraints.CENTER, 0, 0, GridBagConstraints.BOTH);
		
	}
	
	private void addComponentes(Container container,JComponent component,int linha,int coluna,int posicao, int altura, int largura, int preenche){
	        
		constraints.gridy = linha;
	    constraints.gridx = coluna;
	    constraints.anchor = posicao;
	        
	    constraints.gridwidth = largura;
	    constraints.gridheight = altura;   
	        
	    constraints.fill = preenche;
	        
	    constraints.insets = new Insets(10, 10, 10, 10);
	        
	    constraints.weightx = 1;
	    constraints.weighty = 1;
	        
	    component.setFont(new Font("Arial",Font.PLAIN,20));
	        
	    layout.setConstraints(component, constraints);
	    container.add(component);
	}
	 
	private void ajustarJanela(){
		setVisible(true);
	    pack();//Coloca td no pacote 
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
