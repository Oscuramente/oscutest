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

public class TeamMember {

    /**
     * The name of the character on the team.
     */
    private String name;

    /**
     * The class of the character on the team.
     */
    @SerializedName("class")
    private Long classID;

    /**
     * The spec of the character on the team.
     */
    private Long spec;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
