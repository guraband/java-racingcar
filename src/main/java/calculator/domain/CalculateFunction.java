package calculator.domain;

@FunctionalInterface
public interface CalculateFunction {
    int calculate(int value1, int value2);
}