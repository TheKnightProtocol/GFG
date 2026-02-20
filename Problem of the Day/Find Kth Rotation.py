class Solution:
    def findKRotation(self, arr):
        # code here
        return next(
            (i+1 for i in range (len(arr) - 1 ) if arr[i] > arr[i + 1]),
            0
            ) 
        
