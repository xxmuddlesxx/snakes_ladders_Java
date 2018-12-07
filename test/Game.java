/*
 * Copyright (C) 2018 K00232267 - Neal B
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package SnakesAndLadders.test;

/**
 *
 * @author K00232267 - Neal B
 */
public class Game {
    
    private static Game game = null;
    private static int numberOfPlayers = 0;
    private static Player[] players;
    private static int numberOfTurns;
    
    private Game(){} //future proof the game.
    
    private Game(String[] playerList) throws IllegalArgumentException{
        if (playerList == null || playerList.length == 0){
            throw new IllegalArgumentException("At Least 2 Players need to be provided ");
        }
        numberOfPlayers = playerList.length;
        
        //validate number of Players
        if(numberOfPlayers > 6)
    }
}
