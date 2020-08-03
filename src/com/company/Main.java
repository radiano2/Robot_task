package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Robot robot = new Robot();
	    Coffe_Robot robot1 = new Coffe_Robot();
	    Dancer_Robot robot2 = new Dancer_Robot();
	    Chief_Robot robot3 = new Chief_Robot();

//	    robot.work();
//	    robot1.work();
//	    robot2.work();
//	    robot3.work();

	    Robot[] robots = new Robot[3];

	    robots[0]= robot1;
	    robots[1]= robot2;
	    robots[2]= robot3;

		for (Robot element:robots
			 ) {
			element.work();
		}
    }
}
