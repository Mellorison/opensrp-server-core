package org.opensrp.domain.postgres;

public class PlanMetadata {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core.plan_metadata.operational_area_id
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	private String operationalAreaId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core.plan_metadata.identifier
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	private String identifier;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core.plan_metadata.plan_id
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	private Long planId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core.plan_metadata.operational_area_id
	 * @return  the value of core.plan_metadata.operational_area_id
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	public String getOperationalAreaId() {
		return operationalAreaId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core.plan_metadata.operational_area_id
	 * @param operationalAreaId  the value for core.plan_metadata.operational_area_id
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	public void setOperationalAreaId(String operationalAreaId) {
		this.operationalAreaId = operationalAreaId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core.plan_metadata.identifier
	 * @return  the value of core.plan_metadata.identifier
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core.plan_metadata.identifier
	 * @param identifier  the value for core.plan_metadata.identifier
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core.plan_metadata.plan_id
	 * @return  the value of core.plan_metadata.plan_id
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	public Long getPlanId() {
		return planId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core.plan_metadata.plan_id
	 * @param planId  the value for core.plan_metadata.plan_id
	 * @mbg.generated  Fri Aug 30 12:59:38 EAT 2019
	 */
	public void setPlanId(Long planId) {
		this.planId = planId;
	}

}