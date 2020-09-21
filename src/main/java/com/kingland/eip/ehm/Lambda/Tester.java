package com.kingland.eip.ehm.Lambda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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
        System.out.println("6. Get all even number ages from artists");
        Stream<Integer> evenAges = ArtistList.stream().map(a -> a.getAge()).filter(a -> a % 2 == 0);
        evenAges.forEach(a -> System.out.println(a));

        //7. Get max age from artists.
        System.out.println("7. Get max age from artists");
        Stream<Integer> maxAge = ArtistList.stream().map(a -> a.getAge());
        System.out.println(maxAge.max(Integer::compareTo).get());

        //8. Get singer whose age is less than 30.
        Stream<Artist> artistStream = ArtistList.stream().filter(a -> a.getAge() < 30 && a.getProfession().equals(profession.b));
        artistStream.forEach(a -> System.out.println(a));
        //9. Get set collection from artists.
        System.out.println("9. Get set collection from artists.");
        Set<Artist> artistSet = ArtistList.stream().collect(Collectors.toSet());
        for(Artist artist : artistSet){
            System.out.println(artist);
        }
        //10. Stream<List<Integer>> inputStream = Stream.of(
        //Arrays.asList(1),
        //Arrays.asList(2, 3),
        // Arrays.asList(4, 5, 6));Return a List which data should be {1,2,3,4,5,6};
        Stream<List<Integer>> inputStream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
        System.out.println(inputStream.flatMap(a -> a.stream()).collect(Collectors.toList()));

        System.out.println("-------------------2--------------------");


        //2.1. start date 2020/9/13 7:23:23, end date 2020/9/15 13:15:35. Get milliseconds between start date and end date
        System.out.println("2.1. start date 2020/9/13 7:23:23, end date 2020/9/15 13:15:35. Get milliseconds between start date and end date");
        String startDate = "2020/9/13 7:23:23";
        String  endDate = "2020/9/15 13:15:35";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            System.out.println(sdf.parse(endDate).getTime() -sdf.parse(startDate).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //2.2 Print local current time in format: "yyyy-MM-dd HH:mm:ss"
        Date localTime = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(localTime));

        //2.3


        //2.4. Transfer Instant to LocalDateTime by using default zoneId.
        System.out.println("Transfer Instant to LocalDateTime by using default zoneId.");
        Instant instant = Instant.now();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(localDateTime);
        //2.5 Print year, month and day from current time.
                LocalDate localDate = LocalDate.now();
                int year = localDate.getYear();
                Month month = localDate.getMonth();
                int dayinMonth = localDate.getDayOfMonth();
                System.out.printf("Year : %d, Month : %d, Day : %d\n", year, month.getValue(), dayinMonth);
        //2.6. Print date which is one week later from now.
        System.out.println(LocalDate.of(year, month.getValue(), dayinMonth+7));


    }

    }

