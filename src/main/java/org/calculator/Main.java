package org.calculator;

import components.BasicOperations;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BasicOperations op = new BasicOperations();

        System.out.println(op.multiplicate(2,3,4));

    }
}