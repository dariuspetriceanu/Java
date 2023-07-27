package com.qa;

public class TestCalc{

        public static void main(String[] args) {

            BadCalc bc = new BadCalc();
            System.out.println("Mult result: " + bc.mult(2, 3));
            try{
                System.out.println("Div result: " + bc.div(3, 0));
            }catch (ArithmeticException e){
                System.out.println("Calculation error caught!");
            }

        }
}