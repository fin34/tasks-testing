package testing.forum.statistics;

public class StatisticsCalculate {

    private double averagePostsForUser;
    private double averageCommentsForUser;
    private double averageCommentsForPost;

    public double getAveragePostsForUser() {
        return averagePostsForUser;
    }

    public double getAverageCommentsForUser() {
        return averageCommentsForUser;
    }

    public double getAverageCommentsForPost() {
        return averageCommentsForPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        if(statistics.usersNames().size()>0 && statistics.postsCount()>0) {
            averagePostsForUser = (double) statistics.postsCount() / statistics.usersNames().size();
        }
        if(statistics.usersNames().size()>0 && statistics.commentsCount()>0) {
            averageCommentsForUser = (double) statistics.commentsCount() / statistics.usersNames().size();
        }
        if(statistics.commentsCount()>0 && statistics.postsCount()>0) {
            averageCommentsForPost = (double) statistics.commentsCount() / statistics.postsCount();
        }
    }
}
