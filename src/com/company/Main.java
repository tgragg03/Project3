/*
Tanner Gragg
CSCI 1660
4/16/2020
 */
package com.company;

import java.util.*;
public class Main {
    //public static Task task;
    public static ArrayList<Task> tasks =  new ArrayList();
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean pass = true;
        while(pass){
            //was trying to get exception handling working
            try{
                menu();

                int choice = input.nextInt();

                if(choice == 0){
                    break;
                }
                if(choice == 1){
                    tasks.add(addTask());
                }
                if(choice == 2){
                    tasks.remove(removeTask());
                    System.out.println("Removing Task");
                }
                if(choice == 3){
                    updateTask(tasks);
                }
                if(choice == 4){
                    allTasks(tasks);
                }
                if(choice == 5){
                    priority(tasks);
                }
                if(choice  == 6){
                    allTasksPriority(tasks);

                }
                pass = true;
            }catch (Exception e){
                pass = false;
            }

        }
    }
    static void menu(){
        //menu
        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(5) List Tasks of a Certain Priority.");
        System.out.println("(6) List Tasks in order of priority.");
        System.out.println("(0) Exit");
    }
    static Task addTask(){
        //adds a task
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please type the task:");
        String name = input2.nextLine();
        System.out.println("Please enter a description: ");
        String description = input2.nextLine();
        System.out.println("Please enter the priority: ");
        int priority = input2.nextInt();
        Task task = new Task(name, description, priority);
        return task;
    }
    static int removeTask(){
        //removes a task
        Scanner input = new Scanner(System.in);
        System.out.println("Please tell me which index to remove");
        int i = input.nextInt();


        return i;
    }
    static void updateTask(ArrayList<Task> a) {
        //updates a task
        System.out.println("What is the index of the task you'd like to change");
        int index = input.nextInt();
        input.nextLine();
        System.out.println("Please type the task:");
        String name = input.nextLine();
        System.out.println("Please enter a description: ");
        String description = input.nextLine();
        System.out.println("Please enter the priority: ");
        int priority = input.nextInt();

        a.set(index, new Task(name, description, priority));
    }
    static void allTasks(ArrayList<Task> a){
        //lists all tasks
        System.out.println("----------------");
        for(Task task : a){
            System.out.println(task.toString());
        }
        System.out.println("----------------");

    }
    static void priority(ArrayList<Task> a){
        //priority method
        System.out.println("What is the priority number: ");
        int prio = input.nextInt();
        input.nextLine();

        for(Task task : a){
            if(prio == task.getPriority()) {
                System.out.println(task.toString());
            }
        }
    }
    // was not able to figure out optimization of for loop with stepping through different number priorities
    static void allTasksPriority(ArrayList<Task> a){
        //lists all tasks
        System.out.println("----------------");
        for(Task task : a){
            if(task.getPriority() == 1){
                System.out.println(task.toString());
            }
        }
        for(Task task : a){
            if(task.getPriority() == 2){
                System.out.println(task.toString());
            }
        }
        for(Task task : a){
            if(task.getPriority() == 3){
                System.out.println(task.toString());
            }
        }
        for(Task task : a){
            if(task.getPriority() == 4){
                System.out.println(task.toString());
            }
        }
        for(Task task : a){
            if(task.getPriority() == 5){
                System.out.println(task.toString());
            }
        }
        System.out.println("----------------");
    }
}