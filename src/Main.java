public class Main {
    public static void main(String[] args) {

        int widthOfRoom = 5;
        int lengthOfRoom = 6;
        double heightOfRoom = 2.75;
        double widthOfWallpaper = 1.06;
        int lengthOfRoll = 10;

        int perimeter = 2 * (widthOfRoom + lengthOfRoom);

        double neededNumberOfPanels = (int) Math.round(perimeter / widthOfWallpaper);

        double numberOfPanelsInRoll = (int) (lengthOfRoll / (heightOfRoom + 0.10));

        double neededNumberOfRolls = (int) Math.round(neededNumberOfPanels / numberOfPanelsInRoll);

        System.out.println(neededNumberOfRolls);

    }
}