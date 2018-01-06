package behavioral.command;

public class Light {

    private int opacity;

    public Light() {
        this.opacity = 0;
    }

    public void turnOn() {
        System.out.println("The light is on");
        opacity = 100;
    }

    public void turnOff() {
        System.out.println("The light is off");
        opacity = 0;
    }

    public void higherOpacity() {
        if(opacity == 90) {
            opacity += 10;
            System.out.println("Light opacity: " + opacity);
        }
        else if(opacity == 100){
            System.out.println("The light is on at full opacity");
        }
    }

    public void lowerOpacity() {
        if(opacity > 10) {
            opacity -= 10;
            System.out.println("Light opacity: " + opacity);
        }
        else if(opacity == 10){
            turnOff();
        }
    }

    public int getOpacity() {
        return opacity;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
    }
}
