package heap;

import java.util.ArrayList;
import java.util.List;

public class BinaryHeap {

    List<Integer> heap;

    public BinaryHeap() {
        heap = new ArrayList<>();
        heap.add(null);
    }

    public void minAdd(int value) {
        if (heap.size() > 1) {
            int parentIndex = Math.floorDiv(heap.size(), 2);
            int parentValue = heap.get(parentIndex);
            if (value >= parentValue) {
                heap.add(value);
            } else {
                heap.add(parentValue);
                if (parentIndex == 1) {
                    heap.set(1, value);
                } else {
                    int newParentIndex = Math.floorDiv(heap.size(), 2);
                    int newParentValue = heap.get(parentIndex);
                    do {
                        if (newParentIndex == 1) {
                            break;
                        }
                        heap.set(parentIndex, newParentValue);
                        parentIndex = newParentIndex;
                        parentValue = newParentValue;
                        newParentIndex = Math.floorDiv(parentIndex, 2);
                        newParentValue = heap.get(newParentIndex);
                    } while (value < newParentValue);
                    heap.set(parentIndex, newParentValue);
                    heap.set(newParentIndex, value);
                }

            }
        } else {
            heap.add(value);
        }
    }
}
