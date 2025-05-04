import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

import static java.awt.Color.*;

public class main {
    public static void main(String[] args) {
        Frame f =new Frame("currency_converter");
        f.setBackground(cyan);
        Font f1 = new Font("Courier",Font.BOLD,25);
        Font f2 = new Font("Courier",Font.BOLD,15);
        final TextField tf=new TextField();
        tf.setBounds(80,300,550,40);
        tf.setFont(f1);
        tf.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char character = e.getKeyChar();
                String text = tf.getText();

                // Allow digits
                if (Character.isDigit(character)) {
                    return;
                }

                // Allow only one dot
                if (character == '.' && !text.contains(".")) {
                    return;
                }

                // Block everything else
                e.consume();
            }
        });
        Choice c= new Choice();
        c.setBounds(80,460,150,60);
        c.setFont(f2);
        c.add("Indian Rupee");
        c.add("United States Dollor");
        c.add("Dinar");
        c.add("Pound");
        c.add("Euro");
        c.add("Sri Lankan Rupee");
        //Label l5 = new Label("Indian Rupee");
        //l5.setBounds(460,440,150,60);
        //l5.setFont(f2);
        //f.add(l5);
        Choice c1= new Choice();
        c1.setFont(f2);
        c1.setBounds(460,460,150,60);
        c1.add("Indian Rupee");
        c1.add("United States Dollor");
        c1.add("Dinar");
        c1.add("Pound");
        c1.add("Euro");
        c1.add("Sri Lankan Rupee");
        Label l = new Label("...CURRENCY CONVERTER using JAVA awt...");
        l.setAlignment(Label.CENTER);
        l.setFont(f2);
        l.setBackground(blue);
        l.setBounds(0,50,700,40);
        Label l1 = new Label("From");
        l1.setBounds(80,420,100,30);
        Label l2 = new Label("To");
        l2.setBounds(460,420,100,30);
        Label l3 = new Label("Exchange Rate");
        l3.setAlignment(Label.CENTER);
        l3.setBounds(260,120,200,40);
        l3.setFont(f1);
        Label l4 = new Label("Amount");
        l4.setBounds(80,270,150,30);
        Label l6 = new Label();
        l6.setFont(f2);
        l6.setAlignment(Label.CENTER);
        l6.setBounds(260,200,200,40);

        Button reset = new Button("reset");
        reset.setBounds(550,550,70,40);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                l3.setVisible(false);
                l6.setVisible(false);
            }
        });
        Button b = new Button("Convert");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tf.getText().isEmpty())
                    JOptionPane.showMessageDialog(null,"PLEASE ENTER INPUT");
                String s = c.getSelectedItem();
                String s1 = c1.getSelectedItem();
                if (s.equals("Indian Rupee")){
                    if (s1=="Indian Rupee") {
                        l6.setText("No Conversion Possible");
                    }
                    else if (s1=="United States Dollor") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*0.012);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Dinar") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*0.0037);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Pound") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*0.0099);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Euro") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*0.011);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Sri Lankan Rupee") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*3.93);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                }
                else if (s.equals("United States Dollor")) {
                    if (s1=="Indian Rupee") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*83.30);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="United States Dollor") {
                        l6.setText("No Conversion Possible");
                    }
                    else if (s1=="Dinar") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*0.31);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Pound") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*0.82);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Euro") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*0.94);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Sri Lankan Rupee") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*327.27);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                }
                else if (s.equals("Dinar")) {
                    if (s1=="Indian Rupee") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*269.53);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="United States Dollor") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*3.24);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Dinar") {
                        l6.setText("No Conversion Possible");
                    }
                    else if (s1=="Pound") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*2.66);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Euro") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*3.05);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Sri Lankan Rupee") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*1059.01);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                }
                else if (s.equals("Pound")) {
                    if (s1=="Indian Rupee") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*101.34);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="United States Dollor") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*1.22);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Dinar") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*0.38);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Pound") {
                        l6.setText("No Conversion Possible");
                    }
                    else if (s1=="Euro") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*1.15);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Sri Lankan Rupee") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*398.16);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                }
                else if (s.equals("Euro")) {
                    if (s1=="Indian Rupee") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*88.41);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="United States Dollor") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*1.06);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Dinar") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*0.33);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Pound") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*0.87);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Euro") {
                        l6.setText("No Conversion Possible");
                    }
                    else if (s1=="Sri Lankan Rupee") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*347.36);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                }
                else if (s.equals("Sri Lankan Rupee")){
                    if (s1=="Indian Rupee") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*0.25);
                        String str1=String.valueOf(d1);
                        l6.setText("No Conversion Possible");
                    }
                    else if (s1=="United States Dollor") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*0.0031);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Dinar") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*0.00094);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Pound") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*0.0025);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Euro") {
                        double d= Double.parseDouble(tf.getText());
                        double d1=(d*0.0029);
                        String str1=String.valueOf(d1);
                        l6.setText(str1);
                    }
                    else if (s1=="Sri Lankan Rupee") {
                        l6.setText("No Conversion Possible");
                    }
                }
            }
        });
        b.setBounds(200,550,290,40);
        b.setForeground(white);
        b.setFont(f2);
        b.setBackground(blue);
        f.add(c1);
        f.add(c);
        f.add(l);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l6);
        f.add(b);
        f.add(tf);
        f.add(reset);
        f.setSize(700,700);
        f.setLayout(null);
        f.setVisible(true);
    }
}