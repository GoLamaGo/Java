import ru.java.collections.treeset.Wish;
import ru.java.collections.treeset.WishComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        /*Java2.1.1*/
//        ProductBucket replacing = new ProductBucket();
//        ProductBucket.createProductBucket();

        /*Java4.5.1*/
        Wish.printTypeOfSort();
        System.out.println();

//        WishComparator wishComparator = new WishComparator();
        TreeSet<Wish> wishlistComparator = new TreeSet<>(new WishComparator());


        wishlistComparator.add(new Wish("FlashCard", "128Gb for videos", 1500, "http://pleer.ru/flash128", 3));
        wishlistComparator.add(new Wish("Bicycle", "MTB 29'er", 100000, "http://bike24.de/ScottSparkRC2020", 5));
        wishlistComparator.add(new Wish("Shoes", "Sneakers NewBalance", 11000, "http://newbalance.ru/974", 3));
        wishlistComparator.add(new Wish("Printer", "Samsung PB248", 13000, "http://samsung.ru/printers/pb248", 2));
        wishlistComparator.add(new Wish("Socks", "For sports", 500, "http://socks.ru/sports", 1));
        wishlistComparator.add(new Wish("Antiseptick", "Against COVID-19", 800, "http://apteki.ru/antisepticks/", 4));
        wishlistComparator.add(new Wish("Trip", "Iceland", 150000, "http://onetwotrip.ru/iceland", 4));
        wishlistComparator.add(new Wish("ToothPaste", "Colgate", 50, "http://spar.ru/homeGoods", 2));
        wishlistComparator.add(new Wish("Quadrocopter", "DJI Mavic 2 PRO", 50, "http://dji.com/drones", 3));
        wishlistComparator.add(new Wish("Speaker", "JBL Flip 5", 5000, "http://JBL.com/FLIP", 1));

        TreeSet<Wish> wishlistComparable = new TreeSet<>(Wish::compareTo);
        wishlistComparable.addAll(wishlistComparator);

        TreeSet<Wish> wishlistNew = new TreeSet<>(Comparator.comparing(Wish::getPrice).thenComparing(Wish::getPriority));
        wishlistNew.addAll(wishlistComparator);

        for (Wish w : wishlistComparator
        ) {
            System.out.printf("%-12s%20f%n", w.getName(), w.getPrice());
        }

        System.out.println();

        for (Wish w : wishlistComparable
        ) {
            System.out.printf("%-12s%20f%n", w.getName(), w.getPrice());
        }

        System.out.println();

        for (Wish w : wishlistNew
        ) {
            System.out.printf("%-12s%20f%n", w.getName(), w.getPrice());
        }


    }


}
