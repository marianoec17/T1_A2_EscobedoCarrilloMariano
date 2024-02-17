import javax.swing.*;

class Formulario extends JFrame {
	
	public Formulario() {
		 getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,600);
        setLocationRelativeTo(null);
        setVisible(true);
        
        JLabel txt1=new JLabel();
        txt1.setText("The Classic Form includes all visible fields for this list");
        txt1.setBounds(10,10, 330,15);
        //txt1.setBounds(y,x, ancho,alto);
        add(txt1);
        JLabel txt2=new JLabel();
        txt2.setText("Form option");
        txt2.setBounds(10,30, 100,15);
        //txt1.setBounds(x,y, ancho,alto);
        add(txt2);
        JLabel txt3=new JLabel();
        txt3.setText("Include the following");
        txt3.setBounds(10,50, 120,15);
        add(txt3);
    
		JCheckBox check1 = new JCheckBox("a title for your form");
		check1.setBounds(10,70, 180, 20);
		add(check1);
		
		JTextField caja1= new JTextField(10);
        caja1.setBounds(10,100, 120, 15);
		add(caja1);

		JRadioButton radio1=new JRadioButton("only required fields");
		radio1.setBounds(10,120, 150, 15);
		add(radio1);
		
		JRadioButton radio2=new JRadioButton("all fields");
		radio2.setBounds(10,140, 100, 15);
		add(radio2);
		
		JLabel txt4=new JLabel();
        txt4.setText("(edit required fields in the form builder)");
        txt4.setBounds(10,160, 330,15);
        add(txt4);
		
        JCheckBox check2 = new JCheckBox("required group fields");
		check2.setBounds(10,200, 180, 20);
		add(check2);
		JCheckBox check3 = new JCheckBox("required field indicators");
		check3.setBounds(10,220, 180, 20);
		add(check3);
		
		JLabel txt5=new JLabel();
        txt5.setText("set form whidth");
        txt5.setBounds(10,250, 330,15);
		add(txt5);
		
		JTextField caja2= new JTextField(10);
        caja2.setBounds(10,265, 120, 15);
		add(caja2);
		
		JLabel txt6=new JLabel();
        txt6.setText("enlaces your forms");
        txt6.setBounds(10,320, 330,15);
		add(txt6);
		
		JCheckBox check4 = new JCheckBox("enable evil popup");
		check4.setBounds(10,330, 180, 20);
		add(check4);
		
		JCheckBox check5 = new JCheckBox("disable all JavaScript");
		check5.setBounds(10,350, 180, 20);
		add(check5);
		
		JCheckBox check6 = new JCheckBox("include archive link");
		check6.setBounds(10,370, 180, 20);
		add(check6);
		
		JCheckBox check7 = new JCheckBox("include");
		check7.setBounds(10,390, 180, 20);
		add(check7);
		
		JLabel txtTexto14 = new JLabel("Preview");
		txtTexto14.setBounds(400, 10, 380, 20);
		add(txtTexto14);
		
		JTextArea area =new JTextArea(20, 20);
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setBounds(300, 300, 100, 100);
        JScrollPane scroll= new JScrollPane(area);
        scroll.setBounds(250,300, 430, 200);
		add(scroll);
		//add(area);
	
		JPanel panel = new JPanel();
		panel.setLayout(null); 
		panel.setBounds(250, 50, 100, 100);
		JScrollPane scrollPanel = new JScrollPane(panel);
		scrollPanel.setBounds(250, 50, 430, 200);
		scrollPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPanel);
		
		JLabel txtTexto15 = new JLabel("Email Address ");
		txtTexto15.setBounds(15, 10, 100, 20);
		panel.add(txtTexto15);
		JFormattedTextField Caja3 = new JFormattedTextField("@email  ");
		Caja3.setBounds(15,30, 390,20);
		panel.add(Caja3);
		
		JLabel txtTexto16 = new JLabel("First Name ");
		txtTexto16.setBounds(15, 60, 100, 20);
		panel.add(txtTexto16);
		JTextField Caja4= new JTextField(10);
		Caja4.setBounds(15, 80, 390, 20);
		panel.add(Caja4);
		JLabel txtTexto17 = new JLabel("Last Name ");
		txtTexto17.setBounds(15, 110, 100, 20);
		panel.add(txtTexto17);
		JTextField Caja5= new JTextField(10);
		Caja5.setBounds(15, 130, 390, 20);
		panel.add(Caja5);
		
		JButton btn= new JButton();
		btn.setBounds(15, 170, 80, 20);
		ImageIcon icon=new ImageIcon("C:\\Users\\Mariano\\Desktop\\Mariano\\tec_jerez\\4to\\Topicos\\imagenes\\suscr.png");
		btn.setIcon(icon);
		panel.add(btn);

		
		 JLabel txt18=new JLabel();
	        txt18.setText("Copy/paste onto your site");
	        txt18.setBounds(250,280, 200,15);
	        add(txt18);
	}

}


public class FormularioDeRegistro {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
 new Formulario();
	}
});

	}

}
