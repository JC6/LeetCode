#include <stdlib.h>

struct node {
    int key;
    int value;
};

int cmp(const void *a, const void *b) {
    return ((struct node *) a)->value - ((struct node *) b)->value;
}

int *twoSum(int *nums, int numsSize, int target) {
    struct node *head = (struct node *) malloc(numsSize * sizeof(struct node));
    for (int i = 0; i < numsSize; i++) {
        head[i].key = i + 1;
        head[i].value = nums[i];
    }

    qsort(head, (size_t) numsSize, sizeof(struct node), cmp);

    int *result = (int *) malloc(sizeof(int) * 2);
    int i = 0;
    int j = numsSize - 1;
    while (i < j) {
        if (head[i].value + head[j].value == target) {
            result[0] = head[i].key < head[j].key ? head[i].key : head[j].key;
            result[1] = head[i].key < head[j].key ? head[j].key : head[i].key;
            break;
        }
        head[i].value + head[j].value < target ? i++ : j--;
    }
    return result;
}
