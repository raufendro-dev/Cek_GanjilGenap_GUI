package com.cekganjilgenap;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class GanjilGenap extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GanjilGenap frame = new GanjilGenap();
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
	public GanjilGenap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(5, 5, 291, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel jawab = new JLabel();
		
		jawab.setForeground(Color.BLACK);
		jawab.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		jawab.setBounds(15, 28, 319, 44);
		contentPane.add(jawab);
		
		JButton btnNewButton = new JButton("Cek");
		btnNewButton.setBounds(308, 2, 136, 29);
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int angka;
				angka=Integer.parseInt(textField.getText());
				if(angka%2==0) {
					jawab.setText("Genap");
				} else {
					jawab.setText("Ganjil");
				}
			}
		});
		contentPane.add(btnNewButton);
		
		
	}
}
