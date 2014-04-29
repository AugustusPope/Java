package structuralpattern.bridge;

public class Triangle extends Shape {

	private double _ax;
	private double _ay;
	private double _bx;
	private double _by;
	private double _cx;
	private double _cy;
	
	protected Triangle(double ax,double ay,double bx,double by,double cx,double cy,DrawAPI drawAPI) {
		super(drawAPI);
		this._ax = ax;
		this._ay = ay;
		this._bx = bx;
		this._by = by;
		this._cx = cx;
		this._cy = cy;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		this.drawAPI.Draw();
		System.out.println("Drawing a Triangle! Point A : (" + _ax+","+_ay+");  Point B : (" + _bx+","+_by+"); Point C : (" + _cx+","+_cy+");");

	}

}
