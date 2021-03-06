/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakesAndLadders;

import java.util.HashMap;

/**
 *
 * @author K00232267 - Neal B
 * @contributor K00231156 - Caolan G
 *
 * Implementing Hashmap as a GameBoardMap class object with additional methods
 * for Snakes and Ladders
 *
 * param notes:
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public class GameBoardMap<K, V> extends HashMap {

    public void printGrid(int x, int y) {
        int size = 10;
        int count = 0;
        int loc = 100; //variable for alternating rows
        //for each Y
        for (int i = 0; i < size; i++) {
            //System.out.println();
            // if Y is divisible by 2
            if (i % 2 == 0) {
                count = 0;
                for (int j = loc; count < 10; j--) {
                    System.out.print("\t " + j);
                    loc--;
                    count++;
                    //x =i i = 1
                    //y = j j = 100
                    if (i == y && j == x) {
                        //System.out.print("o");
                        //System.out.println("x:"+x);
                        //System.out.println("y:"+y);
                        // }     
                    }
                }
            } else {
                count = 0;
            }

            for (int j = loc - 9; count < 10; ++j) {
                System.out.print("\t " + j);
                loc--;
                count++;
                //if (i == y && count == x){
                // System.out.print("o");
                //System.out.println(x);
                //System.out.println(y);
                // } 
            }
            System.out.println("\n");
        }
    }
    /* Test Client */
    public static void main(String[] args) {
        GameBoardMap<Integer, Integer> snakes = new GameBoardMap<>();
        GameBoardMap<Integer, Integer> ladders = new GameBoardMap<>();
        GameBoardMap<Integer, Integer> players = new GameBoardMap<>();

        //Map1
        {
            snakes.put(10, 55); // snakes position.
            snakes.put(10, 55);
            snakes.put(10, 55);
            snakes.put(10, 55);
        }
        //Map2
        {
            ladders.put(5,16);
            ladders.put(25,32);
            ladders.put(45,60);
            ladders.put(74,85);
            ladders.put(18,22);
        }
        //Map3
        {
            players.put(1,1);
        }
    }
}
