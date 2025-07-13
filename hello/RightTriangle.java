public class RightTriangle {
    public static void main(String[] args) {
        // Read inputs from command line
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Check if all sides are positive
        boolean isPositive = (a > 0) && (b > 0) && (c > 0);
        
        // Find the largest side
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        
        // Assign the other two sides
        int x = 0;
        int y = 0;
        
        if (max == a) {
            x = b;
            y = c;
        }
        else if (max == b) {
            x = a;
            y = c;
        }
        else {
            x = a;
            y = b;
        }

        // Apply Pythagorean theorem and check positivity
        boolean isRightTriangle = (x * x + y * y == max * max) && isPositive;

        System.out.println(isRightTriangle);
    }
}