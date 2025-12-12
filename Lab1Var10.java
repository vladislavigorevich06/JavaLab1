public class Lab1Var10 {

    // Задание 3) Букву в число
    public int charToNum(char x) {
        return x - '0';
    }

    // Задание 4) Есть ли позитив
    public boolean isPositive(int x) {
        return x > 0;
    }

    // Задание 6) Большая буква
    public boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    // Задание 8) Делитель
    public boolean isDivisor(int a, int b) {
        if (a == 0 || b == 0) return false;
        return (a % b == 0) || (b % a == 0);
    }

    // Задание 10) Сумма последних цифр
    public int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    // === Новые задания ===

    // Задание 2.1) Модуль числа
    public int abs(int x) {
        if (x < 0) return -x;
        return x;
    }

    // Задание 2.4) Строка сравнения
    public String makeDecision(int x, int y) {
        if (x < y) return x + "<" + y;
        else if (x > y) return x + ">" + y;
        else return x + "==" + y;
    }

    // Задание 2.5) Тройной максимум
    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

    // Задание 2.7) Двойная сумма
    public int sum2(int x, int y) {
        int s = x + y;
        if (s >= 10 && s <= 19) return 20;
        return s;
    }

    // Задание 2.9) День недели
    public String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    // Циклы
    public String reverseListNums(int x) {
        String s = "";
        for (int i = x; i >= 0; i--) s += i + " ";
        return s.trim();
    }

    public String chet(int x) {
        String s = "";
        for (int i = 0; i <= x; i += 2) s += i + " ";
        return s.trim();
    }

    public boolean equalNum(int x) {
        int last = x % 10;
        x /= 10;
        while (x > 0) {
            int digit = x % 10;
            if (digit != last) return false;
            x /= 10;
        }
        return true;
    }

    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) System.out.print(" ");
            for (int k = 1; k <= i; k++) System.out.print("*");
            System.out.println();
        }
    }
    // 1) Поиск первого значения
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    // 2) Поиск последнего значения
    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    // 4) Добавление в массив
    public int[] add(int[] arr, int x, int pos) {
        if (pos < 0) pos = 0;
        if (pos > arr.length) pos = arr.length;
        int[] res = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) res[i] = arr[i];
        res[pos] = x;
        for (int i = pos; i < arr.length; i++) res[i + 1] = arr[i];
        return res;
    }

    // 7) Реверс массива
    public int[] reverseBack(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }
        return res;
    }

    // 10) Удалить негатив
    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int v : arr) if (v >= 0) count++;
        int[] res = new int[count];
        int idx = 0;
        for (int v : arr) {
            if (v >= 0) res[idx++] = v;
        }
        return res;
    }
}
