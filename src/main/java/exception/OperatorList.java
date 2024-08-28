package exception;

import java.util.*;

public class OperatorList {
    public static void main(String[] args) {
        List<String> operator = Arrays.asList("Hellagur", "Mlynar", "Totter", "Hoederer", "Stormeye", "Sharp");
            
            try {
                searchOperator(operator, "SilverAsh");
            } catch (OperatorUnavailable e) {
                System.out.println("Operator not found: " + e.getMessage());
            }
    }

    public static void searchOperator(List<String> operator, String operatorName) throws OperatorUnavailable {
        try {
            if (operator.contains(operatorName)) {
                System.out.println("Operator found: " + operatorName);
            } else {
                throw new OperatorUnavailable(operatorName);
            }
        } catch (OperatorUnavailable e) {
            System.out.println("Trying to find operator: " + operatorName);
            throw e;
        }
    }
}

class OperatorUnavailable extends Exception{
    public OperatorUnavailable(String operatorName) {
        super(operatorName + " is unavailable");
    }
}