package becker;

import becker.robots.*;

public class DeliverParcel
{
   public static void main(String[] args)
   {  
     // Set up the initial situation
      int a = 5;
      int b = 9;
      int c = 1;
      City prague = new City();
      Thing parcel = new Thing(prague, 1, 2);
       for (int i = 0; i < a; i++) {
           Wall blockAve0 = new Wall(prague, 1+i, 1, Direction.WEST);
           Wall blockAve2 = new Wall(prague, 1+i, 4, Direction.WEST);
           Wall blockAve3 = new Wall(prague, 1+i, 7, Direction.WEST);
           Wall blockAve4 = new Wall(prague, 1+i, 9, Direction.EAST);
           //else if (a == 5) {
           //i = 1;
           //Wall blockAve1 = new Wall(prague, 1, 1+i, Direction.SOUTH);    
           //}
      }
       for (int i = 0; i < b; i++) {
           Wall blockAve1 = new Wall(prague, 1, 1+i, Direction.NORTH);
       }
      for (int i = 0; i < c; i++) {
           Wall blockAve5 = new Wall(prague, 5, 1+i, Direction.SOUTH);
           Wall blockAve6 = new Wall(prague, 5, 3+i, Direction.SOUTH);
           Wall blockAve7 = new Wall(prague, 5, 4+i, Direction.SOUTH);
           Wall blockAve8 = new Wall(prague, 5, 6+i, Direction.SOUTH);
           Wall blockAve9 = new Wall(prague, 5, 7+i, Direction.SOUTH);
           Wall blockAve10 = new Wall(prague, 5, 9+i, Direction.SOUTH);
      }
      Robot karel = new Robot(prague, 1, 0, Direction.EAST,5);
    
      // Direct the robot to the final situation
      karel.move();
      karel.move();
      karel.pickThing();
      karel.move();
      karel.turnLeft();	// start turning right as three turn lefts
      karel.turnLeft();
      karel.turnLeft();	// finished turning right
      karel.move();
     // karel.putThing();
      karel.move();
      System.out.println(karel.countThingsInBackpack());
   }
}
