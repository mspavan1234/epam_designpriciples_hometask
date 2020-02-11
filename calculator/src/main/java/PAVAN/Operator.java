package PAVAN;

/**
 * Operator
 */
public class Operator {
    private int num1,num2;
    private String op;
    public Operator(int n1,String op1,int n2){
        num1=n1;
        num2=n2;
        op=op1;
    }
    protected String getResult(){
        switch(op.toCharArray()[0]){
            case '+': return add(num1,op,num2);
            case '-': return sub(num1,op,num2);
            case '*': return mul(num1,op,num2);
            case '/': return div(num1,op,num2);
            default: return "Enter valid operator";
        }
    }
    private String add(int num1,String op,int num2){
        return ""+(num1+num2);
    }
    private String sub(int num1,String op,int num2){
        return ""+(num1-num2);
    }
    private String mul(int num1,String op,int num2){
        return ""+(num1*num2);
    }
    private String div(int num1,String op,int num2){
        return ""+(num1/num2);
    }
}