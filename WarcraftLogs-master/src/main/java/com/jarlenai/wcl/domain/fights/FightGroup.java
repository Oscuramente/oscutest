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

package com.jarlenai.wcl.domain.fights;

import java.util.ArrayList;
import java.util.List;

public class FightGroup {

    private List<Fight> fights = new ArrayList<Fight>();
    private Boolean challengeModes;
    private String lang;
    private List<Friendly> friendlies = new ArrayList<Friendly>();
    private List<Enemy> enemies = new ArrayList<Enemy>();
    private List<FriendlyPet> friendlyPets = new ArrayList<FriendlyPet>();
    private List<EnemyPet> enemyPets = new ArrayList<EnemyPet>();
    private List<Phase> phases = new ArrayList<Phase>();

    public List<Fight> getFights() {
        return fights;
    }

    public void setFights(List<Fight> fights) {
        this.fights = fights;
    }

    public Boolean getChallengeModes() {
        return challengeModes;
    }

    public void setChallengeModes(Boolean challengeModes) {
        this.challengeModes = challengeModes;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public List<Friendly> getFriendlies() {
        return friendlies;
    }

    public void setFriendlies(List<Friendly> friendlies) {
        this.friendlies = friendlies;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }

    public List<FriendlyPet> getFriendlyPets() {
        return friendlyPets;
    }

    public void setFriendlyPets(List<FriendlyPet> friendlyPets) {
        this.friendlyPets = friendlyPets;
    }

    public List<EnemyPet> getEnemyPets() {
        return enemyPets;
    }

    public void setEnemyPets(List<EnemyPet> enemyPets) {
        this.enemyPets = enemyPets;
    }

    public List<Phase> getPhases() {
        return phases;
    }

    public void setPhases(List<Phase> phases) {
        this.phases = phases;
    }

}
