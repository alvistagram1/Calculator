import javax.swing.*;

import java.math.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
        //class starts
public class calc extends JFrame {
	public static String content = "";
	public static double T1 = 0;
	public static double T2 = 0;
	public static double result = 0;
	public static String op = "";
	public JFrame frame;
	public GridLayout g;
	public JPanel p;
	public JTextField res;
	public JButton b1;
	public JButton b2;
	public JButton b3;
	public JButton b4;
	public JButton b5;
	public JButton b6;
	public JButton b7;
	public JButton b8;
	public JButton b9;
	public JButton b0;
	public JButton be;
	public JButton bc;
	public JButton bp;
	public JButton bm;
	public JButton bx;
	public JButton bd;

	public static void main(String[] args) {

		JFrame frame = new JFrame("Calculator");
		GridLayout g = new GridLayout(5, 4);   //grid layout
		JPanel p = new JPanel();
		p.setLayout(g);
		final JTextField res = new JTextField();
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b0 = new JButton("0");
		JButton be = new JButton("=");
		JButton bc = new JButton("CLEAR");
		JButton bp = new JButton("+");
		JButton bm = new JButton("-");
		JButton bx = new JButton("*");
		JButton bd = new JButton("/");
		//designing the view of calc
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b0);
		p.add(be);
		p.add(bc);
		p.add(bp);
		p.add(bm);
		p.add(bx);
		p.add(bd);
		frame.add(res, BorderLayout.NORTH);
		frame.add(p, BorderLayout.CENTER);
		frame.setTitle("CALCULATOR");
		frame.setSize(400, 400);
		frame.setVisible(true);
		ActionListener a0 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				content += "0";
				res.setText(content);
			}
		};
		ActionListener a1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				content += "1";
				res.setText(content);
			}
		};
		ActionListener a2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				content += "2";
				res.setText(content);
			}
		};
		ActionListener a3 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				content += "3";
				res.setText(content);
			}
		};
		ActionListener a4 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				content += "4";
				res.setText(content);
			}
		};
		ActionListener a5 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				content += "5";
				res.setText(content);
			}
		};
		ActionListener a6 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				content += "6";
				res.setText(content);
			}
		};
		ActionListener a7 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				content += "7";
				res.setText(content);
			}
		};
		ActionListener a8 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				content += "8";
				res.setText(content);
			}
		};
		ActionListener a9 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				content += "9";
				res.setText(content);
			}
		};
		ActionListener ac = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				content = "";
				res.setText(content);
				T1 = 0;
				T2 = 0;
				result = 0;
			}
		};
		ActionListener ap = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					T1 = Double.valueOf(content);
					content = "";
					res.setText(content);
					op = "p";
				} catch (NumberFormatException i) {
					res.setText("ERROR");
				}
			}
		};
		ActionListener am = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					T1 = Double.valueOf(content);
					content = "";
					res.setText(content);
					op = "m";
				} catch (NumberFormatException i) {
					res.setText("ERROR");
				}
			}
		};
		ActionListener ax = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					T1 = Double.valueOf(content);
					content = "";
					res.setText(content);
					op = "x";
				} catch (NumberFormatException i) {
					res.setText("ERROR");
				}
			}
		};
		ActionListener ad = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					T1 = Double.valueOf(content);
					content = "";
					res.setText(content);
					op = "d";
				} catch (NumberFormatException i) {
					res.setText("ERROR");
				}
			}
		};
		//operations
		ActionListener ae = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					T2 = Double.valueOf(content);
					if (op.equals("p")) {
						result = T1 + T2;
						content = String.valueOf(result);
					} else if (op.equals("m")) {
						result = T1 - T2;
						content = String.valueOf(result);
					} else if (op.equals("x")) {
						result = T1 * T2;
						content = String.valueOf(result);
					} else if (op.equals("d")) {
						result = T1 / T2;
						content = String.valueOf(result);
					}
					res.setText(content);
				} catch (NumberFormatException i) {
					res.setText("ERROR");
				}
			}
		};
		b0.addActionListener(a0);
		b1.addActionListener(a1);
		b2.addActionListener(a2);
		b3.addActionListener(a3);
		b4.addActionListener(a4);
		b5.addActionListener(a5);
		b6.addActionListener(a6);
		b7.addActionListener(a7);
		b8.addActionListener(a8);
		b9.addActionListener(a9);
		bc.addActionListener(ac);
		bp.addActionListener(ap);
		bm.addActionListener(am);
		bx.addActionListener(ax);
		bd.addActionListener(ad);
		be.addActionListener(ae);
	}

}