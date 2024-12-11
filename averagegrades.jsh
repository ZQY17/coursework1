int[] average_grades(int grades[][], int weights[]) {
    int numberOfStudents = grades.length;
    int[] weightedAverages = new int[numberOfStudents];

    for (int i = 0; i < numberOfStudents; i++) {
        int total = 0; 
        for (int j = 0; j < weights.length; j++) {
            total += grades[i][j] * weights[j]; 
    }
        weightedAverages[i] = total / 100; 
}
    
    return weightedAverages; 
}

int[][] grades = {
    {51, 83, 28}, 
    {0, 38, 95}  
};

int[] weights = {30, 40, 30};
int[] results = average_grades(grades, weights);
for (int avg : results) {
    System.out.println(avg);
}