# Course Schedule IV 
class courseSchedule {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        boolean[][] reachable = new boolean[numCourses][numCourses];
        for(int[] pre : prerequisites)
        {
            reachable[pre[0]][pre[1]] = true;

        }

        for(int k = 0; k<numCourses; k++)
        {
            for(int i = 0; i<numCourses; i++)
            {
                for(int j = 0; j<numCourses; j++)
                {
                    reachable[i][j] = reachable[i][j] || (reachable[i][k] && reachable[k][j]);
                }
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int[] query : queries)
        {
            result.add(reachable[query[0]][query[1]]);
        }
        return result;
    }
}
