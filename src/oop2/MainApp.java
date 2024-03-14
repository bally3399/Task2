package oop2;

import java.util.Scanner;
import javax.swing.*;
public class MainApp {
    private static  Diary dairy ;
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        String display = """
                Welcome to My Diary
                1.Create Entry
                2.Unlock
                3.lock
                4.Check if Diary is locked
                5.Find Entry
                6.Delete Entry
                7.Update Entry
                8.Exit App
                9.Create diary
                """;
        String choice = input(display);
        switch (choice.charAt(0)) {
            case '1':
                createEntry();
            case '2':
                unlock();
            case '3':
                lock();
            case '4':
                checkIfDiaryIsLocked();
            case '5':
                findEntry();
            case '6':
                deleteEntry();
            case '7':
                updateEntry();
            case '8':
                exitApp();
            case '9':
                createDiary();
            default:
                display();
        }


    }

    private static void updateEntry() {
        String id = input("Enter your id");
        String title = input("Enter title");
        String body = input("Enter body");
        dairy.updateEntry(Integer.parseInt(id), title, body);
        print("You have successfully Updated your entry");
    }

    private static void deleteEntry() {
        dairy = new Diary("username", "correctPassword");
        String id = input("Enter ID of the entry to delete: ");
        dairy.deleteEntry(Integer.parseInt(id));
        print("Entry deleted successfully");
        display();
    }


    private static void findEntry() {
        dairy = new Diary("username", "correctPassword");
        String id = input("Enter your id");
        try{
           Entry entry = dairy.findEntry(Integer.parseInt(id));
            print("Entry found for ID\n" + entry.toString());
        }catch (RuntimeException e){
            print(e.getMessage());
        }finally {
            display();
        }
    }


    private static void checkIfDiaryIsLocked() {
        String password = input("Enter your password");
        dairy = new Diary("username", password);
        if(password.equals(dairy.getPassword())) {
            if (dairy.isLocked()){
                print("Dairy is locked");
            }else{
                print("Diary is unlocked");
            }
        }else{
            print("Incorrect password");
        }
        display();
    }

    private static void lock() {
        String password = input("Enter your password");
        dairy = new Diary("username", password);
        if(password.equals(dairy.getPassword())) {
            dairy.lock();
            print("You have successfully lock dairy");
        } else{
            print("Incorrect password");
        }
        display();
    }

    private static void unlock() {
        String password = input("Enter your password");
        dairy = new Diary("username", password);
        if (password.equals(dairy.getPassword())) {
            dairy.unLocked(password);
            print("You have successfully unlock dairy");
        }else{
            print("Incorrect Password");
        }
        display();

    }

    private static void createEntry() {
        dairy = new Diary("username", "correctPassword");
        String title = input("Enter title: ");
        String body = input("Enter  body: ");
        try{
            Entry entry = dairy.createEntry(title, body);
            print("Entry created successfully!");
            print("Your ID is: "+ entry.getId());
        }catch (RuntimeException e){
            print(e.getMessage());
        }finally {
            display();
        }
    }

    private static void exitApp () {
        System.exit(8);
    }

    private static String input(String display) {
        print(display);
        return JOptionPane.showInputDialog(null, display);
    }

    private static void print(String input){
        JOptionPane.showMessageDialog(null, input);

    }
    public static void createDiary(){
        String username = input("Enter your name");
        String password = input("Enter your password");
        try {
            dairy = new Diary(username, password);
            dairy.createDiary(username, password);
            print("You have create Diary Successfully!!");
        }catch (RuntimeException e){
            print(e.getMessage());
        }finally {
            display();
        }
    }


}
