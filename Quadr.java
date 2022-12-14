package oop2;

public class Quadr extends point {
private point endpoints1; 
private point endpoints2;
private point endpoints3;
private point endpoints4;

    public  void setdata(point endpoints1,point endpoints2,point endpoints3,point endpoints4) {
    	endpoints1.setPoint(getX(), getY());
    	endpoints2.setPoint(getX(), getY());
    	endpoints3.setPoint(getX(), getY());
    	endpoints4.setPoint(getX(), getY());
    }
    public double Area() {
    	double a=this.distance(endpoints1, endpoints2);
    	double b=this.distance(endpoints2, endpoints3);
    	double c=this.distance(endpoints1, endpoints3);
    	double s=(a+b+c)/2;
    	double Area1=Math.sqrt(s(s-a)(s-b)(s-c));
    	
    	return Area;
    }





}
