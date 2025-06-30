
public class Homework {
    public static void main(String[] args) {
        /*
        Первый блок самостоятельной работы
        ==================================
         */
        /**
         * 1. Напишите функциональность, которая вычисляет площадь круга
         * S = π * r²
         */
        double radius = 10;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.printf("Площадь окружности радиусом %.0f равна %.4f\n", radius, circleArea);

        /**
         * 2. Переведите температуру в градусах Цельсия в Фаренгейты
         * F = (C * 9/5) + 32
         */
        double celsius = 21;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Температура %.1f\u00B0 Цельсия равна %.1f\u00B0 Фаренгейта\n", celsius, fahrenheit);

        /**
         * 3. Проверьте, является ли длина сроки "Hello" равной длине другой строки
         */
        String hello = "Hello";
        String otherString = "Bye";
        String resEqualLen = hello.length() == otherString.length() ? "равны" : "не равны";
        System.out.printf("Длины строк со значениями \"%s\" и \"%s\" %s\n", hello, otherString, resEqualLen);

        /**
         * 4. Напишите функциональность, которая определяет, является ли год високосным
         * Год високосный, если он делится на 4 без остатка.
         * Однако, есть исключение: если год делится на 100, то он не високосный, если только он не делится на 400.
         */
        int year = 2025;
        String resLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "високосным" : "обычным";
        System.out.printf("%d является %s годом\n", year, resLeapYear);

        /**
         * 5. Напишите калькулятор ИМТ
         * ИМТ = масса(кг)/рост(м²)
         */
        double weight = 89.40;
        double height = 1.77;
        double indexBmi = weight / Math.pow(height, 2);
        System.out.printf("ИМТ человека массой %.2fкг и ростом %.2fм равен %.2f\n", weight, height, indexBmi);
        System.out.println();

        /**
         * 6. Выведите в консоль таблицу истинности для операторов && и ||
         *
         */
        boolean a = true;
        boolean b = true;
        System.out.println("a    \tb    \ta&&b  \ta||b  ");
        System.out.println("_____\t_____\t_____\t_____");
        System.out.printf("%b\t%b\t%b\t%b%n", a, b, a && b, a || b);
        a = false;
        b = true;
        System.out.printf("%b\t%b\t%b\t%b%n", a, b, a && b, a || b);
        a = true;
        b = false;
        System.out.printf("%b\t%b\t%b\t%b%n", a, b, a && b, a || b);
        a = false;
        b = false;
        System.out.printf("%b\t%b\t%b\t%b%n", a, b, a && b, a || b);
        System.out.println();

        /**
         * 7. Выведите в консоль квадрат
         */
        int size1 = 5;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.print("#  ");
            }
            System.out.println();
        }
        System.out.println();

        /**
         * 8. Выведите в консоль полый квадрат
         */
        int size2 = 4;
        for (int i = 0; i < size2; i++) {
            for (int j = 0; j < size2; j++) {
                if ((i == 0 || i == size2 - 1) || (j == 0 || j == size2 - 1)) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        /**
         * 9. Выведите в консоль ромб
         */
        System.out.println("        ♦");
        System.out.println("      ♦ ♦ ♦");
        System.out.println("    ♦ ♦ ♦ ♦ ♦");
        System.out.println("  ♦ ♦ ♦ ♦ ♦ ♦ ♦");
        System.out.println("♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦");
        System.out.println("  ♦ ♦ ♦ ♦ ♦ ♦ ♦");
        System.out.println("    ♦ ♦ ♦ ♦ ♦");
        System.out.println("      ♦ ♦ ♦");
        System.out.println("        ♦");
        System.out.println();

        /**
         * 10. Выведите в консоль смайлик
         */
        System.out.println("\uD83D\uDE0A");
        System.out.println(":-)");
        /*
        Второй блок самостоятельной работы
        ==================================
        if-else
        1. Дано число. Напишите программу, которая определяет, является ли оно четным или нечетным
        2. Даны два числа. Выведите «Первое больше», «Второе больше» или «Равны»
        3. Дано число. Выведите «Положительное», «Отрицательное» или «Равно нулю»
        4. Дано число (возраст). Если возраст >= 18, выведите «Доступ разрешен», иначе — «Доступ запрещен
        5. Придумать задачу самим
         */

        /**
         * 1. Дано число. Напишите программу, которая определяет, является ли оно четным или нечетным
         */
        int num1 = 5;
        String resEvenOdd;
        if (num1 % 2 == 0) {
            resEvenOdd = "четное";
        } else {
            resEvenOdd = "нечетное";
        }
        System.out.printf("Число %d: %s\n", num1, resEvenOdd);

        /**
         * 2. Даны два числа. Выведите «Первое больше», «Второе больше» или «Равны»
         */
        int numA = 2;
        int numB = 3;
        String resRelation;
        if (numA == numB) {
            resRelation = "Равны";
        } else if (numA > numB) {
            resRelation = "Первое больше";
        } else {
            resRelation = "Второе больше";
        }
        System.out.println(resRelation);

        /**
         * 3. Дано число. Выведите «Положительное», «Отрицательное» или «Равно нулю»
         */
        int numC = -3;
        String signDescript;
        if (numC == 0) {
            signDescript = "Равно нулю";
        } else if (numC > 0) {
            signDescript = "Положительное";
        } else {
            signDescript = "Отрицательное";
        }
        System.out.println(signDescript);

        /**
         * 4. Дано число (возраст). Если возраст >= 18, выведите "Доступ разрешен", иначе — "Доступ запрещен"
         */

        int age = 19;
        String accessState;
        if (age >= 18) {
            accessState = "Доступ разрешен";
        } else {
            accessState = "Доступ запрещен";
        }
        System.out.println(accessState);

        /**
         * 5. Придумать задачу самим
         * Вывести результат произведения двух чисел, его знак и кратность двум
         */
        int numE = 3;
        int numF = -2;
        int mult = numE * numF;
        String signMult;
        String divByTwo;

        if (mult == 0) {
            signMult = "равно нулю";
        } else if (mult > 0) {
            signMult = "положительное";
        } else {
            signMult = "отрицательное";
        }
        if (mult % 2 == 0) {
            divByTwo = "кратно двум";
        } else {
            divByTwo = "не кратно двум";
        }
        System.out.printf("Произведение чисел %d и %d равно %d: %s и %s\n", numE, numF, mult, signMult, divByTwo);

        /*
        Тернарный оператор
        1. Дано число. Используя тернарный оператор, определите, положительное, отрицательное или нулевое
        2. Дано число. С помощью тернарного оператора проверьте, делится ли оно на 3 и 5 одновременно. Выведите «Кратно» или «Не кратно»
        3. Для заданного числа верните строку «Четное» или «Нечетное», используя тернарный оператор.
         */
        /**
         * 1. Дано число. Используя тернарный оператор, определите, положительное, отрицательное или нулевое
         */
        int numG = 3;
        String signDescription = (numG == 0) ? "нулевое" : (numG > 0) ? "положительное" : "отрицательное";
        System.out.printf("Число %d: %s\n", numG, signDescription);
        /**
         * 2. Дано число. С помощью тернарного оператора проверьте, делится ли оно на 3 и 5 одновременно. Выведите «Кратно» или «Не кратно»
         */
        int numH = 15;
        String divisibilityStatus = (numH % 3 == 0 && numH % 5 == 0) ? "Кратно" : "Не кратно";
        System.out.println(divisibilityStatus);

        /**
         * 3. Для заданного числа верните строку «Четное» или «Нечетное», используя тернарный оператор.
         */
        int numH2 = 13;
        String oddState = (numH2 % 2 == 0) ? "Четное" : "Нечетное";
        System.out.println(oddState);

        /*
        switch
        1. Дано число от 1 до 7. Выведите название дня недели. Если число вне диапазона, выведите «Ошибка»
        2. Дано число от 1 до 5. Выведите описание оценки (оцените свою работу)
         */
        /**
         * 1. Дано число от 1 до 7. Выведите название дня недели. Если число вне диапазона, выведите «Ошибка»
         */
        int numH3 = 5;
        switch (numH3) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Ошибка");
        }
        /**
         * 2. Дано число от 1 до 5. Выведите описание оценки (оцените свою работу)
         */
        int grade = 4;
        switch (grade) {
            case 1:
                System.out.println("Кол");
                break;
            case 2:
                System.out.println("Неуд");
                break;
            case 3:
                System.out.println("Зачет");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Ошибка");
        }
        /*
        for
        1. Дан список чисел. Посчитайте сумму всех четных элементов
        2. Дан список чисел. Найдите максимальное значение
        3. Дано число n. Выведите таблицу умножения для n от 1 до 10
        4. С помощью цикла for выведите числа от 10 до 1 в обратном порядке
        5. Найдите количество четных чисел в диапазоне от 1 до 50
         */
        /**
         * 1. Дан список чисел. Посчитайте сумму всех четных элементов
         */
        int[] listNum = {3, 6, 7, 8, 4, 7, 9};
        int sumOdd = 0;
        for (int i = 0; i < listNum.length; i++) {
            if (listNum[i] % 2 == 0) {
                sumOdd += listNum[i];
            }
        }
        System.out.println(sumOdd);
        /**
         * 2. Дан список чисел. Найдите максимальное значение
         */
        int[] listNum2 = {3, 6, 7, 8, 88, 7, -99999};
        int maxNum = listNum2[0];
        for (int i = 1; i < listNum2.length; i++) {
            if (listNum2[i] > maxNum) {
                maxNum = listNum2[i];
            }
        }
        System.out.println(maxNum);
        /**
         * 3. Дано число n. Выведите таблицу умножения для n от 1 до 10
         */
        int n = 2;
        System.out.printf("Таблица умножения для %d:\n", n);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", i, n, i * n);
        }
        /**
         * 4. С помощью цикла for выведите числа от 10 до 1 в обратном порядке
         */
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        /**
         * 5. Найдите количество четных чисел в диапазоне от 1 до 50
         */
        int countOdd = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                countOdd++;
            }
        }
        System.out.printf("Количество четных чисел в диапазоне от 1 до 50: %d\n", countOdd);
        /*
        while
        1. Найдите наименьшее число больше 100, которое делится на 7
        2. Дано число n. Вычислите его факториал через цикл while
        3. Дано число. Определите, является ли оно простым
        4. Придумать задачу самим
         */
        /**
         * 1. Найдите наименьшее число больше 100, которое делится на 7
         */
        int minDiv7 = 101;
        while (minDiv7 % 7 != 0) {
            minDiv7++;
        }
        System.out.println("Наименьшее число больше 100, которое делится на 7: " + minDiv7);
        /**
         * 2. Дано число n. Вычислите его факториал через цикл while
         */
        int n3 = 5;
        int counter = 0;
        long factorial = 1;
        while (counter < n3) {
            counter++;
            factorial *= counter;
        }
        System.out.printf("Факториал числа %d равен %d\n", n3, factorial);
        /**
         * 3. Дано число. Определите, является ли оно простым
         * Если число меньше 2, то оно не простое.
         * Проверяем делители от 2 до квадратного корня из числа (включительно). Если нашли делитель, то число не простое.
         * Если делителей нет, то число простое.
         *
         */
        int numK = 1;
        String resPrime = numK <= 1 ? "Не простое" : "Простое";
        int inc = 2;
        while (inc <= Math.sqrt(numK)) {
            if (numK % inc == 0) {
                resPrime = "Не простое";
                break;
            }
            inc++;
        }
        System.out.println(resPrime);
        /**
         * 4. Придумать задачу самим
         * Посчитать сумму всех чисел до numX кратных divY
         */
        int numX = 50;
        int divY = 7;
        int sumDivY = 0;
        int countX = 0;
        while (countX <= numX) {
            if (countX % divY == 0) {
                sumDivY += countX;
            }
            countX++;
        }
        System.out.println(sumDivY);
        /*
        break & continue
        1. Выведите все числа от 1 до 20, кроме тех, что делятся на 3
        2. Дан список чисел. Суммируйте элементы, пока не встретите отрицательное число
        3. Дан список чисел. Суммируйте элементы, пока сумма не превысит 100
         */
        /**
         * 1. Выведите все числа от 1 до 20, кроме тех, что делятся на 3
         */
        for (int i = 1; i <= 20; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        /**
         * 2. Дан список чисел. Суммируйте элементы, пока не встретите отрицательное число
         */
        int[] list2 = {1, 3, 5, 56, 7, 7, -6, 8};
        int sumList2 = 0;
        for (int i = 0; i < list2.length; i++) {
            if (list2[i] < 0) {
                break;
            }
            sumList2 += list2[i];
        }
        System.out.println(sumList2);
        /**
         * 3. Дан список чисел. Суммируйте элементы, пока сумма не превысит 100
         */
        int[] list3 = {1, 3, 5, 56, 70, 7, -6, 8,};
        int sumList3 = 0;
        for (int i = 0; i < list3.length; i++) {
            if (sumList3 + list3[i] > 100) {
                break;
            }
            sumList3 += list3[i];
        }
        System.out.println(sumList3);
    }
}