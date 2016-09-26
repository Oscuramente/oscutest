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
package com.jarlenai.wcl.domain.rankings;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EncounterRanking {

    /**
     * The name of the character that obtained the ranking
     */
    private String name;

    /**
     * For individual rankings, the DPS/HPS value.
     */
    private Double total;

    /**
     * For individual rankings, the class of the character.
     */
    @SerializedName("class")
    private Long classID;

    /**
     * For individual rankings, the spec of the character.
     */
    private Long spec;

    /**
     * The name of the guild that obtained the ranking.
     */
    private String guild;

    /**
     * The server that the ranking was obtained on.
     */
    private String server;

    /**
     * The length of the fight/run in milliseconds.
     */
    private Double duration;

    /**
     * A timestamp with millisecond precision that indicates when the fight/run happened
     */
    private Double startTime;

    /**
     * For fight rankings, how much damage was taken over the course of the fight.
     */
    private Double damageTaken;

    /**
     * For fight rankings, how many people died on the fight.
     */
    private Double deaths;

    /**
     * For fight rankings, the average item level of the raid. For character rankings, the item level of the character.
     */
    private Double itemLevel;

    /**
     * For challenge mode rankings, what patch they were obtained in.
     */
    private Double patch;

    /**
     * The report ID that contains this ranking.
     */
    private String reportID;

    /**
     * The fight ID within the report for the fight that contains this ranking.
     */
    private Double fightID;

    /**
     * For challenge mode rankings, the team members that made up the team.
     */
    private List<TeamMember> team;

    /**
     * The size of the raid. Only set for flexible size raids. Remember that flexible raid sizes are all ranked together currently.
     */
    private Long size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Long getClassID() {
        return classID;
    }

    public void setClassID(Long classID) {
        this.classID = classID;
    }

    public Long getSpec() {
        return spec;
    }

    public void setSpec(Long spec) {
        this.spec = spec;
    }

    public String getGuild() {
        return guild;
    }

    public void setGuild(String guild) {
        this.guild = guild;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Double getStartTime() {
        return startTime;
    }

    public void setStartTime(Double startTime) {
        this.startTime = startTime;
    }

    public Double getDamageTaken() {
        return damageTaken;
    }

    public void setDamageTaken(Double damageTaken) {
        this.damageTaken = damageTaken;
    }

    public Double getDeaths() {
        return deaths;
    }

    public void setDeaths(Double deaths) {
        this.deaths = deaths;
    }

    public Double getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(Double itemLevel) {
        this.itemLevel = itemLevel;
    }

    public Double getPatch() {
        return patch;
    }

    public void setPatch(Double patch) {
        this.patch = patch;
    }

    public String getReportID() {
        return reportID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public Double getFightID() {
        return fightID;
    }

    public void setFightID(Double fightID) {
        this.fightID = fightID;
    }

    public List<TeamMember> getTeam() {
        return team;
    }

    public void setTeam(List<TeamMember> team) {
        this.team = team;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}
