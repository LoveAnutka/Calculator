import java.util.Scanner;

public class Calculator1 {
static Scanner scanner = new Scanner(System.in);

public static double getDouble() {
System.out.println("Please enter number");
double num;
if (scanner.hasNextDouble()) {
num = scanner.nextDouble();
}
else {
System.out.println("Error!!");
scanner.next();
num = getDouble();
}
return num;
}

public static char getOperation() {
System.out.println("Enter operation");
char operation;
if (scanner.hasNext()) {
operation = scanner.next().charAt(0);
}
else {
System.out.println("Error!");
scanner.next();
operation = getOperation();
}
return operation;
}
public static double calc(double number1, double number2, char operation) {
double result;
switch (operation) {
case '+': 
result = number1 + number2;
break;
case '-':
result = number1 - number2;
break;
case '*':
result = number1 * number2;
break;
case '/':
result = number1 / number2;
break;
default:
System.out.println("Error");
result = calc(number1, number2, getOperation());
}
return result;
}
public static void main(String[] args) {
double number1 = getDouble();
double number2 = getDouble();
char operation = getOperation();
double result = calc(number1, number2, operation);
System.out.println("Result is: " + result);
}
}