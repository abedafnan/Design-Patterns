package com.abedafnan.factory_method;

import com.abedafnan.factory_method.models.Employee;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ParttimeEmployeeForm extends EmployeeForm{

	public ParttimeEmployeeForm() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public JPanel createSubAttributesGUI() {
		JLabel hourRateLabel = new JLabel("Hour rate:");
		JTextField hourRateText = new JTextField();
		JPanel hourRatePanel = new JPanel();
		hourRatePanel.setLayout(new BorderLayout());
		hourRatePanel.add(hourRateLabel, BorderLayout.WEST);
		hourRatePanel.add(hourRateText, BorderLayout.CENTER);
		return hourRatePanel;
	}

	@Override
	public Employee createSubEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
