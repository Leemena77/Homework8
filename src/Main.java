import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        System.out.println("Task 1");
        int[] firstArray = new int[]{1, 2, 3};
        int[] secondArray = new int[3];
        secondArray[0] = 1;
        secondArray[1] = 2;
        secondArray[2] = 3;
        int[] thirdArray = new int[3];
        for (int i = 0; i < thirdArray.length; i++) {
            thirdArray[i] = i + 1;
        }
        System.out.println("Первый массив: " + Arrays.toString(firstArray));
        System.out.println("Второй массив: " + Arrays.toString(secondArray));
        System.out.println("Третий массив: " + Arrays.toString(thirdArray));

        double[] numbers = new double[]{1.57, 7.654, 9.986};
        System.out.println("Первый элемент: " + numbers[0]);
        System.out.println("Второй элемент: " + numbers[1]);
        System.out.println("Третий элемент: " + numbers[2]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        int[] temperatures = new int[7];
        temperatures[0] = 22;
        temperatures[1] = 25;
        temperatures[2] = 23;
        temperatures[3] = 21;
        temperatures[4] = 20;
        temperatures[5] = 24;
        temperatures[6] = 26;

        System.out.println("Температуры за неделю: " + Arrays.toString(temperatures));
        System.out.println("Task 2");
        {
            int[] firstArray = new int[]{1, 2, 3};
            int[] secondArray = new int[3];
            secondArray[0] = 1;
            secondArray[1] = 2;
            secondArray[2] = 3;
            int[] thirdArray = new int[3];
            for (int i = 0; i < thirdArray.length; i++) {
                thirdArray[i] = i + 1;
            }
            double[] numbers = new double[]{1.57, 7.654, 9.986};
            int[] temperatures = new int[]{22, 25, 23, 21, 20, 24, 26};

            for (int i = 0; i < firstArray.length; i++) {
                System.out.print(firstArray[i]);
                if (i < firstArray.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int i = 0; i < secondArray.length; i++) {
                System.out.print(secondArray[i]);
                if (i < secondArray.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();

            for (int i = 0; i < thirdArray.length; i++) {
                System.out.print(thirdArray[i]);
                if (i < thirdArray.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]);
                if (i < numbers.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            for (int i = 0; i < temperatures.length; i++) {
                System.out.print(temperatures[i]);
                if (i < temperatures.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" Task 3");
            {
                int[] firstArray = new int[]{1, 2, 3};
                int[] secondArray = new int[3];
                secondArray[0] = 1;
                secondArray[1] = 2;
                secondArray[2] = 3;
                int[] thirdArray = new int[3];
                for (int i = 0; i < thirdArray.length; i++) {
                    thirdArray[i] = i + 1;
                }
                double[] numbers = new double[]{1.57, 7.654, 9.986};
                for (int i = firstArray.length - 1; i >= 0; i--) {
                    System.out.print(firstArray[i]);
                    if (i > 0) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
                for (int i = secondArray.length - 1; i >= 0; i--) {
                    System.out.print(secondArray[i]);
                    if (i > 0) {
                        System.out.print(", ");
                    }
                }
                System.out.println();

                for (int i = thirdArray.length - 1; i >= 0; i--) {
                    System.out.print(thirdArray[i]);
                    if (i > 0) {
                        System.out.print(", ");
                    }
                }
                System.out.println();

                for (int i = numbers.length - 1; i >= 0; i--) {
                    System.out.print(numbers[i]);
                    if (i > 0) {
                        System.out.print(", ");
                    }
                }
                System.out.println("Task 4");
           import Arrays;
                public class Main {
                    public static void main(String[] args) {
                        int[] firstArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                        for (int i = 0; i < firstArray.length; i++) {
                            if (firstArray[i] % 2 != 0) {
                                firstArray[i] = firstArray[i] + 1;
                                System.out.println(Arrays.toString(firstArray));
                            }
                        }
                    }
                }
            }
        }
    }
