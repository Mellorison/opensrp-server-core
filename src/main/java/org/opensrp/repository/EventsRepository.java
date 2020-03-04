package org.opensrp.repository;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.opensrp.domain.Event;
import org.opensrp.search.EventSearchBean;

public interface EventsRepository extends BaseRepository<Event> {
	
	List<Event> findAllByIdentifier(String identifier);
	
	List<Event> findAllByIdentifier(String identifierType, String identifier);
	
	Event findById(String id);
	
	Event findByFormSubmissionId(String formSubmissionId);
	
	List<Event> findByBaseEntityId(String baseEntityId);
	
	Event findByBaseEntityAndFormSubmissionId(String baseEntityId, String formSubmissionId);
	
	List<Event> findByBaseEntityAndType(String baseEntityId, String eventType);
	
	List<Event> findEvents(EventSearchBean eventSearchBean);
	
	List<Event> findEventsByDynamicQuery(String query);
	
	List<Event> findByServerVersion(long serverVersion);
	
	List<Event> notInOpenMRSByServerVersion(long serverVersion, Calendar calendar);
	
	List<Event> notInOpenMRSByServerVersionAndType(String type, long serverVersion, Calendar calendar);
	
	List<Event> findByClientAndConceptAndDate(String baseEntityId, String concept, String conceptValue, String dateFrom,
	        String dateTo);
	
	List<Event> findByBaseEntityIdAndConceptParentCode(String baseEntityId, String concept, String parentCode);
	
	List<Event> findByConceptAndValue(String concept, String conceptValue);
	
	List<Event> findByEmptyServerVersion();
	
	List<Event> findEvents(EventSearchBean eventSearchBean, String sortBy, String sortOrder, int limit);
	
	List<Event> findEventByEventTypeBetweenTwoDates(String eventType);
	
	List<Event> findByProvider(String provider);

	List<String> findIdsByEventType(String eventType, Date dateDeleted);
	
}
