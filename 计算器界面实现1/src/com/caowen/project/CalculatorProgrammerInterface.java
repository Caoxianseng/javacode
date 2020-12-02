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
	JRadioButton network = new JRadioButton("��",true);
	JRadioButton jarido1;
	JRadioButton jarido2;
	JRadioButton jarido3;
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
		this.setSize(378, 222);
		this.setTitle("������");
		this.setLayout(null);
		this.init();
		this.setVisible(true);
	}
	//��ʼ�����������Լ���ť
	private void init() {
		//�ı���
		showText = new JTextField();
		showText.setSize(358,30);
		showText.setLocation(5,5);
		Font f = new Font("����",Font.PLAIN,12);
		showText.setFont(f);
		showText.setHorizontalAlignment(JTextField.RIGHT);
		this.add(showText);
		
		//���������ؼ��İڷ�
		zeroBt = new JButton("0");
		zeroBt.setSize(64, 23 );
		zeroBt.setLocation(200, 160);
		Font f1 = new Font("����",Font.PLAIN,5);
		zeroBt.setFont(f1);
		this.add(zeroBt);
		
		equalBt = new JButton("=");
		equalBt.setSize(31, 48 );
		equalBt.setLocation(331, 135);
		Font f3 = new Font("",Font.PLAIN,1);
		equalBt.setFont(f1);
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
		jpanel01.setSize(200, 125);
		jpanel01.setLocation(0,60);
		jpanel01.setBackground(Color.CYAN);
		//������аڷŰ�ť
		jpanel01.setLayout(new GridLayout(5,5,4,3));//���ַ�ʽΪ5*5
		String[] jpanelnames = {"","Inv","ln","(",")","Int","sinh","sin","x^2","n!","dms","cosh","cos","x^y","y/x","��","tanh","tan","x^3","3/x","F-E","Exp","Mod","log","10^x"};
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
		//������аڷŰ�ť
		jpanel02.setLayout(new GridLayout(5,4,4,3));//���ַ�ʽΪ5*5
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
		//������аڷŰ�ť
		jpanel03.setLayout(new GridLayout(4,1,4,3));//���ַ�ʽΪ5*5
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
		//������аڷŰ�ť
		Font f = new Font("",Font.PLAIN,5);
		jpanel04.setLayout(new GridLayout(1,2,4,3));//���ַ�ʽΪ5*5
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
		/*JRadioButton jarido1 = new JRadioButton(" ��  ",true);
		JRadioButton jarido2 = new JRadioButton(" ����  ",false);
		JRadioButton jarido3 = new JRadioButton(" �ݶ�  ",false);
		jpanel.add(	jarido1);
		jpanel.add(	jarido2);
		jpanel.add(	jarido3);*/
		//String[] jpanelnames3 = {"��","����","�ݶ�"};
		//jarido = new JRadioButton[3];
		//for(int i = 0; i < jarido.length; i++) {
		//	jarido[i] = new JRadioButton(jpanelnames3[i],true);
			//jarido[i].setSize(width, height);
		//	jpanel.add(	jarido[i]);
		//}
		JRadioButton network = new JRadioButton(" ��  ",true);
		network.setSize(50, 20);
		group.add(network);
		JRadioButton network1 = new JRadioButton("����",false);
		group.add(network1);
		JRadioButton network2 = new JRadioButton("�ݶ�   ",false);
		group.add(network2);
		
		jpanel.add(network);
		jpanel.add(network1);
		jpanel.add(network2);
		this.add(jpanel);
	}
	
}
