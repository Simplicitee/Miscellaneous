public class Math {
    
    public int x;
    
    public Math(int x) {
        this.x = x;
    }
    
    public int add(int y) {
        return x+y;
    }
    
    public int subtract(int y, boolean yfromx) {
        return yfromx? x-y : y-x;
    }
    
    public int multiply(int y) {
        return x*y;
    }
    
    public double divide(int y, boolean yfromx) {
        return yfromx? x/y : y/x;
    }
    
    public int modulo(int y, boolean yfromx) {
        return yfromx? x%y : y%x;
    
    public int factorial() {
        int result = 1;
        for (int n = x; n ≥ 1; n--) {
            result *= n;
        }
        return result;
    }
}
