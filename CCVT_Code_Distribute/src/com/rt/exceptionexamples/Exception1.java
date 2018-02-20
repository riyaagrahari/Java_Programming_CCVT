package com.rt.exceptionexamples;

class Exception1 {
public static void main(String args[]) {
  try{
int d = 0;
int a = 42 / d;
    
  }
  catch(ArithmeticException e){
    System.out.println("Error:Division By zero not possible");
    //e.printStackTrace(); //for displaying error message(debugging option for developer)
  }
}
}