package com.ll.exam;

import java.util.Scanner;

public class App {
    private Scanner sc;
    public App(Scanner sc) {
        this.sc = sc;
    }
    public void run() {
        System.out.println("== 명언 SSG ==");

        loop:
        while(true) {
            System.out.println("명령) ");
            String cmd = sc.nextLine();

            switch(cmd) {
                case "종료":
                    break loop;

            }
        }
    }
}