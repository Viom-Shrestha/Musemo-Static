package com.musemo.model;

/**
 * This class is used as a data model for a visitor in the museum. It is
 * designed to encapsulate the data related to a visitor's attributes like name,
 * ID, gender, and type.
 *
 * @author Viom Shrestha 23048612
 */
public class VisitorModel {

    private int visitorId;
    private String visitorName;
    private String gender;
    private String visitorType;

    /**
     * Default empty constructor for the class.
     */
    public VisitorModel() {
    }

    /**
     * Class constructor used to create a visitor object with attributes.
     *
     * @param visitorName
     * @param visitorId
     * @param gender
     * @param visitorType
     */
    public VisitorModel(int visitorId, String visitorName, String gender, String visitorType) {
        this.visitorName = visitorName;
        this.visitorId = visitorId;
        this.gender = gender;
        this.visitorType = visitorType;
    }

    /**
     * Getter method for getting visitor's name.
     *
     * @return visitorName
     */
    public String getVisitorName() {
        return visitorName;
    }

    /**
     * Setter method for setting visitor's name.
     *
     * @param visitorName
     */
    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    /**
     * Getter method for getting visitor's ID.
     *
     * @return visitorId
     */
    public int getVisitorId() {
        return visitorId;
    }

    /**
     * Setter method for setting visitor's ID.
     *
     * @param visitorId
     */
    public void setVisitorId(int visitorId) {
        this.visitorId = visitorId;
    }

    /**
     * Getter method for getting visitor's gender.
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Setter method for setting visitor's gender.
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter method for getting visitor's type.
     *
     * @return visitorType
     */
    public String getVisitorType() {
        return visitorType;
    }

    /**
     * Setter method for setting visitor's type.
     *
     * @param visitorType
     */
    public void setVisitorType(String visitorType) {
        this.visitorType = visitorType;
    }
}
