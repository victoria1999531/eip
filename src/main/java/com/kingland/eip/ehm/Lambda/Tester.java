package com.kingland.eip.ehm.Lambda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args) {
        Artist art = new Artist("Alan", 10, profession.b);
        Artist art2 = new Artist("Alice", 45, profession.a);
        Artist art3 = new Artist("Mike", 63, profession.b);
        Artist art4 = new Artist("Helen", 30, profession.a);
        List<Artist> ArtistList = new ArrayList<>();
        ArtistList.add(art);
        ArtistList.add(art2);
        ArtistList.add(art3);
        ArtistList.add(art4);
        Stream<Artist> stream = ArtistList.stream();

        //Find artists whoes name start with A
        System.out.println("1. Find artists whoes name start with A");
        Predicate<Artist> predicate = a -> a.getName().startsWith("A");
        stream.filter(predicate).forEach(a -> System.out.println(a));

        //Get all ages from artists
        System.out.println("2. Get all ages from artists");
        Stream<Integer> allages = ArtistList.stream().map(a -> a.getAge());
        allages.forEach(a -> System.out.println(a));

        //Get first two ages from artists
        System.out.println("3. Get first two ages from artists");
        Stream<Integer> getTwoages = ArtistList.stream().map(a -> a.getAge());
        AtomicInteger i = new AtomicInteger();
        getTwoages.filter(a -> i.getAndIncrement() < 2).forEach(a -> System.out.println(a));

        //4.Sort the artist list by age in desc.


        //5. Print artists' name
        System.out.println("5. Print artists' name");
        Stream<String> names = ArtistList.stream().map(a -> a.getName());
        names.forEach(a -> System.out.println(a));
        //6. Get all even number ages from artists

        //7. Get max age from artists.
        Stream<Integer> maxAge = ArtistList.stream().map(a -> a.getAge());
        System.out.println(maxAge.max(Integer::compareTo).get());

        //8. Get singer whose age is less than 30.

        //9. Get set collection from artists.

        //10. Stream<List<Integer>> inputStream = Stream.of(
        //Arrays.asList(1),
        //Arrays.asList(2, 3),
        // Arrays.asList(4, 5, 6));Return a List which data should be {1,2,3,4,5,6};



        //2.1. start date 2020/9/13 7:23:23, end date 2020/9/15 13:15:35. Get milliseconds between start date and end date
        String startDate = "2020/9/13 7:23:23";
        String  endDate = "2020/9/15 13:15:35";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            System.out.println(sdf.parse(endDate).getTime() -sdf.parse(startDate).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    }

