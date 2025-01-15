package com.musemo.controller.algorithms;

import com.musemo.model.ArtifactModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Insertion Sort implementation for sorting by artifact name.
 *
 * @author Viom Shrestha 23048612
 */
public class InsertionSort {

    List<ArtifactModel> artifactSortList;

    /**
     * Default constructor for the class to initialize a new artifact list for
     * storing sorted list data.
     */
    public InsertionSort() {
        artifactSortList = new ArrayList<>();
    }

    /**
     * Sorts a list of ArtifactModel objects by their Artifact Name in ascending
     * or descending order using insertion sort algorithm.
     *
     * @param artifactList the list of ArtifactModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @throws IllegalArgumentException if artifact list is empty or null
     * @return the sorted list
     */
    public List<ArtifactModel> sortByArtifactName(List<ArtifactModel> artifactList, boolean isDesc) {
        this.artifactSortList.clear();
        this.artifactSortList.addAll(artifactList);

        if (artifactSortList == null || artifactSortList.isEmpty()) {
            throw new IllegalArgumentException("Artifact list cannot be null or empty.");
        }

        for (int i = 1; i < artifactSortList.size(); i++) {
            ArtifactModel key = artifactSortList.get(i);
            int j = i - 1;

            while (j >= 0 && shouldSwap(artifactSortList.get(j).getArtifactName(),
                    key.getArtifactName(), isDesc)) {
                artifactSortList.set(j + 1, artifactSortList.get(j));
                j--;
            }
            artifactSortList.set(j + 1, key);
        }

        return artifactSortList;
    }

    /**
     * Determines whether the current value should be moved based on sort order.
     *
     * @param current the current string being compared
     * @param key the key string to compare against
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should be moved; false otherwise
     */
    private boolean shouldSwap(String current, String key, boolean isDesc) {
        int comparison = current.compareToIgnoreCase(key);
        return isDesc ? comparison < 0 : comparison > 0;
    }
}
