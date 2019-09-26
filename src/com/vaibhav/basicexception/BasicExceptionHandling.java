package com.vaibhav.basicexception;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1;
        int input2;
        int result = 0;

        try{
            input1 = sc.nextInt();
            input2 = sc.nextInt();
            result = input1 / input2;
        }
        catch (ArithmeticException e){
            System.out.println("Input2 can not be zero");
        }
        catch (InputMismatchException e){
            System.out.println("please enter integer");
        }
        finally {
            sc.close();
            System.out.println(result);
        }
    }
}
