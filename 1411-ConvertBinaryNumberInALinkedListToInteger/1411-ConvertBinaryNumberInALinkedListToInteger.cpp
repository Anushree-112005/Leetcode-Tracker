// Last updated: 7/9/2026, 9:14:13 AM
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    int getDecimalValue(ListNode* head) {
        int num = 0;
        
        while (head != NULL) {
            num = num * 2 + head->val;
            head = head->next;
        }
        
        return num;
    }
};