public class Main {
    public static void main(String[] args) {
        //task1
        int q = 1000;
        byte w = 100;
        short e = 32766;
        long r = 1234567890;
        float t = 12.5f;
        double y = 1.33333333;
        System.out.println("Значение переменной q с типом int равно " + q);
        System.out.println("Значение переменной w с типом byte равно " + w);
        System.out.println("Значение переменной e с типом short равно " + e);
        System.out.println("Значение переменной r с типом long равно " + r);
        System.out.println("Значение переменной t с типом float равно " + t);
        System.out.println("Значение переменной y с типом double равно " + y);
        //task2
        float z = 27.12f;
        long x = 987678965549L;
        float c = 2.786f;
        int v = 569;
        int b = -159;
        short n = 27897;
        byte m = 67;
        //task3
        byte lyudmilaPavlovnaStudents = 23;
        byte annaSergeevnaStudents = 27;
        byte ekaterinaAndreevnaStudents = 30;
        int totalSheetsOfPaper = 480;
        int studentSheets = totalSheetsOfPaper / (lyudmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents);
        System.out.println("На каждого ученика рассчитано " + studentSheets + " листов бумаги");
        //task4
        byte volume = 16;
        byte workingHours = 2;
        int productivityIn20Minutes = volume / workingHours * 20;
        long productivityInday = volume / workingHours * 60 * 24;
        long productivityIn3day = volume / workingHours * 60 * 24 * 3;
        long productivityIn30day = volume / workingHours * 60 * 24 * 30;
        System.out.println("За 20 минут машина произвела " + productivityIn20Minutes + " штук бутылок");
        System.out.println("За 1 день машина произвела " + productivityInday + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivityIn3day + " штук бутылок");
        System.out.println("За 30 дней машина произвела " + productivityIn30day + " штук бутылок");
        //task5
        byte cansOfPaint = 120;
        byte whiteCans = 2;
        byte brownCans = 4;
        int totalClasses = cansOfPaint / (whiteCans + brownCans);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whiteCans * totalClasses + " банок белой краски и " + totalClasses * brownCans + " банок коричневой краски");
        //task6
        int bananaWeight = 80;
        float milkWeight = 105f / 100f;
        int iceCreamWeight = 100;
        int rawEggWeight = 70;
        byte quantityBanana = 5;
        int quantityMilk = 200;
        byte quantityIceCream = 2;
        byte quantityRawEgg = 4;
        float breakfastWeight = bananaWeight * quantityBanana + milkWeight * quantityMilk + iceCreamWeight * quantityIceCream + rawEggWeight * quantityRawEgg;
        float breakfastWeightKg = breakfastWeight / 1000f;
        System.out.println("Завтрак спортсмена весит " + breakfastWeight + " грамм, или " + breakfastWeightKg + " Килограмм");
        //task7
        int minimalWeightLoss = 250;
        int maximumWeightLoss = 500;
        int mediumWeightLoss = (minimalWeightLoss + maximumWeightLoss) / 2;
        int needToLoseWeight = 7000;
        int naChile = needToLoseWeight / minimalWeightLoss;
        int intensiveTraining = needToLoseWeight / maximumWeightLoss;
        int averageValue = needToLoseWeight / mediumWeightLoss;
        System.out.println("если спортсмен будет терять каждый день по " + minimalWeightLoss + " грамм, то " + needToLoseWeight + " грамм он потеряет за " + naChile + " дней");
        System.out.println("если спортсмен будет терять каждый день по " + maximumWeightLoss + " грамм, то " + needToLoseWeight + " грамм он потеряет за " + intensiveTraining + " дней");
        System.out.println("если спортсмен будет терять каждый день по " + mediumWeightLoss + " грамм, то " + needToLoseWeight + " грамм он потеряет за " + averageValue + " дней");
        //task8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float newSalaryMasha = salaryMasha * 1.1f;
        float newSalaryDenis = salaryDenis * 1.1f;
        float newSalaryKristina = salaryKristina * 1.1f;
        float differenceInAnnualIncomeMasha = 12 * (newSalaryMasha - salaryMasha);
        float differenceInAnnualIncomeDenis = 12 * (newSalaryDenis - salaryDenis);
        float differenceInAnnualIncomeKristina = 12 * (newSalaryKristina - salaryKristina);
        System.out.println("Маша теперь получает " + newSalaryMasha + "  рублей. Годовой доход вырос на " + differenceInAnnualIncomeMasha + " рублей");
        System.out.println("Денис  теперь получает " + newSalaryDenis + "  рублей. Годовой доход вырос на " + differenceInAnnualIncomeDenis + " рублей");
        System.out.println("Кристина  теперь получает " + newSalaryKristina + "  рублей. Годовой доход вырос на " + differenceInAnnualIncomeKristina + " рублей");

    }
}