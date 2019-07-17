import operator.add.*;
import operator.sub.*;
import operator.div.*;
import operator.mul.*;

public class Calculation {

	public static void main(String[] args) {
		double num1 = 3.14;
		double num2 = 5.5;
		
		double result;
		
		Add Add = new Add();
		Sub Sub = new Sub();
		Mul Mul = new Mul();
		Div Div = new Div();
		
		result = Add.add_cal(num1, num2);
		System.out.println(result);
		result = Sub.sub_cal(num1, num2);
		System.out.println(result);
		result = Mul.mul_cal(num1, num2);
		System.out.println(result);
		result = Div.div_cal(num1, num2);
		System.out.println(result);
	}

}
