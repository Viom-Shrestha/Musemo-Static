package com.musemo.controller.algorithms;

import com.musemo.model.ArtifactModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Merge Sort implementation for sorting by floor number.
 *
 * @author Viom Shrestha 23048612
 */
public class MergeSort {

    List<ArtifactModel> artifactSortList;

    /**
     * Default class constructor for initializing a new ArrayList for storing
     * sorted artifact list.
     */
    public MergeSort() {
        artifactSortList = new ArrayList<>();
    }

    /**
     * Sorts a list of ArtifactModel objects by their Floor number in ascending
     * or descending order using merge sort algorithm.
     *
     * @param artifactList the list of ArtifactModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @throws IllegalArgumentException if artifact list is empty or null
     * @return the sorted list
     */
    public List<ArtifactModel> sortByFloor(List<ArtifactModel> artifactList, boolean isDesc) {
        this.artifactSortList.clear();
        this.artifactSortList.addAll(artifactList);

        if (artifactSortList == null || artifactSortList.isEmpty()) {
            throw new IllegalArgumentException("Artifact list cannot be null or empty.");
        }

        mergeSort(artifactSortList, isDesc);
        return artifactSortList;
    }

    /**
     * Recursive method to divide and sort the list.
     *
     * @param list the list to be sorted
     * @param isDesc specifies the sort order
     */
    private void mergeSort(List<ArtifactModel> list, boolean isDesc) {
        if (list.size() <= 1) {
            return;
        }

        // Create first and second sublists
        int midPoint = list.size() / 2;
        List<ArtifactModel> first = new ArrayList<>(list.subList(0, midPoint));
        List<ArtifactModel> second = new ArrayList<>(list.subList(midPoint, list.size()));

        // Recursive calls
        mergeSort(first, isDesc);
        mergeSort(second, isDesc);

        // Merge the sorted sublists
        merge(first, second, list, isDesc);
    }

    /**
     * Merges two sorted sub-lists into a single sorted list.
     *
     * @param first the first sub-list
     * @param second the second sub-list
     * @param result the list to store merged result
     * @param isDesc specifies the sort order
     */
    private void merge(List<ArtifactModel> first, List<ArtifactModel> second,
            List<ArtifactModel> result, boolean isDesc) {
        int fCounter = 0;    // Index for first list
        int sCounter = 0;    // Index for second list
        int rCounter = 0;    // Index for result list

        // Compare and merge elements
        while (fCounter < first.size() && sCounter < second.size()) {
            int comparison = compareFloors(first.get(fCounter), second.get(sCounter), isDesc);
            if (comparison <= 0) {
                result.set(rCounter, first.get(fCounter));
                fCounter++;
            } else {
                result.set(rCounter, second.get(sCounter));
                sCounter++;
            }
            rCounter++;
        }

        // Copy remaining elements from first list
        while (fCounter < first.size()) {
            result.set(rCounter, first.get(fCounter));
            fCounter++;
            rCounter++;
        }

        // Copy remaining elements from second list
        while (sCounter < second.size()) {
            result.set(rCounter, second.get(sCounter));
            sCounter++;
            rCounter++;
        }
    }

    /**
     * Compares floor numbers of two ArtifactModel objects based on sort order.
     *
     * @param a first ArtifactModel object
     * @param b second ArtifactModel object
     * @param isDesc specifies the sort order
     * @return positive if a greater than b, negative if a less than b, 0 if
     * equal (reversed for descending)
     */
    private int compareFloors(ArtifactModel a, ArtifactModel b, boolean isDesc) {
        int comparison = Integer.compare(a.getFloor(), b.getFloor());
        return isDesc ? -comparison : comparison;
    }
}
