//(на входе есть числовой массив, необходимо вывести элементы массива кратные 3)//
public class Test3 {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, 9, 12, 15, 18, 21};
        for (int number : array) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}