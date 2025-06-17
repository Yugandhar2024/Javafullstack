class Unary 
{
    public static void main(String[] args) {
        int a = 10;
        int b = -a;         
        int c = +a;         

        int x = 5;
        int preInc = ++x;   
        int postInc = x++;  

        int y = 5;
        int preDec = --y;   
        int postDec = y--; 

        boolean flag = true;
        boolean notFlag = !flag;

        int n = 5;
        int bitwiseNot = ~n; // Bitwise complement: ~5 = -6
        System.out.println("Unary minus of a: " + b);
        System.out.println("Unary plus of a: " + c);
        System.out.println("Pre-increment: " + preInc);
        System.out.println("Post-increment: " + postInc);
        System.out.println("Final value of x: " + x);
        System.out.println("Pre-decrement: " + preDec);
        System.out.println("Post-decrement: " + postDec);
        System.out.println("Final value of y: " + y);
        System.out.println("Logical NOT of flag: " + notFlag);
        System.out.println("Bitwise complement of 5: " + bitwiseNot);
    }
}
