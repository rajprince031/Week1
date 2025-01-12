
//Create the FootballTeamHeightStats that find the shortest, tallest, and mean height of players present in a football team.
public class FootballTeamHeightStats {

    // Create the sumOfAllTheHeights method to calculate the total sum of heights
    public int sumOfAllTheHeights(int[] heights) {

        // Create a variable and assign the value to 0.
        int totalSum = 0;

        for (int i = 0; i < heights.length; i++) {

            // add the height of the player to the totalSum and update the value of total
            // sum
            totalSum += heights[i];

        }

        // return the totalSum
        return totalSum;
    }

    // Create meanHeightOfThePlayers method to find the mean height of the player
    public double meanHeightOfThePlayers(int totalHeight, int totalSize) {

        // create a variable mean and store the calculate mean into it
        double mean = (double) totalHeight / (double) totalSize;

        // return the mean
        return mean;
    }

    // Create the shortestHeightOfThePlayer method the return the shortest height of
    // the player
    public int shortestHeightOfThePlayer(int[] heights) {

        // Create a variable shortestHeight and assign the height[0] to it;
        // to assume that it is shortest height.
        int shortestHeight = heights[0];

        // take a loop to traverse over the loop
        for (int i = 0; i < heights.length; i++) {

            //Math.min() function find the minimum height and assign to shortestHeight variable
            shortestHeight = Math.min(shortestHeight, heights[i]);
        }

        //return the shortestHeight
        return shortestHeight;
    }

    // Create the shortestHeightOfThePlayer method the return the shortest height of
    // the player
    public int tallestHeightOfThePlayer(int[] heights) {

        // Create a variable shortestHeight and assign the height[0] to it;
        // to assume that it is shortest height.
        int tallestHeight = heights[0];

        for (int i = 0; i < heights.length; i++) {
            //Math.max() function find the minimum height and assign to tallestHeight variable
            tallestHeight = Math.max(tallestHeight, heights[i]);
        }

        //return the tallestHeight
        return tallestHeight;
    }

    public static void main(String[] agrs) {
        // Create the object of FootballTeamHeightStats class
        FootballTeamHeightStats FootballTeamHeightStats = new FootballTeamHeightStats();

        //Create a teamSize and initilize the team size i.e 11.
        int teamSize = 11;

        //Create a array name heights that store the height of the players
        int[] heights = new int[teamSize];

        //take a loop that iterate over the heights array and assign the random height to the player
        for (int i = 0; i < teamSize; i++) {

            //Math.random() generate the random number between 150 to 250 and assign to the array
            heights[i] = (int) (Math.random() * (250 - 150 + 1)) + 150;

        }

        //Create a totalSumOfHeight that store the total sum of height of the player
        int totalSumOfHeight = FootballTeamHeightStats.sumOfAllTheHeights(heights);

        //Create a meanOfTheTeam that store the mean of height of the player
        double meanOfTheTeam = FootballTeamHeightStats.meanHeightOfThePlayers(totalSumOfHeight, teamSize);

        //Create a tallestHeight that store the height of the tallest player.
        int tallestHeight = FootballTeamHeightStats.tallestHeightOfThePlayer(heights);

        //Create a shortestHeight that store the height of the shortest player.
        int shortestHeight = FootballTeamHeightStats.shortestHeightOfThePlayer(heights);

        //Display all the result
        System.out.println("The mean height of the players on the football team " + meanOfTheTeam);

        System.out.println("the shortest height of the players on the football team " + shortestHeight);

        System.out.println("the tallest height of the players on the football team " + tallestHeight);
    }

}
