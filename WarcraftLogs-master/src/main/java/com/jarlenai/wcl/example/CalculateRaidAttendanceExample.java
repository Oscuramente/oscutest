/**
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
package com.jarlenai.wcl.example;

import com.jarlenai.wcl.WarcraftLogsApi;
import com.jarlenai.wcl.domain.ServerRegion;
import com.jarlenai.wcl.domain.WarcraftServer;
import com.jarlenai.wcl.domain.fights.FightGroup;
import com.jarlenai.wcl.domain.fights.Friendly;
import com.jarlenai.wcl.domain.reports.Report;

import java.util.List;
import java.util.stream.Collectors;

public class CalculateRaidAttendanceExample {

    public static void main(String[] args) {

        WarcraftLogsApi api = WarcraftLogsApi.get(args[0]);

        List<Report> reports = api.getReportsForGuild("Nostalgia", WarcraftServer.Whisperwind, ServerRegion.US, null, null);

        double max = reports.size();

        reports
                .parallelStream()
                .map(report -> api.getFightsForReport(report.getId()))
                .map(FightGroup::getFriendlies)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Friendly::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .forEach(entry -> {
                    System.out.format("%-25s %s %%%.2f\n", entry.getKey(), entry.getValue(), (double)entry.getValue()/max*(double)100);
                });
    }

}
