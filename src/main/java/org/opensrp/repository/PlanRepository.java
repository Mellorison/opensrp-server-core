package org.opensrp.repository;

import org.opensrp.domain.PlanDefinition;

import java.util.List;

/**
 * Created by Vincent Karuri on 06/05/2019
 */
public interface PlanRepository extends BaseRepository<PlanDefinition> {

    List<PlanDefinition> getPlansByServerVersionAndOperationalAreas(Long serverVersion, List<String> operationalAreaIds);

    /**
     * This method searches for plans using a list of provided
     * plan identifiers and returns a subset of fields determined by the list of provided fields
     * If no plan identifier(s) are provided the method returns all available plans
     * If no fields are provided the method returns all the available fields
     * @param ids list of plan identifiers
     * @param fields list of fields to return
     * @return plan definitions whose identifiers match the provided params
     */
    List<PlanDefinition> getPlansByIdsReturnOptionalFields(List<String> ids, List<String> fields);
    
    
    /**
     * Gets the plan primary key 
     * @param identifier of of the plan
     * @return the numerical primary key of a plan
     */
    public Long retrievePrimaryKey(String identifier);

	
    /** Gets the plans using the plan ids and whose server version is greater than or equal to server version
	 * @param planIds the plan ids
	 * @param serverVersion 
	 * @return plans with the ids and server version greater than or equal to server version param
	 */
	List<PlanDefinition> getPlansByIdsAndServerVersion(List<Long> planIds, Long serverVersion);
	
	
	/** Gets the plans using the plan identifiers and whose server version is greater than or equal to server version
	 * @param planIdentifiers the plan identifiers
	 * @param serverVersion 
	 * @return plans with the identifiers and server version greater than or equal to server version param
	 */
	List<PlanDefinition> getPlansByIdentifiersAndServerVersion(List<String> planIdentifiers, Long serverVersion);
}
