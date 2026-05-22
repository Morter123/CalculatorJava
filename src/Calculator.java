public class Calculator {

    private int n1, n2;

    public enum Operation {
        SUM, MINUS, MULTIPLY
    }

    public Calculator() {}

    protected void setNum1(int num) {
        this.n1 = num;
    }

    protected void setNum2(int num) {
        this.n2 = num;
    }

    protected int getResult(String operation) {

        String value = operation.trim().toUpperCase();
        
        switch (value) {
            case "SUM":
                return n1 + n2;
            case "MINUS":
                return n1 - n2;
            case "MULTIPLY":
                return n1 * n2;
            default:
                throw new IllegalArgumentException("Неизвестная операция");
        }
    }

}
