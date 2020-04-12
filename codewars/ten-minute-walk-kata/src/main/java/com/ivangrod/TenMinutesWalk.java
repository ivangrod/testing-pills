package com.ivangrod;

import java.util.HashMap;
import java.util.Map;

public class TenMinutesWalk {

  private static final int walkTime = 10;

  public static boolean isValid(char[] directions) {
    return isWalkTimeSpent(directions) && finishAtTheStartingPoint(directions);
  }

  private static boolean isWalkTimeSpent(char[] directions) {
    return directions.length == walkTime;
  }

  private static boolean finishAtTheStartingPoint(char[] directions) {

    Map<Character, Integer> countDirections = new HashMap<>();

    for (char oneDirection : directions) {
      Integer movementNumberInTheWalkPerDirection = countDirections.get(oneDirection);
      if (movementNumberInTheWalkPerDirection != null) {
        countDirections.put(oneDirection, movementNumberInTheWalkPerDirection += 1);
      } else {
        countDirections.put(oneDirection, 1);
      }
    }

    return countDirections.get('n') == countDirections.get('s')
        && countDirections.get('e') == countDirections.get('w');
  }

  public static boolean isValidFromCodewars(char[] walk) {

    if (walk.length != 10) {
      return false;
    }
    int x = 0, y = 0;

    for (int i = 0; i < 10; i++) {
      switch (walk[i]) {
        case 'n':
          y++;
          break;
        case 'e':
          x++;
          break;
        case 's':
          y--;
          break;
        case 'w':
          x--;
          break;
      }
    }
    return x == 0 && y == 0;
  }
}
