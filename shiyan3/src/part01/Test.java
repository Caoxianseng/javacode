package part01;
abstract class Figure{//抽象类:图形
	public abstract double figureArea();//计算面积
	public abstract double figurePerimeter();//计算周长	
}
class Circular extends Figure{//子类,圆形
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
	
    //定义一个方法求面积
    
	public double figureArea() {
		return Math.PI * r * r;
	}
	 //定义一个方法求周长
	public double figurePerimeter() {
		 return 2 * Math.PI *r;
	}
 }

 class Rectangle extends Figure{//子类长方形
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
    //定义一个方法求面积
    
	public double figureArea() {
		return s*l;
	}
	 //定义一个方法求周长
	public double figurePerimeter() {
		 
		 return 2*(s+l);
	}
}
 
 class Equilateraltriangle extends Figure{//子类等边三角形
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
		
	    //定义一个方法求面积 
		public double figureArea() {
			return (l * l * Math.pow(3,0.5) ) / 4;
		}
		 //定义一个方法求周长
		public double figurePerimeter() {
			 return 3 * l;
		}
	}

public class Test {
	public static void main(String[] args) {
		Circular c1 = new Circular(1.0);
		System.out.println("圆的半径为:"+ c1.getL());
		System.out.println("圆的面积为: "+c1.figureArea());
		System.out.println("圆的周长为: "+c1.figurePerimeter());
		Rectangle r1 = new Rectangle(4.0,2.0);
		System.out.println("长方形的长为"+r1.getL()+"  长方形的宽为:"+ r1.getS());
		System.out.println("长方形的面积为: "+r1.figureArea());
		System.out.println("长方形的周长为: "+r1.figurePerimeter());
		Equilateraltriangle e1 = new Equilateraltriangle(3.0);
		System.out.println("等边三角形的边长为:"+e1.getL());
		System.out.println("三角形的面积为: "+e1.figureArea());
		System.out.println("三角形的周长为: "+e1.figurePerimeter());
	}
}
