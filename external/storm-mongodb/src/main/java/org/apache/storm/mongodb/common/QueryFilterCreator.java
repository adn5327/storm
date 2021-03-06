/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.storm.mongodb.common;

import java.io.Serializable;
import java.util.List;

import org.apache.storm.tuple.ITuple;
import org.bson.conversions.Bson;

/**
 * Create a MongoDB query Filter by given Tuple/trident keys.
 */
public interface QueryFilterCreator extends Serializable {

    /**
     * Create a query Filter by given Tuple
     * 
     * @param tuple
     * @return query Filter
     */
    Bson createFilter(ITuple tuple);

    /**
     * Create a query Filter by given trident keys
     *
     * @param keys
     * @return query Filter
     */
    Bson createFilterByKeys(List<Object> keys);
}
