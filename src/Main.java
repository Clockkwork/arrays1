import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int [] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        System.out.println("Задача №1 " + " Целочисленный массив ");
        int[] arr = new int[]{1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();


        System.out.println("Задача №1 " + " Дробный массив ");

        float[] arrNum = new float[]{1.57f, 7.654f, 9.986f};


        for (int a = 0; a < arrNum.length; a++) {
            if (a < arrNum.length - 1) {
                System.out.print(arrNum[a] + ",");
            } else {
                System.out.print(arrNum[a]);
            }
        }
        System.out.println("\n");


        System.out.println("Задача №1 " + " Произвольный массив ");

        int[] yearsOld = {14, 18, 21, 42, 10, 19};


        for (int i = 0; i < yearsOld.length; i++) {
            if (i < yearsOld
                    .length - 1) {
                System.out.print(yearsOld[i] + ",");
            } else {
                System.out.print(yearsOld[i]);
            }
        }
        System.out.println("\n");
    }


    public static void task2() {
        System.out.println("Задача №2 " + " массивы по порядку");
        int[] arr1 = {1, 2, 3,};

        int[] arr2 = {14, 18, 21, 42, 10, 19};

        float[] arr3 = {1.57f, 7.654f, 9.986f};


        for (int i = 0; i < arr1.length; i++) {
            if (i < arr1.length - 1) {
                System.out.print(arr1[i] + ",");
            } else {
                System.out.print(arr1[i]);
            }
        }
        System.out.println("\n");


        for (int b = 0; b < arr2.length; b++) {
            if (b < arr2.length - 1) {
                System.out.print(arr2[b] + ",");
            } else {
                System.out.print(arr2[b]);
            }
        }
        System.out.println("\n");

        for (int a = 0; a < arr3.length; a++) {
            if (a < arr3.length - 1) {
                System.out.print(arr3[a] + ",");
            } else {
                System.out.print(arr3[a]);
            }
        }
        System.out.println("\n");
    }

    public static void task3() {
        System.out.println("Задача №2 " + " массивы в обратном порядке");

        int[] arr4 = {3, 2, 1};


        int[] arr5 = {19, 10, 42, 21, 18, 14};


        float[] arr6 = {9.986f, 7.654f, 1.57f};


        for (int i = 0; i < arr4.length; i++) {
            if (i < arr4.length - 1) {
                System.out.print(arr4[i] + ",");
            } else {
                System.out.print(arr4[i]);
            }
        }
        System.out.println("\n");


        for (int b = 0; b < arr5.length; b++) {
            if (b < arr5.length - 1) {
                System.out.print(arr5[b] + ",");
            } else {
                System.out.print(arr5[b]);
            }
        }
        System.out.println("\n");


        for (int a = 0; a < arr6.length; a++) {
            if (a < arr6.length - 1) {
                System.out.print(arr6[a] + ",");
            } else {
                System.out.print(arr6[a]);
            }
        }
        System.out.println("\n");
    }

    public static void task4() {
        System.out.println("Задача №4 " + " массив чётные числа ");
        int numbers[] = {1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
            } else {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void task5() {
        System.out.println("Задача №5 " + " ");
        int arr[] = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей ");
    }

    public static void task6() {
        System.out.println("Задача №6 " + " минимальные и максимальные затраты за день ");
        int arr[] = generateRandomArray();
        int maxDayMoney = -1;
        int minDayMoney = arr[0];
        for (final int current : arr) {
            if (current > maxDayMoney) {
                maxDayMoney = current;
            }
        }
        for (final int current : arr) {
            if (current < minDayMoney) {
                minDayMoney = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxDayMoney + " рублей ");
        System.out.println("Минимальная сумма трат за день составила " + minDayMoney + " рублей ");
    }

    public static void task7() {
        System.out.println("Задача №7 " + " средняя сумма трат за месяц ");
        int arr[] = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum= sum / 31;
        System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей ");
    }

    public static void task8(){
        System.out.println("Задача №8 " + " неправильные имена сотрудников ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i = reverseFullName.length - 1; i  >=  0 ;i--){
            System.out.print(reverseFullName[i]);
        }
    }
}
