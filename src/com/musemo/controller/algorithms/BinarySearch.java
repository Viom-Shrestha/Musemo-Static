package com.musemo.controller.algorithms;

import com.musemo.model.ArtifactModel;
import java.util.ArrayList;
import java.util.List;  

/**
 * Binary Search implementation for finding an ArtifactModel object. Searches by
 * artifact id, name and floor number.
 *
 * @author Viom Shrestha 23048612
 */
public class BinarySearch {

    /**
     * Performs a binary search on the list of ArtifactModel objects to find an
     * artifact with the given floor.
     *
     * @param sortedList the sorted list of ArtifactModel objects
     * @param targetFloor the floor to search for
     * @return the index of the ArtifactModel with the matching floor, or -1 if
     * not found
     */
    public List<ArtifactModel> searchByFloor(List<ArtifactModel> sortedList, int targetFloor) {
        List<ArtifactModel> matchingArtifacts = new ArrayList<>();
        int left = 0;
        int right = sortedList.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midFloor = sortedList.get(mid).getFloor();

            if (midFloor == targetFloor) {
                // Add the matching artifact to the result list
                matchingArtifacts.add(sortedList.get(mid));

                // Check for duplicates on both sides of the mid
                int i = mid - 1;
                while (i >= 0 && sortedList.get(i).getFloor() == targetFloor) {
                    matchingArtifacts.add(sortedList.get(i));
                    i--;
                }
                int j = mid + 1;
                while (j < sortedList.size() && sortedList.get(j).getFloor() == targetFloor) {
                    matchingArtifacts.add(sortedList.get(j));
                    j++;
                }
                break;
            } else {
                if (midFloor < targetFloor) {
                    left = mid + 1; // Target is in the right half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }
        }
        return matchingArtifacts; // Target floor not found
    }

    /**
     * Performs a binary search on the list of ArtifactModel objects to find an
     * artifact with the given id.
     *
     * @param sortedList the sorted list of ArtifactModel objects
     * @param targetArtifactId the id to search for
     * @return the index of the ArtifactModel with the matching floor, or -1 if
     * not found
     */
    public List<ArtifactModel> searchByArtifactId(List<ArtifactModel> sortedList, int targetArtifactId) {
        List<ArtifactModel> matchingArtifacts = new ArrayList<>();
        int left = 0;
        int right = sortedList.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; 
            int midId = sortedList.get(mid).getArtifactId();

            if (midId == targetArtifactId) {
                // Add the matching artifact to the result list
                matchingArtifacts.add(sortedList.get(mid));
                break;
            } else {
                if (midId < targetArtifactId) {
                    left = mid + 1; // Target is in the right half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }
        }
        return matchingArtifacts; // Target artifact id not found
    }

    /**
     * Performs a binary search on the list of ArtifactModel objects to find an
     * artifact with the given name.
     *
     * @param sortedList the sorted list of ArtifactModel objects
     * @param targetArtifactName the artifact name to search for
     * @return the index of the ArtifactModel with the matching floor, or -1 if
     * not found
     */
    public List<ArtifactModel> searchByArtifactName(List<ArtifactModel> sortedList, String targetArtifactName) {
        List<ArtifactModel> matchingArtifacts = new ArrayList<>();
        int left = 0;
        int right = sortedList.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; 
            String midName = sortedList.get(mid).getArtifactName().trim();
            int compareName = midName.compareToIgnoreCase(targetArtifactName);
            if (compareName == 0) {
                // Add the matching artifact to the result list
                matchingArtifacts.add(sortedList.get(mid));

                // Check for duplicates on both sides of the mid
                int i = mid - 1;
                while (i >= 0 && sortedList.get(i).getArtifactName().trim().compareToIgnoreCase(targetArtifactName) == 0) {
                    matchingArtifacts.add(sortedList.get(i));
                    i--;
                }
                int j = mid + 1;
                while (j < sortedList.size() && sortedList.get(j).getArtifactName().trim().compareToIgnoreCase(targetArtifactName) == 0) {
                    matchingArtifacts.add(sortedList.get(j));
                    j++;
                }
                break;
            } else {
                if (compareName < 0) {
                    left = mid + 1; // Target is in the right half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }
        }
        return matchingArtifacts; // Target name not found
    }
}
