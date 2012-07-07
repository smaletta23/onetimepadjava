package com.google.jerry.otp;

import javax.swing.*;
import com.google.jerry.otp.GUI;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		JFrame frame = new JFrame("One Time Pad GUI");
		GUI gui = new GUI(frame);
		frame.setVisible(true);
	}
}