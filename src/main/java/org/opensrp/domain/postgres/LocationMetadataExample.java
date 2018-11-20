package org.opensrp.domain.postgres;

import java.util.ArrayList;
import java.util.List;

public class LocationMetadataExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	public LocationMetadataExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new IllegalArgumentException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new IllegalArgumentException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new IllegalArgumentException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andLocationIdIsNull() {
			addCriterion("location_id is null");
			return (Criteria) this;
		}

		public Criteria andLocationIdIsNotNull() {
			addCriterion("location_id is not null");
			return (Criteria) this;
		}

		public Criteria andLocationIdEqualTo(Long value) {
			addCriterion("location_id =", value, "locationId");
			return (Criteria) this;
		}

		public Criteria andLocationIdNotEqualTo(Long value) {
			addCriterion("location_id <>", value, "locationId");
			return (Criteria) this;
		}

		public Criteria andLocationIdGreaterThan(Long value) {
			addCriterion("location_id >", value, "locationId");
			return (Criteria) this;
		}

		public Criteria andLocationIdGreaterThanOrEqualTo(Long value) {
			addCriterion("location_id >=", value, "locationId");
			return (Criteria) this;
		}

		public Criteria andLocationIdLessThan(Long value) {
			addCriterion("location_id <", value, "locationId");
			return (Criteria) this;
		}

		public Criteria andLocationIdLessThanOrEqualTo(Long value) {
			addCriterion("location_id <=", value, "locationId");
			return (Criteria) this;
		}

		public Criteria andLocationIdIn(List<Long> values) {
			addCriterion("location_id in", values, "locationId");
			return (Criteria) this;
		}

		public Criteria andLocationIdNotIn(List<Long> values) {
			addCriterion("location_id not in", values, "locationId");
			return (Criteria) this;
		}

		public Criteria andLocationIdBetween(Long value1, Long value2) {
			addCriterion("location_id between", value1, value2, "locationId");
			return (Criteria) this;
		}

		public Criteria andLocationIdNotBetween(Long value1, Long value2) {
			addCriterion("location_id not between", value1, value2, "locationId");
			return (Criteria) this;
		}

		public Criteria andGeojsonIdIsNull() {
			addCriterion("geojson_id is null");
			return (Criteria) this;
		}

		public Criteria andGeojsonIdIsNotNull() {
			addCriterion("geojson_id is not null");
			return (Criteria) this;
		}

		public Criteria andGeojsonIdEqualTo(String value) {
			addCriterion("geojson_id =", value, "geojsonId");
			return (Criteria) this;
		}

		public Criteria andGeojsonIdNotEqualTo(String value) {
			addCriterion("geojson_id <>", value, "geojsonId");
			return (Criteria) this;
		}

		public Criteria andGeojsonIdGreaterThan(String value) {
			addCriterion("geojson_id >", value, "geojsonId");
			return (Criteria) this;
		}

		public Criteria andGeojsonIdGreaterThanOrEqualTo(String value) {
			addCriterion("geojson_id >=", value, "geojsonId");
			return (Criteria) this;
		}

		public Criteria andGeojsonIdLessThan(String value) {
			addCriterion("geojson_id <", value, "geojsonId");
			return (Criteria) this;
		}

		public Criteria andGeojsonIdLessThanOrEqualTo(String value) {
			addCriterion("geojson_id <=", value, "geojsonId");
			return (Criteria) this;
		}

		public Criteria andGeojsonIdLike(String value) {
			addCriterion("geojson_id like", value, "geojsonId");
			return (Criteria) this;
		}

		public Criteria andGeojsonIdNotLike(String value) {
			addCriterion("geojson_id not like", value, "geojsonId");
			return (Criteria) this;
		}

		public Criteria andGeojsonIdIn(List<String> values) {
			addCriterion("geojson_id in", values, "geojsonId");
			return (Criteria) this;
		}

		public Criteria andGeojsonIdNotIn(List<String> values) {
			addCriterion("geojson_id not in", values, "geojsonId");
			return (Criteria) this;
		}

		public Criteria andGeojsonIdBetween(String value1, String value2) {
			addCriterion("geojson_id between", value1, value2, "geojsonId");
			return (Criteria) this;
		}

		public Criteria andGeojsonIdNotBetween(String value1, String value2) {
			addCriterion("geojson_id not between", value1, value2, "geojsonId");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(String value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(String value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(String value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(String value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(String value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(String value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLike(String value) {
			addCriterion("type like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotLike(String value) {
			addCriterion("type not like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<String> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<String> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(String value1, String value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(String value1, String value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNull() {
			addCriterion("parent_id is null");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNotNull() {
			addCriterion("parent_id is not null");
			return (Criteria) this;
		}

		public Criteria andParentIdEqualTo(String value) {
			addCriterion("parent_id =", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotEqualTo(String value) {
			addCriterion("parent_id <>", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThan(String value) {
			addCriterion("parent_id >", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThanOrEqualTo(String value) {
			addCriterion("parent_id >=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThan(String value) {
			addCriterion("parent_id <", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThanOrEqualTo(String value) {
			addCriterion("parent_id <=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLike(String value) {
			addCriterion("parent_id like", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotLike(String value) {
			addCriterion("parent_id not like", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdIn(List<String> values) {
			addCriterion("parent_id in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotIn(List<String> values) {
			addCriterion("parent_id not in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdBetween(String value1, String value2) {
			addCriterion("parent_id between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotBetween(String value1, String value2) {
			addCriterion("parent_id not between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andUuidIsNull() {
			addCriterion("uuid is null");
			return (Criteria) this;
		}

		public Criteria andUuidIsNotNull() {
			addCriterion("uuid is not null");
			return (Criteria) this;
		}

		public Criteria andUuidEqualTo(String value) {
			addCriterion("uuid =", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidNotEqualTo(String value) {
			addCriterion("uuid <>", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidGreaterThan(String value) {
			addCriterion("uuid >", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidGreaterThanOrEqualTo(String value) {
			addCriterion("uuid >=", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidLessThan(String value) {
			addCriterion("uuid <", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidLessThanOrEqualTo(String value) {
			addCriterion("uuid <=", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidLike(String value) {
			addCriterion("uuid like", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidNotLike(String value) {
			addCriterion("uuid not like", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidIn(List<String> values) {
			addCriterion("uuid in", values, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidNotIn(List<String> values) {
			addCriterion("uuid not in", values, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidBetween(String value1, String value2) {
			addCriterion("uuid between", value1, value2, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidNotBetween(String value1, String value2) {
			addCriterion("uuid not between", value1, value2, "uuid");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andServerVersionIsNull() {
			addCriterion("server_version is null");
			return (Criteria) this;
		}

		public Criteria andServerVersionIsNotNull() {
			addCriterion("server_version is not null");
			return (Criteria) this;
		}

		public Criteria andServerVersionEqualTo(Long value) {
			addCriterion("server_version =", value, "serverVersion");
			return (Criteria) this;
		}

		public Criteria andServerVersionNotEqualTo(Long value) {
			addCriterion("server_version <>", value, "serverVersion");
			return (Criteria) this;
		}

		public Criteria andServerVersionGreaterThan(Long value) {
			addCriterion("server_version >", value, "serverVersion");
			return (Criteria) this;
		}

		public Criteria andServerVersionGreaterThanOrEqualTo(Long value) {
			addCriterion("server_version >=", value, "serverVersion");
			return (Criteria) this;
		}

		public Criteria andServerVersionLessThan(Long value) {
			addCriterion("server_version <", value, "serverVersion");
			return (Criteria) this;
		}

		public Criteria andServerVersionLessThanOrEqualTo(Long value) {
			addCriterion("server_version <=", value, "serverVersion");
			return (Criteria) this;
		}

		public Criteria andServerVersionIn(List<Long> values) {
			addCriterion("server_version in", values, "serverVersion");
			return (Criteria) this;
		}

		public Criteria andServerVersionNotIn(List<Long> values) {
			addCriterion("server_version not in", values, "serverVersion");
			return (Criteria) this;
		}

		public Criteria andServerVersionBetween(Long value1, Long value2) {
			addCriterion("server_version between", value1, value2, "serverVersion");
			return (Criteria) this;
		}

		public Criteria andServerVersionNotBetween(Long value1, Long value2) {
			addCriterion("server_version not between", value1, value2, "serverVersion");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table core.location_metadata
	 * @mbg.generated  Fri Nov 16 10:53:19 EAT 2018
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table core.location_metadata
     *
     * @mbg.generated do_not_delete_during_merge Thu Nov 15 15:55:07 EAT 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}