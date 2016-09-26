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
package com.jarlenai.wcl.domain.classes;

import java.util.List;

public class WarcraftClass {

    /**
     * A unique identifier representing this specific class.
     */
    private Integer id;

    /**
     * The English name of the class.
     */
    private String name;

    /**
     * The possible specs for this class.
     */
    private List<WarcraftSpec> specs;

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

    public List<WarcraftSpec> getSpecs() {
        return specs;
    }

    public void setSpecs(List<WarcraftSpec> specs) {
        this.specs = specs;
    }

    public static class WarcraftSpec {

        /**
         * A unique identifier representing this specific spec.
         */
        private Integer id;

        /**
         * The English name of the spec.
         */
        private String name;

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
    }
}