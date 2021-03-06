package windowsystem.rat;


import windowsystem.coordinates.Coordinates;
import windowsystem.coordinates.Point;

import java.awt.*;

public class RATButton extends RATLabel {
    private Color backgroundColor;
    private Color borderColor;

    public RATButton(Point startingPoint, String text, Color backgroundColor, Color borderColor, Color textColor) {
        super(startingPoint, text, textColor);
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public void draw() {
        Coordinates windowSystemBasedCoordinates = getWindowSystemBasedCoordinates();
        windowSystemBasedCoordinates.setEndPoint(new Point(
                windowSystemBasedCoordinates.getStartPoint().getX() + 50,
                windowSystemBasedCoordinates.getStartPoint().getY() + 25));

        getSimpleWindow().getWindowSystem().setColor(borderColor);
        getSimpleWindow().getWindowSystem().drawRect(getCoordinates());
        getSimpleWindow().getWindowSystem().setColor(backgroundColor);
        getSimpleWindow().getWindowSystem().fillRect(getCoordinates());
        super.draw();
    }
}
