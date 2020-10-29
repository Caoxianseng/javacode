


public class Circle {
		private Point o;
		private double redious;//半径
		Circle(Point p,double r){
			this.o = p;
			this.redious = r;
		}
		
		//定义一个方法，用来判断点是否在里面
		public boolean isIn(Point n) {
			boolean result = true;
			if(((n.getX() - this.o.getX())*(n.getX() - this.o.getX())+(n.getY()- this.o.getY())*(n.getY() - this.o.getY()) ) > (this.redious*this.redious)) 
		    {result = false;
		    }
		    return result;	
		    }
		
		 public static void main(String[] args) {
		    	Point p = new Point(3.0,4.0);
		    	Circle circle1 = new Circle((new Point(0.0,0.0)),5);
		    	circle1.isIn(p);
		    	System.out.println(circle1.isIn(p));
	}
}
	class Point{
		private double x;
		private double y;
		Point(double _x,double _y){
			this.setX(_x);
			this.setY(_y);
		}
		Point(){
			x = 0.0;
			y = 0.0;
		}
		public void setX(double x) {
			this.x = x;
		}
		public void setY(double y) {
			this.y = y;
		}
		public double getX() {
			return x;
		}
		public double getY() {
			return y;
		}
	}



