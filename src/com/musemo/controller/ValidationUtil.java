package com.musemo.controller;

import java.util.regex.Pattern;

/**
 * This class is used for the validation of artifact management form.
 *
 * It validates the user input related to artifact using regex expressions and
 * logic.
 *
 * @author Viom Shrestha 23048612
 */
public class ValidationUtil {

    private static final Pattern ARTIFACT_ID_PATTERN = Pattern.compile("^\\d{3}$");
    private static final Pattern VISITOR_ID_PATTERN = Pattern.compile("^\\d{5}$");
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern STATUS_PATTERN = Pattern.compile("^(Permanent|Temporary|permanent|temporary)$");

    /**
     * Validates if a string text field is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if string fields like Artifact name, creator and origin
     * contains only alphabets.
     *
     * @param name the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }

    /**
     * Validates if the Artifact ID is exactly 3 digits.
     *
     * @param artifactId the Artifact ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidArtifactId(int artifactId) {
        return ARTIFACT_ID_PATTERN.matcher(String.valueOf(artifactId)).matches();
    }
    
    /**
     * Validates if the Visitor ID is exactly 5 digits.
     *
     * @param visitorId the Visitor ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidVisitorId(int visitorId) {
        return VISITOR_ID_PATTERN.matcher(String.valueOf(visitorId)).matches();
    }

    /**
     * Validates if the status is of the allowed options.
     *
     * @param status the object status to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidStatus(String status) {
        return !isNullOrEmpty(status) && STATUS_PATTERN.matcher(status).matches();
    }

    /**
     * Validates if the floor number is between 1 and 5 (inclusive).
     *
     * @param floorNo the floor number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidFloor(short floorNo) {
        return floorNo >= 1 && floorNo <= 5;
    }

    /**
     * Validates if the room number is between 1 and 7 (inclusive).
     *
     * @param roomNo the room number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidRoom(short roomNo) {
        return roomNo >= 1 && roomNo <= 7;
    }

    /**
     * Validates if the selected index is not -1 and something is selected.
     *
     * @param selectedIndex
     * @return
     */
    public static boolean isValidComboBoxSelection(int selectedIndex) {
        return selectedIndex != -1;
    }
}
