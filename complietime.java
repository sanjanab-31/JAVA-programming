public class complietime {
    public static void main(String[] args){
        class mul{
            static int multiply(int a,int b){
                return a*b;
            }
            static double multiply(double a,double b){
                return a*b;
            }
        }
        int result = mul.multiply(2, 3);
        double result2 = mul.multiply(2.5, 3.5);
    }
}
