public class Math {
    
    public int x;
    
    public Math(int x) {
        this.x = x;
    }
    
    public int add(int... y) {
        int result = x;
        for (int i : y) {
            result += i;
        }
        return result;
    }
    
    public int subtract(int y, boolean yfromx) {
        return yfromx? x-y : y-x;
    }
    
    public int multiply(int... y) {
        int result = x;
        for (int i : y) {
            result *= i;
        }
        return result;
    }
    
    public double divide(int y, boolean yfromx) {
        return yfromx? x/y : y/x;
    }
    
    public int modulo(int y, boolean yfromx) {
        return yfromx? x%y : y%x;
    }
    
    public int factorial() {
        int result = 1;
        for (int n = x; n >= 1; n--) {
            result *= n;
        }
        return result;
    }
    
    public int power(int n) {
        int result = 1, a = n >= 0 ? n : (n*-1);
        while (a > 0) {
            result *= x;
            a--;
        }
        return n >= 0 ? result : 1/result;
    }
    
    /**
    *   @param base The base you want to check for if factors
    *               for your number exist. (ex: x=9, base=3)
    */
    public int root(int n, int base) {
        int result = x;
        while (n > 0) {
            if (result%base == 0) {
                result /= base;
            } else {
                break;
            }
        }
        return result;
    }
}
