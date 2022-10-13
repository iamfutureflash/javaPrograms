package com.company;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
public class action extends Frame implements ActionListener{
    TextField tf,tfd;
    Button b=new Button("Inc Cntr");
    private int i=0;
    action()
    {

        //create components
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        b.setBounds(100,120,80,30);

        //register listener
        b.addActionListener(this);//passing current instance

        //add components and set size, layout and visibility
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

        i++;
        if(e.getSource()==b) tf.setText("Button clicked: "+i+" times");
    }
public class java_23_check_days {
    public static void main(String[] args) {
//  Scanner scan=new Scanner(System.in);
//        System.out.println("enter day name or day number");
//  String a=scan.nextLine();
//  switch(a){
//      case "1"-> System.out.println("Monday");
//      case "2"-> System.out.println("Tuesday");
//      case "3"-> System.out.println("Wednesday");
//      case "4"-> System.out.println("Thursday");
//      case "5"-> System.out.println("Friday");
//      case "6"-> System.out.println("Saturday");
//      case "7"-> System.out.println("Sunday");
//      case "monday"-> System.out.println("1");
//      case "tuesday"-> System.out.println("2");
//      case "wednesday"-> System.out.println("3");
//      case "thursday"-> System.out.println("4");
//      case "friday"-> System.out.println("5");
//      case "saturday"-> System.out.println("6");
//      case "sinday"-> System.out.println("7");
//  }

        new action();
        }
    }}

