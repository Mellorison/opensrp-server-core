package org.opensrp.domain.postgres;

import java.util.ArrayList;
import java.util.List;

public class IdentifierSourceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table core.identifier_source
     *
     * @mbg.generated Fri May 08 15:20:02 PKT 2020
	 */
	protected String orderByClause;
	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table core.identifier_source
     *
     * @mbg.generated Fri May 08 15:20:02 PKT 2020
	 */
	protected boolean distinct;
	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table core.identifier_source
     *
     * @mbg.generated Fri May 08 15:20:02 PKT 2020
	 */
	protected List<Criteria> oredCriteria;

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.identifier_source
     *
     * @mbg.generated Fri May 08 15:20:02 PKT 2020
	 */
	public IdentifierSourceExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.identifier_source
     *
     * @mbg.generated Fri May 08 15:20:02 PKT 2020
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.identifier_source
     *
     * @mbg.generated Fri May 08 15:20:02 PKT 2020
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.identifier_source
     *
     * @mbg.generated Fri May 08 15:20:02 PKT 2020
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.identifier_source
     *
     * @mbg.generated Fri May 08 15:20:02 PKT 2020
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.identifier_source
     *
     * @mbg.generated Fri May 08 15:20:02 PKT 2020
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.identifier_source
     *
     * @mbg.generated Fri May 08 15:20:02 PKT 2020
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.identifier_source
     *
     * @mbg.generated Fri May 08 15:20:02 PKT 2020
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.identifier_source
     *
     * @mbg.generated Fri May 08 15:20:02 PKT 2020
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.identifier_source
     *
     * @mbg.generated Fri May 08 15:20:02 PKT 2020
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.identifier_source
     *
     * @mbg.generated Fri May 08 15:20:02 PKT 2020
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table core.identifier_source
     *
     * @mbg.generated Fri May 08 15:20:02 PKT 2020
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
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

		public Criteria andIdentifierIsNull() {
			addCriterion("identifier is null");
			return (Criteria) this;
		}

		public Criteria andIdentifierIsNotNull() {
			addCriterion("identifier is not null");
			return (Criteria) this;
		}

		public Criteria andIdentifierEqualTo(String value) {
			addCriterion("identifier =", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierNotEqualTo(String value) {
			addCriterion("identifier <>", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierGreaterThan(String value) {
			addCriterion("identifier >", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierGreaterThanOrEqualTo(String value) {
			addCriterion("identifier >=", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierLessThan(String value) {
			addCriterion("identifier <", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierLessThanOrEqualTo(String value) {
			addCriterion("identifier <=", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierLike(String value) {
			addCriterion("identifier like", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierNotLike(String value) {
			addCriterion("identifier not like", value, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierIn(List<String> values) {
			addCriterion("identifier in", values, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierNotIn(List<String> values) {
			addCriterion("identifier not in", values, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierBetween(String value1, String value2) {
			addCriterion("identifier between", value1, value2, "identifier");
			return (Criteria) this;
		}

		public Criteria andIdentifierNotBetween(String value1, String value2) {
			addCriterion("identifier not between", value1, value2, "identifier");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("description is null");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("description is not null");
			return (Criteria) this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("description =", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("description <>", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("description >", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("description >=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("description <", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("description <=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("description like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("description not like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("description in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("description not in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("description between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("description not between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andIdentifierValidatorAlgorithmIsNull() {
			addCriterion("identifier_validator_algorithm is null");
			return (Criteria) this;
		}

		public Criteria andIdentifierValidatorAlgorithmIsNotNull() {
			addCriterion("identifier_validator_algorithm is not null");
			return (Criteria) this;
		}

		public Criteria andIdentifierValidatorAlgorithmEqualTo(String value) {
			addCriterion("identifier_validator_algorithm =", value, "identifierValidatorAlgorithm");
			return (Criteria) this;
		}

		public Criteria andIdentifierValidatorAlgorithmNotEqualTo(String value) {
			addCriterion("identifier_validator_algorithm <>", value, "identifierValidatorAlgorithm");
			return (Criteria) this;
		}

		public Criteria andIdentifierValidatorAlgorithmGreaterThan(String value) {
			addCriterion("identifier_validator_algorithm >", value, "identifierValidatorAlgorithm");
			return (Criteria) this;
		}

		public Criteria andIdentifierValidatorAlgorithmGreaterThanOrEqualTo(String value) {
			addCriterion("identifier_validator_algorithm >=", value, "identifierValidatorAlgorithm");
			return (Criteria) this;
		}

		public Criteria andIdentifierValidatorAlgorithmLessThan(String value) {
			addCriterion("identifier_validator_algorithm <", value, "identifierValidatorAlgorithm");
			return (Criteria) this;
		}

		public Criteria andIdentifierValidatorAlgorithmLessThanOrEqualTo(String value) {
			addCriterion("identifier_validator_algorithm <=", value, "identifierValidatorAlgorithm");
			return (Criteria) this;
		}

		public Criteria andIdentifierValidatorAlgorithmLike(String value) {
			addCriterion("identifier_validator_algorithm like", value, "identifierValidatorAlgorithm");
			return (Criteria) this;
		}

		public Criteria andIdentifierValidatorAlgorithmNotLike(String value) {
			addCriterion("identifier_validator_algorithm not like", value, "identifierValidatorAlgorithm");
			return (Criteria) this;
		}

		public Criteria andIdentifierValidatorAlgorithmIn(List<String> values) {
			addCriterion("identifier_validator_algorithm in", values, "identifierValidatorAlgorithm");
			return (Criteria) this;
		}

		public Criteria andIdentifierValidatorAlgorithmNotIn(List<String> values) {
			addCriterion("identifier_validator_algorithm not in", values, "identifierValidatorAlgorithm");
			return (Criteria) this;
		}

		public Criteria andIdentifierValidatorAlgorithmBetween(String value1, String value2) {
			addCriterion("identifier_validator_algorithm between", value1, value2, "identifierValidatorAlgorithm");
			return (Criteria) this;
		}

		public Criteria andIdentifierValidatorAlgorithmNotBetween(String value1, String value2) {
			addCriterion("identifier_validator_algorithm not between", value1, value2, "identifierValidatorAlgorithm");
			return (Criteria) this;
		}

		public Criteria andBaseCharacterSetIsNull() {
			addCriterion("base_character_set is null");
			return (Criteria) this;
		}

		public Criteria andBaseCharacterSetIsNotNull() {
			addCriterion("base_character_set is not null");
			return (Criteria) this;
		}

		public Criteria andBaseCharacterSetEqualTo(String value) {
			addCriterion("base_character_set =", value, "baseCharacterSet");
			return (Criteria) this;
		}

		public Criteria andBaseCharacterSetNotEqualTo(String value) {
			addCriterion("base_character_set <>", value, "baseCharacterSet");
			return (Criteria) this;
		}

		public Criteria andBaseCharacterSetGreaterThan(String value) {
			addCriterion("base_character_set >", value, "baseCharacterSet");
			return (Criteria) this;
		}

		public Criteria andBaseCharacterSetGreaterThanOrEqualTo(String value) {
			addCriterion("base_character_set >=", value, "baseCharacterSet");
			return (Criteria) this;
		}

		public Criteria andBaseCharacterSetLessThan(String value) {
			addCriterion("base_character_set <", value, "baseCharacterSet");
			return (Criteria) this;
		}

		public Criteria andBaseCharacterSetLessThanOrEqualTo(String value) {
			addCriterion("base_character_set <=", value, "baseCharacterSet");
			return (Criteria) this;
		}

		public Criteria andBaseCharacterSetLike(String value) {
			addCriterion("base_character_set like", value, "baseCharacterSet");
			return (Criteria) this;
		}

		public Criteria andBaseCharacterSetNotLike(String value) {
			addCriterion("base_character_set not like", value, "baseCharacterSet");
			return (Criteria) this;
		}

		public Criteria andBaseCharacterSetIn(List<String> values) {
			addCriterion("base_character_set in", values, "baseCharacterSet");
			return (Criteria) this;
		}

		public Criteria andBaseCharacterSetNotIn(List<String> values) {
			addCriterion("base_character_set not in", values, "baseCharacterSet");
			return (Criteria) this;
		}

		public Criteria andBaseCharacterSetBetween(String value1, String value2) {
			addCriterion("base_character_set between", value1, value2, "baseCharacterSet");
			return (Criteria) this;
		}

		public Criteria andBaseCharacterSetNotBetween(String value1, String value2) {
			addCriterion("base_character_set not between", value1, value2, "baseCharacterSet");
			return (Criteria) this;
		}

		public Criteria andFirstIdentifierBaseIsNull() {
			addCriterion("first_identifier_base is null");
			return (Criteria) this;
		}

		public Criteria andFirstIdentifierBaseIsNotNull() {
			addCriterion("first_identifier_base is not null");
			return (Criteria) this;
		}

		public Criteria andFirstIdentifierBaseEqualTo(String value) {
			addCriterion("first_identifier_base =", value, "firstIdentifierBase");
			return (Criteria) this;
		}

		public Criteria andFirstIdentifierBaseNotEqualTo(String value) {
			addCriterion("first_identifier_base <>", value, "firstIdentifierBase");
			return (Criteria) this;
		}

		public Criteria andFirstIdentifierBaseGreaterThan(String value) {
			addCriterion("first_identifier_base >", value, "firstIdentifierBase");
			return (Criteria) this;
		}

		public Criteria andFirstIdentifierBaseGreaterThanOrEqualTo(String value) {
			addCriterion("first_identifier_base >=", value, "firstIdentifierBase");
			return (Criteria) this;
		}

		public Criteria andFirstIdentifierBaseLessThan(String value) {
			addCriterion("first_identifier_base <", value, "firstIdentifierBase");
			return (Criteria) this;
		}

		public Criteria andFirstIdentifierBaseLessThanOrEqualTo(String value) {
			addCriterion("first_identifier_base <=", value, "firstIdentifierBase");
			return (Criteria) this;
		}

		public Criteria andFirstIdentifierBaseLike(String value) {
			addCriterion("first_identifier_base like", value, "firstIdentifierBase");
			return (Criteria) this;
		}

		public Criteria andFirstIdentifierBaseNotLike(String value) {
			addCriterion("first_identifier_base not like", value, "firstIdentifierBase");
			return (Criteria) this;
		}

		public Criteria andFirstIdentifierBaseIn(List<String> values) {
			addCriterion("first_identifier_base in", values, "firstIdentifierBase");
			return (Criteria) this;
		}

		public Criteria andFirstIdentifierBaseNotIn(List<String> values) {
			addCriterion("first_identifier_base not in", values, "firstIdentifierBase");
			return (Criteria) this;
		}

		public Criteria andFirstIdentifierBaseBetween(String value1, String value2) {
			addCriterion("first_identifier_base between", value1, value2, "firstIdentifierBase");
			return (Criteria) this;
		}

		public Criteria andFirstIdentifierBaseNotBetween(String value1, String value2) {
			addCriterion("first_identifier_base not between", value1, value2, "firstIdentifierBase");
			return (Criteria) this;
		}

		public Criteria andPrefixIsNull() {
			addCriterion("prefix is null");
			return (Criteria) this;
		}

		public Criteria andPrefixIsNotNull() {
			addCriterion("prefix is not null");
			return (Criteria) this;
		}

		public Criteria andPrefixEqualTo(String value) {
			addCriterion("prefix =", value, "prefix");
			return (Criteria) this;
		}

		public Criteria andPrefixNotEqualTo(String value) {
			addCriterion("prefix <>", value, "prefix");
			return (Criteria) this;
		}

		public Criteria andPrefixGreaterThan(String value) {
			addCriterion("prefix >", value, "prefix");
			return (Criteria) this;
		}

		public Criteria andPrefixGreaterThanOrEqualTo(String value) {
			addCriterion("prefix >=", value, "prefix");
			return (Criteria) this;
		}

		public Criteria andPrefixLessThan(String value) {
			addCriterion("prefix <", value, "prefix");
			return (Criteria) this;
		}

		public Criteria andPrefixLessThanOrEqualTo(String value) {
			addCriterion("prefix <=", value, "prefix");
			return (Criteria) this;
		}

		public Criteria andPrefixLike(String value) {
			addCriterion("prefix like", value, "prefix");
			return (Criteria) this;
		}

		public Criteria andPrefixNotLike(String value) {
			addCriterion("prefix not like", value, "prefix");
			return (Criteria) this;
		}

		public Criteria andPrefixIn(List<String> values) {
			addCriterion("prefix in", values, "prefix");
			return (Criteria) this;
		}

		public Criteria andPrefixNotIn(List<String> values) {
			addCriterion("prefix not in", values, "prefix");
			return (Criteria) this;
		}

		public Criteria andPrefixBetween(String value1, String value2) {
			addCriterion("prefix between", value1, value2, "prefix");
			return (Criteria) this;
		}

		public Criteria andPrefixNotBetween(String value1, String value2) {
			addCriterion("prefix not between", value1, value2, "prefix");
			return (Criteria) this;
		}

		public Criteria andSuffixIsNull() {
			addCriterion("suffix is null");
			return (Criteria) this;
		}

		public Criteria andSuffixIsNotNull() {
			addCriterion("suffix is not null");
			return (Criteria) this;
		}

		public Criteria andSuffixEqualTo(String value) {
			addCriterion("suffix =", value, "suffix");
			return (Criteria) this;
		}

		public Criteria andSuffixNotEqualTo(String value) {
			addCriterion("suffix <>", value, "suffix");
			return (Criteria) this;
		}

		public Criteria andSuffixGreaterThan(String value) {
			addCriterion("suffix >", value, "suffix");
			return (Criteria) this;
		}

		public Criteria andSuffixGreaterThanOrEqualTo(String value) {
			addCriterion("suffix >=", value, "suffix");
			return (Criteria) this;
		}

		public Criteria andSuffixLessThan(String value) {
			addCriterion("suffix <", value, "suffix");
			return (Criteria) this;
		}

		public Criteria andSuffixLessThanOrEqualTo(String value) {
			addCriterion("suffix <=", value, "suffix");
			return (Criteria) this;
		}

		public Criteria andSuffixLike(String value) {
			addCriterion("suffix like", value, "suffix");
			return (Criteria) this;
		}

		public Criteria andSuffixNotLike(String value) {
			addCriterion("suffix not like", value, "suffix");
			return (Criteria) this;
		}

		public Criteria andSuffixIn(List<String> values) {
			addCriterion("suffix in", values, "suffix");
			return (Criteria) this;
		}

		public Criteria andSuffixNotIn(List<String> values) {
			addCriterion("suffix not in", values, "suffix");
			return (Criteria) this;
		}

		public Criteria andSuffixBetween(String value1, String value2) {
			addCriterion("suffix between", value1, value2, "suffix");
			return (Criteria) this;
		}

		public Criteria andSuffixNotBetween(String value1, String value2) {
			addCriterion("suffix not between", value1, value2, "suffix");
			return (Criteria) this;
		}

		public Criteria andMinLengthIsNull() {
			addCriterion("min_length is null");
			return (Criteria) this;
		}

		public Criteria andMinLengthIsNotNull() {
			addCriterion("min_length is not null");
			return (Criteria) this;
		}

		public Criteria andMinLengthEqualTo(Integer value) {
			addCriterion("min_length =", value, "minLength");
			return (Criteria) this;
		}

		public Criteria andMinLengthNotEqualTo(Integer value) {
			addCriterion("min_length <>", value, "minLength");
			return (Criteria) this;
		}

		public Criteria andMinLengthGreaterThan(Integer value) {
			addCriterion("min_length >", value, "minLength");
			return (Criteria) this;
		}

		public Criteria andMinLengthGreaterThanOrEqualTo(Integer value) {
			addCriterion("min_length >=", value, "minLength");
			return (Criteria) this;
		}

		public Criteria andMinLengthLessThan(Integer value) {
			addCriterion("min_length <", value, "minLength");
			return (Criteria) this;
		}

		public Criteria andMinLengthLessThanOrEqualTo(Integer value) {
			addCriterion("min_length <=", value, "minLength");
			return (Criteria) this;
		}

		public Criteria andMinLengthIn(List<Integer> values) {
			addCriterion("min_length in", values, "minLength");
			return (Criteria) this;
		}

		public Criteria andMinLengthNotIn(List<Integer> values) {
			addCriterion("min_length not in", values, "minLength");
			return (Criteria) this;
		}

		public Criteria andMinLengthBetween(Integer value1, Integer value2) {
			addCriterion("min_length between", value1, value2, "minLength");
			return (Criteria) this;
		}

		public Criteria andMinLengthNotBetween(Integer value1, Integer value2) {
			addCriterion("min_length not between", value1, value2, "minLength");
			return (Criteria) this;
		}

		public Criteria andMaxLengthIsNull() {
			addCriterion("max_length is null");
			return (Criteria) this;
		}

		public Criteria andMaxLengthIsNotNull() {
			addCriterion("max_length is not null");
			return (Criteria) this;
		}

		public Criteria andMaxLengthEqualTo(Integer value) {
			addCriterion("max_length =", value, "maxLength");
			return (Criteria) this;
		}

		public Criteria andMaxLengthNotEqualTo(Integer value) {
			addCriterion("max_length <>", value, "maxLength");
			return (Criteria) this;
		}

		public Criteria andMaxLengthGreaterThan(Integer value) {
			addCriterion("max_length >", value, "maxLength");
			return (Criteria) this;
		}

		public Criteria andMaxLengthGreaterThanOrEqualTo(Integer value) {
			addCriterion("max_length >=", value, "maxLength");
			return (Criteria) this;
		}

		public Criteria andMaxLengthLessThan(Integer value) {
			addCriterion("max_length <", value, "maxLength");
			return (Criteria) this;
		}

		public Criteria andMaxLengthLessThanOrEqualTo(Integer value) {
			addCriterion("max_length <=", value, "maxLength");
			return (Criteria) this;
		}

		public Criteria andMaxLengthIn(List<Integer> values) {
			addCriterion("max_length in", values, "maxLength");
			return (Criteria) this;
		}

		public Criteria andMaxLengthNotIn(List<Integer> values) {
			addCriterion("max_length not in", values, "maxLength");
			return (Criteria) this;
		}

		public Criteria andMaxLengthBetween(Integer value1, Integer value2) {
			addCriterion("max_length between", value1, value2, "maxLength");
			return (Criteria) this;
		}

		public Criteria andMaxLengthNotBetween(Integer value1, Integer value2) {
			addCriterion("max_length not between", value1, value2, "maxLength");
			return (Criteria) this;
		}

		public Criteria andRegexFormatIsNull() {
			addCriterion("regex_format is null");
			return (Criteria) this;
		}

		public Criteria andRegexFormatIsNotNull() {
			addCriterion("regex_format is not null");
			return (Criteria) this;
		}

		public Criteria andRegexFormatEqualTo(String value) {
			addCriterion("regex_format =", value, "regexFormat");
			return (Criteria) this;
		}

		public Criteria andRegexFormatNotEqualTo(String value) {
			addCriterion("regex_format <>", value, "regexFormat");
			return (Criteria) this;
		}

		public Criteria andRegexFormatGreaterThan(String value) {
			addCriterion("regex_format >", value, "regexFormat");
			return (Criteria) this;
		}

		public Criteria andRegexFormatGreaterThanOrEqualTo(String value) {
			addCriterion("regex_format >=", value, "regexFormat");
			return (Criteria) this;
		}

		public Criteria andRegexFormatLessThan(String value) {
			addCriterion("regex_format <", value, "regexFormat");
			return (Criteria) this;
		}

		public Criteria andRegexFormatLessThanOrEqualTo(String value) {
			addCriterion("regex_format <=", value, "regexFormat");
			return (Criteria) this;
		}

		public Criteria andRegexFormatLike(String value) {
			addCriterion("regex_format like", value, "regexFormat");
			return (Criteria) this;
		}

		public Criteria andRegexFormatNotLike(String value) {
			addCriterion("regex_format not like", value, "regexFormat");
			return (Criteria) this;
		}

		public Criteria andRegexFormatIn(List<String> values) {
			addCriterion("regex_format in", values, "regexFormat");
			return (Criteria) this;
		}

		public Criteria andRegexFormatNotIn(List<String> values) {
			addCriterion("regex_format not in", values, "regexFormat");
			return (Criteria) this;
		}

		public Criteria andRegexFormatBetween(String value1, String value2) {
			addCriterion("regex_format between", value1, value2, "regexFormat");
			return (Criteria) this;
		}

		public Criteria andRegexFormatNotBetween(String value1, String value2) {
			addCriterion("regex_format not between", value1, value2, "regexFormat");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table core.identifier_source
	 * @mbg.generated  Wed May 20 16:35:12 PKT 2020
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
     * This class corresponds to the database table core.identifier_source
     *
     * @mbg.generated do_not_delete_during_merge Fri May 08 15:20:02 PKT 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}
