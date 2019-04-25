package by.it.eslaikouskaya.calc;

class Scalar extends Var {

	private double value;
	private ResourceManager manager = ResourceManager.INSTANCE;

	public double getValue() {
		return value;
	}

	@Override
	public Var add(Var other) throws CalcException {
		if (other instanceof Scalar)
			return new Scalar(this.value + ((Scalar) other).value);
		return other.add(this);
	}

	@Override
	public Var sub(Var other) throws CalcException {
		if (other.toString().matches(Patterns.SCALAR))
			return new Scalar(this.value - ((Scalar) other).value);
		Scalar minus=new Scalar(-1);
		return other.sub(this).mul(minus);
	}

	@Override
	public Var mul(Var other) throws CalcException {
		if (other instanceof Scalar)
			return new Scalar(this.value * ((Scalar) other).value);
		return other.mul(this);
	}

	@Override
	public Var div(Var other) throws CalcException {
		if (other instanceof Scalar) {
			if (((Scalar) other).value == 0)
				throw new CalcException(manager.getString("message.zero"));
			return new Scalar(this.value / ((Scalar) other).value);
		}
		return super.div(other);
	}

	Scalar(double value) {
		this.value = value;
	}

	Scalar(String str){
		this.value=Double.parseDouble(str);
	}

	Scalar(Scalar scalar){
		this.value=scalar.value;
	}


	@Override
	public String toString() {
		return Double.toString(value);
	}
}
