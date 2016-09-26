package com.jarlenai.wcl.test.unit;

import com.jarlenai.wcl.WarcraftLogsApi;
import com.jarlenai.wcl.WarcraftLogsService;
import com.jarlenai.wcl.domain.rankings.EncounterDifficulty;
import com.jarlenai.wcl.domain.rankings.EncounterRankings;
import com.jarlenai.wcl.domain.rankings.EncounterRegion;
import com.jarlenai.wcl.domain.rankings.RankingMetric;
import com.jarlenai.wcl.request.EncounterRankingsRequestBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EncounterRankingsRequestBuilderTest {

    private final String apiKey = "POTATOES";

    @InjectMocks
    WarcraftLogsService service = new WarcraftLogsService(apiKey);

    @Mock
    WarcraftLogsApi api;

    private int encounterID = 12345;
    private RankingMetric metric = RankingMetric.execution;
    private Integer size = 20;
    private EncounterDifficulty difficulty = EncounterDifficulty.LFR;
    private EncounterRegion region = EncounterRegion.US_EU;
    private Integer classID = 432;
    private Integer specID = 5467;
    private Integer bracket = 4822;
    private Integer limit = 4000;
    private Integer page = 32;
    private EncounterRankings rankings = new EncounterRankings();

    @Test
    public void validateParameterMappings() {

        when(api.getRankingsForEncounter(eq(encounterID), any(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(rankings);

        assertEquals(rankings,
                service.findEncounterRankings(encounterID, metric, difficulty, region)
                        .setBracket(bracket)
                        .setClassID(classID)
                        .setSpecID(specID)
                        .setSize(size)
                        .setLimit(limit)
                        .setPage(page)
                        .execute());

        verify(api).getRankingsForEncounter(encounterID, metric, size, difficulty, region, classID, specID, bracket, limit, page);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateParameterLimit() {
        new EncounterRankingsRequestBuilder(api, encounterID, metric, difficulty, region).setLimit(5001);
    }

    @Test
    public void testValidLimitValue() {
        new EncounterRankingsRequestBuilder(api, encounterID, metric, difficulty, region).setLimit(5000);
    }

}
