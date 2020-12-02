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
	JRadioButton network = new JRadioButton("度",true);
	JRadioButton jarido1;
	JRadioButton jarido2;
	JRadioButton jarido3;
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
		this.setSize(378, 222);
		this.setTitle("计算器");
		this.setLayout(null);
		this.init();
		this.setVisible(true);
	}
	//初始化二级容器以及按钮
	private void init() {
		//文本框
		showText = new JTextField();
		showText.setSize(358,30);
		showText.setLocation(5,5);
		Font f = new Font("宋体",Font.PLAIN,12);
		showText.setFont(f);
		showText.setHorizontalAlignment(JTextField.RIGHT);
		this.add(showText);
		
		//三个单独控件的摆放
		zeroBt = new JButton("0");
		zeroBt.setSize(64, 23 );
		zeroBt.setLocation(200, 160);
		Font f1 = new Font("宋体",Font.PLAIN,5);
		zeroBt.setFont(f1);
		this.add(zeroBt);
		
		equalBt = new JButton("=");
		equalBt.setSize(31, 48 );
		equalBt.setLocation(331, 135);
		Font f3 = new Font("",Font.PLAIN,1);
		equalBt.setFont(f1);
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
		jpanel01.setSize(200, 125);
		jpanel01.setLocation(0,60);
		jpanel01.setBackground(Color.CYAN);
		//在面板中摆放按钮
		jpanel01.setLayout(new GridLayout(5,5,4,3));//布局方式为5*5
		String[] jpanelnames = {"","Inv","ln","(",")","Int","sinh","sin","x^2","n!","dms","cosh","cos","x^y","y/x","π","tanh","tan","x^3","3/x","F-E","Exp","Mod","log","10^x"};
		Font f = new Font("",Font.PLAIN,5);
		jbutton01 = new JButton[25];
		for(int i = 0; i < jbutton01.length; i++) {
			jbutton01[i] = new JButton(jpanelnames[i]);
			jbutton01[i].setFont(f);
			jpanel01.add(jbutton01[i]);
		}
		this.add(jpanel01);
	}
	private void initpanel02() {
		jpanel02 = new JPanel();
		jpanel02.setSize(130, 125);
		jpanel02.setLocation(200,35);
		jpanel02.setBackground(Color.CYAN);
		Font f = new Font("",Font.PLAIN,5);
		//在面板中摆放按钮
		jpanel02.setLayout(new GridLayout(5,4,4,3));//布局方式为5*5
		String[] jpanelnames1 = {"MC","MR","MS","M+","<-","CE","C","+-","7","8","9","/","4","5","6","*","1","2","3","-"};
		jbutton02 = new JButton[20];
		for(int i = 0; i < jbutton02.length; i++) {
			jbutton02[i] = new JButton(jpanelnames1[i]);
			jbutton02[i].setFont(f);
			jpanel02.add(jbutton02[i]);
		}
		this.add(jpanel02);
	}
	private void initpanel03() {
		jpanel03 = new JPanel();
		jpanel03.setSize(30, 100);
		jpanel03.setLocation(331,35);
		jpanel03.setBackground(Color.CYAN);
		//在面板中摆放按钮
		jpanel03.setLayout(new GridLayout(4,1,4,3));//布局方式为5*5
		String[] jpanelnames2 = {"M-","/","%","1/x"};
		jbutton03 = new JButton[4];
		Font f = new Font("",Font.PLAIN,5);
		for(int i = 0; i < jbutton03.length; i++) {
			jbutton03[i] = new JButton(jpanelnames2[i]);
			jbutton03[i].setFont(f);
			jpanel03.add(jbutton03[i]);
		}
		this.add(jpanel03);
	}
	private void initpanel04() {
		jpanel04 = new JPanel();
		jpanel04.setSize(63, 23);
		jpanel04.setLocation(267,160);
		jpanel04.setBackground(Color.CYAN);
		//在面板中摆放按钮
		Font f = new Font("",Font.PLAIN,5);
		jpanel04.setLayout(new GridLayout(1,2,4,3));//布局方式为5*5
		String[] jpanelnames3 = {".","+"};
		jbutton04 = new JButton[2];
		for(int i = 0; i < jbutton04.length; i++) {
			jbutton04[i] = new JButton(jpanelnames3[i]);
			jbutton04[i].setFont(f);
			jpanel04.add(jbutton04[i]);
		}
		this.add(jpanel04);
	}
	private void initpanel() {
		jpanel = new JPanel();
		jpanel.setSize(180,25);
		jpanel.setLocation(2,35);
		jpanel.setBackground(Color.white);
		jpanel.setLayout(new GridLayout(1,3,0,0));
		/*JRadioButton jarido1 = new JRadioButton(" 度  ",true);
		JRadioButton jarido2 = new JRadioButton(" 弧度  ",false);
		JRadioButton jarido3 = new JRadioButton(" 梯度  ",false);
		jpanel.add(	jarido1);
		jpanel.add(	jarido2);
		jpanel.add(	jarido3);*/
		//String[] jpanelnames3 = {"度","弧度","梯度"};
		//jarido = new JRadioButton[3];
		//for(int i = 0; i < jarido.length; i++) {
		//	jarido[i] = new JRadioButton(jpanelnames3[i],true);
			//jarido[i].setSize(width, height);
		//	jpanel.add(	jarido[i]);
		//}
		JRadioButton network = new JRadioButton(" 度  ",true);
		network.setSize(50, 20);
		group.add(network);
		JRadioButton network1 = new JRadioButton("弧度",false);
		group.add(network1);
		JRadioButton network2 = new JRadioButton("梯度   ",false);
		group.add(network2);
		
		jpanel.add(network);
		jpanel.add(network1);
		jpanel.add(network2);
		this.add(jpanel);
	}
	
}
