public class Main {
    public static void main(String[] args) {

        //Задание-1.
        System.out.println("Задание-1.");

        int savings = 29_000;
        int total = 0;
        int a = 0;
        while (total <= 2_459_000) {
            a = a + 1;
            total = total + total / 100;
            total = total + savings;
        }
        System.out.println("Месяц " + a + " , сумма накоплений равна " + total + " рублей");

        //Задание-2.
        System.out.println("Задание-2.");

        int b = 0;
        while (b < 10) {
            System.out.print((b = b + 1) + " ");
        }
        System.out.println(" ");
        for (int c = 10 ; c >= 1 ; c --) {
            System.out.print(c + " ");
        }
        System.out.println(" ");

        //Задание-3.
        System.out.println("Задание-3.");

        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int year = 0;
        while (year < 10) {
            year = year + 1;
            int birth = population / 1000 * birthRate;
            int mortal = population / 1000 * mortality;
            population = population + (birth - mortal);
            System.out.println("Год " + year + " , численность населения составляет " + population + " человек.");
        }

        //Задание-4.
        System.out.println("Задание-4.");
        {
            int contribution = 15_000;
            int month = 0;
            int percentages = 7;

            while (contribution < 12_000_000) {
                month = month + 1;
                int depositPercentage = contribution / 100 * percentages;
                contribution = contribution + depositPercentage;
                System.out.println("Месяц " + month + " , сумма накоплений равна " + contribution + " рублей");
            }
        }

        //Задание-5.
        System.out.println("Задание-5.");
        {
            int contribution = 15_000;
            int month = 0;
            int percentages = 7;

            while (contribution <= 12_000_000) {
                month = month + 1;
                int depositPercentage = contribution / 100 * percentages;
                contribution = contribution + depositPercentage;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + " , сумма накоплений равна " + contribution + " рублей");
                }
            }
        }

        //Задание-6.
        System.out.println("Задание-6.");

        {
            int contribution = 15_000;
            int month = 0;
            int percentages = 7;

            while (month <= 108) {
                month = month + 1;
                int depositPercentage = contribution / 100 * percentages;
                contribution = contribution + depositPercentage;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + " , сумма накоплений равна " + contribution + " рублей");
                }
            }
        }

        //Задание-7.
        System.out.println("Задание-7.");

        int friday = 2;
        int day = 0;
        while (day < 31) {
            day = day + 1;
            if (day == friday) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
                friday = friday + 7;
            }
        }

        //Задание-8.
        System.out.println("Задание-8.");

        int yearsBefore = 1822;
        int yearsAfter = 2122;
        int years = 1;

        while (years <= yearsAfter) {
            years += 1;
            if (years % 79 == 0) {
                if (yearsBefore < years) {
                    System.out.println("Год кометы " + years);
                }
            }
        }

        //Задание-9.
        System.out.println("Задание-9.");

        int d = 2;

        for (int e = 1; e <= 10 ; e ++) {
            int f = d * e;
            System.out.println(d + "*" + e + "=" + f);
        }
    }
}