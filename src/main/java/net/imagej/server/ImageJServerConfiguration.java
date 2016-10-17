/*
 * #%L
 * ImageJ server for RESTful access to ImageJ.
 * %%
 * Copyright (C) 2013 - 2016 Board of Regents of the University of
 * Wisconsin-Madison, Broad Institute of MIT and Harvard, and Max Planck
 * Institute of Molecular Cell Biology and Genetics.
 * %%
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
 * #L%
 */

package net.imagej.server;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Configuration instance for imagej-server by parsing imagej-server.yml
 *
 * @author Leon Yang
 */
public class ImageJServerConfiguration extends Configuration {

	/** temporary directory storing images for IO */
	@NotEmpty
	private String tmpDir;

	@JsonProperty
	public String getTmpDir() {
		return tmpDir;
	}

	@JsonProperty
	public void setTmpDir(final String tmpDir) {
		this.tmpDir = tmpDir;
	}
}