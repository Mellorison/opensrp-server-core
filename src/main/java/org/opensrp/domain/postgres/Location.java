package org.opensrp.domain.postgres;

public class Location {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.location.id
     *
     * @mbg.generated Thu Nov 15 15:55:07 EAT 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.location.json
     *
     * @mbg.generated Thu Nov 15 15:55:07 EAT 2018
     */
    private Object json;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.location.id
     *
     * @return the value of core.location.id
     *
     * @mbg.generated Thu Nov 15 15:55:07 EAT 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.location.id
     *
     * @param id the value for core.location.id
     *
     * @mbg.generated Thu Nov 15 15:55:07 EAT 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.location.json
     *
     * @return the value of core.location.json
     *
     * @mbg.generated Thu Nov 15 15:55:07 EAT 2018
     */
    public Object getJson() {
        return json;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.location.json
     *
     * @param json the value for core.location.json
     *
     * @mbg.generated Thu Nov 15 15:55:07 EAT 2018
     */
    public void setJson(Object json) {
        this.json = json;
    }
}