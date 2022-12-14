package oop2;

public class point {
	
		private float x =0.0f;
		private float y =0.0f;

		public point(){
		}
		public void setPoint(float x ,float y) {	
			this.x=x;
			this.y=y;
		}
		public float getX() {
			return x;
		}
		
		public float getY() {
			return y;
		}
		public double distance(point obj1,point obj2) {               
		double distance =Math.sqrt(((this.x-obj2.x)*(this.x-obj2.x))+((this.y-obj2.y)*(this.y-obj2.y)));
			
			return distance;
		}
}