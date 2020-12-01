package com.caowen.project;
import java.awt.*;
import javax.swing.*; 

public class CalculatorProgrammerInterface extends JFrame{
	//������ϵĿؼ�
	//�ı���
	JTextField showText;
	
	JButton zeroBt;//������0
	JButton equalBt;//�����ĵȺ�
	
	//��ѡ��
	JPanel jpanel;//��ѡ�����
	ButtonGroup group = new ButtonGroup();//����ѡ�� 
	
	//�������
	JPanel jpanel01;//���1,���½�һ���
	JButton[] jbutton01;//����ϵİ�ť,����(25)
	
	JPanel jpanel02;//���2,�����м�����
	JButton[] jbutton02;//����ϵİ�ť,����(20)
	
	
	JPanel jpanel03;//���3,���������һ��
	JButton[] jbutton03;//����ϵİ�ť,����(4)
	
	
	JPanel jpanel04;//���4,��������С��
	JButton[] jbutton04;	//����ϵİ�ť,����(2)
	
	
	
	public  CalculatorProgrammerInterface() {
		this.setSize(615, 400);
		this.setTitle("������");
		this.setLayout(null);
		this.init();
		this.setVisible(true);
	}
	//��ʼ�����������Լ���ť
	private void init() {
		//�ı���
		showText = new JTextField();
		showText.setSize(595,60);
		showText.setLocation(5,5);
		this.add(showText);
		
		//���������ؼ��İڷ�
		zeroBt = new JButton("0");
		zeroBt.setSize(112, 42 );
		zeroBt.setLocation(302, 320);
		this.add(zeroBt);
		
		equalBt = new JButton("=");
		equalBt.setSize(70, 92 );
		equalBt.setLocation(531, 270);
		this.add(equalBt);
		
		initpanel();
		//01���İڷ�
		initpanel01();
		//02���İڷ�
		initpanel02();
		//03���İڷ�
		initpanel03();
		//04���İڷ�
		initpanel04();
	
		
	}
	private void initpanel01() {
		jpanel01 = new JPanel();
		jpanel01.setSize(300, 245);
		jpanel01.setLocation(0,120);
		jpanel01.setBackground(Color.CYAN);
		//������аڷŰ�ť
		jpanel01.setLayout(new GridLayout(5,5,4,3));//���ַ�ʽΪ5*5
		String[] jpanelnames = {"","Inv","ln","(",")","Int","sinh","sin","x^2","n!","dms","cosh","cos","x^y","y/x","��","tanh","tan","x^3","3/x","F-E","Exp","Mod","log","10^x"};
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
		//������аڷŰ�ť
		jpanel02.setLayout(new GridLayout(5,4,4,3));//���ַ�ʽΪ5*5
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
		//������аڷŰ�ť
		jpanel03.setLayout(new GridLayout(4,1,4,3));//���ַ�ʽΪ5*5
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
		//������аڷŰ�ť
		jpanel04.setLayout(new GridLayout(1,2,4,3));//���ַ�ʽΪ5*5
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
		JRadioButton network = new JRadioButton("��",true);
		group.add(network);
		JRadioButton network1 = new JRadioButton("����",false);
		group.add(network1);
		JRadioButton network2 = new JRadioButton("�ݶ�",false);
		group.add(network1);
		network.setBounds(0, 50, 50, 50);
		jpanel.add(network);
		jpanel.add(network1);
		jpanel.add(network2);
		this.add(jpanel);
	}
	
}
