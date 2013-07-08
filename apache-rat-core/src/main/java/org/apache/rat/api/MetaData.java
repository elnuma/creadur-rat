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
package org.apache.rat.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Data about the file.
 */
public class MetaData {

	public static final String BASE_URL = "http://org/apache/rat/meta-data";

	// Document Categories
	public static final String URL_DOCUMENT_CATEGORY = BASE_URL
			+ "#FileCategory";
	public static final String DOCUMENT_CATEGORY_VALUE_GENERATED = "GEN  ";
	public static final String DOCUMENT_CATEGORY_VALUE_UNKNOWN = "?????";
	public static final String DOCUMENT_CATEGORY_VALUE_ARCHIVE = "archive";
	public static final String DOCUMENT_CATEGORY_VALUE_NOTICE = "notice";
	public static final String DOCUMENT_CATEGORY_VALUE_BINARY = "binary";
	public static final String DOCUMENT_CATEGORY_VALUE_STANDARD = "standard";
	public static final Datum DOCUMENT_CATEGORY_DATUM_GENERATED = new Datum(
			URL_DOCUMENT_CATEGORY, DOCUMENT_CATEGORY_VALUE_GENERATED);
	public static final Datum DOCUMENT_CATEGORY_DATUM_UNKNOWN = new Datum(
			URL_DOCUMENT_CATEGORY, DOCUMENT_CATEGORY_VALUE_UNKNOWN);
	public static final Datum DOCUMENT_CATEGORY_DATUM_ARCHIVE = new Datum(
			URL_DOCUMENT_CATEGORY, DOCUMENT_CATEGORY_VALUE_ARCHIVE);
	public static final Datum DOCUMENT_CATEGORY_DATUM_NOTICE = new Datum(
			URL_DOCUMENT_CATEGORY, DOCUMENT_CATEGORY_VALUE_NOTICE);
	public static final Datum DOCUMENT_CATEGORY_DATUM_BINARY = new Datum(
			URL_DOCUMENT_CATEGORY, DOCUMENT_CATEGORY_VALUE_BINARY);
	public static final Datum DOCUMENT_CATEGORY_DATUM_STANDARD = new Datum(
			URL_DOCUMENT_CATEGORY, DOCUMENT_CATEGORY_VALUE_STANDARD);

	// Header Categories
	public static final String URL_HEADER_CATEGORY = BASE_URL
			+ "#HeaderCategory";

	// License Family Categories
	public static final String URL_LICENSE_FAMILY_CATEGORY = BASE_URL
			+ "#LicenseFamilyCategory";
	// Shortcuts used in report output, must be exactly 5 characters
	public static final String LICENSE_FAMILY_CATEGORY_VALUE_GEN = "GEN  ";
	public static final String LICENSE_FAMILY_CATEGORY_VALUE_UNKNOWN = "?????";
	public static final String LICENSE_FAMILY_CATEGORY_VALUE_ASL = "AL   ";
	public static final String LICENSE_FAMILY_CATEGORY_VALUE_OASIS = "OASIS";
	public static final String LICENSE_FAMILY_CATEGORY_VALUE_W3CD = "W3CD ";
	public static final String LICENSE_FAMILY_CATEGORY_VALUE_W3C = "W3C  ";
	public static final String LICENSE_FAMILY_CATEGORY_VALUE_DOJO = "DOJO ";
	public static final String LICENSE_FAMILY_CATEGORY_VALUE_TMF = "TMF  ";
	public static final String LICENSE_FAMILY_CATEGORY_VALUE_GPL1 = "GPL1 ";
	public static final String LICENSE_FAMILY_CATEGORY_VALUE_GPL2 = "GPL2 ";
	public static final String LICENSE_FAMILY_CATEGORY_VALUE_GPL3 = "GPL3 ";
	public static final String LICENSE_FAMILY_CATEGORY_VALUE_MIT = "MIT  ";

