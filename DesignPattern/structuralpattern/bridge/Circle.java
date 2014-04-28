package structuralpattern.bridge;

public class Circle extends Shape {
	
	protected Circle(int x,int y,int radius,DrawAPI drawAPI) {
		super(drawAPI);
		this._x = x;
		this._y = y;
		this._radius = radius;
	}

	private double _x;
	private double _y;
	private double _radius;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
        System.out.println("Drawing a circle! Axis_x: " + _x+";   Axis_y"+_y+"; radius: "+_radius);
	}

}
