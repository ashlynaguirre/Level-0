import java.awt.Color;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Robotg {
public static void main(String[] args) {
	Tortoise.setPenColor(PenColors.Blues.Aquamarine);
Tortoise.show();
Tortoise.turn(30);
Tortoise.move(110);
Tortoise.turn(120);
Tortoise.move(110);
Tortoise.turn(180);
Tortoise.penUp();
Tortoise.move(40);
Tortoise.turn(300);
Tortoise.penDown();
Tortoise.move(70);
}
}
