package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String command = scanner.next();
            if (command.equals("terminate")) {
                break;
            } else if (command.equals("add")) {
                String entity = scanner.next();
                if (entity.equals("member")) {
                    Long MemberId = scanner.nextLong();
                    String name = scanner.next();
                    String provinceName = scanner.next();
                    String townName = scanner.next();
                    String streetName = scanner.next();
                } else if (entity.equals("Book")) {
                    Long BookId = scanner.nextLong();
                    String bookName = scanner.next();
                    int authorsNum = scanner.nextInt();
                }
            } else if(command.equals("borrow")){

            } else if (command.equals("item")){

            }else if(command.equals("report")){
                String entity = scanner.next();

                if(entity.equals("customers")){
                } else if(entity.equals("Books")){
                } else if(entity.equals("Borrow")){
                }
            }
        }

    }
}
