package com.webtest.testt.models;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "surname")
    String surname;
    @Column(name = "password")
    Integer password;
    @Column(name = "grade")
    Integer grade;
    @Column(name = "absense")
    Integer absense;
    @Column(name = "bonus")
    Integer bonus;

    public User(){
    }

    public User(String name, String surname, Integer password, Integer grade,Integer absense, Integer bonus) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.grade = grade;
        this.absense = absense;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getAbsense() {
        return absense;
    }

    public void setAbsense(Integer absense) {
        this.absense = absense;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }
}
