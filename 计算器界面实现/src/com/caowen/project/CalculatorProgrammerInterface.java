package com.caowen.project;
import java.awt.*;
import javax.swing.*; 

public class CalculatorProgrammerInterface extends JFrame{
	//计算机上的控件
	//文本框
	JTextField showText;
	
	JButton zeroBt;//单独的0
	JButton equalBt;//单独的等号
	
	//单选框
	JPanel jpanel;//单选框面板
	ButtonGroup group = new ButtonGroup();//三个选项 
	
	//采用面板
	JPanel jpanel01;//面板1,左下角一大块
	JButton[] jbutton01;//面板上的按钮,数组(25)
	
	JPanel jpanel02;//面板2,用来中间上面
	JButton[] jbutton02;//面板上的按钮,数组(20)
	
	
	JPanel jpanel03;//面板3,用来右面的一列
	JButton[] jbutton03;//面板上的按钮,数组(4)
	
	
	JPanel jpanel04;//面板4,下面两个小的
	JButton[] jbutton04;	//面板上的按钮,数组(2)
	
	
	
	public  CalculatorProgrammerInterface() {
		this.setSize(615, 400);
		this.setTitle("计算器");
		this.setLayout(null);
		this.init();
		this.setVisible(true);
	}
	//初始化二级容器以及按钮
	private void init() {
		//文本框
		showText = new JTextField();
		showText.setSize(595,60);
		showText.setLocation(5,5);
		this.add(showText);
		
		//三个单独控件的摆放
		zeroBt = new JButton("0");
		zeroBt.setSize(112, 42 );
		zeroBt.setLocation(302, 320);
		this.add(zeroBt);
		
		equalBt = new JButton("=");
		equalBt.setSize(70, 92 );
		equalBt.setLocation(531, 270);
		this.add(equalBt);
		
		initpanel();
		//01面板的摆放
		initpanel01();
		//02面板的摆放
		initpanel02();
		//03面板的摆放
		initpanel03();
		//04面板的摆放
		initpanel04();
	
		
	}
	private void initpanel01() {
		jpanel01 = new JPanel();
		jpanel01.setSize(300, 245);
		jpanel01.setLocation(0,120);
		jpanel01.setBackground(Color.CYAN);
		//在面板中摆放按钮
		jpanel01.setLayout(new GridLayout(5,5,4,3));//布局方式为5*5
		String[] jpanelnames = {"","Inv","ln","(",")","Int","sinh","sin","x^2","n!","dms","cosh","cos","x^y","y/x","π","tanh","tan","x^3","3/x","F-E","Exp","Mod","log","10^x"};
		jbutton01 = new JButton[25];
		for(int i = 0; i < jbutton01.length; i++) {
			jbutton01[i] = new JButton(jpanelnames[i]);
			jpanel01.add(jbutton01[i]);
		}
		this.add(jpanel01);
	}
	private void initpanel02() {
		jpanel02 = new JPanel();
		jpanel02.setSize(230, 250);
		jpanel02.setLocation(300,70);
		jpanel02.setBackground(Color.CYAN);
		//在面板中摆放按钮
		jpanel02.setLayout(new GridLayout(5,4,4,3));//布局方式为5*5
		String[] jpanelnames1 = {"MC","MR","MS","M+","<-","CE","C","+-","7","8","9","/","4","5","6","*","1","2","3","-"};
		jbutton02 = new JButton[20];
		for(int i = 0; i < jbutton02.length; i++) {
			jbutton02[i] = new JButton(jpanelnames1[i]);
			jpanel02.add(jbutton02[i]);
		}
		this.add(jpanel02);
	}
	private void initpanel03() {
		jpanel03 = new JPanel();
		jpanel03.setSize(70, 200);
		jpanel03.setLocation(531,70);
		jpanel03.setBackground(Color.CYAN);
		//在面板中摆放按钮
		jpanel03.setLayout(new GridLayout(4,1,4,3));//布局方式为5*5
		String[] jpanelnames2 = {"M-","/","%","1/x"};
		jbutton03 = new JButton[4];
		for(int i = 0; i < jbutton03.length; i++) {
			jbutton03[i] = new JButton(jpanelnames2[i]);
			jpanel03.add(jbutton03[i]);
		}
		this.add(jpanel03);
	}
	private void initpanel04() {
		jpanel04 = new JPanel();
		jpanel04.setSize(114, 42);
		jpanel04.setLocation(416,320);
		jpanel04.setBackground(Color.CYAN);
		//在面板中摆放按钮
		jpanel04.setLayout(new GridLayout(1,2,4,3));//布局方式为5*5
		String[] jpanelnames3 = {".","+"};
		jbutton04 = new JButton[2];
		for(int i = 0; i < jbutton04.length; i++) {
			jbutton04[i] = new JButton(jpanelnames3[i]);
			jpanel04.add(jbutton04[i]);
		}
		this.add(jpanel04);
	}
	private void initpanel() {
		jpanel = new JPanel();
		jpanel.setSize(295,47);
		jpanel.setLocation(2,70);
		jpanel.setBackground(Color.white);
		JRadioButton network = new JRadioButton("度",true);
		group.add(network);
		JRadioButton network1 = new JRadioButton("弧度",false);
		group.add(network1);
		JRadioButton network2 = new JRadioButton("梯度",false);
		group.add(network1);
		network.setBounds(0, 50, 50, 50);
		jpanel.add(network);
		jpanel.add(network1);
		jpanel.add(network2);
		this.add(jpanel);
	}
	
}
