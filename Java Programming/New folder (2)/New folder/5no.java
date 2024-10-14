public class EquationSolver {
  public static void main(String[] args) {
    int A = 5, B = 6, C = 7, D = 8;

    int result1 = A * B - C * D;
    int result2 = 2 * A - B + 3 * D;
    int result3 = (int) (Math.pow(A, 2) + Math.pow(B, 2) - C * C + Math.pow(D, 2));
    int result4 = (int) (Math.pow(A, 3) + B - Math.pow(C, 2));

    System.out.println("\n Result 1: " + result1);
    System.out.println("\n Result 2: " + result2);
    System.out.println("\n Result 3: " + result3);
    System.out.println(" Result 4: " + result4);
  }
}