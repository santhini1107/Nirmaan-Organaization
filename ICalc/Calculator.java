package day15;

public class Calculator implements ICalculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public int mult(int a, int b) {
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		return a/b;
	}
	@Override
	public int mud(int a, int b) {
		return a%b;
	}

}
