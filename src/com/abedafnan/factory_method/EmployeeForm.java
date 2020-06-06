package com.abedafnan.factory_method;

import com.abedafnan.factory_method.models.Employee;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public abstract class EmployeeForm extends JFrame{

	
	public EmployeeForm() {
		this.setLayout(new GridLayout(5,1));
		// name record
		JLabel nameLabel = new JLabel("Name:");
		JTextField nameText = new JTextField();
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new BorderLayout());
		namePanel.add(nameLabel, BorderLayout.WEST);
		namePanel.add(nameText, BorderLayout.CENTER);
		this.add(namePanel);
		
		// id record
		JLabel idLabel = new JLabel("ID:");
		JTextField idText = new JTextField();
		JPanel idPanel = new JPanel();
		idPanel.setLayout(new BorderLayout());
		idPanel.add(idLabel, BorderLayout.WEST);
		idPanel.add(idText, BorderLayout.CENTER);
		this.add(idPanel);

		// job title record
		JLabel jobLabel = new JLabel("Job Title:");
		JTextField jobText = new JTextField();
		JPanel jobPanel = new JPanel();
		jobPanel.setLayout(new BorderLayout());
		jobPanel.add(jobLabel, BorderLayout.WEST);
		jobPanel.add(jobText, BorderLayout.CENTER);
		this.add(jobPanel);

		JPanel extraPanel = createSubAttributesGUI();
		this.add(extraPanel);
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				Employee emp = createSubEmployee();
				//emp.setName(name);
				//emp.setId(id);
			}


			
		});
		this.add(saveButton);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public abstract Employee createSubEmployee();

	public abstract JPanel createSubAttributesGUI();
}
