/**
 * 
 */
package org.opensrp.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * @author Samuel Githengi created on 08/30/19
 */
public class Organization implements Serializable {

	private static final long serialVersionUID = -9204925528493297488L;

	private Long id;

	private String identifier;

	private boolean active;

	private String name;

	private Long partOf;

	public List<CodeSystem> type;

	private Set<AssignedLocations> assignedLocations;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPartOf() {
		return partOf;
	}

	public void setPartOf(Long partOf) {
		this.partOf = partOf;
	}

	public List<CodeSystem> getType() {
		return type;
	}

	public void setType(List<CodeSystem> type) {
		this.type = type;
	}

	public Set<AssignedLocations> getAssignedLocations() {
		return assignedLocations;
	}

	public void setAssignedLocations(Set<AssignedLocations> assignedLocations) {
		this.assignedLocations = assignedLocations;
	}

}