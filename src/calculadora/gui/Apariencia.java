package calculadora.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import calculadora.logica.Convertidor;
import calculadora.logica.Logica;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.DropMode;

public class Apariencia extends JFrame {
	Logica calculadora = new Logica();
	Convertidor C = new Convertidor();
	String operacion = "", pantalla;
	int base = 10;
	private JPanel contentPane;
	private JTextField display;
	private JTextField txtMdbp;


	public Apariencia() {
		setBounds(100, 100, 455, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 436, 423);
		contentPane.setLayout(null);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JButton btn_off = new JButton("OFF");
		btn_off.setBackground(new Color(139, 0, 0));
		btn_off.setForeground(SystemColor.inactiveCaptionBorder);
		btn_off.setFont(new Font("Dialog", Font.BOLD, 12));
		btn_off.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_off.setBounds(10, 118, 60, 50);
		btn_off.setToolTipText("OOF");
		panel.add(btn_off);
		
		display = new JTextField();
		display.setFont(new Font("Tw Cen MT Condensed", Font.BOLD | Font.ITALIC, 34));
		display.setText("0");
		display.setBounds(10, 11, 311, 36);
		display.setColumns(10);
		panel.add(display);
		
		
		JButton btn_encender = new JButton("ON/C");
		btn_encender.setBackground(new Color(255, 255, 0));
		btn_encender.setForeground(new Color(0, 0, 51));
		btn_encender.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn_encender.setBounds(10, 301, 60, 50);
		panel.add(btn_encender);
		
		JButton button_12 = new JButton("t");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_12.setBackground(new Color(72, 61, 139));
		button_12.setForeground(new Color(0, 0, 51));
		button_12.setBounds(10, 240, 60, 50);
		panel.add(button_12);
		
		JButton btn_reiniciar = new JButton("CE");
		btn_reiniciar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_reiniciar.setBackground(new Color(255, 0, 0));
		btn_reiniciar.setForeground(new Color(245, 245, 245));
		btn_reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				display.setText(null);
				
			}
		});
		btn_reiniciar.setBounds(10, 362, 60, 50);
		panel.add(btn_reiniciar);
		
		JButton btn_binario = new JButton("BNR");
		btn_binario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				C.setnumero1(Integer.valueOf(display.getText()));
				base = 2;
				display.setText(C.binario());
				
		}
		});
		btn_binario.setBackground(new Color(210, 105, 30));
		btn_binario.setForeground(new Color(0, 0, 51));
		btn_binario.setBounds(85, 119, 60, 50);
		panel.add(btn_binario);
		
		JButton button_2 = new JButton("OCT");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				C.setnumero1(Integer.valueOf(display.getText()));
				base = 8;
				display.setText(C.octal());
			}
		});
		button_2.setBackground(new Color(210, 105, 30));
		button_2.setForeground(new Color(0, 0, 51));
		button_2.setBounds(157, 119, 60, 50);
		panel.add(button_2);
		
		JButton button_3 = new JButton("HEX");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			C.setnumero1(Integer.valueOf(display.getText()));
			base = 16;
			display.setText(C.hexadecimal());
			}
			
		});
		button_3.setBackground(new Color(210, 105, 30));
		button_3.setForeground(new Color(0, 0, 51));
		button_3.setBounds(227, 119, 60, 50);
		panel.add(button_3);
		
		JButton btn_decimal = new JButton("DEC");
		btn_decimal.setBackground(new Color(210, 105, 30));
		btn_decimal.setForeground(new Color(0, 0, 51));
		btn_decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				C.setnumero1(Integer.valueOf(display.getText()));
				base = 10;
						display.setText(C.decimal());
							}
		});
		btn_decimal.setBounds(297, 119, 60, 50);
		panel.add(btn_decimal);
		
		JButton btn_delete = new JButton("->");
		btn_delete.setBackground(new Color(153, 50, 204));
		btn_delete.setForeground(new Color(0, 0, 51));
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				pantalla = display.getText();
				
				if(pantalla.length()>0){
					pantalla = pantalla.substring(0, pantalla.length()-1);
					display.setText(pantalla);
				}
	display.requestFocus();
			}
		});
		btn_delete.setBounds(10, 179, 60, 50);
		panel.add(btn_delete);
		
		
		JButton btn_0 = new JButton("0");
		btn_0.setBackground(new Color(240, 230, 140));
		btn_0.setForeground(new Color(0, 0, 51));
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_0.getText());
			}
		});
		btn_0.setBounds(90, 362, 50, 50);
		panel.add(btn_0);
		
		JButton btn_00 = new JButton("00");
		btn_00.setBackground(new Color(240, 230, 140));
		btn_00.setForeground(new Color(0, 0, 51));
		btn_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_00.getText());
			
			}
		});
		btn_00.setBounds(162, 362, 50, 50);
		panel.add(btn_00);
		
		JButton btn_1 = new JButton("1");
		btn_1.setBackground(new Color(240, 230, 140));
		btn_1.setForeground(new Color(0, 0, 51));
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_1.getText());
			}
		});
		btn_1.setBounds(90, 301, 50, 50);
		panel.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.setBackground(new Color(240, 230, 140));
		btn_2.setForeground(new Color(0, 0, 51));
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_2.getText());
			}
		});
		btn_2.setBounds(162, 301, 50, 50);
		panel.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setBackground(new Color(240, 230, 140));
		btn_3.setForeground(new Color(0, 0, 51));
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_3.getText());
			}
		});
		btn_3.setBounds(232, 301, 50, 50);
		panel.add(btn_3);
		
		JButton btn_4 = new JButton("4");
		btn_4.setBackground(new Color(240, 230, 140));
		btn_4.setForeground(new Color(0, 0, 51));
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_4.getText());
			}
		});
		btn_4.setBounds(90, 240, 50, 50);
		panel.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setBackground(new Color(240, 230, 140));
		btn_5.setForeground(new Color(0, 0, 51));
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_5.getText());
			}
		});
		btn_5.setBounds(162, 240, 50, 50);
		panel.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setBackground(new Color(240, 230, 140));
		btn_6.setForeground(new Color(0, 0, 51));
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_6.getText());
			}
		});
		btn_6.setBounds(232, 240, 50, 50);
		panel.add(btn_6);
		
		JButton btn_7 = new JButton("7");
		btn_7.setBackground(new Color(240, 230, 140));
		btn_7.setForeground(new Color(0, 0, 51));
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_7.getText());
			}
		});
		btn_7.setBounds(90, 179, 50, 50);
		panel.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.setBackground(new Color(240, 230, 140));
		btn_8.setForeground(new Color(0, 0, 51));
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_8.getText());
			}
		});
		btn_8.setBounds(162, 179, 50, 50);
		panel.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setBackground(new Color(240, 230, 140));
		btn_9.setForeground(new Color(0, 0, 51));
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_9.getText());
			}
		});
		btn_9.setBounds(232, 179, 50, 50);
		panel.add(btn_9);
		
		JButton btn_suma = new JButton("+");
		btn_suma.setBackground(new Color(30, 144, 255));
		btn_suma.setForeground(new Color(0, 0, 51));
		btn_suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculadora.setnumero1(Integer.parseInt(display.getText(),base));
				C.setnumero1(Integer.parseInt(display.getText(),base));
				display.setText("");
				
				operacion = "+";
			}
		});
		btn_suma.setBounds(297, 240, 62, 172);
		panel.add(btn_suma);
		
		
		JButton btn_resta = new JButton("-");
		btn_resta.setBackground(new Color(100, 149, 237));
		btn_resta.setForeground(new Color(0, 0, 51));
		btn_resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculadora.setnumero1(Integer.parseInt(display.getText(),base));
				C.setnumero1(Integer.parseInt(display.getText(),base));
				display.setText("");
				
				operacion = "-";
			}
		});
		btn_resta.setBounds(297, 179, 60, 50);
		panel.add(btn_resta);
		
		JButton btn_multiplicacion = new JButton("x");
		btn_multiplicacion.setBackground(new Color(100, 149, 237));
		btn_multiplicacion.setForeground(new Color(0, 0, 51));
		btn_multiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculadora.setnumero1(Integer.parseInt(display.getText(),base));
				C.setnumero1(Integer.parseInt(display.getText(),base));
				display.setText("");
				
				operacion = "x";
			}
		});
		btn_multiplicacion.setBounds(367, 179, 60, 50);
		panel.add(btn_multiplicacion);
		
				
		JButton btn_division = new JButton("/");
		btn_division.setBackground(new Color(100, 149, 237));
		btn_division.setForeground(new Color(0, 0, 51));
		btn_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculadora.setnumero1(Integer.parseInt(display.getText(),base));
				C.setnumero1(Integer.parseInt(display.getText(),base));
				display.setText("");
				
				operacion = "/";
			}
		});
		btn_division.setBounds(367, 240, 60, 50);
		panel.add(btn_division);
		
		
		JButton btn_punto = new JButton(".");
		btn_punto.setBackground(new Color(240, 230, 140));
		btn_punto.setForeground(new Color(0, 0, 51));
		btn_punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(display.getText().equals("")){
					display.setText("0.");
				}
				else{
					display.getText().equals(".");
				}
				display.setText(display.getText() + btn_punto.getText());
			}
		});
		btn_punto.setBounds(232, 362, 50, 50);
		panel.add(btn_punto);
		
		JButton btn_raiz = new JButton("raiz");
		btn_raiz.setBackground(new Color(100, 149, 237));
		btn_raiz.setForeground(new Color(0, 0, 51));
		btn_raiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculadora.setnumero1(Integer.parseInt(display.getText(),base));
				display.setText("");
				
				operacion = "raiz";
			}
		});
		btn_raiz.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn_raiz.setBounds(367, 119, 60, 50);
		panel.add(btn_raiz);

		
		JButton btn_igual = new JButton("=");
		btn_igual.setBackground(new Color(100, 149, 237));
		btn_igual.setForeground(new Color(0, 0, 51));
		btn_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculadora.setnumero2(Integer.valueOf(display.getText()));
				C.setnumero2(Integer.valueOf(display.getText()));
				if(operacion.equals("+")){
					calculadora.sumar(); 
					C.sumar();
				}
				
				if(operacion.equals("/")){
					calculadora.Division();
					C.Division();
				}
				
				if(operacion.equals("x")){
					calculadora.multiplicar();
					C.multiplicar();
				}
				if(operacion.equals("-")){
					calculadora.restar();
					C.restar();
				}
				if(operacion.equals("%")){
					calculadora.porcentaje();
				}
				if(operacion.equals("raiz")){
					calculadora.raiz();
				}
				
			
				display.setText(String.valueOf(calculadora.getresultado()));
				display.setText(String.valueOf(C.getresultado()));
				
			}
		});
		btn_igual.setBounds(367, 301, 60, 111);
		panel.add(btn_igual);
		
		txtMdbp = new JTextField();
		txtMdbp.setHorizontalAlignment(SwingConstants.CENTER);
		txtMdbp.setEnabled(false);
		txtMdbp.setEditable(false);
		txtMdbp.setBackground(new Color(0, 0, 0));
		txtMdbp.setForeground(new Color(224, 255, 255));
		txtMdbp.setFont(new Font("Wide Latin", Font.BOLD, 14));
		txtMdbp.setText("MDBP");
		txtMdbp.setBounds(320, 11, 107, 36);
		panel.add(txtMdbp);
		txtMdbp.setColumns(10);
		
		JButton btn_a = new JButton("A");
		btn_a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				base =16;
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_a.getText());
				
				
			}
		});
		btn_a.setBounds(20, 71, 50, 36);
		panel.add(btn_a);
		
		JButton btn_b = new JButton("B");
		btn_b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				base =16;
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_b.getText());
			
			}
		});
		btn_b.setBounds(95, 72, 50, 36);
		panel.add(btn_b);
		
		JButton btn_c = new JButton("C");
		btn_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				base =16;
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_c.getText());
			}
		});
		btn_c.setBounds(165, 71, 52, 37);
		panel.add(btn_c);
		
		JButton btn_d = new JButton("D");
		btn_d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				base =16;
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_d.getText());
			}
		});
		btn_d.setBounds(235, 72, 52, 36);
		panel.add(btn_d);
		
		JButton btn_e = new JButton("E");
		btn_e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				base =16;
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_e.getText());
			}
		});
		btn_e.setBounds(305, 72, 52, 36);
		panel.add(btn_e);
		
		JButton btn_f = new JButton("F");
		btn_f.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				base =16;
				if(display.getText().equals("0")){
					display.setText("");
				}
				display.setText(display.getText() + btn_f.getText());
			}
		});
		btn_f.setBounds(367, 72, 47, 36);
		panel.add(btn_f);

				panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btn_off, display, btn_encender, button_12, btn_reiniciar, btn_binario, button_2, button_3, btn_delete, btn_0, btn_00, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_resta, btn_multiplicacion, btn_decimal, btn_raiz, btn_suma, btn_division, btn_punto, btn_igual}));
	}
}
