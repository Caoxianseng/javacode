package part01;
abstract class Figure{//������:ͼ��
	public abstract double figureArea();//�������
	public abstract double figurePerimeter();//�����ܳ�	
}
class Circular extends Figure{//����,Բ��
	private double r;
	
	public Circular(double r1) {
		this.r = r1;
	}
	public double getL() {
		return r;
	}
	public void setL(double r1) {
		this.r = r1;
	}
	
    //����һ�����������
    
	public double figureArea() {
		return Math.PI * r * r;
	}
	 //����һ���������ܳ�
	public double figurePerimeter() {
		 return 2 * Math.PI *r;
	}
 }

 class Rectangle extends Figure{//���೤����
	private double l;
	private double s;
	
	public Rectangle(double l1, double s1) {
		this.l = l1;
		this.s = s1;
	}
	public double getL() {
		return l;
	}
	public void setL(double l1) {
		this.l = l1;
	}
	public double getS() {
        return s;
    }
    public void setS(double s) {
        this.s = s;
    }
    //����һ�����������
    
	public double figureArea() {
		return s*l;
	}
	 //����һ���������ܳ�
	public double figurePerimeter() {
		 
		 return 2*(s+l);
	}
}
 
 class Equilateraltriangle extends Figure{//����ȱ�������
		private double l;
		
		public Equilateraltriangle(double l1) {
			this.l = l1;
		}
		public double getL() {
			return l;
		}
		public void setL(double l1) {
			this.l = l1;
		}
		
	    //����һ����������� 
		public double figureArea() {
			return (l * l * Math.pow(3,0.5) ) / 4;
		}
		 //����һ���������ܳ�
		public double figurePerimeter() {
			 return 3 * l;
		}
	}

public class Test {
	public static void main(String[] args) {
		Circular c1 = new Circular(1.0);
		System.out.println("Բ�İ뾶Ϊ:"+ c1.getL());
		System.out.println("Բ�����Ϊ: "+c1.figureArea());
		System.out.println("Բ���ܳ�Ϊ: "+c1.figurePerimeter());
		Rectangle r1 = new Rectangle(4.0,2.0);
		System.out.println("�����εĳ�Ϊ"+r1.getL()+"  �����εĿ�Ϊ:"+ r1.getS());
		System.out.println("�����ε����Ϊ: "+r1.figureArea());
		System.out.println("�����ε��ܳ�Ϊ: "+r1.figurePerimeter());
		Equilateraltriangle e1 = new Equilateraltriangle(3.0);
		System.out.println("�ȱ������εı߳�Ϊ:"+e1.getL());
		System.out.println("�����ε����Ϊ: "+e1.figureArea());
		System.out.println("�����ε��ܳ�Ϊ: "+e1.figurePerimeter());
	}
}
