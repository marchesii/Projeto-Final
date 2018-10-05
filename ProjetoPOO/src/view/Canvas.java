package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas extends JPanel{
	
	BufferedImage imagem;
	
	public Canvas() {
		try {
			this.imagem = ImageIO.read(new File("C:/Users/andre/OneDrive/Documentos/GitHub/Projeto-Final/ProjetoPOO/src/venda.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("Qualquer coisa");
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(imagem, 0,0,null);
	}
}
