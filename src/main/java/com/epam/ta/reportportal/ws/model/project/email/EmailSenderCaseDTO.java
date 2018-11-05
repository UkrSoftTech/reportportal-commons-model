/*
 * Copyright 2018 EPAM Systems
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
 *
 */

package com.epam.ta.reportportal.ws.model.project.email;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Cases object for email sending declarations
 *
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class EmailSenderCaseDTO implements Serializable {
	/**
	 * Generated SVUID
	 */
	private static final long serialVersionUID = -3546546654348861010L;

	@JsonProperty(value = "cases")
	private Map<String, List<String>> cases;

	public EmailSenderCaseDTO() {
	}

	public Map<String, List<String>> getCases() {
		return cases;
	}

	public void setCases(Map<String, List<String>> cases) {
		this.cases = cases;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		EmailSenderCaseDTO that = (EmailSenderCaseDTO) o;

		return cases != null ? cases.equals(that.cases) : that.cases == null;
	}

	@Override
	public int hashCode() {
		return cases != null ? cases.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "EmailSenderCaseDTO{" + "cases=" + cases + '}';
	}
}