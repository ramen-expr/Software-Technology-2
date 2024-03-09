public class q {

  public static int fun(int n)
    {
      if (n == 4){return n;}
      else return 2*fun(n+1);
  }
  
  public static void main (String[] args){
   printf("%d", fun(2));
   return 0;
  }
} 
