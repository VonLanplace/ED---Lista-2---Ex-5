package controller;
public class Mdc{
  public static int calc(int X, int Y){
    if (X < Y) {
      return calc(Y,X);
    }else if (X == Y) {
      return X;
    }else{
      return calc(X-Y,Y);
    }
  }
}

