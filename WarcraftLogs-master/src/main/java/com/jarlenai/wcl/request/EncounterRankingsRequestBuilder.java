package com.jarlenai.wcl.request;

import com.jarlenai.wcl.WarcraftLogsApi;
import com.jarlenai.wcl.domain.rankings.EncounterDifficulty;
import com.jarlenai.wcl.domain.rankings.EncounterRankings;
import com.jarlenai.wcl.domain.rankings.EncounterRegion;
import com.jarlenai.wcl.domain.rankings.RankingMetric;

import static com.google.common.base.Preconditions.checkArgument;

public class EncounterRankingsRequestBuilder {

    private final WarcraftLogsApi api;
    private int encounterID;
    private RankingMetric metric;
    private Integer size;
    private EncounterDifficulty difficulty;
    private EncounterRegion region;
    private Integer classID;
    private Integer specID;
    private Integer bracket;
    private Integer limit;
    private Integer page;

    public EncounterRankingsRequestBuilder(WarcraftLogsApi api, int encounterID, RankingMetric metric, EncounterDifficulty difficulty, EncounterRegion region) {
        this.api = api;
        this.encounterID = encounterID;
        this.metric = metric;
        this.difficulty = difficulty;
        this.region = region;
    }

    public EncounterRankingsRequestBuilder setSize(Integer size) {
        this.size = size;
        return this;
    }

    public EncounterRankingsRequestBuilder setClassID(Integer classID) {
        this.classID = classID;
        return this;
    }

    public EncounterRankingsRequestBuilder setSpecID(Integer specID) {
        this.specID = specID;
        return this;
    }

    public EncounterRankingsRequestBuilder setBracket(Integer bracket) {
        this.bracket = bracket;
        return this;
    }

    public EncounterRankingsRequestBuilder setLimit(Integer limit) {
        checkArgument(limit <= 5000, "Limits greater than 5000 are not permitted");
        this.limit = limit;
        return this;
    }

    public EncounterRankingsRequestBuilder setPage(Integer page) {
        this.page = page;
        return this;
    }

    public EncounterRankings execute() {
        return api.getRankingsForEncounter(encounterID, metric, size, difficulty, region, classID, specID, bracket, limit, page);
    }
}