package com.javaexamples;

public class SumArray {

	class dummy {
		int var1;
		int var2;

		public int getVar1() {
			return var1;
		}

		public void setVar1(int var1) {
			this.var1 = var1;
		}

		public int getVar2() {
			return var2;
		}

		public void setVar2(int var2) {
			this.var2 = var2;
		}

		@Override
		public String toString() {
			return "dummy [var1=" + var1 + ", var2=" + var2 + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + var1;
			result = prime * result + var2;
			return result;
		}

		public dummy(int var1, int var2) {
			super();
			this.var1 = var1;
			this.var2 = var2;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 2, 3, 4, 5 };
		int sum1 = 0;
		for (int num : numbers) {
			sum1 += num;
		}
		myfunction(sum1);
		System.out.println("Sum = " + sum1);

	}

	static void myfunction(int sum) {
		System.out.println("function");
	}
}