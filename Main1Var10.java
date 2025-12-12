import java.util.*;

public class Main1Var10 {

    public static void main(String[] args) {
        Lab1Var10 lab = new Lab1Var10();
        Scanner sc = new Scanner(System.in);


        // Задание 3) Букву в число
        System.out.println("=== ЗАДАНИЕ 3. Букву в число ===");
        char x3 = 0;
        boolean ok = false;
        while (!ok) {
            System.out.print("Введите символ от '0' до '9': ");
            String s = sc.next();
            if (s.length() == 1 && s.charAt(0) >= '0' && s.charAt(0) <= '9') {
                x3 = s.charAt(0);
                ok = true;
            }
        }
        System.out.println("Результат: " + lab.charToNum(x3));

        // Задание 4) Есть ли позитив
        System.out.println("\n=== ЗАДАНИЕ 4. Есть ли позитив ===");
        System.out.print("Введите число x: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int n4 = sc.nextInt();
        System.out.println("Положительное? " + lab.isPositive(n4));

        // Задание 6) Большая буква
        System.out.println("\n=== ЗАДАНИЕ 6. Большая буква ===");
        System.out.print("Введите символ x: ");
        char c6 = sc.next().charAt(0);
        System.out.println("Это большая буква? " + lab.isUpperCase(c6));

        // Задание 8) Делитель
        System.out.println("\n=== ЗАДАНИЕ 8. Делитель ===");
        System.out.print("Введите число a: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int a8 = sc.nextInt();
        System.out.print("Введите число b: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int b8 = sc.nextInt();
        System.out.println("Одно число делит другое нацело? " + lab.isDivisor(a8, b8));

        // Задание 10) Сумма последних цифр
        System.out.println("\n=== ЗАДАНИЕ 10. Многократный вызов (сумма последних цифр) ===");
        int result = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите число " + i + ": ");
            while (!sc.hasNextInt()) { sc.next(); }
            int num = sc.nextInt();
            result = lab.lastNumSum(result, num);
            System.out.println("Промежуточный результат: " + result);
        }
        System.out.println("Итоговая сумма последних цифр: " + result);



        // Задание 2.1) Модуль числа
        System.out.println("\n=== ЗАДАНИЕ 2.1. Модуль числа ===");
        System.out.print("Введите число x: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int x2 = sc.nextInt();
        System.out.println("Модуль числа: " + lab.abs(x2));

        // Задание 2.4) Строка сравнения
        System.out.println("\n=== ЗАДАНИЕ 2.4. Строка сравнения ===");
        System.out.print("Введите число x: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int x4 = sc.nextInt();
        System.out.print("Введите число y: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int y4 = sc.nextInt();
        System.out.println("Результат сравнения: " + lab.makeDecision(x4, y4));

        // Задание 2.5) Тройной максимум
        System.out.println("\n=== ЗАДАНИЕ 2.5. Тройной максимум ===");
        System.out.print("Введите число x: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int x5 = sc.nextInt();
        System.out.print("Введите число y: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int y5 = sc.nextInt();
        System.out.print("Введите число z: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int z5 = sc.nextInt();
        System.out.println("Максимум из трёх: " + lab.max3(x5, y5, z5));

        // Задание 2.7) Двойная сумма
        System.out.println("\n=== ЗАДАНИЕ 2.7. Двойная сумма ===");
        System.out.print("Введите число x: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int x7 = sc.nextInt();
        System.out.print("Введите число y: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int y7 = sc.nextInt();
        System.out.println("Результат sum2: " + lab.sum2(x7, y7));

        // Задание 2.9) День недели
        System.out.println("\n=== ЗАДАНИЕ 2.9. День недели ===");
        System.out.print("Введите число (1-7): ");
        while (!sc.hasNextInt()) { sc.next(); }
        int x9 = sc.nextInt();
        System.out.println("День недели: " + lab.day(x9));

        //ЦИКЛЫ
        System.out.println("\n=== ЗАДАНИЕ 3.2. Числа наоборот ===");
        System.out.print("Введите число x: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int x32 = sc.nextInt();
        System.out.println("Результат: " + lab.reverseListNums(x32));

        System.out.println("\n=== ЗАДАНИЕ 3.3. Четные числа ===");
        System.out.print("Введите число x: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int x33 = sc.nextInt();
        System.out.println("Результат: " + lab.chet(x33));

        System.out.println("\n=== ЗАДАНИЕ 3.6. Одинаковость цифр числа ===");
        System.out.print("Введите число x: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int x36 = sc.nextInt();
        System.out.println("Все цифры одинаковы? " + lab.equalNum(x36));

        System.out.println("\n=== ЗАДАНИЕ 3.8. Левый треугольник ===");
        System.out.print("Введите высоту треугольника x: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int x38 = sc.nextInt();
        lab.leftTriangle(x38);

        System.out.println("\n=== ЗАДАНИЕ 3.9. Правый треугольник ===");
        System.out.print("Введите высоту треугольника x: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int x39 = sc.nextInt();
        lab.rightTriangle(x39);

        // массив

        // Задание 1 и 2) Поиск первого и последнего значения
        System.out.println("\n=== ЗАДАНИЕ 1 и 2. Поиск первого и последнего значения ===");
        int[] arr1 = inputArray(sc);
        System.out.print("Введите число x для поиска: ");
        int xFind = sc.nextInt();
        System.out.println("Первое вхождение: " + lab.findFirst(arr1, xFind));
        System.out.println("Последнее вхождение: " + lab.findLast(arr1, xFind));

        // Задание 4) Добавление в массив
        System.out.println("\n=== ЗАДАНИЕ 4. Добавление в массив ===");
        int[] arrAdd = inputArray(sc);
        System.out.print("Введите число x для вставки: ");
        int valAdd = sc.nextInt();
        System.out.print("Введите позицию pos: ");
        int posAdd = sc.nextInt();
        int[] newArr = lab.add(arrAdd, valAdd, posAdd);
        System.out.println("Новый массив: " + Arrays.toString(newArr));

        // Задание 7) Реверс массива
        System.out.println("\n=== ЗАДАНИЕ 7. Реверс массива ===");
        int[] arrRev = inputArray(sc);
        int[] reversed = lab.reverseBack(arrRev);
        System.out.println("Реверс массива: " + Arrays.toString(reversed));

        // Задание 10) Удаление негативных чисел
        System.out.println("\n=== ЗАДАНИЕ 10. Удаление негативных чисел ===");
        int[] arrNeg = inputArray(sc);
        int[] noNeg = lab.deleteNegative(arrNeg);
        System.out.println("Массив без негативных: " + Arrays.toString(noNeg));
    }

    // метод для ввода массива
    public static int[] inputArray(Scanner sc) {
        System.out.print("Введите размер массива: ");
        while (!sc.hasNextInt()) { sc.next(); }
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            while (!sc.hasNextInt()) { sc.next(); }
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
