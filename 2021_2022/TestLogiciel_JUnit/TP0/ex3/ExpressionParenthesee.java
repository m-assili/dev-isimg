package ex3;

import ex3.exceptions.ParentheseFermantException;

public class ExpressionParenthesee {
    private String expression;
    ExpressionParenthesee(String str) throws Exception {
        Pile p = new Pile();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='(')
                p.empiler('(');
            else
                if(str.charAt(i)==')')
                    p.depiler();
        }
        if(p.getSize()!=0)
            throw new ParentheseFermantException();
        else
            System.out.println("*** Expression Correcte ***");
    }
}
