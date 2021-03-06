package org.opensrp.domain.postgres;

import java.util.Date;

public class Plan {
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.plan.id
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private Long id;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.plan.identifier
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private String identifier;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.plan.json
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private Object json;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.plan.date_deleted
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private Date dateDeleted;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.plan.server_version
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private Long serverVersion;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.plan.experimental
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private Boolean experimental;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.plan.date_created
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private Date dateCreated;
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * core.plan.date_edited
	 *
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	private Date dateEdited;
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.plan.id
	 *
	 * @return the value of core.plan.id
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.plan.id
	 *
	 * @param id the value for core.plan.id
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.plan.identifier
	 *
	 * @return the value of core.plan.identifier
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public String getIdentifier() {
		return identifier;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.plan.identifier
	 *
	 * @param identifier the value for core.plan.identifier
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.plan.json
	 *
	 * @return the value of core.plan.json
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public Object getJson() {
		return json;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.plan.json
	 *
	 * @param json the value for core.plan.json
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setJson(Object json) {
		this.json = json;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.plan.date_deleted
	 *
	 * @return the value of core.plan.date_deleted
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public Date getDateDeleted() {
		return dateDeleted;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.plan.date_deleted
	 *
	 * @param dateDeleted the value for core.plan.date_deleted
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setDateDeleted(Date dateDeleted) {
		this.dateDeleted = dateDeleted;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.plan.server_version
	 *
	 * @return the value of core.plan.server_version
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public Long getServerVersion() {
		return serverVersion;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.plan.server_version
	 *
	 * @param serverVersion the value for core.plan.server_version
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setServerVersion(Long serverVersion) {
		this.serverVersion = serverVersion;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.plan.experimental
	 *
	 * @return the value of core.plan.experimental
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public Boolean getExperimental() {
		return experimental;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.plan.experimental
	 *
	 * @param experimental the value for core.plan.experimental
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setExperimental(Boolean experimental) {
		this.experimental = experimental;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.plan.date_created
	 *
	 * @return the value of core.plan.date_created
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public Date getDateCreated() {
		return dateCreated;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.plan.date_created
	 *
	 * @param dateCreated the value for core.plan.date_created
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column core.plan.date_edited
	 *
	 * @return the value of core.plan.date_edited
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public Date getDateEdited() {
		return dateEdited;
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * core.plan.date_edited
	 *
	 * @param dateEdited the value for core.plan.date_edited
	 * @mbg.generated Wed Sep 30 15:22:34 EAT 2020
	 */
	public void setDateEdited(Date dateEdited) {
		this.dateEdited = dateEdited;
	}
}
