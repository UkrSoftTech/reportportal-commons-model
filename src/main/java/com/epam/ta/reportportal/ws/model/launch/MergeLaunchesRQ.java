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

package com.epam.ta.reportportal.ws.model.launch;

import com.epam.ta.reportportal.ws.annotations.ElementLength;
import com.epam.ta.reportportal.ws.annotations.NotEmpty;
import com.epam.ta.reportportal.ws.model.ItemAttributeResource;
import com.epam.ta.reportportal.ws.model.ValidationConstraints;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

import static com.epam.ta.reportportal.ws.model.ValidationConstraints.MAX_NAME_LENGTH;

@JsonInclude(Include.NON_NULL)
public class MergeLaunchesRQ {

	@NotNull
	@NotEmpty
	@Size(min = ValidationConstraints.MIN_LAUNCH_NAME_LENGTH, max = ValidationConstraints.MAX_NAME_LENGTH)
	@JsonProperty(value = "name", required = true)
	@ApiModelProperty(required = true)
	private String name;

	@JsonProperty(value = "description")
	private String description;

	@ElementLength(max = MAX_NAME_LENGTH)
	@JsonProperty("attributes")
	private Set<ItemAttributeResource> attributes;

	@JsonProperty(value = "startTime")
	@ApiModelProperty
	private Date startTime;

	@JsonProperty("mode")
	private Mode mode;

	@NotNull
	@JsonProperty(value = "launches", required = true)
	@ApiModelProperty(required = true)
	private Set<Long> launches;

	@JsonProperty(value = "endTime")
	@ApiModelProperty
	private Date endTime;

	@NotNull
	@JsonProperty("mergeType")
	@ApiModelProperty(allowableValues = "BASIC, DEEP")
	private String mergeType;

	@JsonProperty(value = "extendSuitesDescription", required = true)
	private boolean extendSuitesDescription;

	@NotNull
	public String getName() {
		return name;
	}

	public void setName(@NotNull String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<ItemAttributeResource> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<ItemAttributeResource> attributes) {
		this.attributes = attributes;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	@NotNull
	public Set<Long> getLaunches() {
		return launches;
	}

	public void setLaunches(@NotNull Set<Long> launches) {
		this.launches = launches;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@NotNull
	public String getMergeType() {
		return mergeType;
	}

	public void setMergeType(@NotNull String mergeType) {
		this.mergeType = mergeType;
	}

	public boolean isExtendSuitesDescription() {
		return extendSuitesDescription;
	}

	public void setExtendSuitesDescription(boolean extendSuitesDescription) {
		this.extendSuitesDescription = extendSuitesDescription;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		MergeLaunchesRQ that = (MergeLaunchesRQ) o;

		if (extendSuitesDescription != that.extendSuitesDescription) {
			return false;
		}
		if (!name.equals(that.name)) {
			return false;
		}
		if (description != null ? !description.equals(that.description) : that.description != null) {
			return false;
		}
		if (attributes != null ? !attributes.equals(that.attributes) : that.attributes != null) {
			return false;
		}
		if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) {
			return false;
		}
		if (mode != that.mode) {
			return false;
		}
		if (!launches.equals(that.launches)) {
			return false;
		}
		if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) {
			return false;
		}
		return mergeType.equals(that.mergeType);
	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
		result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
		result = 31 * result + (mode != null ? mode.hashCode() : 0);
		result = 31 * result + launches.hashCode();
		result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
		result = 31 * result + mergeType.hashCode();
		result = 31 * result + (extendSuitesDescription ? 1 : 0);
		return result;
	}

	@Override
	public String toString() {
		return "MergeLaunchesRQ{" + "name='" + name + '\'' + ", description='" + description + '\'' + ", attributes=" + attributes
				+ ", startTime=" + startTime + ", mode=" + mode + ", launches=" + launches + ", endTime=" + endTime
				+ ", mergeType='" + mergeType + '\'' + ", extendSuitesDescription=" + extendSuitesDescription + '}';
	}
}