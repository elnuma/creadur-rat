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
package org.apache.rat.document.impl;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import org.apache.rat.document.IDocument;
import org.apache.rat.document.IDocumentCollection;
import org.apache.rat.document.UnreadableArchiveException;


public class MonolithicFileDocument extends AbstractMonolithicDocument {
	private final File file;

    /**
     * Creates a new instance. The document is read from the
     * given URL.
     */
    public static IDocument newInstance(final URL url) {
    	if ("file".equals(url.getProtocol())) {
    		final File f = new File(url.getFile());
    		return new MonolithicFileDocument(f);
    	}
    	return new AbstractMonolithicDocument(url.toExternalForm()){
			public Reader reader() throws IOException {
				return new InputStreamReader(url.openStream(), "UTF-8");
			}
    	};
    }

    public MonolithicFileDocument(final File file) {
    	super(DocumentImplUtils.toName(file));
        this.file = file;
    }

    public IDocumentCollection readArchive() throws IOException {
        throw new UnreadableArchiveException("This file is not an archive");
    }

    public Reader reader() throws IOException {
        return new FileReader(file);
    }
}
