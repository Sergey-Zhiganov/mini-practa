package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    }
    static int countWorkers(int count) {
        return count;
    }
    static double getSalary(int[] salaries) {
        double total = 0;
        for (int salary : salaries) {
            total += salary;
        }
        return total / salaries.length;
    }
    static String findWorker(String[] workers, int id) {
        if (id >= 0 && id < workers.length) {
            return workers[id];
        }
        else
            return null;
    }
    static void addWorker(Object[]... workers) {
        if (workers.length % 3 != 0) {
            System.out.println("Ошибка: количество элементов не делится на 3");
            return;
        }
        for (int i = 0; i < workers.length; i += 3) {
            System.out.println("Добавлен сотрудник " + workers[i] + " с возрастом " + workers[i+1] + " с зарлатой " + workers[i+2]);
        }

    }
    static void editWorker(Object[]... workers) {
        if (workers.length % 4 != 0) {
            System.out.println("Ошибка: количество элементов не делится на 4");
            return;
        }
        for (int i = 0; i < workers.length; i += 4) {
            System.out.println("Изменён сотрудник с ID" + workers[i] + ". Сотрудник:" + workers[i+1] + " с возрастом " + workers[i+2] + " с зарлатой " + workers[i+3]);
        }
    }
    static void removeWorker(int... id) {
        for (int i : id) {
            System.out.println("Удалён сотрудник с ID " + i);
        }
    }
    static void getSalary(String[] workers, int[] salaries, int[] allowances) {
        if (workers.length != salaries.length && salaries.length != allowances.length) {
            System.out.println("Количество элементов не совпадает");
            return;
        }
        for (int id = 0; id < workers.length; id++) {
            System.out.println("Сотрудник: " + workers[id] + ". Зарплата с бонусом: " + salaries[id] + allowances[id]);
        }
    }
    static int findWorker(String[] workers, String worker) {
        for (int i = 0; i <= workers.length; i++) {
            if (workers[i] == worker) {
                return i;
            }
        }
        return -1;
    }
}