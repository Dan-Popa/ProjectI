package ex01;


public interface Calculator <T extends Number> {
    double calculateFees(T clubID);
}
