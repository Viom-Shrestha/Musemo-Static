package com.musemo.controller.algorithms;

import com.musemo.model.ArtifactModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Selection Sort implementation for sorting by artifact id.
 *
 * @author Viom Shrestha 23048612
 */
public class SelectionSort {

    List<ArtifactModel> artifactSortList;

    /**
     * Default class constructor for initializing a new ArrayList for storing
     * sorted artifact list.
     */
    public SelectionSort() {
        artifactSortList = new ArrayList<>();
    }

    /**
     * Sorts a list of ArtifactModel objects by their Artifact Id in ascending
     * or descending order.
     *
     * @param artifactList the list of ArtifactModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @throws IllegalArgumentException if artifact list is empty or null
     * @return the sorted list
     */
    public List<ArtifactModel> sortByArtifactId(List<ArtifactModel> artifactList, boolean isDesc) {
        this.artifactSortList.clear();
        this.artifactSortList.addAll(artifactList);
        if (artifactSortList == null || artifactSortList.isEmpty()) {
            throw new IllegalArgumentException("Artifact list cannot be null or empty.");
        }

        for (int i = 0; i < artifactSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(artifactSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(artifactSortList, i, extremumIndex);
            }
        }
        return artifactSortList;
    }

    /**
     * Finds the index of the extremum value (minimum or maximum) in the list
     * from the start index.
     *
     * @param artifactSortList the list of ArtifactModel objects
     * @param startIndex the index to start searching from
     * @param isDesc specifies whether to find the maximum (true) or minimum
     * (false)
     * @return the index of the extremum value
     */
    private int findExtremumIndex(List<ArtifactModel> artifactSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < artifactSortList.size(); j++) {
            if (shouldSwap(artifactSortList.get(j).getArtifactId(), artifactSortList.get(extremumIndex).getArtifactId(), isDesc)) {
                extremumIndex = j;
            }
        }
        return extremumIndex;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     *
     * @param current the current value
     * @param extremum the current extremum value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwap(int current, int extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }

    /**
     * Swaps two elements in the list.
     *
     * @param artifactSortList the list of ArtifactModel objects
     * @param i the index of the first element
     * @param j the index of the extremum element
     */
    private void swap(List<ArtifactModel> artifactSortList, int i, int j) {
        ArtifactModel temp = artifactSortList.get(i);
        artifactSortList.set(i, artifactSortList.get(j));
        artifactSortList.set(j, temp);
    }
}
