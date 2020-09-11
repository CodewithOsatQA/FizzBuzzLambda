package com.qa;
class LambdaExpressions {

    interface FuncInterface {
        void operation(int a);
    }

    private void operate(int a, FuncInterface funcObj) {
        funcObj.operation(a);
    }

    public static void main(String[] args) {
        FuncInterface fizz = (int x) -> {if (x%3 == 0) System.out.print(" Fizz");};
        FuncInterface buzz = (int x) -> {if (x%5 == 0) System.out.print(" Buzz");};
        LambdaExpressions lambda = new LambdaExpressions();
        
        for (int x = 1; x <= 200; x ++) {
        	System.out.print(x);
        	lambda.operate(x, fizz);
        	lambda.operate(x, buzz);
        	System.out.println();
        	
        }
    }
}