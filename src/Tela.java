import javax.swing.*;


public class Tela extends JFrame implents ActionListener {
	private JLabel lblTexto;
	private JTextField txtValor;
	private JButton btnOk;
	
	public Tela (String nome) {
		super (nome);
		this.setBounds(100,100,400,300);
		this.setVisible(true);
		
		this.lblTexto = new JLabel ("Interface Graficla");
		this.lblTexto.setBounds(100,100,200,30);
		super.getContentPane().add(this.lblTexto);
		
		this.txtValor = new JTextField();
		this.txtValor.setBounds(100,140,150,20);
		super.getRootPane().add(this.txtValor);
		
		this.btnOk = new JButton("0k");
		this.btnOk.setBounds(100,170,100,30);
		this.btnOk.addActionListener(this);
		
		//
		super.getContentPane().add(this.btnOk);
		

		// Eventos em Java
		public void actionPerformed(ActionEvent e){
			
		};
		
	}

}
