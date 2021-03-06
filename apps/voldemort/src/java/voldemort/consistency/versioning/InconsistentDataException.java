/*
 * Copyright 2008-2009 LinkedIn, Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package voldemort.consistency.versioning;

import java.util.List;

import voldemort.VoldemortException;

/**
 * Thrown when multiple inconsistent values are found and no resolution strategy
 * resolves the problem
 * 
 * 
 */
public class InconsistentDataException extends VoldemortException {

    private static final long serialVersionUID = 1L;

    private List<?> versions;

    public InconsistentDataException(String message, List<?> versions) {
        super(message);
        this.versions = versions;
    }

    public List<?> getVersions() {
        return this.versions;
    }

}
