package queuemanager;

import java.util.Scanner;

/**
 * Simple text based driver program for the PriorityQueue ADT and its different
 * implementations.
 */
public class QueueManager {

    public static void main(String[] args) {
        
        orderarray oa = new orderarray();
        Scanner stdin = new Scanner(System.in);
        
        

        /* Welcome and prompt for implementation choices */
        System.out.println("Welcome to the Priority Queue manager.");
        System.out.println();
        System.out.println("Select priority queue implementation");
        System.out.println("SA for a sorted array");
        System.out.println("UA for an unsorted array");
        System.out.println("SL for a sorted linked list");
        System.out.println("UL for an unsorted linked list");
        System.out.println("H for a heap");
        System.out.println();
        System.out.print("Your choice > ");
        String input = stdin.nextLine();

        /* Select implementation version to use */
        switch (input.toLowerCase()) {
            case "sa":
                System.out.println("Using a sorted array.");
                oa.orderarray(input);
                
                break;
            case "ua":
               
            case "sl":
            case "ul":
            case "h":
            default:
               //q = new SortedArrayPriorityQueue<>(8);
               // System.out.println("Invalid choice, using sorted array.");
               // break;
        }

        /* Usage instructions */
        System.out.println("Enter commands at the prompt.");
        System.out.println("A <name> <priority> adds a person to the queue.");
        System.out.println("H displays the name of the person at the head of the queue");
        System.out.println("R removes the person at the head of the queue");
        System.out.println("E checks if the queue is empty");
        System.out.println("P prints the whole queue");
        System.out.println("Q quits from the system");

        System.out.print("> ");
        input = stdin.nextLine();

       
    }
}
