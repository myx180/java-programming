public class Task11 {
    public static void main(String[] args) {
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 0, 0, 0, 3, 4, 1},
                {3, 5, 43, 0, 6, 3, 8},
                {3, 0, 46, 0, 3, 4, 4},
                {3, 0, 0, 0, 483, 8, 4},
                {6, 0, 0, 0, 3592, 7, 9}
        };

        int[] totalHours = new int[hours.length];
        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                totalHours[i] += hours[i][j];
            }
        }

        // Sort employees by total hours in decreasing order
        for (int i = 0; i < totalHours.length - 1; i++) {
            for (int j = i + 1; j < totalHours.length; j++) {
                if (totalHours[i] < totalHours[j]) {
                    int tempHours = totalHours[i];
                    totalHours[i] = totalHours[j];
                    totalHours[j] = tempHours;

                    int[] tempEmployeeHours = hours[i];
                    hours[i] = hours[j];
                    hours[j] = tempEmployeeHours;
                }
            }
        }

        // Display employees and their total hours
        for (int i = 0; i < hours.length; i++) {
            System.out.print("Employee " + i + ": ");
            for (int j = 0; j < hours[i].length; j++) {
                System.out.print(hours[i][j] + " ");
            }
            System.out.println("Total hours: " + totalHours[i]);
        }
    }
}