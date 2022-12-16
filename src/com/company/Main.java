package com.company;


import com.company.Model.Library;
import com.company.Model.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("please enter add or borrow or remove and report  ");
            String command = scanner.next();


            if (command.equals("terminate")) {
                break;
            }


            else if (command.equals("add")) {
                System.out.println("pls enter member or book");
                String entity = scanner.next();

                if (entity.equals("member")) {
                    System.out.println("please enter Mem id");
                    Long MemberId = scanner.nextLong();

                    System.out.println("please enter memberName");
                    String MemberName = scanner.next();

                    System.out.println("please enter provinceName");
                    String provinceName = scanner.next();

                    System.out.println("please enter townName");
                    String townName = scanner.next();

                    System.out.println("please enter StreetName");
                    String streetName = scanner.next();

                } else
                    if (entity.equals("Book")) {

                    System.out.println("please enter book id");
                    Long BookId = scanner.nextLong();

                    System.out.println("please enter BookName");
                    String bookName = scanner.next();

                    System.out.println("please enter releaseDate");
                    String releaseDate = scanner.next();

                    int authorsNum = scanner.nextInt();
                    for (int i = authorsNum; i >= 1; i--) {
                        String authorName = scanner.next();
                        ArrayList<String> booksAuthors = new ArrayList<>();
                        booksAuthors.add(authorName);
                    }
                }
            }


            else if (command.equals("borrow")) {
                String entity = scanner.next();
                if (entity.equals("BorrowId")) {
                    String borrowId = scanner.next();
                } else
                    if (entity.equals("userId")) {
                    String userId = scanner.next();
                }
                  else
                      if (command.equals("item")) {
                    if (entity.equals("BorrowId")) {
                        String borrowId = scanner.next();
                    } else if (entity.equals("BookId")) {
                        String BookId = scanner.next();
                    }
                }

            }


            else if (command.equals("remove")) {
                int id_request = scanner.nextInt();
                int id_book = scanner.nextInt();
            }

            else if (command.equals("report")) {
                String entity = scanner.next();

                if (entity.equals("customers")) {
                } else if (entity.equals("Books")) {
                } else if (entity.equals("Borrow")) {
                }

            }
        }

    }
}
