package edu.pinkmotan.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        NoOne aryaNoOne = new BlackWhiteNoOne();

        FacelessMan arya = new FacelessMan(aryaNoOne);

        List<Lord> lordList = new ArrayList<>();
        lordList.add(arya);

        lordList.stream().forEach(lord -> lord.giveCommand());
    }
}
