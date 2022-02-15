package ex3;

public class Main{
    public static void main(String []args) {
        ExpressionParenthesee expressionParenthesee;

        try {
            expressionParenthesee = new ExpressionParenthesee("((1+X)-(2-y))))");
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
}
