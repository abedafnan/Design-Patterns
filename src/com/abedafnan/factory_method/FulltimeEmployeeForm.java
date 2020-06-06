package com.abedafnan.factory_method;


import com.abedafnan.factory_method.models.Employee;
import com.abedafnan.factory_method.models.FulltimeEmployee;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FulltimeEmployeeForm extends EmployeeForm{

	JTextField salaryText;
	
	public FulltimeEmployeeForm() {
	}

	@Override
	public JPanel createSubAttributesGUI() {
		JLabel salaryLabel = new JLabel("salary:");
		salaryText = new JTextField();
		JPanel salaryPanel = new JPanel();
		salaryPanel.setLayout(new BorderLayout());
		salaryPanel.add(salaryLabel, BorderLayout.WEST);
		salaryPanel.add(salaryText, BorderLayout.CENTER);
		return salaryPanel;
	}

	@Override
	public Employee createSubEmployee() {
		FulltimeEmployee e = new FulltimeEmployee();
		e.setBasicSalary(Float.parseFloat(salaryText.getText()));
		return e;
	}


}
