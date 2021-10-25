package ex3;

public class RobotSimple {
    private String name;
    private int x;
    private int y;
    private String direction;

    public RobotSimple(String name, int x, int y, String direction) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public RobotSimple() {
        this.name = "Anonyme";
    }

    public RobotSimple(String name) {
        this.name = name;
        this.x = 0;
        this.y = 0;
        this.direction = "NORD";
    }
    public void avancer(){
        switch (this.direction){
            case "NORD": this.y++; break;
            case "SUD": this.y--;break;
            case "EST":this.x--;break;
            case "OUEST":this.x++;break;
        }
    }
    public void tournerDroite(){
        switch (this.direction){
            case "NORD": this.direction="OUEST";
                break;
            case "SUD": this.direction = "EST";
                break;
            case "EST":this.direction = "NORD";
                break;
            case "OUEST":this.direction = "SUD";
                break;
        }
    }

    @Override
    public String toString() {
        return "RobotSimple{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", direction='" + direction + '\'' +
                '}';
    }
}
