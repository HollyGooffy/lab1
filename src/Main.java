import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main m = new Main();

        /* Задание 1.1 */
        System.out.println("Задание 1.1");

        while (true) {
            System.out.print("Введите число: ");
            if (in.hasNextDouble()) {
                double a_11 = in.nextDouble();
                double Fr = m.fraction(a_11);
                System.out.println("Результат: " + new DecimalFormat("0.000").format(Fr));
                break;
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите число: ");
                in.next();
                System.out.println();
                continue;
            }
        }
        System.out.println();


        /* Задание 1.3 */
        // nothing



        /* Задание 1.5 */
        System.out.println("Задание 1.5");
        while (true) {
            System.out.print("Введите число: ");
            if (in.hasNextInt()) {
                int a_15 = in.nextInt();
                boolean Dig = m.is2Digits(a_15);
                System.out.println(Dig);
                break;
            } else {
                System.out.println("Некорректный ввод.  ");
                in.next();
            }
        }
        System.out.println();



        /* Задание 1.7 */
        System.out.println("Задание 1.7");

        int a_17 = 0, b_17 = 0, num = 0;
        while (true) {
            System.out.print("Введите число a: ");
            if (in.hasNextInt()) {
                a_17 = in.nextInt();
            } else {
                System.out.println("Некоректный ввод.");
                in.next();
                continue;
            }

            System.out.print("Введите число b: ");
            if (in.hasNextInt()) {
                b_17 = in.nextInt();
            } else {
                System.out.println("Некоректный ввод.");
                in.next();
                continue;
            }

            System.out.print("Введите точку: ");
            if (in.hasNextInt()) {
                num = in.nextInt();
            } else {
                System.out.println("Некоректный ввод.");
                in.next();
                continue;
            }
            boolean IQ = m.isInRange(a_17, b_17, num);
            System.out.println(IQ);
            System.out.println();
            break;
        }



        /* Задание 1.9*/
        System.out.println("Задание 1.9");
        int a_19 = 0, b_19 = 0, c_19 = 0;

        while (true) {
            System.out.print("Введите первое число: ");
            if (in.hasNextInt()) {
                a_19 = in.nextInt();
            } else {
                System.out.println("Некорректный ввод. ");
                in.next();
                continue;
            }

            System.out.print("Введите второе число: ");
            if (in.hasNextInt()) {
                b_19 = in.nextInt();
            } else {
                System.out.println("Некорректный ввод. ");
                continue;
            }

            System.out.print("Введите третье число: ");
            if (in.hasNextInt()) {
                c_19 = in.nextInt();
            } else {
                System.out.println("Некорректный ввод. ");
                in.next();
                continue;
            }

            boolean EQ = m.isEqual(a_19, b_19, c_19);
            System.out.println("Результат: " + EQ);
            break;
        }
        System.out.println();




        /* Задание 2.1 */
        System.out.println("Задание 2.1");
        int a_21 = 0;
        System.out.print("Введите число: ");
        while (true) {
            if (in.hasNextInt()) {
                a_21 = in.nextInt();
            } else {
                System.out.print("Некорректный ввод. Пожалуйста, введите число: ");
                in.next();
                continue;
            }

            int ABS = m.abs(a_21);
            System.out.println("Результат: " + ABS);
            break;
        }
        System.out.println();



        /* Задание 2.3 */
        System.out.println("Задание 2.3");

        int a_23 = 0;
        System.out.print("Введите число: ");
        while (true) {
            if (in.hasNextInt()) {
                a_23 = in.nextInt();
            } else {
                System.out.print("Некорректный ввод. Пожалуйста, введите число:  ");
                in.next();
                continue;
            }
            boolean is_35 = m.is35(a_23);
            System.out.println("Результат: " + is_35);
            break;
        }
        System.out.println();



        /* Задание 2.5 */
        System.out.println("Задание 2.5");

        int a_25 = 0, b_25 = 0, c_25 = 0;
        while (true) {
            System.out.print("Введите первое число: ");
            if (in.hasNextInt()) {
                a_25 = in.nextInt();
            } else {
                System.out.print("Некорректный ввод. Пожалуйста, ");
                in.next();
                continue;
            }

            System.out.print("Введите второе число: ");
            if (in.hasNextInt()) {
                b_25 = in.nextInt();
            } else {
                System.out.print("Некорректный ввод. Пожалуйста, ");
                in.next();
                continue;
            }

            System.out.print("Введите третье число: ");
            if (in.hasNextInt()) {
                c_25 = in.nextInt();
            } else {
                System.out.print("Некорректный ввод. Пожалуйста, ");
                in.next();
                continue;
            }

            int Max3 = m.max3(a_25, b_25, c_25);
            System.out.println("Результат: " + Max3);
            break;
        }
        System.out.println();



        /* Задание 2.7 */
        System.out.println("Задание 2.7");
        int x_27 = 0, y_27 = 0;
        while (true) {
            System.out.print("Введите число x: ");
            if (in.hasNextInt()) {
                x_27 = in.nextInt();
            } else {
                System.out.print("Неккоректный ввод. ");
                in.next();
                continue;
            }

            System.out.print("Введите число y: ");
            if (in.hasNextInt()) {
                y_27 = in.nextInt();
            } else {
                System.out.print("Неккоректный ввод. ");
                in.next();
                continue;
            }
            int SUM27 = m.sum2(x_27, y_27);
            System.out.println("Результат: " + SUM27);
            break;
        }
        System.out.println();



        /* Задание 2.9 */
        System.out.println("Задание 2.9");
        int a_29 = 0;
        while (true) {
            System.out.print("Введите число: ");
            if (in.hasNextInt()) {
                a_29 = in.nextInt();
            } else {
                System.out.print("Неккоректный ввод. ");
                in.next();
                continue;
            }

            String day29 = m.day(a_29);
            System.out.println("Результат: " + day29);
            break;
        }
        System.out.println();


        /* Задание 3.1 */
        System.out.println("Задание 3.1");

        int a_31 = 0;
        while (true) {
            System.out.print("Введите число: ");
            if (in.hasNextInt()) {
                a_31 = in.nextInt();
                if (a_31 > 0) {
                    String func_31 = m.listNums(a_31);
                    System.out.println("Результат: " + func_31);
                    break;
                } else {
                    System.out.println("Число должно быть больше 0");
                }
            } else {
                System.out.print("Неккоректный ввод. ");
                in.next();

            }
        }
        System.out.println();


        /* Задание 3.3 */
        System.out.println("Задание 3.3");

        int a_33 = 0;
        while (true) {
            System.out.print("Введите число: ");
            if (in.hasNextInt()) {
                a_33 = in.nextInt();
                if (a_33 > 0) {
                    String func_33 = m.chet(a_33);
                    System.out.println("Результат: " + func_33);
                    break;
                } else {
                    System.out.println("Число должно быть больше 0");
                }
            } else {
                System.out.print("Неккоректный ввод. ");
                in.next();
            }
        }
        System.out.println();



        /* Задание 3.5 */
        System.out.println("Задание 3.5");

        int a_35 = 0;
        while (true) {
            System.out.print("Введите число: ");
            if (in.hasNextInt()) {
                a_35 = in.nextInt();
            } else {
                System.out.print("Неккоректный ввод. ");
                in.next();
                continue;
            }

            int Len = m.numLen(a_35);
            System.out.println("Результат: " + Len);
            break;
        }
        System.out.println();



        /* Задание 3.7 */
        System.out.println("Задание 3.7");

        int x_37 = 0;
        while (true) {
            System.out.print("Введите число: ");
            if (in.hasNextInt()) {
                x_37 = in.nextInt();
                if (x_37 > 0) {
                    m.square(x_37);
                    break;
                } else {
                    System.out.println("Число должно быть больше 0");
                }
            } else {
                System.out.print("Неккоректный ввод. ");
                in.next();
            }
        }
        System.out.println();



        /* Задание 3.9 */
        System.out.println("Задание 3.9");

        int x_39 = 0;
        while (true) {
            System.out.print("Введите число: ");
            if (in.hasNextInt()) {
                x_39 = in.nextInt();
                if (x_39 > 0) {
                    m.rightTriangle(x_39);
                    break;
                } else {
                    System.out.println("число должно быть больше 0");
                }
            } else {
                System.out.print("Неккоректный ввод. ");
                in.next();
            }
        }
        System.out.println();



        /* Задание 4.1 */
        System.out.println("Задание 4.1");

        int a_41 = 0;
        int n_41 = 0;

        while (true) {
            System.out.print("Введите число из массива: ");
            if (in.hasNextInt()) {
                a_41 = in.nextInt();
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                in.next();
                continue;
            }

            System.out.print("Введите длину массива: ");
            if (in.hasNextInt()) {
                n_41 = in.nextInt();
                if (n_41 > 0) {
                    int[] arr = new int[n_41];

                    // генератор рандома
                    Random random = new Random();
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = random.nextInt(5);
                    }

                    // вывод массива
                    System.out.print("Массив: ");
                    for (int j = 0; j < arr.length; j++) {
                        System.out.print(arr[j] + " ");
                    }

                    // вывод массива после скрипта
                    System.out.println();
                    int FF = m.findFirst(arr, a_41);
                    System.out.println("Результат: " + FF);
                    break;
                } else {
                    System.out.println("Длина массива должна быть положительной.");
                    continue;
                }
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                in.next();
                continue;
            }
        }
        System.out.println();




        /* Задание 4.3 */
        System.out.println("Задание 4.3");
        int n_43 = 0;

        while (true) {
            System.out.print("Введите длину массива: ");
            if (in.hasNextInt()) {
                n_43 = in.nextInt();
                if (n_43 > 0) {
                    int[] arr_43 = new int[n_43];

                    // генератор рандома
                    Random random_43 = new Random();
                    for (int i = 0; i < arr_43.length; i++) {
                        arr_43[i] = random_43.nextInt(100) - 50;
                    }

                    // вывод массива
                    System.out.print("Массив: ");
                    for (int j = 0; j < arr_43.length; j++) {
                        System.out.print(arr_43[j] + " ");
                    }

                    // вывод массива после скрипта
                    System.out.println();
                    int MA = m.maxAbs(arr_43);
                    System.out.println("Результат: " + MA);
                    break;
                } else {
                    System.out.println("Длина массива должна быть положительной");
                    in.next();
                    continue;
                }
            } else {
                System.out.println("Неккоректный ввод");
                in.next();
                continue;
            }
        }
        System.out.println();



        /* Задание 4.5 */
        System.out.println("Задание 4.5");

        int n_45 = 0;
        int pos = 0;

        while (true) {
            System.out.print("Введите длину массива: ");
            if (in.hasNextInt()) {
                n_45 = in.nextInt(); // проверка типа ввода для длины массива
                if (n_45 > 0) {
                    System.out.print("Введите количество элементов для вставки: ");

                    if (in.hasNextInt()) { // проверка длины ввода
                        int insLength = in.nextInt();
                        if (insLength > 0) {

                            int[] ins = new int[insLength];
                            System.out.print("Введите позицию для вставки: ");

                            if (in.hasNextInt()) {
                                pos = in.nextInt();

                                if (pos >= 0 && pos <= n_45) { // ввод элементов в новый массив
                                    System.out.println("Введите элементы массива для вставки: ");
                                    for (int i = 0; i < ins.length; i++) {
                                        if (in.hasNextInt()) {
                                            ins[i] = in.nextInt();
                                        } else {
                                            System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                                            in.next();
                                            i--;
                                            continue;
                                        }
                                    }

                                    int[] arr_45 = new int[n_45];

                                    // генератор рандома
                                    Random random_45 = new Random();
                                    for (int i = 0; i < arr_45.length; i++) {
                                        arr_45[i] = random_45.nextInt(100);
                                    }

                                    // вывод массива
                                    System.out.print("Массив: ");
                                    for (int j = 0; j < arr_45.length; j++) {
                                        System.out.print(arr_45[j] + " ");
                                    }
                                    System.out.println();

                                    // вывод массива после скрипта
                                    int[] AA = m.add(arr_45, ins, pos);
                                    System.out.println("Результат после вставки: " + Arrays.toString(AA));
                                    System.out.println();
                                    break;

                                } else {
                                    System.out.println("Позиция для вставки должна быть в пределах массива. Попробуйте еще раз.");
                                    continue;
                                }
                            } else {
                                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                                in.next();
                                continue;
                            }
                        } else {
                            System.out.println("Количество элементов для вставки должно быть положительным. Попробуйте еще раз.");
                            continue;
                        }
                    } else {
                        System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                        in.next();
                        continue;
                    }
                } else {
                    System.out.println("Длина массива должна быть положительной. Попробуйте еще раз.");
                    continue;
                }
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                in.next();
                continue;
            }
        }




        /* Задание 4.7 */
        System.out.println("Задание 4.7");

        int n_47 = 0;
        while (true) {
            System.out.print("Введите длину массива: ");
            if (in.hasNextInt()) {
                n_47 = in.nextInt();
                if (n_47 > 0) {
                    int[] arr_47 = new int[n_47];

                    // генератор рандома
                    Random random_47 = new Random();
                    for (int i = 0; i < arr_47.length; i++) {
                        arr_47[i] = random_47.nextInt(100);
                    }

                    // вывод массива
                    System.out.print("Массив: ");
                    for (int j = 0; j < arr_47.length; j++) {
                        System.out.print(arr_47[j] + " ");
                    }

                    // вывод массива после скрипта
                    System.out.println();
                    int[] RB = m.reverseBack(arr_47);
                    System.out.print("Перевернутый массив: ");
                    for (int i = 0; i < RB.length; i++) {
                        System.out.print(RB[i] + " ");
                    }
                    System.out.println();
                    break;
                } else {
                    System.out.println("Длина массива должна быть положительной");
                    continue;
                }
            } else {
                System.out.println("Введите корректные данные");
                in.next();
                continue;
            }
        }
        System.out.println();


        /* Задание 4.9*/
        System.out.println("Задание 4.9");

        int a_49 = 0;
        int n_49 = 0;
        while (true) {
            System.out.print("Введите число для поиска: ");
            if (in.hasNextInt()) {
                a_49 = in.nextInt();
            } else {
                System.out.println("Некорректные данные. попробуйте еще раз");
                in.next();
                continue;
            }
            System.out.print("Введите длину массива: ");
            if (in.hasNextInt()) {
                n_49 = in.nextInt();
                if (n_49 > 0) {
                    int[] arr_49 = new int[n_49];

                    // генератор рандома
                    Random random_49 = new Random();
                    for (int i = 0; i < arr_49.length; i++) {
                        arr_49[i] = random_49.nextInt(10);
                    }

                    // вывод массива
                    System.out.print("Массив: ");
                    for (int j = 0; j < arr_49.length; j++) {
                        System.out.print(arr_49[j] + " ");
                    }

                    // вывод массива после скрипта
                    System.out.println();
                    int[] FA = m.findAll(arr_49, a_49);
                    System.out.print("Результат: " + Arrays.toString(FA));
                    break;
                } else {
                    System.out.println("Длина не может быть отрицательной");
                    continue;
                }

            } else {
                System.out.println("Некорректный воод. Попробуйте еще раз: ");
                in.next();
                continue;
            }
        }
    }


    // \\\\\\\\\\\\\\\\\\\\\\\\\\\\\ //

    /* Задание 1.1 */
    public double fraction(double x) {
        if (x < 0) {
            return x - Math.ceil(x);
        } else {
            return x - Math.floor(x);
        }
    }


    /* Задание 1.3 */
    //nothing


    /* Задание 1.5 */
    public boolean is2Digits(int x) {
        return ((x >= 10 && x < 100)) || (x <= -10 && x >= -100);
    }


    /* Задание 1.7 */
    public boolean isInRange(int a_1, int b_1, int num) {
        if (a_1 > b_1) {
            int temp = a_1;
            a_1 = b_1;
            b_1 = temp;
        }

        return a_1 <= num && num <= b_1;
    }


    /* Задание 1.9 */
    public boolean isEqual(int a, int b, int c) {
        return (a == b && b == c && a == c);
    }


    /* Задание 2.1 */
    public int abs(int x) {
        return Math.abs(x);
    }


    /* Задание 2.3 */
    public boolean is35(int x) {
        if (x % 15 == 0) {
            return false;
        } else if ((x % 3 == 0) || (x % 5 == 0)) {
            return true;
        } else {
            return false;
        }
    }


    /* Задание 2.5 */
    public int max3(int x, int y, int z) {
        if ((x > y) && (x > z)) {
            return x;
        } else if ((y > z)) {
            return y;
        } else {
            return z;
        }
    }


    /* Задание 2.7*/
    public int sum2(int x, int y) {
        if ((x + y >= 10) && (x + y <= 20)) {
            return 20;
        } else return x + y;
    }


    /* Задание 2.9 */
    public String day(int x) {
        switch (x) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "Это не день недели";
        }
    }


    /* Задание 3.1 */
    public String listNums(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }


    /* Задание 3.3 */
    public String chet(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }


    /* Задание 3.5 */
    public int numLen(long x) {
        if (x == 0) {
            return 1;
        } else {
            int count = 0;
            while (x != 0) {
                x /= 10;
                count++;
            }
            return count;
        }

    }

    /* Задание 3.7 */
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /* Задание 3.9*/
    public void rightTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    /* Задание 4.1 */
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }


    /* Задание 4.3 */
    public int maxAbs(int[] arr) {
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Max) {
                Max = Math.abs(arr[i]);
            }
        }
        return Max;
    }


    /* Задание 4.5 */
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];

        System.arraycopy(arr, 0, result, 0, arr.length);

        System.arraycopy(ins, 0, result, pos, ins.length);

        System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);

        return result;
    }

    /* Задание 4.7 */
    public int[] reverseBack(int[] arr) {
        int[] reverseA = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reverseA[i] = arr[(arr.length - 1) - i];
        }
        return reverseA;
    }


    /* Задание 4.9 */
    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] resalt = new int[count];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                resalt[j++] = i;
            }
        }
        return resalt;
    }
}
