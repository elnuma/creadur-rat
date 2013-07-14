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
package org.apache.rat.analysis.generation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.apache.rat.analysis.IHeaderMatcher;
import org.apache.rat.api.Document;
import org.apache.rat.document.MockLocation;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class GeneratedLicenseNotRequiredTest.
 */
public class GeneratedLicenseNotRequiredTest {

	/** The license. */
	private IHeaderMatcher license;

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		Pattern[] patterns = { Pattern.compile(".*Generated") };
		license = new GeneratedLicenseNotRequired(patterns);
	}

	/**
	 * Test match pattern license.
	 */
	@Test
	public void testMatchPatternLicense() {
		final Document subject = new MockLocation("subject");
		assertTrue("Matches regex", license.match(subject, "This is Generated"));
	}

	/**
	 * Test match default phrases license.
	 */
	@Test
	public void testMatchDefaultPhrasesLicense() {
		license = new GeneratedLicenseNotRequired();
		final Document subject = new MockLocation("subject");
		assertTrue("Does not match regex",
				license.match(subject, "-----Generated by Maven------"));
	}
	
	/**
	 * Test match non pattern license.
	 */
	@Test
	public void testMatchNonPatternLicense() {
		final Document subject = new MockLocation("subject");
		assertFalse("Does not match regex",
				license.match(subject, "Not at all"));
	}
}