	public static final Datum LICENSE_FAMILY_CATEGORY_DATUM_GEN = new Datum(
			URL_LICENSE_FAMILY_CATEGORY, LICENSE_FAMILY_CATEGORY_VALUE_GEN);
	public static final Datum LICENSE_FAMILY_CATEGORY_DATUM_UNKNOWN = new Datum(
			URL_LICENSE_FAMILY_CATEGORY, LICENSE_FAMILY_CATEGORY_VALUE_UNKNOWN);
	public static final Datum LICENSE_FAMILY_CATEGORY_DATUM_ASL = new Datum(
			URL_LICENSE_FAMILY_CATEGORY, LICENSE_FAMILY_CATEGORY_VALUE_ASL);
	public static final Datum LICENSE_FAMILY_CATEGORY_DATUM_OASIS = new Datum(
			URL_LICENSE_FAMILY_CATEGORY, LICENSE_FAMILY_CATEGORY_VALUE_OASIS);
	public static final Datum LICENSE_FAMILY_CATEGORY_DATUM_W3CD = new Datum(
			URL_LICENSE_FAMILY_CATEGORY, LICENSE_FAMILY_CATEGORY_VALUE_W3CD);
	public static final Datum LICENSE_FAMILY_CATEGORY_DATUM_W3C = new Datum(
			URL_LICENSE_FAMILY_CATEGORY, LICENSE_FAMILY_CATEGORY_VALUE_W3C);
	public static final Datum LICENSE_FAMILY_CATEGORY_DATUM_DOJO = new Datum(
			URL_LICENSE_FAMILY_CATEGORY, LICENSE_FAMILY_CATEGORY_VALUE_DOJO);
	public static final Datum LICENSE_FAMILY_CATEGORY_DATUM_TMF = new Datum(
			URL_LICENSE_FAMILY_CATEGORY, LICENSE_FAMILY_CATEGORY_VALUE_TMF);
	public static final Datum LICENSE_FAMILY_CATEGORY_DATUM_GPL1 = new Datum(
			URL_LICENSE_FAMILY_CATEGORY, LICENSE_FAMILY_CATEGORY_VALUE_GPL1);
	public static final Datum LICENSE_FAMILY_CATEGORY_DATUM_GPL2 = new Datum(
			URL_LICENSE_FAMILY_CATEGORY, LICENSE_FAMILY_CATEGORY_VALUE_GPL2);
	public static final Datum LICENSE_FAMILY_CATEGORY_DATUM_GPL3 = new Datum(
			URL_LICENSE_FAMILY_CATEGORY, LICENSE_FAMILY_CATEGORY_VALUE_GPL3);
	public static final Datum LICENSE_FAMILY_CATEGORY_DATUM_MIT = new Datum(
			URL_LICENSE_FAMILY_CATEGORY, LICENSE_FAMILY_CATEGORY_VALUE_MIT);

	// License Family Standard Names
	public static final String URL_LICENSE_FAMILY_NAME = BASE_URL
			+ "#LicenseFamilyName";
	public static final String LICENSE_FAMILY_NAME_VALUE_W3C_SOFTWARE_COPYRIGHT = "W3C Software Copyright";
	public static final String LICENSE_FAMILY_NAME_VALUE_W3C_DOCUMENT_COPYRIGHT = "W3C Document Copyright";
	public static final String LICENSE_FAMILY_NAME_VALUE_OASIS_OPEN_LICENSE = "OASIS Open License";
	public static final String LICENSE_FAMILY_NAME_VALUE_MODIFIED_BSD_LICENSE = "Modified BSD License";
	public static final String LICENSE_FAMILY_NAME_VALUE_APACHE_LICENSE_VERSION_2_0 = "Apache License Version 2.0";
	public static final String LICENSE_FAMILY_NAME_VALUE_GPL_VERSION_1 = "GNU General Public License, version 1";
	public static final String LICENSE_FAMILY_NAME_VALUE_GPL_VERSION_2 = "GNU General Public License, version 2";
	public static final String LICENSE_FAMILY_NAME_VALUE_GPL_VERSION_3 = "GNU General Public License, version 3";
	public static final String LICENSE_FAMILY_NAME_VALUE_MIT = "The MIT License";
	public static final String LICENSE_FAMILY_NAME_VALUE_ACADEMIC_FREE_LICENSE_VERSION_2_1 = "Academic Free License, Version 2.1";
	public static final String LICENSE_FAMILY_NAME_VALUE_UNKNOWN = "?????";
	public static final Datum LICENSE_FAMILY_NAME_DATUM_W3C_SOFTWARE_COPYRIGHT = new Datum(
			URL_LICENSE_FAMILY_NAME,
			LICENSE_FAMILY_NAME_VALUE_W3C_SOFTWARE_COPYRIGHT);
	public static final Datum LICENSE_FAMILY_NAME_DATUM_W3C_DOCUMENT_COPYRIGHT = new Datum(
			URL_LICENSE_FAMILY_NAME,
			LICENSE_FAMILY_NAME_VALUE_W3C_DOCUMENT_COPYRIGHT);
	public static final Datum LICENSE_FAMILY_NAME_DATUM_OASIS_OPEN_LICENSE = new Datum(
			URL_LICENSE_FAMILY_NAME,
			LICENSE_FAMILY_NAME_VALUE_OASIS_OPEN_LICENSE);
	public static final Datum LICENSE_FAMILY_NAME_DATUM_MODIFIED_BSD_LICENSE = new Datum(
			URL_LICENSE_FAMILY_NAME,
			LICENSE_FAMILY_NAME_VALUE_MODIFIED_BSD_LICENSE);
	public static final Datum LICENSE_FAMILY_NAME_DATUM_APACHE_LICENSE_VERSION_2_0 = new Datum(
			URL_LICENSE_FAMILY_NAME,
			LICENSE_FAMILY_NAME_VALUE_APACHE_LICENSE_VERSION_2_0);
	public static final Datum LICENSE_FAMILY_NAME_DATUM_GPL_VERSION_1 = new Datum(
			URL_LICENSE_FAMILY_NAME, LICENSE_FAMILY_CATEGORY_VALUE_GPL1);
	public static final Datum LICENSE_FAMILY_NAME_DATUM_GPL_VERSION_2 = new Datum(
			URL_LICENSE_FAMILY_NAME, LICENSE_FAMILY_CATEGORY_VALUE_GPL2);
	public static final Datum LICENSE_FAMILY_NAME_DATUM_GPL_VERSION_3 = new Datum(
			URL_LICENSE_FAMILY_NAME, LICENSE_FAMILY_NAME_VALUE_GPL_VERSION_3);
	public static final Datum LICENSE_FAMILY_NAME_DATUM_MIT = new Datum(
			URL_LICENSE_FAMILY_NAME, LICENSE_FAMILY_NAME_VALUE_MIT);
	public static final Datum LICENSE_FAMILY_NAME_DATUM_ACADEMIC_FREE_LICENSE_VERSION_2_1 = new Datum(
			URL_LICENSE_FAMILY_NAME,
			LICENSE_FAMILY_NAME_VALUE_ACADEMIC_FREE_LICENSE_VERSION_2_1);
	public static final Datum LICENSE_FAMILY_NAME_DATUM_UNKNOWN = new Datum(
			URL_LICENSE_FAMILY_NAME, LICENSE_FAMILY_NAME_VALUE_UNKNOWN);

