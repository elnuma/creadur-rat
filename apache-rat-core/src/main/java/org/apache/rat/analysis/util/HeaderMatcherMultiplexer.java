/*
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 */ 
package org.apache.rat.analysis.util;

import org.apache.rat.analysis.IHeaderMatcher;
import org.apache.rat.analysis.RatHeaderAnalysisException;
import org.apache.rat.report.claim.IClaimReporter;
import org.apache.rat.report.claim.ISubject;

/**
 * Delegates to an ordered set of matchers.
 *
 */
public final class HeaderMatcherMultiplexer implements IHeaderMatcher {

	private final IHeaderMatcher[] matchers;
	private final int numberOfMatchers;
	
	public HeaderMatcherMultiplexer(final IHeaderMatcher[] matchers) {
		this.matchers = matchers;
		numberOfMatchers = matchers.length;
	}
	
	public boolean match(ISubject subject, String line, IClaimReporter reporter) throws RatHeaderAnalysisException {
        boolean result = false;
		for (int i=0;i<numberOfMatchers;i++) {
			result = matchers[i].match(subject, line, reporter);
            if (result) {
                break;
            }
		}
        return result;
	}

	public void reset() {
		for (int i=0;i<numberOfMatchers;i++) {
			matchers[i].reset();
		}
	}

}
