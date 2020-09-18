package com.kingland.eip.ehm.Lambda;

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
    public void main(String[] args) {
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

        System.out.println("1. Find artists whoes name start with A");
        Predicate<Artist> predicate = a -> a.getName().startsWith("A");
        stream.filter(predicate).forEach(a -> System.out.println(a));

        System.out.println("2. Get all ages from artists");
        Stream<Integer> age = ArtistList.stream().map(a -> a.getAge());
        age.forEach(a -> System.out.println(a));

        Stream<Integer> getTwoage = ArtistList.stream().map(a -> a.getAge());
        AtomicInteger i = new AtomicInteger();
        getTwoage.filter(a -> i.getAndIncrement() < 2).forEach(a -> System.out.println(a));
    }

    }

