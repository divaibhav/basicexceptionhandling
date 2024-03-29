package com.vaibhav.basicexception;

import com.vaibhav.exception.DenominatorIsZeroException;

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
            if(input2 == 0){
                throw new DenominatorIsZeroException("Input2 cannot be zero");
            }
            result = input1 / input2;
        }
        catch (ArithmeticException e){
            System.out.println("Input2 can not be zero");
        }
        catch (InputMismatchException e){
            System.out.println("please enter integer");
        }
        catch(DenominatorIsZeroException e){
            System.out.println(e.getMessage());
        }
        finally {
            //closing Scanner class
            sc.close();
            // printing result
            System.out.println(result);
        }
    }
}
