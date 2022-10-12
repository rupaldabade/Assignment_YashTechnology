import javax.annotation.Resource;
public class A {

		private int x;
		@Resource(name="refb")
		private B b;
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public B getB() {
			return b;
		}
		public void setB(B b) {
			this.b = b;
		}
		
}