	// Header sample
	public static final String URL_HEADER_SAMPLE = BASE_URL + "#HeaderSample";

	// License Approval
	public static final String URL_APPROVED_LICENSE = BASE_URL
			+ "#ApprovedLicense";
	public static final String APPROVED_LICENSE_VALUE_TRUE = Boolean.TRUE
			.toString();
	public static final String APPROVED_LICENSE_VALUE_FALSE = Boolean.FALSE
			.toString();
	public static final Datum APPROVED_LICENSE_DATIM_TRUE = new Datum(
			URL_APPROVED_LICENSE, APPROVED_LICENSE_VALUE_TRUE);
	public static final Datum APPROVED_LICENSE_DATIM_FALSE = new Datum(
			URL_APPROVED_LICENSE, APPROVED_LICENSE_VALUE_FALSE);

	private ContentType contentType;
	/**
	 * Only likely to be a small quantity of data so trade some performance for
	 * simplicity.
	 */
	private final transient List<Datum> data;

	/**
     * 
     */
	public MetaData() {
		this(null);
	}

	/**
	 * 
	 * @param contentType
	 */
	public MetaData(final ContentType contentType) {
		this.contentType = contentType;
		this.data = new ArrayList<Datum>(16);
	}

	/**
	 * Gets the content type for the subject.
	 * 
	 * @return or null when the type is unknown
	 */
	public ContentType getContentType() {
		return contentType;
	}

	/**
	 * Sets the content type for this subject.
	 * 
	 * @param contentType
	 *            <code>ContentType</code>, or null when the content type is
	 *            unknown
	 */
	public void setContentType(final ContentType contentType) {
		this.contentType = contentType;
	}

	/**
	 * Gets all data.
	 * 
	 * @return unmodifiable view of the meta data.
	 */
	public Collection<Datum> getData() {
		return Collections.unmodifiableCollection(data);
	}

	/**
	 * Adds a new datum. Existing data with the same name are not replaced.
	 * 
	 * @param datum
	 * @see #set(org.apache.rat.api.MetaData.Datum)
	 */
	public void add(final Datum datum) {
		data.add(datum);
	}

	/**
	 * Puts in a new datum replacing any existing data. Any current data
	 * matching the name are removed.
	 * 
	 * @param datum
	 *            not null
	 * @see #add(org.apache.rat.api.MetaData.Datum)
	 */
	public void set(final Datum datum) {
		clear(datum.getName());
		add(datum);
	}

	/**
	 * Removes all data matching the given name.
	 * 
	 * @param name
	 *            not null
	 * @return true if any data match, false otherwise
	 */
	public boolean clear(final String name) {
		boolean dataRemoved = Boolean.FALSE;
		for (final Iterator<Datum> it = data.iterator(); it.hasNext();) {
			final Datum datum = it.next();
			if (name != null && name.equals(datum.getName())) {
				it.remove();
				dataRemoved = true;
			}
		}
		return dataRemoved;
	}

	/**
	 * A datum.
	 */
	public static final class Datum {
		private String name;
		private String value;

		/**
		 * Constructs a datum.
		 * 
		 * @param name
		 *            not null
		 * @param value
		 *            not null
		 */
		public Datum(final String name, final String value) {
			super();
			this.name = name;
			this.value = value;
		}

		/**
		 * Gets the name of the data type. To avoid collisions, it is
		 * recommended that URLs are used.
		 * 
		 * @return not null
		 */
		public String getName() {
			return name;
		}

		/**
		 * Data type value.
		 * 
		 * @return not null
		 */
		public String getValue() {
			return value;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @param value the value to set
		 */
		public void setValue(String value) {
			this.value = value;
		}
	}
}
