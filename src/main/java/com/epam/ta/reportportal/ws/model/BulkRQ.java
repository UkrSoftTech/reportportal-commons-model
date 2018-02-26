/*
 * Copyright 2016 EPAM Systems
 *
 *
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/commons-model
 *
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.epam.ta.reportportal.ws.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;

/**
 * @param <T> Type of Entity
 * @author Dzmitry_Kavalets
 */
public class BulkRQ<T> {

	@Valid
	@NotNull
	@JsonProperty(value = "entities", required = true)
	private Map<Long, T> entities;

	public Map<Long, T> getEntities() {
		return entities;
	}

	public void setEntities(Map<Long, T> entities) {
		this.entities = entities;
	}

	@Override
	public String toString() {
		return "BulkRQ{" + "entities=" + entities + '}';
	}
}
