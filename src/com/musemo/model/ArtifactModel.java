package com.musemo.model;

/**
 * This class is used as a data model for an artifact in the museum. It is
 * designed to encapsulate the data related to an artifact's attribute like id,
 * name, type.
 *
 * @author Viom Shrestha 23048612
 */
public class ArtifactModel {

    private int artifactId;
    private String artifactName;
    private String artifactType;
    private String creator;
    private String status;
    private String origin;
    private String condition;
    private short floor;
    private short roomNo;

    /**
     * Default empty constructor for the class.
     */
    public ArtifactModel() {
    }

    /**
     * Class constructor used to create an artifact object with attributes.
     *
     * @param artifactId
     * @param artifactName
     * @param artifactType
     * @param creator
     * @param status
     * @param origin
     * @param condition
     * @param floor
     * @param roomNo
     */
    public ArtifactModel(int artifactId, String artifactName, String artifactType, String creator, String status, String origin, String condition, short floor, short roomNo) {
        this.artifactId = artifactId;
        this.artifactName = artifactName;
        this.artifactType = artifactType;
        this.creator = creator;
        this.status = status;
        this.origin = origin;
        this.condition = condition;
        this.floor = floor;
        this.roomNo = roomNo;
    }

    /**
     * Getter method for getting artifact id.
     *
     * @return artifactId
     */
    public int getArtifactId() {
        return artifactId;
    }

    /**
     * Setter method for setting artifact id
     *
     * @param artifactId
     */
    public void setArtifactId(int artifactId) {
        this.artifactId = artifactId;
    }

    /**
     * Getter method for getting artifact name.
     *
     * @return artifactName
     */
    public String getArtifactName() {
        return artifactName;
    }

    /**
     * Setter method for setting artifact name.
     *
     * @param artifactName
     */
    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }

    /**
     * Getter method for getting artifact type.
     *
     * @return artifactType
     */
    public String getArtifactType() {
        return artifactType;
    }

    /**
     * Setter method for setting artifact type.
     *
     * @param artifactType
     */
    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    /**
     * Getter method for getting artifact's creator name.
     *
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Setter method for setting artifact creator.
     *
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * Getter method for getting artifact's status.
     *
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for setting artifact status.
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter method for getting artifact's origin location.
     *
     * @return origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Setter method for setting artifact origin.
     *
     * @param origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * Getter method to get artifact's condition.
     *
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Setter method for setting artifact condition.
     *
     * @param condition
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * Getter method for getting artifact's floor number.
     *
     * @return floor
     */
    public short getFloor() {
        return floor;
    }

    /**
     * Setter method for setting floor number.
     *
     * @param floor
     */
    public void setFloor(short floor) {
        this.floor = floor;
    }

    /**
     * Getter method for getting artifact's room number.
     *
     * @return roomNo
     */
    public short getRoomNo() {
        return roomNo;
    }

    /**
     * Setter method for setting room number.
     *
     * @param roomNo
     */
    public void setRoomNo(short roomNo) {
        this.roomNo = roomNo;
    }
}
