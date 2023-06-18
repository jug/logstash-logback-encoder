/*
 * Copyright 2013-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.logstash.logback.composite.loggingevent.mdc;

import java.util.HashSet;
import java.util.Set;

/**
 * A base class with configuration for {@link MdcEntryWriter} implementations.
 * 
 * Allows to:
 * <ul>
 *     <li>exclude MDC entries for given keys</li>
 * </ul>
 */
public abstract class AbstractMdcEntryWriter {

    protected Set<String> excludeMdcKeys = new HashSet<>();

    public Set<String> getExcludeMdcKeys() {
        return excludeMdcKeys;
    }

    public void addExcludeMdcKey(String key) {
        excludeMdcKeys.add(key);
    }

    public boolean mdcKeyExcluded(String key) {
        return excludeMdcKeys.contains(key);
    }

}
