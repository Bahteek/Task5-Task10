public class Main {
    public static void main(String[] args) {
//        Task 5
//        int chislo = 75;
//        int ondyk = chislo/10;
//       int birlik = chislo % 10;
//        int kos = ondyk + birlik;
//        int kob = ondyk * birlik;
//        System.out.println(ondyk+" "+birlik+" "+kos+" "+kob);

//        //Task6
//
//        int chislo = 476;
//        int ondyk = chislo/10%10;
//        int birlik = chislo % 10;
//        System.out.println(ondyk+" "+birlik);

//        //Task 7
//        int chislo = 425;
//        int zhuzdik = chislo/100;
//        int ondik = chislo/10%10;
//        int birlik = chislo%10;
//        int kosindisi = zhuzdik + ondik + birlik;
//        int kobeitindi = zhuzdik * ondik * birlik;
//        System.out.println(kosindisi+" "+kobeitindi);

//        //Task 8
//        // 378
//        // 873
//        int chislo = 378;
//        int zhuzdik = chislo/100;
//        int ondik = chislo/10%10;
//        int birlik = chislo%10;
//        int chis_nab = birlik * 100 + ondik * 10 + zhuzdik;
//        System.out.println(chis_nab);

        //Task 9
        //345 саны берілген
        //сан1: 354
        //сан2: 435
        //сан3: 453 және басқалары...

        int chislo = 345;
        int zhuzdik = chislo/100%10;
        int ondik = chislo/10%10;
        int birlik = chislo%10;
        int san1 =zhuzdik*100+birlik*10+ondik;
        int san2 =ondik*100+zhuzdik*10+birlik;
        int san3 =ondik*100+birlik*10+zhuzdik;
        System.out.println(san1+" "+san2+" "+san3+" ");



        // Task 10
//         int chislo = 2325;
//        int myndyk = chislo/1000;
//        int zhuzdik = chislo/100%10;
//        int ondik = chislo/10%10;
//        int birlik = chislo%10;
//        int kosindi = myndyk+zhuzdik+ondik+birlik;
//        int kobeitindi = myndyk*zhuzdik*ondik*birlik;
//        System.out.println(kosindi+" "+kobeitindi);

    }
}