import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;


import java.awt.Component;


import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import java.awt.Color;



public class Formulario01 {

	private JFrame frame;
	private JTextField cap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario01 window = new Formulario01();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Formulario01() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int buffer=0;
		boolean seleee;
	 
		
		final JProgressBar progressBar_c1 = new JProgressBar();
		final JLabel lblNewLabel_c1 = new JLabel("New label");		
		final JLabel lblNewLabel_c2 = new JLabel("New label");		
		final JLabel lblNewLabel_c3 = new JLabel("New label");
	        
		JButton btnEmpezar = new JButton("Empezar todos");
			
		final JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel = new JLabel("por: richarteq@gmail.com");
		
		
		JLabel lblHttpssitesgooglecomsitejavaejercicios = new JLabel("https://sites.google.com/site/javaejercicios/");
		
		JLabel label = new JLabel("New label");
		
		JLabel label_1 = new JLabel("New label");
		
		JLabel label_2 = new JLabel("New label");
		
		JButton btnPrimerConsumidor = new JButton("Primer Consumidor");
		
		JButton btnProductor = new JButton("Productor");
		
		JButton btnEmpezarSegundo = new JButton("Segundo consumidor");
		
		cap = new JTextField();
		cap.setColumns(10);
		
		JRadioButton finito = new JRadioButton("finito");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(progressBar_c1, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(cap, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_c1)
									.addGap(18)
									.addComponent(label)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addComponent(finito)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_1))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(64)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_c2)
										.addComponent(lblNewLabel_c3))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(btnEmpezarSegundo, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(label_2)
												.addComponent(btnPrimerConsumidor, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
										.addComponent(lblNewLabel)
										.addComponent(lblHttpssitesgooglecomsitejavaejercicios)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(96)
											.addComponent(btnEmpezar, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))))
								.addComponent(btnProductor, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
							.addGap(51)))
					.addGap(119))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(cap, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(finito))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_1)
									.addGap(18)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(15)
									.addComponent(btnPrimerConsumidor)
									.addGap(12)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_c1)
										.addComponent(label)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(37)
									.addComponent(lblNewLabel_c2))))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(13)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnProductor)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(label_2)
							.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnEmpezarSegundo))
									.addPreferredGap(ComponentPlacement.UNRELATED))
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_c3)
									.addGap(31)))
							.addComponent(btnEmpezar, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(progressBar_c1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblHttpssitesgooglecomsitejavaejercicios)
					.addContainerGap())
		);
		
		final JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		frame.getContentPane().setLayout(groupLayout);
		
		textArea.setText(null);

		cap.setText(Integer.toString(0));
		buffer=Integer.parseInt(cap.getText());
		
		btnEmpezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
				panel.setBackground(Color.GREEN);
				panel_1.setBackground(Color.GREEN);
				panel_2.setBackground(Color.GREEN);
				new ElHilo("Apple", progressBar_c1, textArea, lblNewLabel_c1,Integer.parseInt(cap.getText()),panel,label,finito.isSelected()).start();
				new Consumidor("EEUU", progressBar_c1, textArea, lblNewLabel_c2,Integer.parseInt(cap.getText()),panel_1,label_1,finito.isSelected()).start();
				new Consumidor("PERU", progressBar_c1, textArea, lblNewLabel_c3,Integer.parseInt(cap.getText()),panel_2,label_2,finito.isSelected()).start();
			}
		});
		btnEmpezarSegundo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setBackground(Color.GREEN);
				new Consumidor("PERU", progressBar_c1, textArea, lblNewLabel_c3,Integer.parseInt(cap.getText()),panel_2,label_2,finito.isSelected()).start();
			}
		});
		btnProductor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.GREEN);
				
				new ElHilo("Apple", progressBar_c1, textArea, lblNewLabel_c1, Integer.parseInt(cap.getText()),panel,label,finito.isSelected()).start();

			}
		});
		btnPrimerConsumidor.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				panel_1.setBackground(Color.GREEN);
				new Consumidor("EEUU", progressBar_c1, textArea, lblNewLabel_c2,Integer.parseInt(cap.getText()),panel_1,label_1,finito.isSelected()).start();
			}
		});
		
	}	
}
