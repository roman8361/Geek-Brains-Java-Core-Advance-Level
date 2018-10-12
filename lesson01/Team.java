package ru.kravchenko.se;

public class Team {
    String teamName;
    Person[] people = new Person[4];


    Team(String teamName, Person[] people){
        this.teamName = teamName;
        for (int i = 0; i <people.length ; i++) {
            this.people[i] = people[i];
        }
    }

    void showResultTeam() {
        System.out.println("TEAM NAME: " + this.teamName.toUpperCase() + "!!!");
        System.out.println("******************");

        for (int i = 0; i <people.length ; i++) {
            this.people[i].showPersonProfile();
        }

    }

}
