package com.practice.populationstats;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 */
public class PopulationStats {
    public static void main(String[] args) throws Exception {
        List<Person> lperson = new ArrayList<>();
        lperson.add(new Person("p1", 1950, 1980));
        lperson.add(new Person("p2", 1960, 1990));
        lperson.add(new Person("p3", 1970, 2000));
        lperson.add(new Person("p4", 1960, 1980));
        lperson.add(new Person("p5", 1990, 2000));

        lperson.stream()
                .map(p->p.name+" "+p.birthYear+"/"+p.deathYear)
                .forEach(System.out::println);

        int minBirthYear = lperson.stream()
                .min(Comparator.comparing(Person::getBirthYear))
                .get().getBirthYear();

        int maxDeathYear = lperson.stream()
                .max(Comparator.comparing(Person::getDeathYear))
                .get().getDeathYear();

        System.out.println(minBirthYear);
        System.out.println(maxDeathYear);
        List<Integer> population = new ArrayList<>();

        for(int i=minBirthYear;i<=maxDeathYear;i++){
            int numOfLiving=0;
            for(Person p:lperson){
                if(p.birthYear<=i && i<=p.deathYear) numOfLiving++;
            }
            population.add(numOfLiving);
        }

        int maxPopulation = population.stream()
                .max(Comparator.comparing(Integer::intValue))
                .get();
        System.out.printf("The max population per year is %d\n",maxPopulation);
    }
}
