class Solution:
    def getPairs(self, arr):
        arr.sort()
        n = len(arr)
        result = []
        left, right = 0, n - 1
        
        while left < right:
            current_sum = arr[left] + arr[right]
            
            if current_sum == 0:
                pair = [arr[left], arr[right]]
                result.append(pair)
                
                while left < right and arr[left] == pair[0]:
                    left += 1
                while left < right and arr[right] == pair[1]:
                    right -= 1
                    
            elif current_sum < 0:
                left += 1
            else:
                right -= 1
        
        return result
