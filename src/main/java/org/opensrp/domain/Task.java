package org.opensrp.domain;

import java.util.List;

import org.joda.time.DateTime;

import com.google.gson.annotations.SerializedName;

public class Task {

	public enum TaskStatus {
		@SerializedName("Draft")
		DRAFT, @SerializedName("Ready")
		READY, @SerializedName("Cancelled")
		CANCELLED, @SerializedName("In Progress")
		IN_PROGRESS, @SerializedName("Completed")
		COMPLETED, @SerializedName("Failed")
		FAILED, @SerializedName("Archived")
        ARCHIVED
	}

	private String identifier;

	private String planIdentifier;

	private String groupIdentifier;

	private TaskStatus status;

	private String businessStatus;

	private int priority;

	private String code;

	private String description;

	private String focus;

	@SerializedName("for")
	private String forEntity;

	private DateTime executionStartDate;

	private DateTime executionEndDate;

	private DateTime authoredOn;

	private DateTime lastModified;

	private String owner;

	@SerializedName("note")
	private List<Note> notes;

	private Long serverVersion;

	private String reasonReference;

	private String location;

	private String requester;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getPlanIdentifier() {
		return planIdentifier;
	}

	public void setPlanIdentifier(String planIdentifier) {
		this.planIdentifier = planIdentifier;
	}

	public String getGroupIdentifier() {
		return groupIdentifier;
	}

	public void setGroupIdentifier(String groupIdentifier) {
		this.groupIdentifier = groupIdentifier;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public String getBusinessStatus() {
		return businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFocus() {
		return focus;
	}

	public void setFocus(String focus) {
		this.focus = focus;
	}

	public String getForEntity() {
		return forEntity;
	}

	public void setForEntity(String forEntity) {
		this.forEntity = forEntity;
	}

	public DateTime getExecutionStartDate() {
		return executionStartDate;
	}

	public void setExecutionStartDate(DateTime executionStartDate) {
		this.executionStartDate = executionStartDate;
	}

	public DateTime getExecutionEndDate() {
		return executionEndDate;
	}

	public void setExecutionEndDate(DateTime executionEndDate) {
		this.executionEndDate = executionEndDate;
	}

	public DateTime getAuthoredOn() {
		return authoredOn;
	}

	public void setAuthoredOn(DateTime authoredOn) {
		this.authoredOn = authoredOn;
	}

	public DateTime getLastModified() {
		return lastModified;
	}

	public void setLastModified(DateTime lastModified) {
		this.lastModified = lastModified;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public Long getServerVersion() {
		return serverVersion;
	}

	public void setServerVersion(Long serverVersion) {
		this.serverVersion = serverVersion;
	}

	public String getReasonReference() {
		return reasonReference;
	}

	public void setReasonReference(String reasonReference) {
		this.reasonReference = reasonReference;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRequester() {
		return requester;
	}

	public void setRequester(String requester) {
		this.requester = requester;
	}

}
