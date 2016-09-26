package com.jarlenai.wcl.test.integration; /**
 * Copyright 2015 Michael Beer <michael@jarlenai.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.google.common.collect.Iterables;
import com.jarlenai.wcl.WarcraftLogsApi;
import com.jarlenai.wcl.domain.ServerRegion;
import com.jarlenai.wcl.domain.WarcraftServer;
import com.jarlenai.wcl.domain.zones.Zone;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;

/**
 * A small set of simple tests that confirms that each method
 * on the API object correctly reaches an endpoint on the API
 */
public class BasicApiEndpointTests {

    String apiKey = System.getProperty("apiKey");

    /**
     * API key to verify endpoints
     */
    WarcraftLogsApi api;

    private ServerRegion region = ServerRegion.US;
    private WarcraftServer server = WarcraftServer.Whisperwind;
    private String guildName = "Nostalgia";
    private String characterName = "Mazorlion";

    @Before
    public void setup() {
        //Assume.assumeTrue("A valid API key must be provided to run these tests", apiKey != null && !apiKey.isEmpty());
        api = WarcraftLogsApi.get(apiKey);
    }


    @Test
    public void testGetClasses() {
        assertThat(api.getClasses(), is(not(empty())));
    }

    @Test
    public void testGetZones() {
        assertThat(api.getZones(), is(not(empty())));
    }

    @Test
    public void testGetEncounterRankings() {
        assertNotNull(api.getRankingsForEncounter(getEncounterID(), null, null, null, null, null, null, null, null, null));
    }

    @Test
    public void testGetCharacterRankings() {
        assertThat(api.getRankingsForCharacter(characterName, server, region, null, null, null, null), is(not(empty())));
    }

    @Test
    public void testGetGuildReports() {
        assertThat(api.getReportsForGuild(guildName, server, region, null, null), is(not(empty())));
    }

    @Test
    public void testGetUserReports() {
        assertThat(api.getReportsForUser(characterName, null, null), is(not(empty())));
    }

    @Test
    public void testGetReportFights() {
        assertNotNull(api.getFightsForReport(getReportID()));
    }
//
//    @Test
//    public void testGetReportEvents() {
//        assertThat(api.getEventsForReport(getReportID()), is(not(empty())));
//    }

    private String getReportID() {
        return Iterables.getFirst(api.getReportsForUser(characterName, null, null), null).getId();
    }

    private int getEncounterID() {
        List<Zone> zones = api.getZones();
        return Iterables.getFirst(Iterables.getFirst(zones, null).getEncounters(), null).getId();
    }
}
