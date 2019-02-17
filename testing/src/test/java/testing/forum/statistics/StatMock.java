package testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatMock {

    @Test
    public void testCalculateAdvStatistics(){
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        int postsCount = 10;
        int commentsCount = 10;
        for (int i = 0; i <100 ; i++) {
            usersNames.add("abc" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        double averagePostsForUser = statisticsCalculate.getAveragePostsForUser();
        double averageCommentsForUser = statisticsCalculate.getAverageCommentsForUser();
        double averageCommentsForPost = statisticsCalculate.getAverageCommentsForPost();

        Assert.assertEquals(0.1, averagePostsForUser, 0.01);
        Assert.assertEquals(0.1, averageCommentsForUser, 0.01);
        Assert.assertEquals(1.0, averageCommentsForPost, 0.01);
    }
}
