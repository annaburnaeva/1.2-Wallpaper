public class Main {
    public static void main(String[] args) {

        double widthOfRoom = 5.0;
        double lengthOfRoom = 6.0;
        double heightOfRoom = 2.75;
        double widthOfWallpaper = 1.06;
        int lengthOfRoll = 10;

        double perimeter = 2 * (widthOfRoom + lengthOfRoom);

        int neededNumberOfPanels = (int) Math.round(perimeter / widthOfWallpaper);

        int numberOfPanelsInRoll = (int) (lengthOfRoll / (heightOfRoom + 0.10));

        int neededNumberOfRolls = neededNumberOfPanels / numberOfPanelsInRoll;

        System.out.println(neededNumberOfRolls);
    }
}
