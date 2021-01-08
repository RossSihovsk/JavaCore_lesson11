package Task2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static void menu()
    {
        System.out.println("Введіть 1 якщо хочете  вивести данні про всі машини");
        System.out.println("Введіть 2 якщо хочете  всіх об`єктів даного масиву засетити одинаковий  об`єкт");

        System.out.println("------------------------------------------------------------------------------------------");

    }

    static int setRandomValue(int min, int max){
        Random random =  new Random();
        return random.nextInt(max-min+1)+min;
    }


    public static void main(String[] args) {

        Random rand = new Random();

        Car[][] auto = new Car[10][10];

        String[] material = {"Шкіра","Алькантара","Дермантин", "Шкірозманник"};
        int x;

        while (true){
            menu();
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();

            switch (x){

                case 1: {

                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            auto[i][j] = new Car(setRandomValue(1,10),setRandomValue(10,20),material[rand.nextInt(4)], setRandomValue(50,300),setRandomValue(1980,2021));

                        }
                    }
                    System.out.println(Arrays.deepToString(auto));
                    break;
                }

                case 2:{

                    Car defaultCar = new Car(setRandomValue(1,10),setRandomValue(10,20),material[rand.nextInt(5)], setRandomValue(50,300),setRandomValue(1980,2021));
                    for (Car[] row : auto)
                        Arrays.fill(row, defaultCar);
                    System.out.println(Arrays.deepToString(auto));
                    break;

                }
                default:
                    throw new IllegalArgumentException("Unexpected value: " + x);

            }

            }

        }


    }

