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
package com.jarlenai.wcl.domain.zones;

import java.util.List;

public class Zone {

    /**
     * A unique identifier representing this specific zone.
     */
    private Integer id;

    /**
     * The English name of the raid zone.
     */
    private String name;

    /**
     *  Whether or not the rankings and statistics for the zone are frozen.
     *  If set, then the results for this zone are never going to change, and you don't have to fetch them again.
     */
    private Boolean frozen;

    /**
     * The encounters for this zone.
     */
    private List<Encounter> encounters;

    /**
     * Optional
     * The brackets for this zone. Rankings and statistics are collected for each bracket.
     */
    private List<Bracket> brackets;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFrozen() {
        return frozen;
    }

    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }

    public List<Encounter> getEncounters() {
        return encounters;
    }

    public void setEncounters(List<Encounter> encounters) {
        this.encounters = encounters;
    }

    public List<Bracket> getBrackets() {
        return brackets;
    }

    public void setBrackets(List<Bracket> brackets) {
        this.brackets = brackets;
    }
}
